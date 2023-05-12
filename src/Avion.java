package src;

public class Avion extends Vehiculo{
    // Atributos
    public double longitud;
    public int cantPasajeros;

    @Override
    public String toString() {
        return "Barco{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", longitud='" + longitud + '\'' +
                ", cantPasajeros='" + cantPasajeros+ '\'' +
                ", Dueño='" + propietario.getIdPersona()+ '\'' +
                '}';
    }

    // Constructores


    public Avion(String matricula, String nombre, String color, Persona propietario, double longitud, int cantPasajeros) {
        super(matricula, nombre, color, propietario);
        this.longitud = longitud;
        this.cantPasajeros = cantPasajeros;
    }

    // Getters
    public double getLongitud() {
        return longitud;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    // Setters
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
}
