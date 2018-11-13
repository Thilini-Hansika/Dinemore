/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.controller;

import java.util.List;
import lk.ijse.chef.connector.ProxHandler;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.observer.Subject;
import lk.ijse.chef.service.ServiceFactory;
import lk.ijse.chef.service.custom.OrdersQueueService;

/**
 *
 * @author Thilini Hansika
 */
public class OrderController {

    public static boolean addOrderToQueue(OrdersDTO ordersDTO) throws Exception {
        OrdersQueueService ordersQueueService = (OrdersQueueService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS_QUEUE);

        boolean addOrdersToQueue = ordersQueueService.addOrdersToQueue(ordersDTO);

        return addOrdersToQueue;
    }

    public static List<OrdersDTO> getAllList() throws Exception {
        OrdersQueueService ordersQueueService = (OrdersQueueService) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS_QUEUE);
        return ordersQueueService.getAllList();
    }

    public static Subject getSubject() throws Exception {
        return (Subject) ProxHandler.getInstance().getService(ServiceFactory.ServiceTypes.ORDERS_QUEUE);
    }

}
