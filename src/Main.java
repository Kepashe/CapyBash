package src;

public class Main {
    public static void main(String []args) {
        Vehiculo vehiculo1 = new Vehiculo(1, "Quad", "Rojo");
        System.out.println(vehiculo1.toString());
        Barco barco1 = new Barco(1, "La cacatúa del mar", "Azul", 2.23, 12.4);
        System.out.println(barco1.toString());
        Avion avion1 = new Avion(1, "Águila Calva-22", "Blanco", 20, 2);
        System.out.println(avion1.toString());
    }
}
