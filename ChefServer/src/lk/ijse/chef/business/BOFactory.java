/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business;

import lk.ijse.chef.business.custom.impl.AddChefBoImpl;
import lk.ijse.chef.business.custom.impl.ChefBOImpl;
import lk.ijse.chef.business.custom.impl.OrderBoImpl;
import lk.ijse.chef.business.custom.impl.OrderQueueBOImpl;

/**
 *
 * @author Thilini Hansika
 */
public class BOFactory {
     public enum BOTypes{
        ORDERS,ORDER_QUEUE,CHEF,ADDCHEF
    }
    
    private static BOFactory boFactory;
    
    private BOFactory(){
        
    }
    
    public static BOFactory getInstance(){
        if (boFactory == null){
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    
    public SuperBO getBO(BOTypes type) throws Exception{
        switch(type){
            case ORDERS:
                return new OrderBoImpl();
            case CHEF:
                return  new ChefBOImpl();
            case ORDER_QUEUE:
                return OrderQueueBOImpl.getInstance();
            case ADDCHEF:
                return new AddChefBoImpl();
            default:
                return null;
        }
    }
    
}
