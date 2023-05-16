
package src.JFrame;

import src.Main;
import src.Persona;

import java.awt.Panel;
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
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AgregarPersona extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new java.awt.TextField();
        txtID = new java.awt.TextField();
        txtApellido = new java.awt.TextField();
        txtFecha = new java.awt.TextField();
        btnGuardar = new javax.swing.JButton();
        cbxDepto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersona = new javax.swing.JTable();
        spnHijos = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDFiltro = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox<>();
        btnAsignarVehiculo = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Hijos");

        jLabel6.setText("Depto.");

        jLabel7.setText("FechaNac.");

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

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbxDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres" }));
        cbxDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeptoActionPerformed(evt);
            }
        });

        tablaPersona.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "ID", "Nombre", "Apellido", "Hijos", "Depto", "FechaNac"
                }
        ));
        jScrollPane1.setViewportView(tablaPersona);

        jLabel10.setText("Filtrar por ID");

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

        jLabel16.setText("Agregar Persona:");

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Apellido", "Hijos", "Depto", "FechaNac" }));
        cbxFiltro.setName(""); // NOI18N
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        btnAsignarVehiculo.setText("Lista Vehiculos");
        btnAsignarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
                PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(289, 289, 289)
                                                .addComponent(jLabel8))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7))
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
                                                        .addComponent(jLabel16)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addComponent(btnGuardar)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(btnAsignarVehiculo)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(txtIDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
                PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel10)
                                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtIDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(jLabel5))
                                                        .addGroup(PanelLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(spnHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(16, 16, 16)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(cbxDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnGuardar)
                                                        .addComponent(btnAsignarVehiculo))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(PanelLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        Panel.getAccessibleContext().setAccessibleName("");
        refrescarTabla();
        pack();
    }// </editor-fold>

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtIDFiltroKeyTyped(java.awt.event.KeyEvent evt) {

        txtIDFiltro.addKeyListener(new KeyAdapter(){
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

    private void btnAsignarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {
        // Crea una nueva instancia de la ventana de lista de vehículos
        AsignarVehiculo asignarVehiculo = new AsignarVehiculo();

        // Hace visible la nueva instancia de la ventana vehículos
        asignarVehiculo.setVisible(true);

        // Cierra la ventana actual
        this.dispose();
    }


    TableRowSorter trs;TableRowSorter trs2;TableRowSorter trs3;
    TableRowSorter trs4;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        AgregarPersona ventana = new AgregarPersona();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnAsignarVehiculo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxDepto;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnHijos;
    private javax.swing.JTable tablaPersona;
    private java.awt.TextField txtApellido;
    private java.awt.TextField txtFecha;
    private java.awt.TextField txtID;
    private java.awt.TextField txtIDFiltro;
    private java.awt.TextField txtNombre;
    // End of variables declaration

    DefaultTableModel modelo = new DefaultTableModel(); //Para mostrarlos en una tabla
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //Array para guardar las personas

    public AgregarPersona() {
        initComponents();
        listaPersonas = Main.listaPersonasMain;
        refrescarTabla();

        JFrame frame = new JFrame("VentanaRegistro");
        frame.setTitle("Ventana de Registro de Personas!");
        frame.setSize(1600, 1280);
        frame.setContentPane(Panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

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

    // Hacer un metodo para actualizar la tabla según el filtro introducido
    private void aplicarFiltro() {

    }


    private void refrescarTabla() {
        tablaPersona.setModel(modelo);
        //Borrar todos los elementos del modelo
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        //Recorremos el array y rellenamos la tabla
        for (Persona persona : listaPersonas){
            Object a[]=new Object[6];
            a[0] = persona.getIdPersona();
            a[1] = persona.getNombre();
            a[2] = persona.getApellido();
            a[3] = persona.getCantHijos();
            a[4] = persona.getDptoResidencia();
            a[5] = persona.getFechaNacimiento();
            modelo.addRow(a);
        }
    }
}
