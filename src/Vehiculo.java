package src;

public class Vehiculo {
    // Atributos
    public String matricula;
    public String nombre;
    public String color;

    // Metodo ToString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", color='" + color +
                '}';
    }

    // Constructores
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String nombre, String color) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.color = color;
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
}

