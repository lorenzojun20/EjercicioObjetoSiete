/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Hora;
import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Hora h1, h2;
    public Principal() {
        initComponents();
        txtHora1.setEditable(true);
        txtHora2.setEditable(true);
        txtMinuto1.setEditable(true);
        txtMinuto2.setEditable(true);
        txtSegundo1.setEditable(true);
        txtSegundo2.setEditable(true);
        cmdIngresar.setEnabled(true);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cmdValidar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdIgual = new javax.swing.JButton();
        cmdMayor = new javax.swing.JButton();
        cmdMenor = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdIngresar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        txtHora2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMinuto2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSegundo2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtHora1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMinuto1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSegundo1 = new javax.swing.JTextField();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HORA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdValidar.setText("Validar");
        cmdValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdValidarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 30));

        cmdIgual.setText("Igual");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIgualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 30));

        cmdMayor.setText("Mayor");
        cmdMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMayorActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        cmdMenor.setText("Menor ");
        cmdMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenorActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));

        cmdIngresar.setText("Ingresar Hora");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 180, 300));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 340, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora 2"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHora2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHora2KeyTyped(evt);
            }
        });
        jPanel4.add(txtHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Horas:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        txtMinuto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinuto2KeyTyped(evt);
            }
        });
        jPanel4.add(txtMinuto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Minutos:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 30));

        txtSegundo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundo2KeyTyped(evt);
            }
        });
        jPanel4.add(txtSegundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Segundos:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, 150));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora1"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Horas:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 60, 30));

        txtHora1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHora1KeyTyped(evt);
            }
        });
        jPanel5.add(txtHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 60, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Minutos:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 60, 30));

        txtMinuto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinuto1KeyTyped(evt);
            }
        });
        jPanel5.add(txtMinuto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 60, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Segundos:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 30));

        txtSegundo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundo1KeyTyped(evt);
            }
        });
        jPanel5.add(txtSegundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(613, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtHora1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora1KeyTyped
      char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtHora1KeyTyped

    private void txtMinuto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuto1KeyTyped
     char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtMinuto1KeyTyped

    private void txtSegundo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtSegundo1KeyTyped

    private void txtHora2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHora2KeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtHora2KeyTyped

    private void txtMinuto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinuto2KeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtMinuto2KeyTyped

    private void txtSegundo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundo2KeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtSegundo2KeyTyped

    private void cmdValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdValidarActionPerformed
     String aux;
     aux = h1.valida(h2);
     txtResultado.setText(aux);
     cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(true);
        cmdMayor.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
        
    }//GEN-LAST:event_cmdValidarActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
     int hora,hora2,minuto,minuto2,segundo,segundo2;
     if(txtHora1.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtHora1.requestFocusInWindow();
     }else if(txtHora2.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtHora2.requestFocusInWindow();
     }else if(txtMinuto1.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtMinuto1.requestFocusInWindow();
     }else if(txtMinuto2.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtMinuto2.requestFocusInWindow();
     }else if(txtSegundo1.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtSegundo1.requestFocusInWindow();
     }else if(txtSegundo2.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Espacio Vacío, Favor Llénelo","ERROR",JOptionPane.ERROR_MESSAGE);
         txtSegundo2.requestFocusInWindow();
     }else{
     hora = Integer.parseInt(txtHora1.getText());
     hora2 = Integer.parseInt(txtHora2.getText());
     minuto = Integer.parseInt(txtMinuto1.getText());
     minuto2 = Integer.parseInt(txtMinuto2.getText());
     segundo = Integer.parseInt(txtSegundo1.getText());
     segundo2 = Integer.parseInt(txtSegundo2.getText());
     
     if(hora > 23){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtHora1.requestFocusInWindow();
     }else if(hora2 > 23){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtHora2.requestFocusInWindow();
     }else if(minuto > 60){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtMinuto1.requestFocusInWindow();
     }else if(minuto2 > 60){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtMinuto2.requestFocusInWindow();
     }else if(segundo > 60){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtSegundo1.requestFocusInWindow();
     }else if(segundo2 > 60){
         JOptionPane.showMessageDialog(this, "Hora inválida", "ERROR",JOptionPane.ERROR_MESSAGE);
         txtSegundo2.requestFocusInWindow();
     }else{
         h1 = new Hora(hora,minuto,segundo);
         h2 = new Hora(hora2,minuto2,segundo2);
         JOptionPane.showMessageDialog(this, "¡Hora Ingresada Correctamente!");
         
         txtHora1.setEditable(false);
        txtHora2.setEditable(false);
        txtMinuto1.setEditable(false);
        txtMinuto2.setEditable(false);
        txtSegundo1.setEditable(false);
        txtSegundo2.setEditable(false);
        cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(true);
        cmdIgual.setEnabled(true);
        cmdMayor.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
         
     }
     }
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIgualActionPerformed
        String aux;
        aux = h1.igual(h2);
        txtResultado.setText(aux);
        
        cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(true);
        cmdMenor.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdIgualActionPerformed

    private void cmdMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMayorActionPerformed
        String aux;
        aux = h1.mayorque(h2);
        txtResultado.setText(aux);
        
        cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdMenor.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdMayorActionPerformed

    private void cmdMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenorActionPerformed
       String aux;
        aux = h1.menorque(h2);
        txtResultado.setText(aux);
        
        cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdMenorActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
       String aux;
        aux = h1.mostrar();
        txtResultado.setText(aux);
        
        cmdIngresar.setEnabled(false);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
       txtHora1.setText("");
       txtHora2.setText("");
       txtMinuto1.setText("");
       txtMinuto2.setText("");
       txtSegundo1.setText("");
       txtSegundo2.setText("");
       txtResultado.setText("");
       
       txtHora1.requestFocusInWindow();
       
       txtHora1.setEditable(true);
        txtHora2.setEditable(true);
        txtMinuto1.setEditable(true);
        txtMinuto2.setEditable(true);
        txtSegundo1.setEditable(true);
        txtSegundo2.setEditable(true);
        cmdIngresar.setEnabled(true);
        cmdValidar.setEnabled(false);
        cmdIgual.setEnabled(false);
        cmdMayor.setEnabled(false);
        cmdMenor.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMayor;
    private javax.swing.JButton cmdMenor;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdValidar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHora1;
    private javax.swing.JTextField txtHora2;
    private javax.swing.JTextField txtMinuto1;
    private javax.swing.JTextField txtMinuto2;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSegundo1;
    private javax.swing.JTextField txtSegundo2;
    // End of variables declaration//GEN-END:variables
}