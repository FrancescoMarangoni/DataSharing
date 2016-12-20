import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface Interfaccia extends Remote {
	 void vota(String nome) throws RemoteException;
	 Vector<Candidato> ottieni() throws RemoteException;
}
