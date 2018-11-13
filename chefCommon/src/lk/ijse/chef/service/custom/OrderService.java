/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.custom;

import java.util.List;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.service.SuperService;

/**
 *
 * @author Thilini Hansika
 */
public interface OrderService extends SuperService{
     public boolean addOrder(OrdersDTO order) throws Exception;
     public List<OrdersDTO>getAllOrders()throws Exception;
     public List<OrdersDTO> findByOID(int id) throws Exception;
    
}
