/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class GenerarMantencion extends javax.swing.JInternalFrame {

    /**
     * Creates new form GenerarMantencion
     */
    public GenerarMantencion() {
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

        b_buscarrepuesto = new javax.swing.JButton();
        b_mostrarrepuesto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Nueva Mantencion");

        b_buscarrepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        b_buscarrepuesto.setText("Buscar");
        b_buscarrepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarrepuestoActionPerformed(evt);
            }
        });

        b_mostrarrepuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomostrarrepuestos.jpg"))); // NOI18N
        b_mostrarrepuesto.setText("Mostrar Repuestos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(b_buscarrepuesto)
                .addGap(64, 64, 64)
                .addComponent(b_mostrarrepuesto)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_buscarrepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mostrarrepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(339, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_buscarrepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarrepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscarrepuestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscarrepuesto;
    private javax.swing.JButton b_mostrarrepuesto;
    // End of variables declaration//GEN-END:variables
}
