package src.clases;

public class Vehiculo {
    // Atributos
    public String matricula;
    public String nombre;
    public String color;

    public Persona propietario;

    // Metodo ToString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", color='" + color +
                ", propietario:" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }

    public String toStringID() {
        return propietario.getIdPersona() + "";
    }

    // Constructores
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String nombre, String color, Persona propietario) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.color = color;
        this.propietario = propietario;
    }

    //Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public Persona getPropietario() {
        return propietario;
    }
    // Setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}

