/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Principal.escritorio;
import entidades.Paciente;
import java.awt.HeadlessException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.PacienteService;

/**
 *
 * @author Cristian
 */
public class GestionPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionPaciente
     */
    public GestionPaciente() {
        initComponents();
        panelListaPacientes.setVisible(false);
        desabilitarBotones();
        txtId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        panelListaPacientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaPacientes = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregarDieta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarDni = new javax.swing.JTextField();
        btnBuscarDni = new javax.swing.JButton();
        lblSeleccione = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Cargar,Buscar Paciente");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(828, 675));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargar Paciente"));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Apellido");

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel4.setText("Domicilio");

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel5.setText("Telefono");

        txtapellido.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtapellido.setToolTipText("Primera Mayuscula, no puede Contener Numeros");

        txtDni.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDni.setToolTipText("Ingrese solo Numeros");

        txtDomicilio.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtDomicilio.setToolTipText("Ingrese letras y numeros");

        txtNombre.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtNombre.setToolTipText("Primera Mayuscula, no puede Contener Numeros");

        txtTelefono.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtTelefono.setToolTipText("Ingrese solo numeros");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.setToolTipText("Busca todos los pacientes de la base de dato");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtId.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelListaPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Pacientes"));

        tablaListaPacientes.setAutoCreateRowSorter(true);
        tablaListaPacientes.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        tablaListaPacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaListaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaListaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaListaPacientes);

        btnModificar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setToolTipText("Modificar algun dato del paciente seleccionado");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setToolTipText("Elimina al Paciente seleccionado");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregarDieta.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnAgregarDieta.setText("AGREGAR DIETA");
        btnAgregarDieta.setToolTipText("Agregar dieta al paciente seleccionado");
        btnAgregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDietaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Escriba el DNI a buscar :");

        btnBuscarDni.setText("BUSCAR");
        btnBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDniActionPerformed(evt);
            }
        });

        lblSeleccione.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblSeleccione.setText("*Seleccione el paciente si desea Modificar algún dato, Eliminarlo de la base de datos o Agregarle una Dieta...");

        javax.swing.GroupLayout panelListaPacientesLayout = new javax.swing.GroupLayout(panelListaPacientes);
        panelListaPacientes.setLayout(panelListaPacientesLayout);
        panelListaPacientesLayout.setHorizontalGroup(
            panelListaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panelListaPacientesLayout.createSequentialGroup()
                .addComponent(btnAgregarDieta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(panelListaPacientesLayout.createSequentialGroup()
                .addGroup(panelListaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListaPacientesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelListaPacientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeleccione)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelListaPacientesLayout.setVerticalGroup(
            panelListaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaPacientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelListaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDni))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSeleccione)
                .addGap(59, 59, 59)
                .addGroup(panelListaPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDieta)))
        );

        btnSalir.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setToolTipText("Cierra la ventana");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("*Nota : SI desea buscar un paciente en la base de datos click en \"BUSCAR\"  para poder buscarlo por DNI.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        panelListaPacientes.setVisible(true);
        lblSeleccione.setVisible(false);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        PacienteService ps = new PacienteService();

        try {
            String apellido = txtapellido.getText();
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDni.getText());
            String domicilio = txtDomicilio.getText();
            String telefono = txtTelefono.getText();
            ps.crearPaciente(apellido, nombre, dni, domicilio, telefono);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros en dni Por Favor!");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, " Por Favor!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Verifique los datos ingresados y vuelva a intentarlo");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaListaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaPacientesMouseClicked

        abilitarBotones();
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaListaPacientes.getModel();
            int dni = (int) modelo.getValueAt(tablaListaPacientes.getSelectedRow(), 0);

            PacienteService ps = new PacienteService();
            Paciente p = new Paciente();

            p = ps.buscarPacientePorDNI(dni);

            txtId.setText("" + p.getIdPaciente());
            txtNombre.setText(p.getNombre());
            txtapellido.setText(p.getApellido());
            txtDni.setText("" + p.getDni());
            txtDomicilio.setText(p.getDomicilio());
            txtTelefono.setText(p.getTelefono());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Se produjo un error al intentar seleccionar El paciente");
        }
    }//GEN-LAST:event_tablaListaPacientesMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        panelListaPacientes.setVisible(false);
        limpiar();
        desabilitarBotones();
        txtBuscarDni.setText("");
        vaciarTabla();
    }//GEN-LAST:event_formMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            PacienteService ps = new PacienteService();
            int id = Integer.parseInt(txtId.getText());

            String apellido = txtapellido.getText();
            String nombre = txtNombre.getText();
            int dni = Integer.parseInt(txtDni.getText());
            String domicilio = txtDomicilio.getText();
            String telefono = txtTelefono.getText();

            if (JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE MODIFICAR PACIENTE?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
                ps.modificarPaciente(id, apellido, nombre, dni, domicilio, telefono);
                llenarTabla(dni);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La celda del documento no puede estar vacia");
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, "Error: " + f);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        PacienteService ps = new PacienteService();
        int id = Integer.parseInt(txtId.getText());

        if (JOptionPane.showConfirmDialog(null, "ESTA SEGURO DE ELIMINAR PACIENTE?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            ps.eliminarPaciente(id);
            vaciarTabla();
            limpiar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDietaActionPerformed
        int idPaciente = Integer.parseInt(txtId.getText());

        GestionDieta gs = new GestionDieta();
        ControlaInstancia(gs);

        PacienteService ps = new PacienteService();
        Paciente pa = new Paciente();
        pa = ps.buscarPacientePorID(idPaciente);

        GestionDieta.cmbPaciente.removeAllItems();
        GestionDieta.cmbPaciente.addItem(pa);
        this.dispose();


    }//GEN-LAST:event_btnAgregarDietaActionPerformed

    private void btnBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDniActionPerformed

        try {
            int dni = Integer.parseInt(txtBuscarDni.getText());
            llenarTabla(dni);
            txtBuscarDni.setText("");
            lblSeleccione.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Escriba un DNI" + e);
        }
    }//GEN-LAST:event_btnBuscarDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDieta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarDni;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JPanel panelListaPacientes;
    private javax.swing.JTable tablaListaPacientes;
    private javax.swing.JTextField txtBuscarDni;
    public static javax.swing.JTextField txtDni;
    public static javax.swing.JTextField txtDomicilio;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTelefono;
    public static javax.swing.JTextField txtapellido;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla(int dni) {

        try {
            PacienteService ps = new PacienteService();
            Paciente p = new Paciente();

            p = ps.buscarPacientePorDNI(dni);

            //le otorgo un modelo a la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Dni");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre");

            tablaListaPacientes.setModel(modelo);

            //creo un vector para guardar los datos y que luego el modelo de la tabla pueda agregarlo a la tabla.
            Object pacientes[] = {p.getDni(), p.getApellido(), p.getNombre()};

            modelo.addRow(pacientes);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No tenemos registros de ese DNI en la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void abilitarBotones() {
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnAgregarDieta.setEnabled(true);
        lblSeleccione.setVisible(true);
    }

    public void desabilitarBotones() {
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregarDieta.setEnabled(false);

    }

    public void limpiar() {
        txtDni.setText("");
        txtDomicilio.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtapellido.setText("");
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
        inter.setLocation(240, 20);
    }

    private void vaciarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Dni");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");

        tablaListaPacientes.setModel(modelo);
        modelo.setRowCount(0);
    }
}
