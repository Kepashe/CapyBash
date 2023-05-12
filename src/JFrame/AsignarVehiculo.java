package src.JFrame;

import src.*;

import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.ArrayList;

public class AsignarVehiculo extends javax.swing.JFrame {

    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private String tipo = "todos";

    DefaultTableModel modeloVehiculos = new DefaultTableModel();

    public void test() {

        Persona per1 = new Persona();
        Vehiculo vei = new Vehiculo();
        vei.setColor("verde");
        vei.setNombre("Cacamovil");
        vei.setMatricula("2B");
        vei.setPropietario(per1);

        per1.setApellido("Fer");
        per1.setNombre("Juan");
        per1.setCantHijos((byte) 2);
        per1.setDptoResidencia("Sanjose");
        per1.setFechaNacimiento(LocalDate.of(2002, 10, 23));
        per1.agregarVehiculo(vei);

        this.listaVehiculos.add(vei);

    }

    public AsignarVehiculo() {
        initComponents();
        test();
        actualizarTabla();
    }

    public void actualizarTabla() {
        modeloVehiculos.addColumn("Matricula");
        modeloVehiculos.addColumn("Nombre");
        modeloVehiculos.addColumn("Color");
        modeloVehiculos.addColumn("Propietario");

        if (tipo == "todos") {
            modeloVehiculos.addColumn("Matricula");
            modeloVehiculos.addColumn("Nombre");
            modeloVehiculos.addColumn("Color");
            modeloVehiculos.addColumn("Propietario");
        } else if (tipo == "barco") {
            modeloVehiculos.addColumn("Matricula");
            modeloVehiculos.addColumn("Nombre");
            modeloVehiculos.addColumn("Color");
            modeloVehiculos.addColumn("Propietario");
            modeloVehiculos.addColumn("Eslora");
            modeloVehiculos.addColumn("Manga");
        } else if (tipo == "avion") {
            modeloVehiculos.addColumn("Matricula");
            modeloVehiculos.addColumn("Nombre");
            modeloVehiculos.addColumn("Color");
            modeloVehiculos.addColumn("Propietario");
            modeloVehiculos.addColumn("longitud");
            modeloVehiculos.addColumn("cantPasajeros");
        }
        refrescarTablaVehiculos();
    }

    private void refrescarTablaVehiculos() {
        TablaVehiculos.setModel(modeloVehiculos);
        //Borrar todos los elementos del modelo
        while (modeloVehiculos.getRowCount() > 0) {
            modeloVehiculos.removeRow(0);
        }

        //Recorremos el array y rellenamos la tabla
        for (Vehiculo vehiculo : listaVehiculos) {
            Object a[] = new Object[4];
            a[0] = vehiculo.getMatricula();
            a[1] = vehiculo.getNombre();
            a[2] = vehiculo.getColor();
            a[3] = vehiculo.toStringID();
            modeloVehiculos.addRow(a);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAplicarFiltro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        cbxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 197, Short.MAX_VALUE)
        );

        btnAplicarFiltro.setActionCommand("Aplicar");
        btnAplicarFiltro.setLabel("Aplicar");
        btnAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFiltroActionPerformed(evt);
            }
        });

        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "ID", "Nombre", "Color", "Propietario", "Tipo"
                }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Vehiculos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Filtro:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tipo:");

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"ID", "Nombre", "Color", "Propietario", "Tipo"}));
        cbxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroActionPerformed(evt);
            }
        });

        btnVolver.setLabel("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"todos", "barco", "avion"}));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(621, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel1)
                                                .addGap(31, 31, 31)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(439, 439, 439)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(605, Short.MAX_VALUE)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        pack();
    }// </editor-fold>

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTabla();
    }

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        // Crea una nueva instancia de la ventana de lista de vehículos
        AgregarPersona agregarPersona = new AgregarPersona();

        // Hace visible la nueva instancia de la ventana vehículos
        agregarPersona.setVisible(true);

        // Cierra la ventana actual
        this.dispose();
    }

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarVehiculo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration
}

