package marangoni;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FSEVERI\marangoni3292
 */
public interface InterfacciaClient extends Remote {
   public Risorsa ottieni(String nomeRis)throws RemoteException; 
}
