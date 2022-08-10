/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.udea;

import controlador.controlador;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UdeA {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        controlador control =new controlador();
        control.iniciar();
    }
}
