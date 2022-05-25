
public class showQuesorAns extends javax.swing.JFrame {

    /**
     * Creates new form showQuesorAns
     */
    String ans,qus;
    public showQuesorAns(String answer,String question) {
        ans = answer;
        qus = question;
        initComponents();
    }

     private void initComponents() {

        quesOrAns = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quesOrAns.setBackground(new java.awt.Color(0, 204, 204));
        quesOrAns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quesOrAns.setForeground(new java.awt.Color(255, 153, 0));
        quesOrAns.setText("Your Question is :"+qus+"And here is your answer\n"+ans);
        getContentPane().add(quesOrAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 780, 184));

        BackButton.setBackground(new java.awt.Color(0, 102, 102));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(51, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("H:\\MyIcon\\quran.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 850, 460));

        pack();
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
    }                                          

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel quesOrAns;
    // End of variables declaration                   
}
    
