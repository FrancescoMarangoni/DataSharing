package newpackage;


import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FSEVERI\marangoni3292
 */
public class Client implements InterfacciaClient {
    public String nomeCl;
    private ArrayList<Risorsa>ris;
    private boolean connesso;
    private InterfacciaServer server;

    public Client(String nomeCl) {
        this.nomeCl = nomeCl;
        connesso = false;
        ris = new ArrayList<>();
    }
    
    public void addRis(Risorsa ris) {
        this.ris.add(new Risorsa(ris.getNomeRisorsa()));
    }
    
    public boolean connetti(String nomeServer) {
        
        try {
            server = (InterfacciaServer) Naming.lookup ("rmi://localhost/"+nomeServer);
            server.connessioneClient(this.nomeCl,nomiRisorse());
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        connesso=true;
        return true;
    }
    
    public boolean disconnetti() throws RemoteException {
        server.disconnessioneClient(this.nomeCl,nomiRisorse());
        server=null;
        connesso=false;
        return true;
    }
    
    public boolean ottieniRisorsa(String nomeRis) throws RemoteException {
        InterfacciaClient clientContattato;
        String[] listaCl = server.ricercaRis(nomeRis);
        if(listaCl.length<1||listaCl==null)
            return false;
        
        clientContattato = contattaClient(listaCl[0]); // come verificare che trasferimento andato a buon fine ed eventualmente tentare con altri client?
        this.ris.add(clientContattato.ottieni(nomeRis));
        
        server.aggiorna(nomeRis,this.nomeCl);
        return true;
    }
    
    public String[] nomiRisorse(){
        String[] nomi=new String[ris.size()];
        int i=0;
        for(Risorsa r: ris) {
            nomi[i]=r.getNomeRisorsa();
            i++;
        }
        return nomi;
    }
    
    private InterfacciaClient contattaClient(String nomeClient) {
        InterfacciaClient interf = null;
        try {
            interf= (InterfacciaClient) Naming.lookup ("rmi://localhost/"+nomeClient);
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return interf;
    }
    
    
    @Override
    public synchronized Risorsa ottieni(String nomeRis)throws RemoteException {
        for(Risorsa r:ris) {
            if(r.getNomeRisorsa().equals(nomeRis))
                return r;
        }
        return null;
    }


}
