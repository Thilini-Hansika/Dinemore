/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.custom;

import java.util.List;
import lk.ijse.chef.dto.ChefDTO;
import lk.ijse.chef.service.SuperService;

/**
 *
 * @author Thilini Hansika
 */
public interface ChefService extends SuperService {

    public boolean addChefOrder(ChefDTO c) throws Exception;

    public List<ChefDTO> getAllChef() throws Exception;

    public List<ChefDTO> findByChefId(int id) throws Exception;
}
