
import javax.swing.JOptionPane;


public class QuesAndAns extends javax.swing.JFrame {

    String userName,userType;
    QuesAndAns(){
    initComponents();
    }
    QuesAndAns(String user,String type) {
        userName = user;
        userType = type;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        answerButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionLabel = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        Answer = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Questions and Answers");
        setLocation(new java.awt.Point(350, 150));
        setPreferredSize(new java.awt.Dimension(852, 450));
        setSize(new java.awt.Dimension(852, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answerButton.setBackground(new java.awt.Color(128, 122, 206));
        answerButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        answerButton.setText("Answers");
        answerButton.setToolTipText("Your Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, -1));

        LogOutButton.setBackground(new java.awt.Color(181, 124, 45));
        LogOutButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(128, 89, 167));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 231, 242));
        jLabel1.setText("Write your question here...");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 24));

        jScrollPane1.setBackground(new java.awt.Color(153, 149, 148));

        questionLabel.setColumns(20);
        questionLabel.setRows(5);
        questionLabel.setToolTipText("Write your question....");
        jScrollPane1.setViewportView(questionLabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 800, 110));

        submitButton.setBackground(new java.awt.Color(215, 111, 56));
        submitButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        Answer.setVisible(false);
        Answer.setBackground(new java.awt.Color(102, 102, 102));
        Answer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Answer.setForeground(new java.awt.Color(255, 255, 255));
        Answer.setText("I am here");
        getContentPane().add(Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 780, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon("H:\\MyIcon\\Q&A.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 450));

        pack();
    }// </editor-fold>                        

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        dispose();
        new ForumHome().setVisible(true);
    }                                            
    QandAdataBase qna = new QandAdataBase();
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String ans = QandAdataBase.getAns(userName);
        if(ans!=null)
            Answer.setText(ans);
        else 
            Answer.setText("Sorry nobody has not ans yet!!\n");
        Answer.setVisible(true);
        //qna.setVisible(true);
    }                                            

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String ques = questionLabel.getText();
        
        qna.insert(userName,ques,userType);
        JOptionPane.showMessageDialog(null, "Thank You\n Your Question Submitted Successfully");
        questionLabel.setText("");
        
    }                                           

   
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
                new QuesAndAns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Answer;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton answerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea questionLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration                   
}
