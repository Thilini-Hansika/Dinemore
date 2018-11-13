/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository.custom;

import lk.ijse.chef.entity.AddChef;
import lk.ijse.chef.repository.SuperRepository;

/**
 *
 * @author Thilini Hansika
 */
public interface AddChefRepository extends SuperRepository<AddChef, String>{
    public AddChef findByName(String name) throws Exception;
    public AddChef findById(int aid)throws Exception;
}
