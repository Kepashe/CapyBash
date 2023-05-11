package src;

import java.time.LocalDate;

public class Main {
    public static void main(String []args) {
//        Vehiculo vehiculo1 = new Vehiculo(1, "Quad", "Rojo");
//        System.out.println(vehiculo1.toString());
//        Barco barco1 = new Barco(1, "La cacatúa del mar", "Azul", 2.23, 12.4);
//        System.out.println(barco1.toString());
//        Avion avion1 = new Avion(1, "Águila Calva-22", "Blanco", 20, 2);
//        System.out.println(avion1.toString());


        Vehiculo vei = new Vehiculo();
        vei.setColor("verde");
        vei.setNombre("Cacamovil");
        vei.setMatricula("2B");

        Persona per1 = new Persona();
        per1.setApellido("Fer");
        per1.setNombre("Juan");
        per1.setCantHijos((byte) 2);
        per1.setDptoResidencia("Sanjose");
        per1.setFechaNacimiento(LocalDate.of(2002, 10, 23));
        per1.agregarVehiculo(vei);

        System.out.println(per1.toString());
    }
}
