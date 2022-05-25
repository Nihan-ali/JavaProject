public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        SubmitBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setSize(new java.awt.Dimension(852, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(184, 151, 107));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 123, 115));
        jLabel1.setText("Sign Up Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, 40));

        User.setBackground(new java.awt.Color(255, 250, 240));
        User.setToolTipText("Choose an User Name");
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 190, -1));

        jTextField4.setBackground(new java.awt.Color(255, 250, 240));
        jTextField4.setToolTipText("Give your Gmail address.");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 190, -1));

        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expert", "General" }));
        Type.setToolTipText("If you want to ask question select General.");
        getContentPane().add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 170, -1));

        SubmitBtn.setBackground(new java.awt.Color(74, 144, 45));
        SubmitBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        CancelBtn.setBackground(new java.awt.Color(116, 148, 86));
        CancelBtn.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 125, 219));
        jLabel4.setText("User Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, 20));

        jLabel2.setBackground(new java.awt.Color(95, 136, 194));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(106, 125, 219));
        jLabel2.setText("Gmail :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 80, 20));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 125, 219));
        jLabel5.setText("Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 70, 20));

        jLabel6.setBackground(new java.awt.Color(95, 136, 194));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(106, 125, 219));
        jLabel6.setText("Type of User :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 90, 20));

        Password.setBackground(new java.awt.Color(255, 248, 245));
        Password.setToolTipText("Set your password using letters, number & special charecters.");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("H:\\MyIcon\\SignUp.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 450));

        pack();
    }// </editor-fold>                        

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String type = (String)Type.getSelectedItem();
        String user = User.getText();
        String password = Password.getText();
        MyDataBaseCon userInfo = new MyDataBaseCon();
        userInfo.insert(user, password,type);
        dispose();
        new SignInFrom().setVisible(true);
    }                                         

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        //SignUnFrom().setVisible(true);
        dispose();
        new ForumHome().setVisible(true);
    }                                         

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
            java.util.logging.Logger.getLogger(SignInFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CancelBtn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}