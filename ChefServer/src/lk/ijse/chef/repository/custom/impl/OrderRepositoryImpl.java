/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.dto.OrdersDTO;

import lk.ijse.chef.entity.Chef;

import lk.ijse.chef.entity.Orders;
import lk.ijse.chef.repository.custom.OrderRepository;

/**
 *
 * @author Thilini Hansika
 */
public class OrderRepositoryImpl implements OrderRepository {

    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean save(Orders t) throws Exception {
        String sql = "INSERT INTO Orders VALUES (?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, t.getOid());
        pstm.setObject(2, t.getOperatorID());
        pstm.setObject(3, t.getOdate());
        pstm.setObject(4, t.getCustomerName());
        pstm.setObject(5, t.getPhone());
        pstm.setObject(6, t.getQty());
        

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(Orders t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Orders t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> findAll() throws Exception {
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * from Orders");
        List<Orders> allorders = null;
        while (rst.next()) {
            if (allorders == null) {
                allorders = new ArrayList<>();
            }
            Orders orders = new Orders(rst.getInt(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getInt(6)
            );
            allorders.add(orders);
        }
        return allorders;
    }

    @Override
    public Orders findById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> findByOID(int oid) throws Exception {
      String sql = "SELECT * FROM Orders WHERE oid = '" + oid + "'";
        Statement createStatement = connection.createStatement();
        ResultSet executeQuery = createStatement.executeQuery(sql);

        List<Orders> orderList = null;
        while (executeQuery.next()) {
            if (orderList == null) {
                orderList = new ArrayList<>();
            }
            orderList.add(new Orders(
                    executeQuery.getInt(1),
                    executeQuery.getString(2),
                    executeQuery.getString(3),
                    executeQuery.getString(4),
                    executeQuery.getString(5),
                    executeQuery.getInt(6)
            ));
        }
        return orderList;
    
    }

}
