/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

/**
 *
 * @author Deepak
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cpassword = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cpi = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        sembox = new javax.swing.JComboBox<>();
        addmarks = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Add Student Record");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel3.setText("Reg No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        regno.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        regno.setForeground(new java.awt.Color(0, 0, 153));
        regno.setBorder(null);
        jPanel1.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 160, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 10));

        password.setBorder(null);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, 10));

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 153));
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 160, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, 10));

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        email.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 153));
        email.setBorder(null);
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 160, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 160, 10));

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel7.setText("Confirm Paswd");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        cpassword.setBorder(null);
        jPanel1.add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 160, 10));

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel8.setText("Mobile");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        mobile.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        mobile.setForeground(new java.awt.Color(0, 0, 153));
        mobile.setBorder(null);
        jPanel1.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 160, 10));

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel9.setText("CPI");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        cpi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        cpi.setForeground(new java.awt.Color(0, 0, 153));
        cpi.setBorder(null);
        jPanel1.add(cpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 160, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 160, 10));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 20)); // NOI18N
        jLabel2.setText("Semester");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 30));

        sembox.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        sembox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "1st", "2nd", "3rd", "4th", "5th", "6th" }));
        jPanel1.add(sembox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 160, -1));

        addmarks.setBackground(new java.awt.Color(255, 255, 255));
        addmarks.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        addmarks.setForeground(new java.awt.Color(0, 0, 204));
        addmarks.setText("Add Marks");
        jPanel1.add(addmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 67, 150, 30));

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 153, 0));
        submit.setText("Submit");
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 80, -1));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 0, 51));
        back.setText("Back");
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmarks;
    private javax.swing.JButton back;
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JTextField cpi;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField regno;
    private javax.swing.JComboBox<String> sembox;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
