package src.ui;

    public class Dashboard extends javax.swing.JFrame {


        public Dashboard() {
            initComponents();
            setTitle("Dashboard");
            setContentPane(jPanel1);
            pack();
            setLocationRelativeTo(null);
            setVisible(true);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {
            int cantPersonas = AltaPersonas.listaPersonas.size();
            int cantVehiculos = AltaVehiculos.altaListaVehiculosAviones.size() + AltaVehiculos.altaListaVehiculosBarcos.size();
            Double promedio;
            if (cantVehiculos == 0 || cantPersonas == 0){
                promedio = 0.0;
            }else {
                promedio = (double) (cantVehiculos / cantPersonas);
            }


            jPanel6 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            lblPersonasIngresadas3 = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            lblDashboard = new javax.swing.JLabel();
            lblCapyBash = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            lblPersonasIngresadas = new javax.swing.JLabel();
            jPanel5 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            lblPromedio = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            lblVehiculosIngresados = new javax.swing.JLabel();
            btnVolver = new javax.swing.JButton();

            jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

            jLabel6.setText("Personas ingresadas");

            lblPersonasIngresadas3.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
            lblPersonasIngresadas3.setText("0");

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jLabel6))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGap(61, 61, 61)
                                                    .addComponent(lblPersonasIngresadas3)))
                                    .addContainerGap(26, Short.MAX_VALUE))
            );
            jPanel6Layout.setVerticalGroup(
                    jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPersonasIngresadas3)
                                    .addContainerGap(7, Short.MAX_VALUE))
            );

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(221, 138, 36));

            lblDashboard.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
            lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
            lblDashboard.setText("Dashboard");

            lblCapyBash.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
            lblCapyBash.setForeground(new java.awt.Color(255, 255, 255));
            lblCapyBash.setText("CapyBash:");

            jPanel4.setBackground(new java.awt.Color(236, 183, 64));
            jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Personas ingresadas");

            lblPersonasIngresadas.setFont(new java.awt.Font("Segoe UI Black", 0, 70)); // NOI18N
            lblPersonasIngresadas.setForeground(new java.awt.Color(255, 255, 255));
            lblPersonasIngresadas.setText(Integer.toString(cantPersonas));

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel4)
                                    .addContainerGap(25, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPersonasIngresadas)
                                    .addGap(61, 61, 61))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPersonasIngresadas)
                                    .addContainerGap())
            );

            jPanel5.setBackground(new java.awt.Color(236, 183, 64));
            jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Promedio Vehiculos por Persona");

            lblPromedio.setFont(new java.awt.Font("Segoe UI Black", 0, 70)); // NOI18N
            lblPromedio.setForeground(new java.awt.Color(255, 255, 255));
            lblPromedio.setText(Double.toString(promedio));

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap(15, Short.MAX_VALUE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(14, 14, 14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                    .addComponent(lblPromedio)
                                                    .addGap(59, 59, 59))))
            );
            jPanel5Layout.setVerticalGroup(
                    jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblPromedio)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel7.setBackground(new java.awt.Color(236, 183, 64));
            jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setText("Vehiculos ingresados");

            lblVehiculosIngresados.setFont(new java.awt.Font("Segoe UI Black", 0, 70)); // NOI18N
            lblVehiculosIngresados.setForeground(new java.awt.Color(255, 255, 255));
            lblVehiculosIngresados.setText(Integer.toString(cantVehiculos));

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jLabel7)
                                    .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblVehiculosIngresados)
                                    .addGap(60, 60, 60))
            );
            jPanel7Layout.setVerticalGroup(
                    jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblVehiculosIngresados)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            btnVolver.setBackground(new java.awt.Color(240, 167, 50));
            btnVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
            btnVolver.setForeground(new java.awt.Color(255, 255, 255));
            btnVolver.setText("Volver");
            btnVolver.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnVolverActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(150, 150, 150)
                                                    .addComponent(lblCapyBash)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(lblDashboard))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(btnVolver)))
                                    .addContainerGap(9, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDashboard)
                                            .addComponent(lblCapyBash))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addComponent(btnVolver)
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
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>

        private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
            Menu menu = new Menu();
            // Cierra la ventana actual
            this.dispose();
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
                java.util.logging.Logger.getLogger(src.ui.Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(src.ui.Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(src.ui.Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(src.ui.Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new src.ui.Dashboard().setVisible(true);
                }
            });
        }

        // Variables declaration - do not modify
        private javax.swing.JButton btnVolver;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JLabel lblCapyBash;
        private javax.swing.JLabel lblDashboard;
        private javax.swing.JLabel lblPersonasIngresadas;
        private javax.swing.JLabel lblPersonasIngresadas3;
        private javax.swing.JLabel lblPromedio;
        private javax.swing.JLabel lblVehiculosIngresados;
        // End of variables declaration
    }
