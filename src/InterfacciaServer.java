package marangoni;


import java.rmi.Remote;
import java.rmi.RemoteException;
 /*
 * @author FSEVERI\marangoni3292
 */
public interface InterfacciaServer extends Remote {
    public String[] ricercaRis(String nomeRis) throws RemoteException;
    public boolean aggiorna(String nomeRis, String cl)throws RemoteException;
    public void connessioneClient(String cl,String[] nomiRis)throws RemoteException;
    public void disconnessioneClient(String cl,String[] nomiRis)throws RemoteException ;
    
}
