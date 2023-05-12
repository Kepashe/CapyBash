package src.JFrame;

import src.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class AsignarVehiculo extends javax.swing.JFrame {

    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private ArrayList<Avion> listaVehiculosAviones = new ArrayList<>();
    private ArrayList<Barco> listaVehiculosBarcos = new ArrayList<>();

    DefaultTableModel modeloVehiculos = new DefaultTableModel();
    DefaultTableModel modeloVehiculosAvion = new DefaultTableModel();
    DefaultTableModel modeloVehiculosBarco = new DefaultTableModel();


    public AsignarVehiculo() {
        initComponents();
        listaVehiculos = Main.listaVehiculosMain;
        listaVehiculosAviones = Main.listaVehiculosAvionesMain;
        listaVehiculosBarcos = Main.listaVehiculosBarcosMain;
        actualizarTablas();
    }

    public void actualizarTablas() {

        modeloVehiculos.addColumn("Matricula");
        modeloVehiculos.addColumn("Nombre");
        modeloVehiculos.addColumn("Color");
        modeloVehiculos.addColumn("Propietario");
        modeloVehiculosAvion.addColumn("Matricula");
        modeloVehiculosAvion.addColumn("Nombre");
        modeloVehiculosAvion.addColumn("Color");
        modeloVehiculosAvion.addColumn("Propietario");
        modeloVehiculosAvion.addColumn("Longitud");
        modeloVehiculosAvion.addColumn("Cantidad Pasajeros");
        modeloVehiculosBarco.addColumn("Matricula");
        modeloVehiculosBarco.addColumn("Nombre");
        modeloVehiculosBarco.addColumn("Color");
        modeloVehiculosBarco.addColumn("Propietario");
        modeloVehiculosBarco.addColumn("Eslora");
        modeloVehiculosBarco.addColumn("Manga");

        refrescarTablaVehiculosAviones();
        refrescarTablaVehiculosTodos();
        refrescarTablaVehiculosBarcos();
    }

    private void refrescarTablaVehiculosTodos() {
        TablaVehiculos.setModel(modeloVehiculos);

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

    private void refrescarTablaVehiculosAviones() {
        TablaVehiculos4.setModel(modeloVehiculosAvion);

        //Recorremos el array y rellenamos la tabla
        for (Avion avion : listaVehiculosAviones) {
            Object b[] = new Object[6];
            b[0] = avion.getMatricula();
            b[1] = avion.getNombre();
            b[2] = avion.getColor();
            b[3] = avion.toStringID();
            b[4] = avion.getLongitud();
            b[5] = avion.getCantPasajeros();
            modeloVehiculosAvion.addRow(b);
            modeloVehiculos.addRow(b);
        }

//        TablaVehiculos.setModel(modeloVehiculos);
//
//        //Recorremos el array y rellenamos la tabla
//        for (Vehiculo avion : listaVehiculosAviones) {
//            Object b[] = new Object[4];
//            b[0] = avion.getMatricula();
//            b[1] = avion.getNombre();
//            b[2] = avion.getColor();
//            b[3] = avion.toStringID();
//            modeloVehiculos.addRow(b);
//        }
    }

    private void refrescarTablaVehiculosBarcos() {
        TablaVehiculos3.setModel(modeloVehiculosBarco);

        //Recorremos el array y rellenamos la tabla
        for (Barco barco : listaVehiculosBarcos) {
            Object c[] = new Object[6];
            c[0] = barco.getMatricula();
            c[1] = barco.getNombre();
            c[2] = barco.getColor();
            c[3] = barco.toStringID();
            c[4] = barco.getEslora();
            c[5] = barco.getManga();
            modeloVehiculosBarco.addRow(c);
            modeloVehiculos.addRow(c);
        }

        TablaVehiculos.setModel(modeloVehiculos);

//        //Recorremos el array y rellenamos la tabla
//        for (Vehiculo barco : listaVehiculosBarcos) {
//            Object c[] = new Object[4];
//            c[0] = barco.getMatricula();
//            c[1] = barco.getNombre();
//            c[2] = barco.getColor();
//            c[3] = barco.toStringID();
//            modeloVehiculos.addRow(c);
//        }
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
        cbxFiltro = new javax.swing.JComboBox<>();
        txtFiltro = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaVehiculos3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaVehiculos4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 276, Short.MAX_VALUE)
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
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "ID", "Nombre", "Color", "Propietario"
                }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        jLabel1.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        jLabel1.setText("Listado de Vehiculos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Filtro:");

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

        jLabel4.setText("Todos");

        jLabel5.setText("Aviones");

        jLabel6.setText("Botes");

        TablaVehiculos3.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "ID", "Nombre", "Color", "Propietario", "Eslora", "Manga"
                }
        ));
        jScrollPane4.setViewportView(TablaVehiculos3);

        TablaVehiculos4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[]{
                        "ID", "Nombre", "Color", "Propietario", "Longitud", "Cantidad Pasajeros"
                }
        ));
        jScrollPane5.setViewportView(TablaVehiculos4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cbxFiltroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
        // Cierra la ventana actual
        this.dispose();
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
    private javax.swing.JTable TablaVehiculos3;
    private javax.swing.JTable TablaVehiculos4;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration
}