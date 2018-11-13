/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.chef.entity.AddChef;
import lk.ijse.chef.repository.custom.AddChefRepository;

/**
 *
 * @author Thilini Hansika
 */
public class AddChefRepositryImpl implements AddChefRepository {

    private Connection connection;

    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean save(AddChef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(AddChef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(AddChef t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AddChef> findAll() throws Exception {
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select * from addchef");
        List<AddChef> allChef = null;
        while (rst.next()) {
            if (allChef == null) {
                allChef = new ArrayList<>();
            }
            AddChef ac = new AddChef(rst.getInt(1),
                    rst.getString(2));
            allChef.add(ac);
        }
        return allChef;
    }

    @Override
    public AddChef findById(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AddChef findByName(String name) throws Exception {
        String sql = "SELECT * FROM addchef WHERE chefName='" + name + "'";
        Statement createStatement = connection.createStatement();
        ResultSet executeQuery = createStatement.executeQuery(sql);
        if (executeQuery.next()) {
            return new AddChef(executeQuery.getInt(1), executeQuery.getString(2));
        }
        return null;

    }

    @Override
    public AddChef findById(int aid) throws Exception {
        String sql="Select * from addchef where chefId='" + aid + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return new AddChef(rst.getInt(1),
            rst.getString(2));
        }
        return null;
        
    }

}
