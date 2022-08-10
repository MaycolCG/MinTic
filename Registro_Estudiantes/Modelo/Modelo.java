package Modelo;

import Controlador.Controlador;
import Vista.Vista;
import java.util.ArrayList;

public class Modelo { //Creación de una clase

    public static ArrayList<String> nombres = new ArrayList<String>();
    public static ArrayList<String> apellidos = new ArrayList<String>();
    public static ArrayList<String> nacimiento = new ArrayList<String>();
    public static ArrayList<String> correo = new ArrayList<String>();
    public static ArrayList<Long> celular = new ArrayList<Long>();
    public static ArrayList<String> programa = new ArrayList<String>();

    public static void main(String[] args) {

        while (true) {
            Vista.imprimirMenu();

            int valor = Controlador.capturarOpcion();

            if (valor == 1) {
                System.out.println("\nINGRESAR ESTUDIANTE:");
                Controlador.ingresar();

            } else if (valor == 2) {
                System.out.println("\nBUSCAR ESTUDIANTE:");
                Controlador.buscar();

            } else if (valor == 3) {
                System.out.println("\nMODIFICAR ESTUDIANTE:");
                Controlador.modificar();

            } else if (valor == 4) {
                System.out.println("\nELIMINAR ESTUDIANTE::");
                Controlador.eliminar();

            } else if (valor == 5) {
                System.out.println("\nVER LISTADO");
                Vista.Dir();

            } else if (valor == 6) {
                System.out.println("\nHASTA PRONTO\n");
                System.exit(0);
            }

        }
    }
    public class ClearConsoleScreen {
        public static void main(String[] args){
            System.out.print("Everything on the console will cleared");
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
