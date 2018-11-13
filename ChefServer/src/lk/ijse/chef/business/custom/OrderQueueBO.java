/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom;

import java.util.List;
import lk.ijse.chef.business.SuperBO;
import lk.ijse.chef.dto.OrdersDTO;



/**
 *
 * @author Thilini Hansika
 */
public interface OrderQueueBO extends SuperBO {

    public boolean addOrderToQueue(OrdersDTO dTO) throws Exception;

    public OrdersDTO getOrderFromQueue() throws Exception;
    
    public List<OrdersDTO> getAllList() throws Exception;
}
