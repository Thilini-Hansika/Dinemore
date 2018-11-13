/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom;

import lk.ijse.chef.business.SuperBO;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Thilini Hansika
 */
public interface ReoprtsBO extends SuperBO {

    public JasperPrint getChef() throws Exception;
}
