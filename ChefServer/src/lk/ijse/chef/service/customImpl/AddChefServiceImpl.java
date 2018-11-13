/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.customImpl;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import lk.ijse.chef.business.BOFactory;
import lk.ijse.chef.business.custom.AddCheffBO;
import lk.ijse.chef.dto.AddChefDTO;
import lk.ijse.chef.service.custom.AddChefService;

/**
 *
 * @author Thilini Hansika
 */
public class AddChefServiceImpl extends UnicastRemoteObject implements AddChefService{
private AddCheffBO acbo;
public  AddChefServiceImpl()throws Exception{
    acbo=(AddCheffBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ADDCHEF);
}
    @Override
    public List<AddChefDTO> getAllChef() throws Exception {
       return acbo.getAallChef();
    }

    @Override
    public AddChefDTO searchChefByName(String name) throws Exception {
    return  acbo.searchChefByName(name);
    }

    @Override
    public AddChefDTO findByAddChefId(int id) throws Exception {
        return acbo.searchByID(id);
    }
    
}
