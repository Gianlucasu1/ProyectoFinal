/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionproyectos.vista;

import PatronesDiseño.PrincipalVisitador;

/**
 *
 * @author gianlucasorem
 */
public class pnl_buttons_admon extends javax.swing.JPanel implements PrincipalVisitador {

    public void setVisitador(PrincipalVisitador visitador) {
    this.visitador=visitador;
    }

    /**
     * Creates new form pnl_buttons_admon
     */
    public pnl_buttons_admon() {
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

        CrearProyecto = new javax.swing.JButton();
        VerEmpleados = new javax.swing.JButton();
        AgregarEmpleados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ControlarProyecto = new javax.swing.JButton();

        CrearProyecto.setText("Crear ");
        CrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProyectoActionPerformed(evt);
            }
        });

        VerEmpleados.setText("Ver ");
        VerEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEmpleadosActionPerformed(evt);
            }
        });

        AgregarEmpleados.setText("Agregar");
        AgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEmpleadosActionPerformed(evt);
            }
        });

        jLabel1.setText("EMPLEADOS:");

        jLabel2.setText("PROYECTOS:");

        ControlarProyecto.setText("Controlar");
        ControlarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControlarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ControlarProyecto)
                    .addComponent(AgregarEmpleados)
                    .addComponent(VerEmpleados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerEmpleados)
                .addGap(18, 18, 18)
                .addComponent(AgregarEmpleados)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(CrearProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ControlarProyecto)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProyectoActionPerformed
   // Aca empiezoa  crear el proyecto 
   visitador.CambiarTarjetaB("CrearProyecto");
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearProyectoActionPerformed

    private void AgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEmpleadosActionPerformed
       visitador.CambiarTarjetaB("CrearEmpleados"); // TODO add your handling code here:
    }//GEN-LAST:event_AgregarEmpleadosActionPerformed

    private void VerEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEmpleadosActionPerformed
    visitador.CambiarTarjetaB("VerEmpleados");
        // TODO add your handling code here:
    }//GEN-LAST:event_VerEmpleadosActionPerformed

    private void ControlarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControlarProyectoActionPerformed
    visitador.CambiarTarjetaB("ConsultarProyectos"); // TODO add your handling code here:
    }//GEN-LAST:event_ControlarProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEmpleados;
    private javax.swing.JButton ControlarProyecto;
    private javax.swing.JButton CrearProyecto;
    private javax.swing.JButton VerEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private PrincipalVisitador visitador;

    @Override
    public void cambiarTarjeta(String tarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CambiarTarjetaB(String tarjeta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
