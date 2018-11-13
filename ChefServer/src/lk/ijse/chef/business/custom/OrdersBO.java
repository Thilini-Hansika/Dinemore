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
public interface OrdersBO extends SuperBO{
      public boolean addOrder(OrdersDTO o)throws Exception;
      public List<OrdersDTO>getAallOrders()throws Exception;
      public List<OrdersDTO>searchByID(int id)throws Exception;
}
