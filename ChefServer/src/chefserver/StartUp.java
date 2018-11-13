/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chefserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.chef.serviceImpl.ServiceFactoryImpl;

/**
 *
 * @author Thilini Hansika
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Registry createRegistry = LocateRegistry.createRegistry(5050);
            createRegistry.rebind("dinamore", ServiceFactoryImpl.getInstance());
            System.out.println("Server starts successfully");
        } catch (RemoteException ex) {
            Logger.getLogger(StartUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}