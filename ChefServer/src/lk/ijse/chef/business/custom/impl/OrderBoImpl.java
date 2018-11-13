/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.business.custom.OrdersBO;
import lk.ijse.chef.dto.OrdersDTO;
import lk.ijse.chef.entity.Orders;
import lk.ijse.chef.repository.RepositroyFactory;
import lk.ijse.chef.repository.custom.OrderRepository;
import lk.ijse.chef.resource.DBConnection;

/**
 *
 * @author Thilini Hansika
 */
public class OrderBoImpl implements OrdersBO {

    private OrderRepository orderRepository;

    public OrderBoImpl() {
        this.orderRepository = (OrderRepository) RepositroyFactory.getInstance().getRepository(RepositroyFactory.RepositoryTypes.ORDERS);
    }

    @Override
    public boolean addOrder(OrdersDTO o) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        orderRepository.setConnection(connection);

        Orders orders = new Orders(o.getOid(),
                o.getOperatorID(),
                o.getOdate(),
                o.getCustomerName(),
                o.getPhone(),
                o.getQty());

        boolean save = orderRepository.save(orders);
        DBConnection.getInstance().releaseConnection(connection);
        return save;
    }

    @Override
    public List<OrdersDTO> getAallOrders() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        orderRepository.setConnection(connection);
        List<Orders> orders = orderRepository.findAll();
        DBConnection.getInstance().releaseConnection(connection);
        if (orders != null) {
            List<OrdersDTO> allorders = new ArrayList<>();
            for (Orders order : orders) {
                OrdersDTO dTO = new OrdersDTO(order.getOid(),
                        order.getOperatorID(),
                        order.getOdate(),
                        order.getCustomerName(),
                        order.getPhone(),
                        order.getQty());
                allorders.add(dTO);

            }
            return allorders;
        } else {
            return null;
        }

    }

    @Override
    public List<OrdersDTO> searchByID(int id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        orderRepository.setConnection(connection);

        List<Orders> findOrdersByChefID = orderRepository.findByOID(id);

        List<OrdersDTO> ordersDTO = new ArrayList<>();

        DBConnection.getInstance().releaseConnection(connection);

        for (Orders orders : findOrdersByChefID) {
            ordersDTO.add(new OrdersDTO(
                    orders.getOid(),
                    orders.getOperatorID(),
                    orders.getCustomerName(),
                    orders.getOdate(),
                    orders.getPhone(),
                    orders.getQty())
            );

        }
        return ordersDTO;
    
    }

}
