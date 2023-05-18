package src.ui;

import src.clases.Avion;
import src.clases.Barco;
import src.clases.Persona;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.IOException;

import static src.Main.*;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        setTitle("Menú");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        setVisible(true);
        setResizable(false);

        jPanel1 = new javax.swing.JPanel();
        lblCapyBash = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblAlexis = new javax.swing.JLabel();
        lblLeandro = new javax.swing.JLabel();
        lblBernardo = new javax.swing.JLabel();
        lblFacundo = new javax.swing.JLabel();
        lblJuan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAltaPersonas = new javax.swing.JButton();
        btnAltaVehiculos = new javax.swing.JButton();
        btnListaVehiculos = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 138, 36));

        lblCapyBash.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblCapyBash.setForeground(new java.awt.Color(255, 255, 255));
        lblCapyBash.setText("CapyBash");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo-transparencia.png"))); // NOI18N
        lblAlexis.setForeground(new java.awt.Color(255, 255, 255));
        lblAlexis.setText("Alexis Borges");

        lblLeandro.setForeground(new java.awt.Color(255, 255, 255));
        lblLeandro.setText("Leandro Chineli");

        lblBernardo.setForeground(new java.awt.Color(255, 255, 255));
        lblBernardo.setText("Bernardo Montaña");

        lblFacundo.setForeground(new java.awt.Color(255, 255, 255));
        lblFacundo.setText("Facundo Rodríguez ");

        lblJuan.setForeground(new java.awt.Color(255, 255, 255));
        lblJuan.setText("Juan Calviño");

        jPanel2.setBackground(new java.awt.Color(236, 183, 64));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAltaPersonas.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnAltaPersonas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        btnAltaPersonas.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaPersonas.setText("Alta de Personas");
        btnAltaPersonas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAltaPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPersonasActionPerformed(evt);
            }
        });

        btnAltaVehiculos.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnAltaVehiculos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        btnAltaVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnAltaVehiculos.setText("Alta de Vehiculos");
        btnAltaVehiculos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAltaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaVehiculosActionPerformed(evt);
            }
        });

        btnListaVehiculos.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnListaVehiculos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        btnListaVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaVehiculos.setText("Lista de Vehiculos");
        btnListaVehiculos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVehiculosActionPerformed(evt);
            }
        });

        btnDashboard.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnDashboard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnExportar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnExportar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setText("Exportar datos ");
        btnExportar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                                        .addComponent(btnListaVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                                        .addComponent(btnAltaVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                                        .addComponent(btnAltaPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(79, 79, 79))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnAltaPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAltaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListaVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCapyBash)
                                        .addComponent(lblAlexis)
                                        .addComponent(lblLeandro)
                                        .addComponent(lblBernardo)
                                        .addComponent(lblFacundo)
                                        .addComponent(lblJuan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lblLogo))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(lblCapyBash)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblAlexis)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblLeandro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBernardo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblFacundo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblJuan)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>


    //Método para exportar vehículos
    public static void exportarDatos(String nombreArchivo) {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Exportar personas
            writer.write("Personas:\n");
            for (Persona persona : listaPersonasMain) {
                writer.write(persona.toString());
                writer.write("\n");
            }

            // Exportar barcos
            writer.write("Barcos:\n");
            for (Barco barco : listaVehiculosBarcosMain) {
                writer.write(barco.toString());
                writer.write("\n");
            }

            // Exportar aviones
            writer.write("Aviones:\n");
            for (Avion avion : listaVehiculosAvionesMain) {
                writer.write(avion.toString());
                writer.write("\n");
            }

            writer.flush();
            System.out.println("Datos exportados exitosamente al archivo " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al exportar los datos: " + e.getMessage());
        }
    }



    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {
            // Exportar los datos al archivo "datos.txt"
        exportarDatos("datos.txt");


    }


    private void btnAltaPersonasActionPerformed(java.awt.event.ActionEvent evt) {
        // Hace invisible la ventana actual
        setVisible(false);
        // Crear y mostrar el alta de personas
        AltaPersonas altaPersonas = new AltaPersonas();
        // Modificamos la operación cuando se cierra la ventana directa.
        altaPersonas.setDefaultCloseOperation(altaPersonas.DISPOSE_ON_CLOSE);
        // Evento listener de operación de ventana.
        altaPersonas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Hace nuevamente visible el menú
                setVisible(true);
            }
        });
    }

    private void btnAltaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {
        // Hace invisible la ventana actual
        setVisible(false);
        // Crear y mostrar el alta de vehículos
        AltaVehiculos altaVehiculos = new AltaVehiculos();
        // Modificamos la operación cuando se cierra la ventana directa.
        altaVehiculos.setDefaultCloseOperation(altaVehiculos.DISPOSE_ON_CLOSE);
        // Evento listener de operación de ventana.
        altaVehiculos.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Hace nuevamente visible el menú
                setVisible(true);
            }
        });
    }

    private void btnListaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {
        // Hace invisible la ventana actual
        setVisible(false);
        // Crear y mostrar la lista de vehiculos
        ListaVehiculo listaVehiculo = new ListaVehiculo();
        // Modificamos la operación cuando se cierra la ventana directa.
        listaVehiculo.setDefaultCloseOperation(listaVehiculo.DISPOSE_ON_CLOSE);
        // Evento listener de operación de ventana.
        listaVehiculo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Hace nuevamente visible el menú
                setVisible(true);
            }
        });
    }

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {
        /// Hace invisible la ventana actual
        setVisible(false);
        // Crear y mostrar el alta de personas
        Dashboard dashboard = new Dashboard();
        // Modificamos la operación cuando se cierra la ventana directa.
        dashboard.setDefaultCloseOperation(dashboard.DISPOSE_ON_CLOSE);
        // Evento listener de operación de ventana.
        dashboard.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Hace nuevamente visible el menú
                setVisible(true);
            }
        });
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnAltaPersonas;
    private javax.swing.JButton btnAltaVehiculos;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnListaVehiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlexis;
    private javax.swing.JLabel lblBernardo;
    private javax.swing.JLabel lblCapyBash;
    private javax.swing.JLabel lblFacundo;
    private javax.swing.JLabel lblJuan;
    private javax.swing.JLabel lblLeandro;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JButton btnExportar;
    // End of variables declaration
}
