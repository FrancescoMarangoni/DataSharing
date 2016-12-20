import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;

public class Client {
    public static void main(String[] args) {
    String s;
    int opt;
  
    try  {
        Interfaccia server = (Interfaccia) Naming.lookup ("rmi://localhost/Interfaccia");
        while (true) {
            s=JOptionPane.showInputDialog("1 - Inserisci; 2 - Cerca; 3 - Esci");
            opt=Integer.parseInt(s);
            if (opt==1) {
                s=JOptionPane.showInputDialog("Nome");
                server.aggiungi(new Persona(s));
            }
            else if (opt==2) {
                s=JOptionPane.showInputDialog("Nome");
                Persona p=server.ricerca(s);
                if (p!=null) System.out.println(p);
                else System.out.println("non trovato");
           }
                
           else break;
       }    
  }
  catch(NotBoundException e)
  {
   e.printStackTrace( );
  }
  catch(RemoteException e)
  {
   e.printStackTrace( );
  }
  catch(MalformedURLException e)
  {
   e.printStackTrace( );
  }
  System.exit(0);
 }
} 
