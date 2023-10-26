/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Principal.escritorio;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        panelConsultas.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        panelBotones = new javax.swing.JPanel();
        btnAgregarPaciente = new javax.swing.JButton();
        btnAgregarDieta = new javax.swing.JButton();
        btnAgregarComida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCrearDieta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnConsultas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelConsultas = new javax.swing.JPanel();
        btnConsultaComida = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnConsultaPorHorario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnConsultaDietas = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnConsultaPacientes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuPaciente = new javax.swing.JMenuItem();
        menuComida = new javax.swing.JMenuItem();
        menuDieta = new javax.swing.JMenuItem();
        menuHistorial = new javax.swing.JMenuItem();
        menuComidaDieta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Clinica NUTRICIONAL");
        setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(153, 255, 255));
        setSize(new java.awt.Dimension(1100, 730));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(1200, 980));

        panelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder("Menus"));
        panelBotones.setLayout(null);

        btnAgregarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receipt_5239235.png"))); // NOI18N
        btnAgregarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPaciente.setPreferredSize(new java.awt.Dimension(150, 70));
        btnAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPacienteActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarPaciente);
        btnAgregarPaciente.setBounds(30, 40, 150, 70);

        btnAgregarDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/diet_7152806.png"))); // NOI18N
        btnAgregarDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarDieta.setPreferredSize(new java.awt.Dimension(150, 70));
        btnAgregarDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDietaActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarDieta);
        btnAgregarDieta.setBounds(30, 130, 150, 70);

        btnAgregarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salad_4780416.png"))); // NOI18N
        btnAgregarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarComida.setPreferredSize(new java.awt.Dimension(150, 70));
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarComida);
        btnAgregarComida.setBounds(30, 220, 150, 70);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Paciente");
        panelBotones.add(jLabel1);
        jLabel1.setBounds(40, 20, 121, 19);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Agregar Dieta");
        panelBotones.add(jLabel2);
        jLabel2.setBounds(50, 110, 96, 19);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Agregar Comida");
        panelBotones.add(jLabel3);
        jLabel3.setBounds(50, 200, 112, 19);

        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medical-history_10522820.png"))); // NOI18N
        btnHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorial.setPreferredSize(new java.awt.Dimension(150, 70));
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });
        panelBotones.add(btnHistorial);
        btnHistorial.setBounds(30, 310, 150, 70);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Historial Peso");
        panelBotones.add(jLabel4);
        jLabel4.setBounds(50, 290, 97, 19);

        btnCrearDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/healthy_1813376.png"))); // NOI18N
        btnCrearDieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearDieta.setPreferredSize(new java.awt.Dimension(150, 70));
        btnCrearDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDietaActionPerformed(evt);
            }
        });
        panelBotones.add(btnCrearDieta);
        btnCrearDieta.setBounds(30, 410, 150, 70);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Crear Dieta");
        panelBotones.add(jLabel5);
        jLabel5.setBounds(60, 390, 79, 19);

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shopping-list_7792887.png"))); // NOI18N
        btnConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultas.setPreferredSize(new java.awt.Dimension(150, 70));
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        panelBotones.add(btnConsultas);
        btnConsultas.setBounds(30, 500, 150, 70);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Consultas");
        panelBotones.add(jLabel7);
        jLabel7.setBounds(60, 480, 70, 19);

        escritorio.add(panelBotones);
        panelBotones.setBounds(10, 10, 210, 660);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        escritorio.add(jSeparator1);
        jSeparator1.setBounds(230, 10, 9, 870);

        panelConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        panelConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultaComida.setPreferredSize(new java.awt.Dimension(100, 50));
        btnConsultaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaComidaActionPerformed(evt);
            }
        });
        panelConsultas.add(btnConsultaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("Listado de Comidas");
        panelConsultas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setText("Comidas por Horario");
        panelConsultas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btnConsultaPorHorario.setPreferredSize(new java.awt.Dimension(100, 50));
        btnConsultaPorHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPorHorarioActionPerformed(evt);
            }
        });
        panelConsultas.add(btnConsultaPorHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setText("Listado de Dietas");
        panelConsultas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        btnConsultaDietas.setPreferredSize(new java.awt.Dimension(100, 50));
        btnConsultaDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDietasActionPerformed(evt);
            }
        });
        panelConsultas.add(btnConsultaDietas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel11.setText("Listado de Pacientes");
        panelConsultas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        btnConsultaPacientes.setPreferredSize(new java.awt.Dimension(100, 50));
        btnConsultaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPacientesActionPerformed(evt);
            }
        });
        panelConsultas.add(btnConsultaPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        escritorio.add(panelConsultas);
        panelConsultas.setBounds(240, 10, 690, 100);

        jMenu1.setText("Archivo");

        menuPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPaciente.setText("Paciente");
        menuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuPaciente);

        menuComida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuComida.setText("Comida");
        menuComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComidaActionPerformed(evt);
            }
        });
        jMenu1.add(menuComida);

        menuDieta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuDieta.setText("Dieta");
        menuDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDietaActionPerformed(evt);
            }
        });
        jMenu1.add(menuDieta);

        menuHistorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuHistorial.setText("Historial");
        menuHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistorialActionPerformed(evt);
            }
        });
        jMenu1.add(menuHistorial);

        menuComidaDieta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuComidaDieta.setText("Agregar Comida a Dieta");
        menuComidaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComidaDietaActionPerformed(evt);
            }
        });
        jMenu1.add(menuComidaDieta);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Consultas");

        jMenuItem2.setText("Listado de Comidas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setText("Listado de Dietas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Comida por Horario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText(" Listado de Pacientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Salir");

        jMenuItem7.setText("Salir");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComidaActionPerformed
         panelConsultas.setVisible(false);
        GestionComida c = new GestionComida();
        ControlaInstancia(c);
        
    }//GEN-LAST:event_menuComidaActionPerformed

    private void menuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPacienteActionPerformed
        panelConsultas.setVisible(false);
        GestionPaciente gp = new GestionPaciente();
        ControlaInstancia(gp);
    }//GEN-LAST:event_menuPacienteActionPerformed

    private void menuDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDietaActionPerformed
          panelConsultas.setVisible(false);
        GestionDieta gd = new GestionDieta();
        ControlaInstancia(gd);
    }//GEN-LAST:event_menuDietaActionPerformed

    private void menuHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistorialActionPerformed
         panelConsultas.setVisible(false);
        GestionHistorial gh = new GestionHistorial();
        ControlaInstancia(gh);
    }//GEN-LAST:event_menuHistorialActionPerformed

    private void menuComidaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComidaDietaActionPerformed
       panelConsultas.setVisible(false);
        GestionDietaComida dc = new GestionDietaComida();
        ControlaInstancia(dc);
    }//GEN-LAST:event_menuComidaDietaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         
        ConsultasComida cc= new ConsultasComida();
        Controla(cc);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        ConsultaDietas cd = new ConsultaDietas();
        Controla(cd);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ConsultaPorHorario ch=new ConsultaPorHorario();
        Controla(ch);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ConsultaPacientes cp = new ConsultaPacientes();
        Controla(cp);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {

            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    // métodos realizados en los botones de vista Principal...
    private void btnAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPacienteActionPerformed
         panelConsultas.setVisible(false);
        GestionPaciente gp = new GestionPaciente();
        ControlaInstancia(gp);
    }//GEN-LAST:event_btnAgregarPacienteActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
          panelConsultas.setVisible(false);
        GestionHistorial gh = new GestionHistorial();
        ControlaInstancia(gh);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnCrearDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDietaActionPerformed
          panelConsultas.setVisible(false);
        GestionDietaComida dc = new GestionDietaComida();
        ControlaInstancia(dc);
    }//GEN-LAST:event_btnCrearDietaActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        
        try {
            for (JInternalFrame frame : escritorio.getAllFrames()) {
            
                frame.dispose(); 
                
            
        }
        } catch (Exception e) {
            System.out.println(e);
        }
        panelConsultas.setVisible(true);
        GestionDietaComida dc = new GestionDietaComida();
        dc.dispose();
        
       
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        panelConsultas.setVisible(false);
        GestionComida c = new GestionComida();
        ControlaInstancia(c);
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void btnAgregarDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDietaActionPerformed
        panelConsultas.setVisible(false);
        GestionDieta gd = new GestionDieta();
        ControlaInstancia(gd);
    }//GEN-LAST:event_btnAgregarDietaActionPerformed

    private void btnConsultaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaComidaActionPerformed
        ConsultasComida cc= new ConsultasComida();
        Controla(cc);
        
    }//GEN-LAST:event_btnConsultaComidaActionPerformed

    private void btnConsultaPorHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPorHorarioActionPerformed
       ConsultaPorHorario ch=new ConsultaPorHorario();
        Controla(ch);
    }//GEN-LAST:event_btnConsultaPorHorarioActionPerformed

    private void btnConsultaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDietasActionPerformed
         ConsultaDietas cd = new ConsultaDietas();
        Controla(cd);
    }//GEN-LAST:event_btnConsultaDietasActionPerformed

    private void btnConsultaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPacientesActionPerformed
         ConsultaPacientes cp = new ConsultaPacientes();
        Controla(cp);
    }//GEN-LAST:event_btnConsultaPacientesActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnAgregarDieta;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnConsultaComida;
    private javax.swing.JButton btnConsultaDietas;
    private javax.swing.JButton btnConsultaPacientes;
    private javax.swing.JButton btnConsultaPorHorario;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnCrearDieta;
    private javax.swing.JButton btnHistorial;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuComida;
    private javax.swing.JMenuItem menuComidaDieta;
    private javax.swing.JMenuItem menuDieta;
    private javax.swing.JMenuItem menuHistorial;
    private javax.swing.JMenuItem menuPaciente;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelConsultas;
    // End of variables declaration//GEN-END:variables
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

 public void Controla(JInternalFrame inter) {

        for (JInternalFrame frame : escritorio.getAllFrames()) {
            if (frame.getClass().equals(inter.getClass())) {
                frame.toFront(); // Si está abierto, tráelo al frente
                return;
            }
        }

        // Si no está abierto, crea una nueva instancia 
        
        escritorio.add(inter);
        inter.setVisible(true);
        inter.setLocation(240,107);
    }
}

