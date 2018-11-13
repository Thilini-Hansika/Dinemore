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
public class AddChefDTO implements Serializable{
 private int chefId;
    private String chefName;


    public AddChefDTO() {
    }

    public AddChefDTO(int chefId, String chefName) {
        this.chefId = chefId;
        this.chefName = chefName;
    }

    /**
     * @return the chefId
     */
    public int getChefId() {
        return chefId;
    }

    /**
     * @param chefId the chefId to set
     */
    public void setChefId(int chefId) {
        this.chefId = chefId;
    }

    /**
     * @return the chefName
     */
    public String getChefName() {
        return chefName;
    }

    /**
     * @param chefName the chefName to set
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    @Override
    public String toString() {
        return "AddChefDTO{" + "chefId=" + chefId + ", chefName=" + chefName + '}';
    }
    
    
}
