/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository;
import lk.ijse.chef.repository.custom.impl.AddChefRepositryImpl;
import lk.ijse.chef.repository.custom.impl.ChefRepositoryImpl;
import lk.ijse.chef.repository.custom.impl.OrderRepositoryImpl;

/**
 *
 * @author Thilini Hansika
 */
public class RepositroyFactory {
     
    public enum RepositoryTypes{
        ORDERS,CHEF,ADDCHEF
    }
    
    private static RepositroyFactory repositoryFactory;
    
    private RepositroyFactory(){
        
    }
    
    public static RepositroyFactory getInstance(){
        if (repositoryFactory == null){
            repositoryFactory = new RepositroyFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(RepositoryTypes type){
        switch(type){
            case ORDERS:
                return new OrderRepositoryImpl();
            case CHEF:
                return new ChefRepositoryImpl();
            case ADDCHEF:
                return new AddChefRepositryImpl();
            default:
                return null;
        }
    }
    
}
