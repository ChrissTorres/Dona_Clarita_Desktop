/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Chriss
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuProv = new javax.swing.JMenu();
        mnuProvInsert = new javax.swing.JMenuItem();
        mnuProvVer = new javax.swing.JMenuItem();
        mnuProvRealizarPed = new javax.swing.JMenuItem();
        mnuHabi = new javax.swing.JMenu();
        mnuHabitVer = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuServComedor = new javax.swing.JMenu();
        mnuMenu = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostal Doña Clarita");

        mnuArchivo.setText("Archivo");
        mnuArchivo.add(jSeparator1);

        jMenuBar2.add(mnuArchivo);

        mnuProv.setText("Proveedores");

        mnuProvInsert.setText("Ingresar Proveedor");
        mnuProv.add(mnuProvInsert);

        mnuProvVer.setText("Ver Proveedores");
        mnuProv.add(mnuProvVer);

        mnuProvRealizarPed.setText("Realizar Pedido");
        mnuProv.add(mnuProvRealizarPed);

        jMenuBar2.add(mnuProv);

        mnuHabi.setText("Habitaciones");

        mnuHabitVer.setText("Ver Habitaciones");
        mnuHabi.add(mnuHabitVer);

        jMenuBar2.add(mnuHabi);

        jMenu3.setText("Servicios");

        mnuServComedor.setText("Servicio de Comedor");

        mnuMenu.setText("Menu");
        mnuServComedor.add(mnuMenu);

        jMenu3.add(mnuServComedor);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuHabi;
    private javax.swing.JMenuItem mnuHabitVer;
    private javax.swing.JMenuItem mnuMenu;
    private javax.swing.JMenu mnuProv;
    private javax.swing.JMenuItem mnuProvInsert;
    private javax.swing.JMenuItem mnuProvRealizarPed;
    private javax.swing.JMenuItem mnuProvVer;
    private javax.swing.JMenu mnuServComedor;
    // End of variables declaration//GEN-END:variables
}
