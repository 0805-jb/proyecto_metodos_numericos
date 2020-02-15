
package Metodos_numericos;

import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Errores extends javax.swing.JFrame {

    public Errores() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CAMPO1 = new javax.swing.JTextField();
        CAMPO2 = new javax.swing.JTextField();
        REDOND = new javax.swing.JRadioButton();
        TRUNC = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BOTONR = new javax.swing.JButton();
        CAMPO3 = new javax.swing.JLabel();
        CAMPO4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ERROR RELATIVO Y ABSOLUTO");

        jLabel2.setText("VALOR APROXIMADO");

        jLabel3.setText("VALOR VERDADERO");

        CAMPO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPO1ActionPerformed(evt);
            }
        });

        REDOND.setText("REDONDEO");
        REDOND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REDONDActionPerformed(evt);
            }
        });

        TRUNC.setText("TRUNCAMIENTO");
        TRUNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRUNCActionPerformed(evt);
            }
        });

        jLabel4.setText("ABSOLUTO");

        jLabel5.setText("RELATIVO");

        BOTONR.setText("RESULTADO");
        BOTONR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(REDOND)
                        .addGap(18, 18, 18)
                        .addComponent(TRUNC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(BOTONR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CAMPO2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CAMPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAMPO3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CAMPO4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CAMPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CAMPO3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CAMPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CAMPO4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REDOND)
                    .addComponent(TRUNC)
                    .addComponent(BOTONR))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAMPO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPO1ActionPerformed

    private void TRUNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRUNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRUNCActionPerformed

    private void BOTONRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONRActionPerformed
       NumberFormat numberFormat = NumberFormat.getInstance();
        if(TRUNC.isSelected()){
            numberFormat.setMaximumFractionDigits(Integer.parseInt(JOptionPane.showInputDialog(null, "numero de dígitos para truncar")));
            numberFormat.setRoundingMode(RoundingMode.DOWN);
            double errorAbs = Double.parseDouble(CAMPO2.getText()) - Double.parseDouble(CAMPO1.getText());
            CAMPO3.setText(numberFormat.format(errorAbs));
            double errorRel = (errorAbs / Double.parseDouble(CAMPO2.getText())) * 100;
            numberFormat.setRoundingMode(RoundingMode.DOWN);
            CAMPO4.setText(numberFormat.format(errorRel) + "%");
        }else if(REDOND.isSelected()){
            numberFormat.setMaximumFractionDigits(Integer.parseInt(JOptionPane.showInputDialog(null, "numero de dígitos para redondear")));
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            double errorAbs = Double.parseDouble(CAMPO2.getText()) - Double.parseDouble(CAMPO1.getText());
            CAMPO3.setText(numberFormat.format(errorAbs));
            double errorRel = (errorAbs / Double.parseDouble(CAMPO2.getText())) * 100;
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            CAMPO4.setText(numberFormat.format(errorRel) + "%");
        }
    }//GEN-LAST:event_BOTONRActionPerformed
  private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        
        if(!((int)c == 46 || ((int)c >= 48 && (int)c <= 57))){
            getToolkit().beep();
            evt.consume();
            CAMPO1.setCursor(null);
        }
    }                                    

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        
        if(!((int)c == 46 || ((int)c >= 48 && (int)c <= 57))){
            getToolkit().beep();
            evt.consume();
            CAMPO2.setCursor(null);
        }
    }   
    private void REDONDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REDONDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REDONDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("CDE/Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Errores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Errores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONR;
    private javax.swing.JTextField CAMPO1;
    private javax.swing.JTextField CAMPO2;
    private javax.swing.JLabel CAMPO3;
    private javax.swing.JLabel CAMPO4;
    private javax.swing.JRadioButton REDOND;
    private javax.swing.JRadioButton TRUNC;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
