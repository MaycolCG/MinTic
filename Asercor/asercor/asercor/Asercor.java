
package asercor.asercor;

import controlador.controlador;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Asercor {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        controlador control =new controlador();
        control.iniciar();
    }
}