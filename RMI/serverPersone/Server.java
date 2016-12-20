import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Vector;

public class Server extends UnicastRemoteObject implements Interfaccia {
    private Vector<Persona> elenco;
    public Server()throws RemoteException  {
        elenco=new Vector<Persona>();
    }
 
    public Persona ricerca(String nome) throws RemoteException {
        for (Persona p:elenco) if (p.getNome().equals(nome)) return p;
        return null;
    }
    
    public void aggiungi(Persona p) throws RemoteException{
        elenco.add(p);
    }
} 
