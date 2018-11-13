/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.service.customImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import lk.ijse.chef.business.BOFactory;
import lk.ijse.chef.business.custom.OrderQueueBO;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.observer.Observer;
import lk.ijse.chef.service.custom.OrdersQueueService;

/**
 *
 * @author Thilini Hansika
 *
 */
public class OrdersQueueServiceImpl extends UnicastRemoteObject implements OrdersQueueService {

    private OrderQueueBO orderQueueBO;
    private static List<Observer> observers = new ArrayList<>();

    public OrdersQueueServiceImpl() throws RemoteException, Exception {
        orderQueueBO = (OrderQueueBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDER_QUEUE);
    }

    @Override
    public OrdersDTO getOrderFromQueue() throws Exception {
        OrdersDTO orderFromQueue = orderQueueBO.getOrderFromQueue();
        notifyObservers();
        return orderFromQueue;

    }

    @Override
    public boolean addOrdersToQueue(OrdersDTO ordersDTO) throws Exception {
        boolean addOrderToQueue = orderQueueBO.addOrderToQueue(ordersDTO);
        if (addOrderToQueue == true) {
            notifyObservers();
        }
        return addOrderToQueue;
    }

    @Override
    public List<OrdersDTO> getAllList() throws Exception {
        return orderQueueBO.getAllList();
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws Exception {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() throws Exception {
        for (Observer observer : observers) {
            observer.update();

        }
    }

}
