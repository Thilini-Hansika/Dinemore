/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom;

import java.util.List;
import lk.ijse.chef.business.SuperBO;
import lk.ijse.chef.dto.AddChefDTO;

/**
 *
 * @author Thilini Hansika
 */
public interface AddCheffBO extends SuperBO{
      public List<AddChefDTO>getAallChef()throws Exception;
       public AddChefDTO searchChefByName(String name) throws Exception;
       public AddChefDTO searchByID(int aid)throws Exception;
}
