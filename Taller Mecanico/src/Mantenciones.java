/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class Mantenciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mantenciones
     */
    public Mantenciones() {
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

        l_secuenciamantencion = new javax.swing.JLabel();
        b_buscarmeantencion = new javax.swing.JButton();
        b_mostrarmantencion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        j_mantencion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenciones ");

        l_secuenciamantencion.setText("Ingrese Secuencia Mantencion : ");

        b_buscarmeantencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        b_buscarmeantencion.setText("Buscar");
        b_buscarmeantencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_buscarmeantencionActionPerformed(evt);
            }
        });

        b_mostrarmantencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrarmantencion.jpg"))); // NOI18N
        b_mostrarmantencion.setText("Mostrar Mantencion");
        b_mostrarmantencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mostrarmantencionActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        j_mantencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_mantencionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(l_secuenciamantencion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j_mantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(b_buscarmeantencion)
                        .addGap(68, 68, 68)
                        .addComponent(b_mostrarmantencion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_secuenciamantencion)
                    .addComponent(b_buscarmeantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_mantencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_mostrarmantencion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_buscarmeantencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_buscarmeantencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_buscarmeantencionActionPerformed

    private void j_mantencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_mantencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_mantencionActionPerformed

    private void b_mostrarmantencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mostrarmantencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_mostrarmantencionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_buscarmeantencion;
    private javax.swing.JButton b_mostrarmantencion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField j_mantencion;
    private javax.swing.JLabel l_secuenciamantencion;
    // End of variables declaration//GEN-END:variables
}
