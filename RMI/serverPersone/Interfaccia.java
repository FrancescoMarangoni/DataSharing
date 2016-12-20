import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interfaccia extends Remote {
    public Persona ricerca(String nome) throws RemoteException;
    public void aggiungi(Persona p) throws RemoteException;
} 
