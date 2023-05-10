package src;

public class Barco extends Vehiculo{
    // Atributos
    public double eslora;
    public double manga;

    @Override
    public String toString() {
        return "Barco{" +
                "idVehiculo=" + idVehiculo +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", eslora='" + eslora + '\'' +
                ", manga='" + manga +
                '}';
    }

    //Constructores
    public Barco() {

    }

    public Barco(double eslora, double manga) {
        this.eslora = eslora;
        this.manga = manga;
    }

    // Getters
    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    // Setters
    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }
}
