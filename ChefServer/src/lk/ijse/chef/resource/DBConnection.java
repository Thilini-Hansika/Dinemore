/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thilini Hansika
 */
public class DBConnection {
    private static final int MAXIMUM_POOL_CONNECTIONS = 10;

    private static DBConnection dBConnection;
    private ArrayList<Connection> idleConnections = new ArrayList<>();
    private ArrayList<Connection> usedConnections = new ArrayList<>();

    private DBConnection() {
        for (int i = 0; i < MAXIMUM_POOL_CONNECTIONS; i++) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dinamore", "root", "965780874");
                idleConnections.add(connection);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public static DBConnection getInstance() {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }
        return dBConnection;

    }

    public synchronized Connection getConnection() {
        if (idleConnections.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Connection get = idleConnections.get(0);
        usedConnections.add(get);
        idleConnections.remove(get);
        return get;

    }

    public synchronized void releaseConnection(Connection connection) {
        idleConnections.add(connection);
        usedConnections.remove(connection);
        notifyAll();
    }

    public synchronized void releaseAllConnections() {
        for (Connection usedConnection : usedConnections) {
            idleConnections.add(usedConnection);
        }
        usedConnections.removeAll(usedConnections);
        notifyAll();
    }

}
