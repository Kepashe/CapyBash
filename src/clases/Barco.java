package src.clases;

public class Barco extends Vehiculo{
    // Atributos
    public double eslora;
    public double manga;

    @Override
    public String toString() {
        return "Barco{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", eslora='" + eslora + '\'' +
                ", manga='" + manga + '\'' +
                ", Dueño='" + propietario.getIdPersona()+ '\'' +
                '}';
    }

    //Constructores


    public Barco(String matricula, String nombre, String color, Persona propietario, double eslora, double manga) {
        super(matricula, nombre, color, propietario);
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
