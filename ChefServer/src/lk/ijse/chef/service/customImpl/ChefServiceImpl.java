/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.customImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import lk.ijse.chef.business.BOFactory;
import lk.ijse.chef.business.custom.ChefBO;
import lk.ijse.chef.dto.ChefDTO;

/**
 *
 * @author Thilini Hansika
 */
public class ChefServiceImpl extends UnicastRemoteObject implements lk.ijse.chef.service.custom.ChefService{

    
     private ChefBO cBO;
    
   public ChefServiceImpl ()throws RemoteException, Exception{
        cBO =  (ChefBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);
    }
    @Override
    public boolean addChefOrder(ChefDTO order) throws Exception {
        return cBO.addChef(order);
    }

    @Override
    public List<ChefDTO> getAllChef() throws Exception {
        return cBO.getAallChef();
    }

    @Override
    public List<ChefDTO> findByChefId(int id) throws Exception {
        return cBO.findByChefId(id);
    }
    
}
