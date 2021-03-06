/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.chef.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.chef.controller.ChefController;
import lk.ijse.chef.controller.OrderController;
import lk.ijse.chef.dto.AddChefDTO;
import lk.ijse.chef.dto.ChefDTO;
import lk.ijse.chef.dto.OrdersDTO;

/**
 *
 * @author Thilini Hansika
 */
public class OrderTiketForm extends javax.swing.JFrame {

    /**
     * Creates new form OrderTiketForm
     */
    public OrderTiketForm() {

       
            initComponents();
/*
           ChefDTO cd = new ChefDTO();
            OrdersDTO o = new OrdersDTO();
            AddChefDTO a = new AddChefDTO();

            List<ChefDTO> chefList;
            try {
                chefList = ChefController.findByChefId(cd.getChefID());
                for (ChefDTO c : chefList) {
              // List<OrdersDTO> c=ChefController.getAllOrders();
               Object[] ob={c.getChefID(),c.getCustomerName(),c.getDate(),c.getSpentTime(),c.getPreparedBun()};
            
            //c.setChefID(txtChefId.setText(t));
            //c=txtChefId.setText(c.getChefID())
            txtChefId.setText(Integer.toString(c.);
            txtCustomerNAme.setText(c.getCustomerName());
            txtTime.setText(Integer.toString(c.getSpentTime()));
            txtQty.setText(c.getPreparedBun());
            
            chefList.add(e);
            } catch (Exception ex) {
                Logger.getLogger(OrderTiketForm.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            List<OrdersDTO> orderList = ChefController.findByOID(o.getOid());
            txtOperatorId.setText(o.getOperatorID());
            orderList.add(o);
            a = ChefController.searchByAddChefID(a.getChefId());
            txtChefNAme.setText(a.getChefName());

        } catch (Exception ex) {
            Logger.getLogger(OrderTiketForm.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCintactNo = new javax.swing.JTextField();
        txtChefNAme = new javax.swing.JTextField();
        txtOperatorId = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtCustomerNAme = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtChefId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kitchen Order Tiket");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 180, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qty");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("processing time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contract No");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Customer Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 120, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telephone Operator");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Chef Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 20));
        jPanel2.add(txtCintactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, -1));
        jPanel2.add(txtChefNAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 180, -1));
        jPanel2.add(txtOperatorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, -1));
        jPanel2.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, -1));
        jPanel2.add(txtCustomerNAme, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 20));
        jPanel2.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 180, -1));
        jPanel2.add(txtChefId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Chef Id");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Thank Tou! Come Again");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 220, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/chef/image/images (15).jpg"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 300, 340));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderTiketForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderTiketForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderTiketForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderTiketForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderTiketForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtChefId;
    private javax.swing.JTextField txtChefNAme;
    private javax.swing.JTextField txtCintactNo;
    private javax.swing.JTextField txtCustomerNAme;
    private javax.swing.JTextField txtOperatorId;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
