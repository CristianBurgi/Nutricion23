/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import entidades.Dieta;
import entidades.DietaComida;
import entidades.Horario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pdf.pdfHorario;
import service.DietaComidaService;
import service.DietaService;

/**
 *
 * @author Cristian
 */
public class ConsultaPorHorario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPorHorario
     */
    public ConsultaPorHorario() {
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

        jLabel1 = new javax.swing.JLabel();
        comboHorario = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorario = new javax.swing.JTable();
        btnRporte = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta por Horario");
        setMinimumSize(new java.awt.Dimension(90, 18));
        setPreferredSize(new java.awt.Dimension(800, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione Horario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 39, -1, -1));

        comboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "DESAYUNO", "ALMUERZO", "MERIENDA", "CENA", "SNACK" }));
        comboHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(comboHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 36, 216, 35));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablaHorario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tablaHorario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaHorario);

        btnRporte.setBackground(new java.awt.Color(255, 255, 255));
        btnRporte.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnRporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/print_9635651 (1).png"))); // NOI18N
        btnRporte.setText("Imprimir Reporte");
        btnRporte.setBorder(null);
        btnRporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRporte)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRporte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 77, 620, -1));

        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/remove_6431862 (2).png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHorarioActionPerformed
       try{
       String horario = comboHorario.getSelectedItem().toString();
        llenarTabla(horario);
       }catch(IllegalArgumentException e ){
           JOptionPane.showMessageDialog(this, "Seleccione un horario por favor!");
       }catch(Exception ex){
           JOptionPane.showMessageDialog(this, "Seleccione un horario");
       }
    }//GEN-LAST:event_comboHorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRporteActionPerformed
        String horario = comboHorario.getSelectedItem().toString();
        pdfHorario h = new pdfHorario();
        h.pdfHorario(Horario.valueOf(horario));
    }//GEN-LAST:event_btnRporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRporte;
    private javax.swing.JComboBox<String> comboHorario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHorario;
    // End of variables declaration//GEN-END:variables

public void llenarTabla(String horario) {

        try {
            DietaComidaService dc = new DietaComidaService();

            
            ArrayList<DietaComida> dietComida = dc.listaPorHorario(Horario.valueOf(horario));
            
            
            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            
            modelo.addColumn("Apellido Paciente");
            modelo.addColumn("Nombre Paciente");
            modelo.addColumn("Comida");
            
           
            modelo.addColumn("Horario");

            tablaHorario.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object dietacomida[] = null;

            for (int i = 0; i < dietComida.size(); i++) {
                modelo.addRow(dietacomida);
                DietaComida getC = (DietaComida) dietComida.get(i);

               
                modelo.setValueAt(getC.getIdDieta().getIdPaciente().getApellido(), i, 0);
                modelo.setValueAt(getC.getIdDieta().getIdPaciente().getNombre(), i, 1);
                modelo.setValueAt(getC.getIdComida().getNombre(), i, 2);
                modelo.setValueAt(getC.getHorario().toString(), i, 3);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de comidas en la base de datos");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Seleccione un horario Válido");
        }
    }
}
