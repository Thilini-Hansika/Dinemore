/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.serviceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.chef.business.custom.impl.AddChefBoImpl;
import lk.ijse.chef.service.ServiceFactory;
import lk.ijse.chef.service.SuperService;
import lk.ijse.chef.service.customImpl.AddChefServiceImpl;
import lk.ijse.chef.service.customImpl.ChefServiceImpl;
import lk.ijse.chef.service.customImpl.OrderServiceImpl;
import lk.ijse.chef.service.customImpl.OrdersQueueServiceImpl;

/**
 *
 * @author Thilini Hansika
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws RemoteException {

    }

    public static ServiceFactory getInstance() throws RemoteException {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes type) throws Exception {
        switch (type) {
            case ORDERS:
                return new OrderServiceImpl();
            case CHEF:
                return new ChefServiceImpl();
            case ORDERS_QUEUE:
                return new OrdersQueueServiceImpl();
            case ADDCHEF:
                return  new AddChefServiceImpl();
            default:
                return null;

        }

    }

}
