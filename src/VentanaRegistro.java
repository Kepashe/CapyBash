package src;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; //Para formatear la librería
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    public class VentanaRegistro extends JFrame {
        private JTextField txtID;
        private JTextField txtNombre;
    private JComboBox cbxDepto;
    private JButton btnGuardar;
    private JTextField txtFecha;
    private JTextField txtApellido;
    private JPanel Panel;
    private JSpinner spnHijos;
    private JTable tablaPersona;

    DefaultTableModel modelo = new DefaultTableModel(); //Para mostrarlos en una tabla
    ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //Array para guardar las personas

    public VentanaRegistro() {


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
                    //Creamos una instancia de la clase Persona
                    Persona persona = new Persona();
                    persona.setIdPersona(Integer.parseInt(txtID.getText()));
                    persona.setNombre(txtNombre.getText());
                    persona.setApellido(txtApellido.getText());
                    // Obtener el valor del JSpinner y convertirlo a byte
                    byte cantHijos = ((Number) spnHijos.getValue()).byteValue();
                    persona.setCantHijos(cantHijos);

                    persona.setDptoResidencia(cbxDepto.getSelectedItem().toString()); //Guardamos el dato del comboBox

                    String fechaStr = txtFecha.getText(); // Obtener la fecha como una cadena de texto
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Crear un formateador de fechas para el formato "dd/MM/yyyy"
                    LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter); // Convertir la cadena de texto en un objeto LocalDate utilizando el formateador creado
                    persona.setFechaNacimiento(fechaNacimiento);//Seteamos la fecha nacimiento colocada
                    listaPersonas.add(persona); //Guardamos en el array
//                JOptionPane.showMessageDialog(null, persona.toString());
                    refrescarTabla();
                }catch (Exception a){
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }


            }
        });
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

    public static void main(String[] args) {
        VentanaRegistro ventanaRegistro = new VentanaRegistro();
    }

}
