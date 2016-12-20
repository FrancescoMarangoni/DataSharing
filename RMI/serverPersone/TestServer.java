import java.net.MalformedURLException;
//import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import java.rmi.RemoteException;
public class TestServer {
    public static void main(String[] args)  {
        try   {
              Server server = new Server();
              Naming.rebind("//localhost/Interfaccia",server);
        }
        catch (RemoteException e){e.printStackTrace( );}
        catch (MalformedURLException e) {e.printStackTrace( );}
    }
 }
