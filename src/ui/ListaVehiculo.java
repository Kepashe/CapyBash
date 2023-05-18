package src.ui;

import src.clases.Avion;
import src.clases.Barco;
import src.clases.Vehiculo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class ListaVehiculo extends javax.swing.JFrame {
    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(operation);
    }

    private ArrayList<Avion> listaVehiculosAviones = new ArrayList<>();
    private ArrayList<Barco> listaVehiculosBarcos = new ArrayList<>();

    DefaultTableModel modeloVehiculos = new DefaultTableModel();



    public ListaVehiculo() {
        initComponents();

        setTitle("Lista de Vehiculos");
        setContentPane(jPanel1);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        listaVehiculosAviones = AltaVehiculos.altaListaVehiculosAviones;
        listaVehiculosBarcos = AltaVehiculos.altaListaVehiculosBarcos;

        actualizarTablas();
    }
    int cont = 0;
    public void actualizarTablas() {
        modeloVehiculos.setRowCount(0);
        
        if(cbxTipo.getSelectedItem().toString() == "Todos"){
            String[] titulo = new String[]{"Matricula", "Nombre", "Color", "Propietario"};
            modeloVehiculos.setColumnIdentifiers(titulo);
            tblVehiculos.setModel(modeloVehiculos);
            refrescarTablaVehiculosTodos();
        } else if (cbxTipo.getSelectedItem().toString() == "Barcos") {
            String[] titulo = new String[]{"Matricula", "Nombre", "Color", "Propietario", "Eslora", "manga"};
            modeloVehiculos.setColumnIdentifiers(titulo);
            tblVehiculos.setModel(modeloVehiculos);
            refrescarTablaVehiculosBarcos();
        } else {
            String[] titulo = new String[]{"Matricula", "Nombre", "Color", "Propietario", "Longitud", "Cantidad Pasajeros"};
            modeloVehiculos.setColumnIdentifiers(titulo);
            tblVehiculos.setModel(modeloVehiculos);
            refrescarTablaVehiculosAviones();
        }

    }

    private void refrescarTablaVehiculosTodos() {
        tblVehiculos.setModel(modeloVehiculos);

        //Recorremos el array y rellenamos la tabla
        for (Avion avion : listaVehiculosAviones) {
            Object b[] = new Object[6];
            b[0] = avion.getMatricula();
            b[1] = avion.getNombre();
            b[2] = avion.getColor();
            b[3] = avion.toStringID();
            b[4] = avion.getLongitud();
            b[5] = avion.getCantPasajeros();
            modeloVehiculos.addRow(b);
            cont++;
        }

        for (Barco barco : listaVehiculosBarcos) {
            Object b[] = new Object[6];
            b[0] = barco.getMatricula();
            b[1] = barco.getNombre();
            b[2] = barco.getColor();
            b[3] = barco.toStringID();
            b[4] = barco.getEslora();
            b[5] = barco.getManga();
            modeloVehiculos.addRow(b);
            cont++;
        }

    }

    private void refrescarTablaVehiculosBarcos() {
        tblVehiculos.setModel(modeloVehiculos);

        //Recorremos el array y rellenamos la tabla
        for (Barco barco : listaVehiculosBarcos) {
            Object b[] = new Object[6];
            b[0] = barco.getMatricula();
            b[1] = barco.getNombre();
            b[2] = barco.getColor();
            b[3] = barco.toStringID();
            b[4] = barco.getEslora();
            b[5] = barco.getManga();
            modeloVehiculos.addRow(b);
            cont++;
        }

    }

    private void refrescarTablaVehiculosAviones() {
        tblVehiculos.setModel(modeloVehiculos);

        //Recorremos el array y rellenamos la tabla
        for (Avion avion : listaVehiculosAviones) {
            Object b[] = new Object[6];
            b[0] = avion.getMatricula();
            b[1] = avion.getNombre();
            b[2] = avion.getColor();
            b[3] = avion.toStringID();
            b[4] = avion.getLongitud();
            b[5] = avion.getCantPasajeros();
            modeloVehiculos.addRow(b);
            cont++;
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        lblCapyBash = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        lblFiltro = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 138, 36));

        btnVolver.setBackground(new java.awt.Color(240, 167, 50));
        btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tblVehiculos.setBackground(new java.awt.Color(236, 183, 64));
        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "ID", "Nombre", "Color", "Propietario"
                }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        lblCapyBash.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblCapyBash.setForeground(new java.awt.Color(255, 255, 255));
        lblCapyBash.setText("CapyBash:");

        lblDashboard.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Listado De Vehiculos");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Barcos", "Aviones" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });

        lblFiltro.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblFiltro.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltro.setText("Filtro:");

        btnActualizar.setBackground(new java.awt.Color(240, 167, 50));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(lblCapyBash)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDashboard)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblFiltro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnVolver)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnActualizar)))
                                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDashboard)
                                        .addComponent(lblCapyBash))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFiltro)
                                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVolver)
                                        .addComponent(btnActualizar))
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        actualizarTablas();
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaVehiculo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCapyBash;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration                   
}
