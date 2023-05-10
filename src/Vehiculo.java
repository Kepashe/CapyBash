package src;

public class Vehiculo {
    // Atributos
    public int idVehiculo;
    public String nombre;
    public String color;

    // Metodo ToString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", nombre='" + nombre + '\'' +
                ", color='" + color +
                '}';
    }

    // Constructores
    public Vehiculo() {

    }

    public Vehiculo(int idVehiculo, String nombre, String color) {
        this.idVehiculo = idVehiculo;
        this.nombre = nombre;
        this.color = color;
    }

    //Getters
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    // Setter

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

