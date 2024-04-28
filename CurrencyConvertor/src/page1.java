
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author selva
 */
public class page1 extends javax.swing.JFrame {

    /**
     * Creates new form page1
     */
    public page1() {
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

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        choiceFrom = new javax.swing.JComboBox<>();
        choiceTo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        output = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 204, 102));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Enter the amount");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("To");

        input.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        choiceFrom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        choiceFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC", " " }));
        choiceFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceFromActionPerformed(evt);
            }
        });

        choiceTo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        choiceTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INR", "USD", "EUR", "CAD", "JPY", "CNY", "BTC", " " }));
        choiceTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceToActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Convert");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Currency Convertor");
        jLabel4.setToolTipText("");

        output.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        output.setCaretColor(new java.awt.Color(0, 204, 0));
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\selva\\OneDrive\\Desktop\\t.jpeg")); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(80, 80, 80)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(input)
                                        .addComponent(choiceFrom, 0, 204, Short.MAX_VALUE))
                                    .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)
                        .addGap(92, 92, 92)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(choiceFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(choiceTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(78, 78, 78)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double total;
        double amount=Double.parseDouble(input.getText());
        switch (choiceFrom.getSelectedItem().toString()) {
            case "USD":
            //INR
            switch (choiceTo.getSelectedItem().toString()) {
                case "INR":
                total=amount*82.743;
                output.setText(input.getText()+" USD = "+total+" INR");
                break;
                case "EUR":
                total=amount*0.943;
                output.setText(input.getText()+" USD = "+total+" EUR");
                break;
                case "CAD":
                total=amount*1.351;
                output.setText(input.getText()+" USD = "+total+" CAD");
                break;
                case "JPY":
                total=amount*132.440;
                output.setText(input.getText()+" USD = "+total+" JPY");
                break;
                case "CNY":
                total=amount*6.871;
                output.setText(input.getText()+" USD = "+total+" CNY");
                break;
                case "BTC":
                total=amount*0.0000594;
                output.setText(input.getText()+" USD = "+total+" BTC");
                break;
                default:
                total=amount*1;
                output.setText(input.getText()+" USD = "+total+" USD");
                break;
            }
            break;
            case "INR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.0120;
                        output.setText(input.getText()+" INR = "+total+"$");
                        break;
                    case "EUR":
                        total=amount*0.01139;
                        output.setText(input.getText()+" INR = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.0163;
                        output.setText(input.getText()+" INR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*1.6012;
                        output.setText(input.getText()+" INR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*0.083;
                        output.setText(input.getText()+" INR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000000726;
                        output.setText(input.getText()+" INR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" INR = "+total+" INR");
                        break;
                }
                break;
                case "EUR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*1.06057;
                        output.setText(input.getText()+" EUR = "+total+" $");
                        break;
                    case "INR":
                        total=amount*87.74738;
                        output.setText(input.getText()+" EUR = "+total+" INR");
                        break;
                    case "CAD":
                        total=amount*1.4336;
                        output.setText(input.getText()+" EUR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*140.5083;
                        output.setText(input.getText()+" EUR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.2925;
                        output.setText(input.getText()+" EUR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000630;
                        output.setText(input.getText()+" EUR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" EUR = "+total+" EUR");
                        break;
                }
                break;
                case "CAD":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.7397;
                        output.setText(input.getText()+" CAD = "+total+" $");
                        break;
                    case "INR":
                        total=amount*61.2043;
                        output.setText(input.getText()+" CAD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.6975;
                        output.setText(input.getText()+" CAD = "+total+" EUR");
                        break;
                    case "JPY":
                        total=amount*98.0054;
                        output.setText(input.getText()+" CAD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*5.0865;
                        output.setText(input.getText()+" CAD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000439;
                        output.setText(input.getText()+" CAD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CAD = "+total+" CAD");
                        break;
                }
                break;
                case "JPY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.00754;
                        output.setText(input.getText()+" JPY = "+total+" $");
                        break;
                    case "INR":
                        total=amount*0.6244;
                        output.setText(input.getText()+" JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.00711;
                        output.setText(input.getText()+" JPY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.01020;
                        output.setText(input.getText()+" JPY = "+total+" CAD");
                        break;
                    case "CNY":
                        total=amount*0.051900;
                        output.setText(input.getText()+" JPY = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000000453;
                        output.setText(input.getText()+" JPY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" JPY = "+total+" JPY");
                        break;
                }
                break;
                case "CNY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.1454;
                        output.setText(input.getText()+" CNY = "+total+" $");
                        break;
                    case "INR":
                        total=amount*12.0325;
                        output.setText(input.getText()+" CNY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.13712;
                        output.setText(input.getText()+" CNY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.19659;
                        output.setText(input.getText()+" CNY = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*19.26750;
                        output.setText(input.getText()+" CNY = "+total+" JPY");
                        break;
                    case "BTC":
                        total=amount*0.000008646;
                        output.setText(input.getText()+" CNY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" CNY = "+total+" CNY");
                        break;
                }
                break;
                case "BTC":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*16820.845;
                        output.setText(input.getText()+" BTC = "+total+" $");
                        break;
                    case "INR":
                        total=amount*1391685.7254;
                        output.setText(input.getText()+" BTC = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*15860.1393;
                        output.setText(input.getText()+" BTC = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*22738.3511;
                        output.setText(input.getText()+" BTC = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*2228482.3907;
                        output.setText(input.getText()+" BTC = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*115660.1311;
                        output.setText(input.getText()+" BTC = "+total+" CNY");
                        break;
                    default:
                        total=amount*1;
                        output.setText(input.getText()+" BTC = "+total+" BTC");
                        break;
                }
                break;
        }
            
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void choiceFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceFromActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_choiceFromActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void choiceToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceToActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

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
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choiceFrom;
    private javax.swing.JComboBox<String> choiceTo;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField output;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
