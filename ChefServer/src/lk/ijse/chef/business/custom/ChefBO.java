/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom;

import java.util.List;
import lk.ijse.chef.business.SuperBO;
import lk.ijse.chef.dto.ChefDTO;

/**
 *
 * @author Thilini Hansika
 */
public interface ChefBO extends SuperBO {

    public boolean addChef(ChefDTO c) throws Exception;

    public List<ChefDTO> getAallChef() throws Exception;
    
    public List <ChefDTO>findByChefId(int id)throws Exception;
}
