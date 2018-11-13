/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository.custom;

import java.util.List;
import lk.ijse.chef.entity.Chef;

import lk.ijse.chef.repository.SuperRepository;

/**
 *
 * @author Thilini Hansika
 */
public interface ChefRepository extends SuperRepository<Chef, String> {
    public List<Chef>findByIdChef(int id)throws Exception;
    
}
