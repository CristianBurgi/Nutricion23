/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Principal.escritorio;
import entidades.Dieta;
import entidades.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.DietaService;
import service.PacienteService;

/**
 *
 * @author Cristian
 */
public class ConsultaPacientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPacientes
     */
    public ConsultaPacientes() {
        initComponents();
        lblFecha.setText(LocalDate.now().toString());
        deshabilitarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbTodos = new javax.swing.JRadioButton();
        rbDietasTerminadas = new javax.swing.JRadioButton();
        rbDietasVigentes = new javax.swing.JRadioButton();
        rbNoPeso = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAgregarD = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listado de Pacientes");

        buttonGroup1.add(rbTodos);
        rbTodos.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDietasTerminadas);
        rbDietasTerminadas.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbDietasTerminadas.setText("Con dietas Terminadas");
        rbDietasTerminadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDietasTerminadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDietasVigentes);
        rbDietasVigentes.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbDietasVigentes.setText("Con dietas Vigentes");
        rbDietasVigentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDietasVigentesActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNoPeso);
        rbNoPeso.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rbNoPeso.setText("Que no llegaron al Peso");
        rbNoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoPesoActionPerformed(evt);
            }
        });

        tablaPacientes.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tablaPacientes.setSelectionBackground(new java.awt.Color(102, 255, 255));
        tablaPacientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tablaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Fecha :");

        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Listado de Pacientes");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione...");

        jButton1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgregarD.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregarD.setText("AGREGAR DIETA");
        btnAgregarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnModificar.setText("MODIFICAR");

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbTodos)
                                .addGap(18, 18, 18)
                                .addComponent(rbDietasVigentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbDietasTerminadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNoPeso))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(118, 118, 118)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregarD, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodos)
                    .addComponent(rbDietasVigentes)
                    .addComponent(rbNoPeso)
                    .addComponent(rbDietasTerminadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarD)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbDietasVigentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDietasVigentesActionPerformed
        deshabilitarBotones();
        LocalDate fecha = LocalDate.parse(lblFecha.getText());
        llenarTablaDietaVigente(fecha);
    }//GEN-LAST:event_rbDietasVigentesActionPerformed

    private void rbNoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoPesoActionPerformed
        deshabilitarBotones();
        llenarTablaPesoNoLlegado();
    }//GEN-LAST:event_rbNoPesoActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        llenarTablaTodos();
        deshabilitarBotones();
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbDietasTerminadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDietasTerminadasActionPerformed
        deshabilitarBotones();
        String fecha = lblFecha.getText();
        System.out.println(fecha);
        LocalDate fecha1 = LocalDate.parse(fecha);
        llenarTablaDietaTerminada(fecha1);
    }//GEN-LAST:event_rbDietasTerminadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientesMouseClicked
        if (rbTodos.isSelected()) {
            habilitarBotones();
        }


    }//GEN-LAST:event_tablaPacientesMouseClicked

    private void btnAgregarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaPacientes.getModel();
        Integer idPaciente = (Integer) modelo.getValueAt(tablaPacientes.getSelectedRow(), 0);

        if (!idPaciente.toString().isEmpty()) {

            GestionDieta gs = new GestionDieta();
            ControlaInstancia(gs);

            PacienteService ps = new PacienteService();
            Paciente p = new Paciente();
            p = ps.buscarPacientePorID(idPaciente);
        
        GestionDieta.cmbPaciente.removeAllItems();
        GestionDieta.cmbPaciente.addItem(p);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un Paciente");
        }
    }//GEN-LAST:event_btnAgregarDActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        PacienteService ps = new PacienteService();
        DefaultTableModel modelo = (DefaultTableModel) tablaPacientes.getModel();
       int idPaciente = (int) modelo.getValueAt(tablaPacientes.getSelectedRow(), 0);

        if (JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR PACIENTE?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            ps.eliminarPaciente(idPaciente);
            llenarTablaTodos();
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarD;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JRadioButton rbDietasTerminadas;
    private javax.swing.JRadioButton rbDietasVigentes;
    private javax.swing.JRadioButton rbNoPeso;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables

    public void llenarTablaTodos() {

        try {
            PacienteService ps = new PacienteService();

            ArrayList paciente = ps.listaPaciente();

            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre");
            modelo.addColumn("Domicilio");

            tablaPacientes.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object comida[] = null;

            for (int i = 0; i < paciente.size(); i++) {
                modelo.addRow(comida);
                Paciente getP = (Paciente) paciente.get(i);

                modelo.setValueAt(getP.getIdPaciente(), i, 0);
                modelo.setValueAt(getP.getApellido(), i, 1);
                modelo.setValueAt(getP.getNombre(), i, 2);
                modelo.setValueAt(getP.getDomicilio(), i, 3);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de Pacientes en la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void llenarTablaDietaTerminada(LocalDate fecha) {

        try {
            DietaService ds = new DietaService();

            ArrayList dietas = ds.pacientesDietaTerminada(fecha);

            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id");
            modelo.addColumn("Dieta");
            modelo.addColumn("Apellido ");
            modelo.addColumn("Nombre ");
            modelo.addColumn("F. Inicial");
            modelo.addColumn("Peso Inicial");
            modelo.addColumn("Peso Final");
            modelo.addColumn("F. Final");

            tablaPacientes.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object dieta[] = null;

            for (int i = 0; i < dietas.size(); i++) {
                modelo.addRow(dieta);
                Dieta getD = (Dieta) dietas.get(i);

                modelo.setValueAt(getD.getIdDieta(), i, 0);
                modelo.setValueAt(getD.getNombre(), i, 1);
                modelo.setValueAt(getD.getIdPaciente().getApellido(), i, 2);
                modelo.setValueAt(getD.getIdPaciente().getNombre(), i, 3);
                modelo.setValueAt(getD.getFechaInicial(), i, 4);
                modelo.setValueAt(getD.getPesoInicial(), i, 5);
                modelo.setValueAt(getD.getPesoFinal(), i, 6);
                modelo.setValueAt(getD.getFechaFinal(), i, 7);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de dietas en la base de datos" + e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void llenarTablaDietaVigente(LocalDate fecha) {

        try {
            DietaService ds = new DietaService();

            ArrayList dietas = ds.pacientesDietaVigente(fecha);

            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id");
            modelo.addColumn("Apellido ");
            modelo.addColumn("Apellido Paciente");
            modelo.addColumn("Nombre Paciente");
            modelo.addColumn("Fecha Inicial");
            modelo.addColumn("Peso Inicial");
            modelo.addColumn("Peso Final");
            modelo.addColumn("Fecha Final");

            tablaPacientes.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object dieta[] = null;

            for (int i = 0; i < dietas.size(); i++) {
                modelo.addRow(dieta);
                Dieta getD = (Dieta) dietas.get(i);

                modelo.setValueAt(getD.getIdDieta(), i, 0);
                modelo.setValueAt(getD.getNombre(), i, 1);
                modelo.setValueAt(getD.getIdPaciente().getApellido(), i, 2);
                modelo.setValueAt(getD.getIdPaciente().getNombre(), i, 3);
                modelo.setValueAt(getD.getFechaInicial(), i, 4);
                modelo.setValueAt(getD.getPesoInicial(), i, 5);
                modelo.setValueAt(getD.getPesoFinal(), i, 6);
                modelo.setValueAt(getD.getFechaFinal(), i, 7);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de dietas en la base de datos" + e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void llenarTablaPesoNoLlegado() {

        try {
            DietaService ds = new DietaService();

            ArrayList dietas = ds.listaPacientePesoNoLlegado();

            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Id");
            modelo.addColumn("Apellido ");
            modelo.addColumn("Apellido Paciente");
            modelo.addColumn("Nombre Paciente");
            modelo.addColumn("Fecha Inicial");
            modelo.addColumn("Peso Inicial");
            modelo.addColumn("Peso Final");
            modelo.addColumn("Fecha Final");

            tablaPacientes.setModel(modelo);

            //creo un vector para guardar los datos del array y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object dieta[] = null;

            for (int i = 0; i < dietas.size(); i++) {
                modelo.addRow(dieta);
                Dieta getD = (Dieta) dietas.get(i);

                modelo.setValueAt(getD.getIdDieta(), i, 0);
                modelo.setValueAt(getD.getNombre(), i, 1);
                modelo.setValueAt(getD.getIdPaciente().getApellido(), i, 2);
                modelo.setValueAt(getD.getIdPaciente().getNombre(), i, 3);
                modelo.setValueAt(getD.getFechaInicial(), i, 4);
                modelo.setValueAt(getD.getPesoInicial(), i, 5);
                modelo.setValueAt(getD.getPesoFinal(), i, 6);
                modelo.setValueAt(getD.getFechaFinal(), i, 7);

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de dietas en la base de datos" + e);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void deshabilitarBotones() {
        btnAgregarD.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
    }

    private void habilitarBotones() {
        btnAgregarD.setVisible(true);
        btnModificar.setVisible(true);
        btnEliminar.setVisible(true);
    }
    public void ControlaInstancia(JInternalFrame inter) {

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame.getClass().equals(inter.getClass())) {
                frame.toFront(); // Si está abierto, tráelo al frente
                return;
            }
        }

        // Si no está abierto, crea una nueva instancia 
        escritorio.add(inter);
        inter.setVisible(true);
    }
}
