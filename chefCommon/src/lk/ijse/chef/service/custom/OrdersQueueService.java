/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.custom;

import java.util.List;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.observer.Subject;
import lk.ijse.chef.service.SuperService;



/**
 *
 * @author Thilini Hansika
 */
public interface OrdersQueueService extends SuperService,Subject{

    public boolean addOrdersToQueue(OrdersDTO ordersDTO) throws Exception;

    public OrdersDTO getOrderFromQueue() throws Exception;
    
    public List<OrdersDTO> getAllList() throws Exception;
    
}
