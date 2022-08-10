package Controlador;

import java.util.*;
import Modelo.Modelo;
import Vista.Vista;

public class Controlador {

    public static int capturarOpcion() {
        int opcion = 0;
        while (opcion < 1 || opcion > 6) { //controlamos que el numero esté dentro del rango
            System.out.println("Opcion: ");
            try {
                opcion = lector.input.nextInt(); // Controlamos que el usuario si ingrese un numero
                lector.input.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("\nOpcion invalida, por favor ingrese una nueva opcion\n");
                lector.input.nextLine();
            }
        }
        return opcion;
    }

    public static void ingresar() {

        //Guardamos los nombres en el array Nombres creado en la clase modelo
        System.out.println("\nPor favor ingrese su nombre: ");
        String Nombres = lector.input.nextLine();
        Modelo.nombres.add(Nombres);

        //Guardamos los apellidos en el array Apellidos creado en la clase modelo
        System.out.println("\nPor favor ingrese su apellido: ");
        String Apellidos = lector.input.nextLine();
        Modelo.apellidos.add(Apellidos);

        //Guardamos la fecha de nacimiento en el array nacimiento creado en la clase modelo
        System.out.println("\nPor favor ingrese su fecha de nacimiento: (DD-MM-AAAA)");
        String Nacimiento = lector.input.nextLine();
        Modelo.nacimiento.add(Nacimiento);

        //Guardamos el correo electrónico en el array correo creado en la clase modelo
        System.out.println("\nPor favor ingrese su correo personal: ");
        String Correo = lector.input.nextLine();
        Modelo.correo.add(Correo);

        //Guardamos el numero celular (de tipo long) en el array celular creado en el modelo pero verificamos que no haya error en guarda
        Long Celular;
        System.out.println("\nPor favor ingrese su numero celular: ");
        try {
            Celular = lector.input.nextLong();
        } catch (InputMismatchException exception) {
            Celular = (long) 0;
        }
        Modelo.celular.add(Celular);

        //Guardamos el programa en el array programa creado en la clase modelo
        System.out.println("\nPor favor ingrese su programa de interes: ");
        lector.input.nextLine();
        String Programa = lector.input.nextLine();
        Modelo.programa.add(Programa);

        System.out.println("\nESTUDIANTE REGISTRADO CORRECTAMENTE \n");

    }

    public static void buscar() {
        System.out.println("\nIngrese por favor el correo: ");
        String correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(correo);
        if (indice == -1) {//Si index regresa -1, quiere decir que no encontró el objeto
            System.out.println("\nESTUDIANTE NO REGISTRADO");
        } else {
            Vista.mostrar(indice);
        }
    }

    public static void modificar() {
        System.out.println("\nIngrese por favor el correo: ");
        String correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(correo);
        if (indice != -1) {
            System.out.println("\nPor favor ingrese los nombres correctamente");
            Modelo.nombres.set(indice, lector.input.nextLine()); //Modificamos el nombre relacionado con ese indice

            System.out.println("\nPor favor ingrese los apellidos correctamente");
            String Apellidos = lector.input.nextLine();
            Modelo.apellidos.set(indice, Apellidos);//modificamos los apellidos relacionados con ese indicie

            System.out.println("\nPor favor ingrese la fecha de nacimiento correctamente (DD-MM-AAAA)");
            String Nacimiento = lector.input.nextLine();
            Modelo.nacimiento.set(indice, Nacimiento);

            System.out.println("\nPor favor ingrese el numero celular correctamente");
            Long Celular = lector.input.nextLong();
            Modelo.celular.set(indice, Celular);

            System.out.println("\nPor favor ingrese el programa de interes correctamente");
            lector.input.nextLine();
            String Programa = lector.input.nextLine();
            Modelo.programa.set(indice, Programa);

            System.out.println("\nESTUDIANTE MODIFICADO CORRECTAMENTE. \n");
        } else {
            System.out.println("\nUSUARIO NO ENCONTRADO");
        }
    }

    public static void eliminar() {
        System.out.println("\nIngrese por favor el correo: ");
        String correo = lector.input.nextLine();
        int indice = Modelo.correo.indexOf(correo);
        if (indice != -1) {
            Modelo.nombres.remove(indice);
            Modelo.apellidos.remove(indice);
            Modelo.nacimiento.remove(indice);
            Modelo.correo.remove(indice);
            Modelo.celular.remove(indice);
            Modelo.programa.remove(indice);
            System.out.println("\nREGISTRO ELIMINADO CORRECTAMENTE. \n");
        } else {
            System.out.println("\nREGISTRO A ELIMINAR NO ENCONTRADO");
        }
    }
}

class lector {

    static Scanner input = new Scanner(System.in);

}
