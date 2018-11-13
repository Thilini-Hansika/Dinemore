/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.business.custom.impl;

import java.sql.Connection;
import java.util.HashMap;
import lk.ijse.chef.business.custom.ReoprtsBO;
import lk.ijse.chef.resource.DBConnection;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;

@Report("lk.ijse.chef.report")
public class ReoprtsBOImpl implements ReoprtsBO {

    @Override
    public JasperPrint getChef() throws Exception {
        JasperUtil.init(ReoprtsBOImpl.class);

        JasperReportsContext ctx = JasperUtil.getReportContext();

        JasperReport compiledReport = JasperUtil.getCompiledReport("asdf.jasper");

        JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

        HashMap<String, Object> reportParams = new HashMap<>();
        // reportParams.put("ownerID", cmbOwnerID.getSelectedItem().toString());
        Connection conn = DBConnection.getInstance().getConnection();
        JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, conn);
        return filledReport;
    }

}
