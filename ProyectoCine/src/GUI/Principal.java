/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author accel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jButtonRegistrar = new javax.swing.JButton();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonCartelera = new javax.swing.JButton();
        jButtonConsumibles = new javax.swing.JButton();
        jButtonPromociones1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/152039-qvadrons/png/add-user_opt.png"))); // NOI18N
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonRegistrar.setBorderPainted(false);
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 130, 30));

        jButtonIniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        jButtonIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI", 0, 13)); // NOI18N
        jButtonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons/152039-qvadrons/png/user_opt.png"))); // NOI18N
        jButtonIniciarSesion.setText("Iniciar Sesión");
        jButtonIniciarSesion.setFocusPainted(false);
        getContentPane().add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, 30));

        jButtonCartelera.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButtonCartelera.setText("Cartelera");
        getContentPane().add(jButtonCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 170, 40));

        jButtonConsumibles.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButtonConsumibles.setText("Consumibles");
        getContentPane().add(jButtonConsumibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 220, 40));

        jButtonPromociones1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jButtonPromociones1.setText("Promociones");
        getContentPane().add(jButtonPromociones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 220, 40));

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
    private javax.swing.JButton jButtonCartelera;
    private javax.swing.JButton jButtonConsumibles;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonPromociones1;
    private javax.swing.JButton jButtonRegistrar;
    // End of variables declaration//GEN-END:variables
}
