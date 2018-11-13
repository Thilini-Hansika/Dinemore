/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.entity;

import java.util.List;
import lk.ijse.chef.dto.OrdersDTO;

/**
 *
 * @author Thilini Hansika
 */
public class Chef {

    private int oid;
    private int chefID;

    private String date;
    private String customerName;
    private int spentTime;
    private String preparedBun;

    public Chef() {
    }

    public Chef(int oid, int chefID, String date, String customerName, int spentTime, String preparedBun) {
        this.oid = oid;
        this.chefID = chefID;
        this.date = date;
        this.customerName = customerName;
        this.spentTime = spentTime;
        this.preparedBun = preparedBun;
    }

    /**
     * @return the oid
     */
    public int getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(int oid) {
        this.oid = oid;
    }

    /**
     * @return the chefID
     */
    public int getChefID() {
        return chefID;
    }

    /**
     * @param chefID the chefID to set
     */
    public void setChefID(int chefID) {
        this.chefID = chefID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the spentTime
     */
    public int getSpentTime() {
        return spentTime;
    }

    /**
     * @param spentTime the spentTime to set
     */
    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    /**
     * @return the preparedBun
     */
    public String getPreparedBun() {
        return preparedBun;
    }

    /**
     * @param preparedBun the preparedBun to set
     */
    public void setPreparedBun(String preparedBun) {
        this.preparedBun = preparedBun;
    }

    @Override
    public String toString() {
        return "Chef{" + "oid=" + oid + ", chefID=" + chefID + ", date=" + date + ", customerName=" + customerName + ", spentTime=" + spentTime + ", preparedBun=" + preparedBun + '}';
    }

   

}
