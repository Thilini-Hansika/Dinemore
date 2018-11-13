/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.customImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import lk.ijse.chef.business.BOFactory;
import lk.ijse.chef.business.custom.OrdersBO;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.service.custom.OrderService;

/**
 *
 * @author Thilini Hansika
 */
public class OrderServiceImpl extends UnicastRemoteObject implements OrderService{
    private OrdersBO ordersBO;
    
    public OrderServiceImpl() throws RemoteException, Exception{
        ordersBO = (OrdersBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDERS);
    }

    @Override
    public boolean addOrder(OrdersDTO order) throws Exception {
        return  ordersBO.addOrder(order);
    }

    @Override
    public List<OrdersDTO> getAllOrders() throws Exception {
        return ordersBO.getAallOrders();
    }

    @Override
    public List<OrdersDTO> findByOID(int id) throws Exception {
        return  ordersBO.searchByID(id);
    }
    
}
