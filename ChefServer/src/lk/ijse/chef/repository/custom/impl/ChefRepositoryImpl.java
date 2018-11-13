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
import lk.ijse.chef.entity.Chef;
import lk.ijse.chef.entity.Orders;
import lk.ijse.chef.repository.custom.ChefRepository;

/**
 *
 * @author Thilini Hansika
 */
public class ChefRepositoryImpl implements ChefRepository {

    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean save(Chef t) throws Exception {
        String sql = "INSERT INTO Chef VALUES (?,?,?,?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setObject(1, t.getOid());
        pstm.setObject(2, t.getChefID());
        pstm.setObject(3, t.getDate());
        pstm.setObject(4, t.getCustomerName());
        pstm.setObject(5, t.getSpentTime());
        pstm.setObject(6, t.getPreparedBun());

        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(Chef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Chef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Chef> findAll() throws Exception {
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * from Chef");
        List<Chef> allChefOrder = null;
        while (rst.next()) {
            if (allChefOrder == null) {
                allChefOrder = new ArrayList<>();
            }
            Chef chef = new Chef(rst.getInt(1),
                    rst.getInt(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6)
            );
            allChefOrder.add(chef);
        }
        return allChefOrder;

    }

    @Override
    public Chef findById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
/*
        
         */
    }

    @Override
    public List<Chef> findByIdChef(int id) throws Exception {
        String sql = "SELECT * FROM chef WHERE chefId = '" + id + "'";
        Statement createStatement = connection.createStatement();
        ResultSet executeQuery = createStatement.executeQuery(sql);

        List<Chef> orderList = null;
        while (executeQuery.next()) {
            if (orderList == null) {
                orderList = new ArrayList<>();
            }
            orderList.add(new Chef(
                    executeQuery.getInt(1),
                    executeQuery.getInt(2),
                    executeQuery.getString(3),
                    executeQuery.getString(4),
                    executeQuery.getInt(5),
                    executeQuery.getString(6)
            ));
        }
        return orderList;
    }
}
