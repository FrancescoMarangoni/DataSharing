package newpackage;


import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Francesco
 */
public class Server implements InterfacciaServer,Serializable {
    public String nomeSe;
    private HashMap<String,ArrayList<String>> listaRisCl;

    public Server(String nomeSe) {
        this.nomeSe = nomeSe;
        listaRisCl = new HashMap();
    }

    @Override
    public String[] ricercaRis(String nomeRis) throws RemoteException {
        
        if(!listaRisCl.containsKey(nomeRis))
            return null;
        return (String[])listaRisCl.get(nomeRis).toArray();
    }

    @Override
    public  boolean aggiorna(String nomeRis, String cl) throws RemoteException {
        ArrayList<String>temp;
        if(listaRisCl.containsKey(nomeRis)){
                temp=listaRisCl.get(nomeRis);
                temp.add(cl);
                //listaRisCl.put(nomeRis,temp); non necessario poichè temp riferimento
        }
        else
            return false;
            
        return true;            
    }

    @Override
    public  void connessioneClient(String cl, String[] nomiRis) throws RemoteException {
        ArrayList<String>temp;
        for(int i=0;i<nomiRis.length;i++){
            if(listaRisCl.containsKey(nomiRis[i])){
                temp=listaRisCl.get(nomiRis[i]);
                temp.add(cl);
                //listaRisCl.put(nomiRis[i],temp); non necessario poichè temp riferimento
            }
            else{
                temp = new ArrayList<>();
                temp.add(cl);
                listaRisCl.put(nomiRis[i],temp);
            }
        }
    }

    @Override
    public  void disconnessioneClient(String cl,String[] nomiRis) throws RemoteException {
        ArrayList<String>temp;
        for(int i=0;i<nomiRis.length;i++) {
            if(listaRisCl.containsKey(nomiRis[i]))
            {
                temp=listaRisCl.get(nomiRis[i]);
                temp.remove(cl);//riferimento
            }
        }
    }
    
}
