
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mi PC
 */


public class AmbienteTaller extends javax.swing.JFrame {

    /**
     * Creates new form AmbienteTaller
     */
    
     public static JDesktopPane getjDesktopPane() {
        return jDesktopPane1;
    }
    Login l=new Login();
    Automoviles a=new Automoviles();
    Mecanicos m=new Mecanicos();
    Mantenciones man=new Mantenciones();
    Repuestos r= new Repuestos();
    GenerarMantencion g=new GenerarMantencion();
    int cont=0;
    public AmbienteTaller() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        login = new javax.swing.JMenu();
        Mantencionmenu = new javax.swing.JMenu();
        menu_automoviles = new javax.swing.JMenu();
        menu_mecanicos = new javax.swing.JMenu();
        menu_mantenciones = new javax.swing.JMenu();
        menu_repuestos = new javax.swing.JMenu();
        menu_generarmantencion = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconologin.jpg"))); // NOI18N
        login.setText("Acceso ");
        login.setIconTextGap(10);
        login.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                loginMenuSelected(evt);
            }
        });
        jMenuBar1.add(login);

        Mantencionmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomantencionmenu.jpg"))); // NOI18N
        Mantencionmenu.setText("Mantencion");
        Mantencionmenu.setIconTextGap(10);
        Mantencionmenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MantencionmenuMenuSelected(evt);
            }
        });
        Mantencionmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MantencionmenuMouseEntered(evt);
            }
        });

        menu_automoviles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoautomovil.jpg"))); // NOI18N
        menu_automoviles.setText("Automoviles");
        menu_automoviles.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_automovilesMenuSelected(evt);
            }
        });
        menu_automoviles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_automovilesMouseClicked(evt);
            }
        });
        Mantencionmenu.add(menu_automoviles);

        menu_mecanicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomecanico.jpg"))); // NOI18N
        menu_mecanicos.setText("Mecanicos");
        menu_mecanicos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_mecanicosMenuSelected(evt);
            }
        });
        menu_mecanicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_mecanicosMouseClicked(evt);
            }
        });
        Mantencionmenu.add(menu_mecanicos);

        menu_mantenciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconomantencion.jpg"))); // NOI18N
        menu_mantenciones.setText("Mantenciones");
        menu_mantenciones.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_mantencionesMenuSelected(evt);
            }
        });
        menu_mantenciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_mantencionesMouseClicked(evt);
            }
        });
        Mantencionmenu.add(menu_mantenciones);

        menu_repuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconorepuestos.jpg"))); // NOI18N
        menu_repuestos.setText("Repuestos");
        menu_repuestos.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_repuestosMenuSelected(evt);
            }
        });
        menu_repuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_repuestosMouseClicked(evt);
            }
        });
        Mantencionmenu.add(menu_repuestos);

        menu_generarmantencion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconogenerarmantencion.jpg"))); // NOI18N
        menu_generarmantencion.setText("Generar Mantencion");
        menu_generarmantencion.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_generarmantencionMenuSelected(evt);
            }
        });
        menu_generarmantencion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_generarmantencionMouseClicked(evt);
            }
        });
        Mantencionmenu.add(menu_generarmantencion);

        jMenuBar1.add(Mantencionmenu);

        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconosalirmenu.jpg"))); // NOI18N
        menu_salir.setText("Salir");
        menu_salir.setIconTextGap(10);
        menu_salir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menu_salirMenuSelected(evt);
            }
        });
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_salirMenuSelected
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_salirMenuSelected

    private void loginMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_loginMenuSelected
        // TODO add your handling code here:
        l.remove(l);
        jDesktopPane1.add(l);
         cont++;  
        
        if(cont==1){
            
             jDesktopPane1.remove(l);
        jDesktopPane1.add(l);
        l.setVisible(true);
        
        }
       
    }//GEN-LAST:event_loginMenuSelected

    private void MantencionmenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MantencionmenuMenuSelected
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_MantencionmenuMenuSelected

    private void menu_automovilesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_automovilesMenuSelected
        // TODO add your handling code here:
        
            
            
           
      
    }//GEN-LAST:event_menu_automovilesMenuSelected

    private void MantencionmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantencionmenuMouseEntered
        // TODO add your handling code here:
        if(!l.isClosed()){
   JOptionPane.showMessageDialog(rootPane,"PorFavor Logeate", null, WIDTH, null);
        }
        
    }//GEN-LAST:event_MantencionmenuMouseEntered

    private void menu_mecanicosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_mecanicosMenuSelected
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_menu_mecanicosMenuSelected

    private void menu_mantencionesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_mantencionesMenuSelected
        // TODO add your handling code here:
       
    }//GEN-LAST:event_menu_mantencionesMenuSelected

    private void menu_repuestosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_repuestosMenuSelected
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_repuestosMenuSelected

    private void menu_generarmantencionMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menu_generarmantencionMenuSelected
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_generarmantencionMenuSelected

    private void menu_automovilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_automovilesMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.add(a);
            a.setVisible(true);
            a.toFront();
        
    }//GEN-LAST:event_menu_automovilesMouseClicked

    private void menu_generarmantencionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_generarmantencionMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.add(g);
        g.setVisible(true);
        g.toFront();
    }//GEN-LAST:event_menu_generarmantencionMouseClicked

    private void menu_repuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_repuestosMouseClicked
        // TODO add your handling code here:
        jDesktopPane1.add(r);
        r.setVisible(true);
        r.toFront();
    }//GEN-LAST:event_menu_repuestosMouseClicked

    private void menu_mecanicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_mecanicosMouseClicked
        // TODO add your handling code here:
         jDesktopPane1.add(m);
        m.setVisible(true);
        m.toFront();
        
        
    }//GEN-LAST:event_menu_mecanicosMouseClicked

    private void menu_mantencionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_mantencionesMouseClicked
        // TODO add your handling code here:
         jDesktopPane1.add(man);
        man.setVisible(true);
        man.toFront();
    }//GEN-LAST:event_menu_mantencionesMouseClicked

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_menu_salirMouseClicked

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
            java.util.logging.Logger.getLogger(AmbienteTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbienteTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbienteTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbienteTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbienteTaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Mantencionmenu;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu login;
    private javax.swing.JMenu menu_automoviles;
    private javax.swing.JMenu menu_generarmantencion;
    private javax.swing.JMenu menu_mantenciones;
    private javax.swing.JMenu menu_mecanicos;
    private javax.swing.JMenu menu_repuestos;
    private javax.swing.JMenu menu_salir;
    // End of variables declaration//GEN-END:variables
}
