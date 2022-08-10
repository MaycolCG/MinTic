package Vista;

import Modelo.Modelo;

public class Vista {

    public static void imprimirMenu() {

        System.out.println("\nUNIVERSIDAD DE ANTIOQUIA\n");
        System.out.println("Seleccione la tarea a realizar: \n");
        System.out.println("1. Ingresar nuevo estudiante");
        System.out.println("2. Buscar estudiante registrado");
        System.out.println("3. Modificar estudiante registrado");
        System.out.println("4. Eliminar registro de un estudiante");
        System.out.println("5. Ver directorio de estudiantes");
        System.out.println("6. Salir \n");
    }

    public static void mostrar(int indice) {

        System.out.println("\nINFORMACION DEL ESTUDIANTE:");
        System.out.println("Nombres: " + Modelo.nombres.get(indice));
        System.out.println("Apellidos: " + Modelo.apellidos.get(indice));
        System.out.println("Fecha de nacimiento: " + Modelo.nacimiento.get(indice));
        System.out.println("Correo Electronico: " + Modelo.correo.get(indice));
        System.out.println("Numero Celular: " + Modelo.celular.get(indice));
        System.out.println("Programa de interes: " + Modelo.programa.get(indice) + "\n");

    }
    
    public static void Dir() {
        int medida = Modelo.nombres.size();
        for (int i = 0; i < medida; i++) {
            mostrar(i);
        }
    }

}
