
import javax.swing.JOptionPane;

public class expertAns extends javax.swing.JFrame {

    String userName,userType;
    expertAns(){
    initComponents();
    }
    expertAns(String user,String type) {
        userName = user;
        userType = type;
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

        LogOutButton = new javax.swing.JButton();
        QueButton = new javax.swing.JButton();
        AnsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerArea = new javax.swing.JTextArea();
        submitBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        quesArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expert Sign In");
        setBackground(new java.awt.Color(238, 112, 9));
        setLocation(new java.awt.Point(350, 150));
        setSize(new java.awt.Dimension(852, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogOutButton.setBackground(new java.awt.Color(128, 169, 183));
        LogOutButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(21, 11, 37));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 15, -1, -1));

        QueButton.setBackground(new java.awt.Color(128, 105, 181));
        QueButton.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        QueButton.setForeground(new java.awt.Color(167, 48, 63));
        QueButton.setText("Questions");
        QueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        AnsButton.setBackground(new java.awt.Color(129, 79, 205));
        AnsButton.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        AnsButton.setForeground(new java.awt.Color(54, 50, 60));
        AnsButton.setText("Answer");
        AnsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, -1));
        answerArea.setVisible(false);
        answerArea.setColumns(20);
        answerArea.setRows(5);
        jScrollPane1.setViewportView(answerArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 750, -1));

        submitBtn.setBackground(new java.awt.Color(0, 102, 102));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(187, 114, 46));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 30));
        quesArea.setVisible(false);
        quesArea.setColumns(20);
        quesArea.setRows(5);
        jScrollPane2.setViewportView(quesArea);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\MyIcon\\expert.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 450));

        pack();
    }// </editor-fold>                        
    QandAdataBase qna = new QandAdataBase();
    private void QueButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String[] qus = QandAdataBase.getQus();
        if(qus[1]!=null)
                quesArea.setText(qus[1]);
        else
            quesArea.setText("No questions left to answer\n");
        quesArea.setVisible(true);
    }                                         

    private void AnsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        answerArea.setVisible(true);
    }                                         

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String ans = answerArea.getText();
        String type="Expert";
        String[] qus = QandAdataBase.getQus();
        
        qna.updateAns(qus[0],qus[1],ans);
        JOptionPane.showMessageDialog(null, "Thank You\n Your Answer Submitted Successfully");
        answerArea.setText("");
    }                                         

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
            java.util.logging.Logger.getLogger(expertAns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(expertAns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(expertAns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expertAns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new expertAns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AnsButton;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton QueButton;
    private javax.swing.JTextArea answerArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea quesArea;
    private javax.swing.JButton submitBtn;
    // End of variables declaration                   
}

