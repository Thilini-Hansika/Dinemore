/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository.custom;

import java.util.List;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.entity.Orders;
import lk.ijse.chef.repository.SuperRepository;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderRepository extends SuperRepository<Orders, String>{
    public List<Orders>findByOID(int oid)throws Exception;
}
