/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import aplicacion.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ssdesth
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfAdminUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jpfAdminContrasenia = new javax.swing.JPasswordField();
        lblFondoAdmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtfSecreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnIngresarSecretaria = new javax.swing.JButton();
        jpfSecreContrasenia = new javax.swing.JPasswordField();
        lblFondoSecretaria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAdmin.setBackground(new java.awt.Color(0, 2, 255));
        jpAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Usuario:");
        jpAdmin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 79, -1, -1));

        jtfAdminUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAdminUsuarioActionPerformed(evt);
            }
        });
        jpAdmin.add(jtfAdminUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 74, 215, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Contrasena");
        jpAdmin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 119, -1, -1));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpAdmin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 191, 124, -1));
        jpAdmin.add(jpfAdminContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 119, 215, -1));
        jpAdmin.add(lblFondoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        jTabbedPane1.addTab("Administrador", jpAdmin);

        jPanel2.setBackground(new java.awt.Color(0, 15, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Usuario:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 79, -1, -1));

        jtfSecreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSecreUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jtfSecreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 74, 215, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Contrasena");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 119, -1, -1));

        btnIngresarSecretaria.setText("Ingresar");
        btnIngresarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarSecretariaActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresarSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 191, 124, -1));
        jPanel2.add(jpfSecreContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 119, 215, -1));
        jPanel2.add(lblFondoSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        jTabbedPane1.addTab("Secretaria", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfAdminUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAdminUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfAdminUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String usuario = jtfAdminUsuario.getText();
        String password = jpfAdminContrasenia.getText();
        //jpfAdminContrasenia.getPassword();
        if(main.miControlador.ValidarUsuarioAdministrador(usuario, 
                password)){
            Administrador temporal= main.miControlador.
                    CargarAdministrador(usuario);
            main.miControlador.CargarVentanaAdministrador(temporal);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                            "Alerta", 2);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfSecreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSecreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSecreUsuarioActionPerformed

    private void btnIngresarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSecretariaActionPerformed
        String usuario = jtfSecreUsuario.getText();
        String password = jpfSecreContrasenia.getText();
        
        if(main.miControlador.ValidarUsuarioSecretaria(usuario, 
                password)){
            //System.out.println("Usuario Aceptado");
            Secretaria temp = main.miControlador.
                    CargarSecretaria(usuario);
            main.miControlador.CargarVentanaSecretaria(temp);
        
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado",
                            "Alerta", 2);
        }
        
    }//GEN-LAST:event_btnIngresarSecretariaActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    public void CargadorVentana(){
        this.setTitle("Loggin");
        
        ImageIcon imagen = new ImageIcon("src/Multimedia/FondoLoggin.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFondoAdmin.getWidth(),
                lblFondoAdmin.getHeight(), Image.SCALE_DEFAULT));
        lblFondoAdmin.setIcon(icono);
        lblFondoSecretaria.setIcon(icono);
        //FondoLoggin.jpg
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarSecretaria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpAdmin;
    private javax.swing.JPasswordField jpfAdminContrasenia;
    private javax.swing.JPasswordField jpfSecreContrasenia;
    private javax.swing.JTextField jtfAdminUsuario;
    private javax.swing.JTextField jtfSecreUsuario;
    private javax.swing.JLabel lblFondoAdmin;
    private javax.swing.JLabel lblFondoSecretaria;
    // End of variables declaration//GEN-END:variables
}
