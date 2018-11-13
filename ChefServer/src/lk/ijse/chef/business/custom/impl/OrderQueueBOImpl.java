/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.business.custom.OrderQueueBO;
import lk.ijse.chef.dto.OrdersDTO;

public class OrderQueueBOImpl implements OrderQueueBO {

    private static OrderQueueBO orderQueueBO;

    private List<OrdersDTO> waitingOrders;
    private List<OrdersDTO> finishedOrders;

    private OrderQueueBOImpl() {
        finishedOrders = new ArrayList<>();
        waitingOrders = new ArrayList<>();
    }

    public static OrderQueueBO getInstance() {
        if (orderQueueBO == null) {
            orderQueueBO = new OrderQueueBOImpl();
        }
        return orderQueueBO;
    }

    

    @Override
    public OrdersDTO getOrderFromQueue() throws Exception {

        OrdersDTO get = waitingOrders.get(0);

        finishedOrders.add(get);
        waitingOrders.remove(get);
        return get;

    }

    @Override
    public boolean addOrderToQueue(OrdersDTO dTO) throws Exception {
        return waitingOrders.add(dTO);
    }

    @Override
    public List<OrdersDTO> getAllList() throws Exception {
       return waitingOrders;
    }

}
