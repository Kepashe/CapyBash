package src;

import src.clases.Avion;
import src.clases.Barco;
import src.clases.Persona;
import src.clases.Vehiculo;
import src.ui.AltaPersonas;
import src.ui.Menu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static ArrayList<Vehiculo> listaVehiculosMain = new ArrayList<>();
    public static ArrayList<Avion> listaVehiculosAvionesMain = new ArrayList<>();
    public static ArrayList<Barco> listaVehiculosBarcosMain = new ArrayList<>();
    public static ArrayList<Persona> listaPersonasMain = new ArrayList<>();

    public static void main(String[] args) {
        Persona per1 = new Persona(1, "Juan", "Carlos", "Montevideo", (byte) 5, LocalDate.of(2000, 10, 25));
        Persona per2 = new Persona(2, "Alberto", "Fernandez", "Artigas", (byte) 5, LocalDate.of(2005, 06, 13));
        Persona per3 = new Persona(3, "Alex", "Pedro", "Rio Negro", (byte) 5, LocalDate.of(1997, 03, 29));

        listaPersonasMain.add(per1);
        listaPersonasMain.add(per2);
        listaPersonasMain.add(per3);

        Barco bar1 = new Barco("M4c442", "MANSOSOS Negra", "Verde Limo", per1, 34.5, 593.2);
        Barco bar2 = new Barco("423cCD", "Manza Nutia", "Óxido", per2, 56, 15.55);
        Barco bar3 = new Barco("5428DE", "Mathias", "Color agua", per3, 34.5, 15.5);

        listaVehiculosBarcosMain.add(bar1);
        listaVehiculosBarcosMain.add(bar2);
        listaVehiculosBarcosMain.add(bar3);

        Avion av1 = new Avion("986c2", "Juan Airlines", "Verde Limo", per1, 34.5, 93);
        Avion av2 = new Avion("M4542", "Avioncito", "Azul", per1, 35.5, 53);
        Avion av3 = new Avion("DE4c2", "Aguas Tenebrosas", "Verde Musgo", per3, 36.5, 59);

        listaVehiculosAvionesMain.add(av1);
        listaVehiculosAvionesMain.add(av2);
        listaVehiculosAvionesMain.add(av3);

        Menu menu = new Menu();


    }


}
