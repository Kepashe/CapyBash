package src;

import src.JFrame.AgregarPersona;
import src.JFrame.AsignarVehiculo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static ArrayList<Vehiculo> listaVehiculosMain = new ArrayList<>();
    public static ArrayList<Avion> listaVehiculosAvionesMain = new ArrayList<>();
    public static ArrayList<Barco> listaVehiculosBarcosMain = new ArrayList<>();
    public static ArrayList<Persona> listaPersonasMain = new ArrayList<>();

    public static void main(String []args) {



        Persona per1 = new Persona(1, "Pedro", "carlos", "Montevideo", (byte) 5, LocalDate.of(3000, 10, 23));
        Vehiculo vei = new Vehiculo();
        vei.setColor("verde");
        vei.setNombre("Cacamovil");
        vei.setMatricula("2B");
        vei.setPropietario(per1);


        listaPersonasMain.add(per1);


        Barco bar1 = new Barco("M4c2", "Juan", "Verde Limo", per1, 34.5, 593.2);
        Barco bar2 = new Barco("M4c2", "Juan", "Verde Limo", per1, 34.5, 593.2);
        Barco bar3 = new Barco("M4c2", "Juan", "Verde Limo", per1, 34.5, 593.2);
        Barco bar4 = new Barco("M4c2", "Juan", "Verde Limo", per1, 34.5, 593.2);

        listaVehiculosBarcosMain.add(bar1);
        listaVehiculosBarcosMain.add(bar2);
        listaVehiculosBarcosMain.add(bar3);
        listaVehiculosBarcosMain.add(bar4);

        Avion av1 = new Avion("M4c2", "Juan", "Verde Limo", per1, 34.5, 593);
        Avion av2 = new Avion("M4c2", "Juan", "Verde Limo", per1, 34.5, 593);
        Avion av3 = new Avion("M4c2", "Juan", "Verde Limo", per1, 34.5, 593);
        Avion av4 = new Avion("M4c2", "Juan", "Verde Limo", per1, 34.5, 593);

        listaVehiculosAvionesMain.add(av1);
        listaVehiculosAvionesMain.add(av2);
        listaVehiculosAvionesMain.add(av3);
        listaVehiculosAvionesMain.add(av4);



        AgregarPersona agregarPersona = new AgregarPersona();
    }
}
