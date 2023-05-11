package src;

public class Avion extends Vehiculo{
    // Atributos
    public double longitud;
    public int cantPasajeros;

    @Override
    public String toString() {
        return "Barco{" +
                "idVehiculo=" + idVehiculo +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", longitud='" + longitud + '\'' +
                ", cantPasajeros='" + cantPasajeros+
                '}';
    }

    // Constructores
    public Avion() {

    }

    public Avion(double longitud, int cantPasajeros) {
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
