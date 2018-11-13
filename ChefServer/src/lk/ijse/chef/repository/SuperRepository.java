/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.repository;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Thilini Hansika
 */
public interface SuperRepository<T, ID> {

    public void setConnection(Connection connection);

    public boolean save(T t) throws Exception;

    public boolean update(T t) throws Exception;

    public boolean delete(T t) throws Exception;

    public List<T> findAll() throws Exception;

    public T findById(ID id) throws Exception;

}
