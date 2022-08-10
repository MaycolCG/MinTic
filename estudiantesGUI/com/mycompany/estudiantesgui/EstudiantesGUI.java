package com.mycompany.estudiantesgui;

import controlador.controlador;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EstudiantesGUI {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        controlador control =new controlador();
        control.iniciar();
    }
}
