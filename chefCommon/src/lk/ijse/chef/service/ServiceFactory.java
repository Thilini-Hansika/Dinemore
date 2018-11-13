/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service;

import java.rmi.Remote;

/**
 *
 * @author Thilini Hansika
 */
public interface ServiceFactory extends Remote{
    public enum ServiceTypes{
        ORDERS,CHEF,ORDERS_QUEUE,ADDCHEF
    }
    
    public  SuperService getService(ServiceTypes type)throws Exception;
    
}
