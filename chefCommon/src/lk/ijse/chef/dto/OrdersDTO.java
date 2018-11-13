/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.dto;

import java.io.Serializable;

/**
 *
 * @author Thilini Hansika
 */
public class OrdersDTO implements Serializable {

    private int oid;
    private String operatorID;
    private String Odate;
    private String customerName;
    private String phone;
    private int qty;

    public OrdersDTO() {
    }

    public OrdersDTO(int oid, String operatorID, String Odate, String customerName, String phone, int qty) {
        this.oid = oid;
        this.operatorID = operatorID;
        this.Odate = Odate;
        this.customerName = customerName;
        this.phone = phone;
        this.qty = qty;
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
     * @return the operatorID
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * @param operatorID the operatorID to set
     */
    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    /**
     * @return the Odate
     */
    public String getOdate() {
        return Odate;
    }

    /**
     * @param Odate the Odate to set
     */
    public void setOdate(String Odate) {
        this.Odate = Odate;
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" + "oid=" + oid + ", operatorID=" + operatorID + ", Odate=" + Odate + ", customerName=" + customerName + ", phone=" + phone + ", qty=" + qty + '}';
    }

}
