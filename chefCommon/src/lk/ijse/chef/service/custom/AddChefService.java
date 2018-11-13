/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.custom;

import java.util.List;
import lk.ijse.chef.dto.AddChefDTO;
import lk.ijse.chef.service.SuperService;

/**
 *
 * @author Thilini Hansika
 */
public interface AddChefService extends SuperService{
    public List<AddChefDTO>getAllChef()throws Exception;
    public AddChefDTO searchChefByName(String name) throws Exception;
    public AddChefDTO findByAddChefId(int id) throws Exception;
}
