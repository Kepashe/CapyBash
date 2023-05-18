
package src.ui;

import src.Main;
import src.clases.Persona;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AltaPersonas extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel(); //Para mostrarlos en una tabla
    public static ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //Array para guardar las personas

    public AltaPersonas() {
        initComponents();
        listaPersonas = Main.listaPersonasMain;
        refrescarTabla();

        setTitle("Alta de Personas");
        setContentPane(Panel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Hijos");
        modelo.addColumn("Departamento");
        modelo.addColumn("Fecha Nac.");
        refrescarTabla();

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LocalDate fechaActual = LocalDate.now();
                    // Creamos una instancia de la clase Persona
                    Persona persona = new Persona();

                    int idPersona = Integer.parseInt(txtID.getText());


                    // Chequeamos que esa ID no exista ya
                    boolean idsExistentes = listaPersonas.stream().anyMatch(p -> p.getIdPersona() == idPersona);
                    if (idsExistentes) {
                        JOptionPane.showMessageDialog(null, "Error: Ya existe esa ID.");
                        return;
                    }else{
                        persona.setIdPersona(idPersona);
                    }

                    persona.setNombre(txtNombre.getText());
                    persona.setApellido(txtApellido.getText());
                    // Obtener el valor del JSpinner y convertirlo a byte
                    byte cantHijos = ((Number) spnHijos.getValue()).byteValue();
                    if (cantHijos < 0) {
                        JOptionPane.showMessageDialog(null, "Error: El número de hijos debe ser mayor o igual a 0.");
                        return;
                    }
                    persona.setCantHijos(cantHijos);
                    persona.setDptoResidencia(cbxDepto.getSelectedItem().toString());
                    // Obtenemos la fecha de nacimiento
                    String fechaStr = txtFecha.getText();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
                    // Control para no obtener fechas después de la fecha actual
                    if (fechaNacimiento.isAfter(fechaActual)) {
                        JOptionPane.showMessageDialog(null, "Error: La fecha ingresada es mayor a la fecha actual.");
                    } else {
                        persona.setFechaNacimiento(fechaNacimiento);
                        listaPersonas.add(persona);
                        refrescarTabla();
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: El ID es inválido.");
                } catch (DateTimeParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Formato de fecha inválido.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar.");
                }
            }
        });
    }


    private void refrescarTabla() {
        tablaPersona.setModel(modelo);
        //Borrar todos los elementos del modelo
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        //Recorremos el array y rellenamos la tabla
        for (Persona persona : listaPersonas) {
            Object a[] = new Object[6];
            a[0] = persona.getIdPersona();
            a[1] = persona.getNombre();
            a[2] = persona.getApellido();
            a[3] = persona.getCantHijos();
            a[4] = persona.getDptoResidencia();
            a[5] = persona.getFechaNacimiento();
            modelo.addRow(a);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblHijos = new javax.swing.JLabel();
        lblDepto = new javax.swing.JLabel();
        lblFechaNac = new javax.swing.JLabel();
        txtNombre = new java.awt.TextField();
        txtID = new java.awt.TextField();
        txtApellido = new java.awt.TextField();
        txtFecha = new java.awt.TextField();
        btnGuardar = new javax.swing.JButton();
        cbxDepto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        spnHijos = new javax.swing.JSpinner();
        lblFiltrarPor = new javax.swing.JLabel();
        txtIDFiltro = new java.awt.TextField();
        lblAgregarPersona = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lblCapyBash = new javax.swing.JLabel();
        lblAltaDePersonas = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(221, 138, 36));

        lblID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID");

        lblApellido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");

        lblNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblHijos.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblHijos.setForeground(new java.awt.Color(255, 255, 255));
        lblHijos.setText("Hijos");

        lblDepto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblDepto.setForeground(new java.awt.Color(255, 255, 255));
        lblDepto.setText("Depto.");

        lblFechaNac.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaNac.setText("FechaNac.");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtFecha.setName(""); // NOI18N
        txtFecha.setText("DD/MM/YYYY");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(240, 167, 50));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres"}));
        cbxDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeptoActionPerformed(evt);
            }
        });

        tablaPersona.setBackground(new java.awt.Color(236, 183, 64));
        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "ID", "Nombre", "Apellido", "Hijos", "Depto", "FechaNac"
                }
        ));
        jScrollPane1.setViewportView(tablaPersona);

        spnHijos.setAutoscrolls(true);

        lblFiltrarPor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblFiltrarPor.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltrarPor.setText("Filtrar por ID");

        txtIDFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFiltroActionPerformed(evt);
            }
        });
        txtIDFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDFiltroKeyTyped(evt);
            }
        });

        lblAgregarPersona.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblAgregarPersona.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarPersona.setText("Información de la persona:");

        btnVolver.setBackground(new java.awt.Color(240, 167, 50));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblCapyBash.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblCapyBash.setForeground(new java.awt.Color(255, 255, 255));
        lblCapyBash.setText("CapyBash:");

        lblAltaDePersonas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAltaDePersonas.setForeground(new java.awt.Color(255, 255, 255));
        lblAltaDePersonas.setText("Alta De Personas");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
                PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(lblCapyBash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblAltaDePersonas))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblNombre)
                                                                        .addComponent(lblApellido)
                                                                        .addComponent(lblID)
                                                                        .addComponent(lblHijos)
                                                                        .addComponent(lblDepto)
                                                                        .addComponent(lblFechaNac))
                                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                                .addGap(28, 28, 28)
                                                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(spnHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(cbxDepto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addComponent(lblAgregarPersona)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addComponent(btnVolver)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnGuardar)))
                                                .addGap(33, 33, 33)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addComponent(lblFiltrarPor)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtIDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
                PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCapyBash)
                                        .addComponent(lblAltaDePersonas))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblFiltrarPor)
                                                        .addComponent(txtIDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblAgregarPersona)
                                                .addGap(18, 18, 18)))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblID)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNombre)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblApellido)
                                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(lblHijos))
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(spnHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(16, 16, 16)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblDepto)
                                                        .addComponent(cbxDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblFechaNac)
                                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnGuardar)
                                                        .addComponent(btnVolver))
                                                .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>

    private void txtIDFiltroKeyTyped(java.awt.event.KeyEvent evt) {

        txtIDFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtIDFiltro.getText(), 0));

            }
        });
        trs = new TableRowSorter(modelo);
        tablaPersona.setRowSorter(trs);
    }

    private void txtIDFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cbxDeptoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }


    TableRowSorter trs;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        AltaPersonas ventana = new AltaPersonas();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxDepto;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarPersona;
    private javax.swing.JLabel lblAltaDePersonas;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCapyBash;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblFiltrarPor;
    private javax.swing.JLabel lblHijos;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JSpinner spnHijos;
    private javax.swing.JTable tablaPersona;
    private java.awt.TextField txtApellido;
    private java.awt.TextField txtFecha;
    private java.awt.TextField txtID;
    private java.awt.TextField txtIDFiltro;
    private java.awt.TextField txtNombre;
// End of variables declaration
}