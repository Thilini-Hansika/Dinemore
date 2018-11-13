
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.connector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.chef.service.ServiceFactory;
import lk.ijse.chef.service.ServiceFactory.ServiceTypes;
import lk.ijse.chef.service.SuperService;
import lk.ijse.chef.service.custom.OrderService;

/**
 *
 * @author Thilini Hansika
 */
public class ProxHandler implements ServiceFactory {

    private static ProxHandler proxHandler;
    private ServiceFactory serviceFactory;

    private ProxHandler() {
        try {
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/dinamore");
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ProxHandler getInstance() {
        if (proxHandler == null) {
            proxHandler = new ProxHandler();
        }
        return proxHandler;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        return serviceFactory.getService(type);
    }

}
