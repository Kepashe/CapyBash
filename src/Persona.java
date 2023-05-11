package src;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    // Atributos
//    private static int idCounter = 0;
    private int idPersona;
    private String nombre;
    private String apellido;
    private String dptoResidencia;
    private byte cantHijos;
    private LocalDate fechaNacimiento;

    private List<Vehiculo> vehiculos;

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dptoResidencia='" + dptoResidencia + '\'' +
                ", cantHijos=" + cantHijos +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    // Constructores
    public Persona() {
        vehiculos = new ArrayList<>();
    }


    public Persona(int idPersona, String nombre, String apellido, String dptoResidencia, byte cantHijos, LocalDate fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dptoResidencia = dptoResidencia;
        this.cantHijos = cantHijos;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDptoResidencia() {
        return dptoResidencia;
    }

    public byte getCantHijos() {
        return cantHijos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDptoResidencia(String dptoResidencia) {
        this.dptoResidencia = dptoResidencia;
    }

    public void setCantHijos(byte cantHijos) {
        this.cantHijos = cantHijos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

}

