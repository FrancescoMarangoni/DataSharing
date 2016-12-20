package newpackage;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francesco
 */
public class EseguiServer {
    public static void main(String[]args){
        try {
            Server server = new Server(args[0]);
            Naming.rebind("//localhost/"+server.nomeSe,server);
        } catch (RemoteException ex) {
            Logger.getLogger(EseguiServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(EseguiServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
