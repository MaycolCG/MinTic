package modelo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class BaseDeDatos {

    private ArrayList<modelo> lstEstudiantes; //unico atributo

    public BaseDeDatos() {
        this.lstEstudiantes = new ArrayList(); //nueva lista vacia
    }

    public void guardarEstudiante(modelo estudiante) {  //Metodo recibe modelos
        this.lstEstudiantes.add(estudiante); //guarde los modelos en la lista
        System.out.println("Estudiante guardado en la lista");
    }

    public modelo buscarEstudiante(String id) {
        modelo result = null; //Por defecto
        for (int i = 0; i < this.lstEstudiantes.size(); i++) {
            if (this.lstEstudiantes.get(i).getId().equals(id)) {
                System.out.println("Estudiante encontrado");
                result = this.lstEstudiantes.get(i);
            }
        }
        return result;
    }

    public void modificarEst(String id, modelo est) {
        for (int i = 0; i < this.lstEstudiantes.size(); i++) {
            if (this.lstEstudiantes.get(i).getId().equals(id)) {
                this.lstEstudiantes.get(i).setNombre(est.getNombre());
                this.lstEstudiantes.get(i).setApellido(est.getApellido());
                this.lstEstudiantes.get(i).setCorreo(est.getCorreo());
                this.lstEstudiantes.get(i).setTelefono(est.getTelefono());
                this.lstEstudiantes.get(i).setPrograma(est.getPrograma());
            }
        }
    }

    public void eliminar(String id) {
        for (int i = 0; i < this.lstEstudiantes.size(); i++) {
            if (this.lstEstudiantes.get(i).getId().equals(id)) {
                this.lstEstudiantes.remove(i);
            }
        }

    }

    public void guardarArchivo() throws FileNotFoundException, IOException {

        try {
            FileOutputStream archivo = new FileOutputStream("src/main/estudiantes.dat");//Crear un archivo externo
            ObjectOutputStream salida = new ObjectOutputStream(archivo); // Crear un lector de objetos que empalmara informacion con 
            salida.writeObject(this.lstEstudiantes);
            salida.close();
            archivo.close();

            /*for (int i = 0; i < this.lstEstudiantes.size(); i++) { //alimentamos al lector de objetos nuestra lista de estudiantes
                modelo est = this.lstEstudiantes.get(i);
                salida.writeObject(est); //escribimos los objetos en salida
            }*/
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear o encontrar el archivo");
        } catch (IOException e) {
            System.out.println("Hubo un error en el sistema");
            e.printStackTrace(); //Muestre los errores
        }

    }

    public void recuperarArchivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            FileInputStream archivo = new FileInputStream("src/main/estudiantes.dat");
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            this.lstEstudiantes = (ArrayList) entrada.readObject();
            archivo.close();
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo crear o encontrar el archivo");
        } catch (IOException e) {
            System.out.println("Hubo un error en el sistema");
        } catch (ClassCastException e) {
            System.out.println("EL tipo de clase no corresponde");
        }

    }

    //trabajando con CSV
    public void guardarCSV() {
        String csvFileName = "archivoCSV.csv";
        ICsvBeanWriter beanWriter = null;
        CellProcessor[] procesador = new CellProcessor[]{//Diseñamos las celdas
            new NotNull(), //ID
            new NotNull(), //Nombre
            new NotNull(), //Apellido
            new NotNull(), //Telefono
            new NotNull(), //Correo
            new NotNull(), //Programa
        };

        try {
            beanWriter = new CsvBeanWriter(new FileWriter(csvFileName), CsvPreference.STANDARD_PREFERENCE);// Crea el archivo csv con preferencia estandar
            String[] header = {"ID", "Nombre", "Apellido", "Telefono", "Correo", "Programa"};
            beanWriter.writeHeader(header);//forzar la escritura del encabezado

            for (modelo estudiantes : this.lstEstudiantes) {//recorrer cada estudiante de la lista de estudiantes
                beanWriter.write(estudiantes, header, procesador);//forzar la escritura de cada estudiante según
            }
            System.out.println("Archivo Creado");
            beanWriter.close();
        } catch (IOException e) {
            System.out.println("Hubo un error en el sistema");
        }
    }

    /*finally{
        if (beanWriter!=null){
            try{
            beanWriter.close(); //Que cierra el archivo despues de grabar
            }catch(IOException ex){
                System.err.println("error");                
            }
          }
        }*/
    public void leerCSV() throws FileNotFoundException {
        String line1=null; //ignore el titulo
        String splitBy=",";//delimitador es una coma
        try{
            BufferedReader br = new BufferedReader(new FileReader("archivoCSV.csv")); //guardamos el archivo en un buffered
            br.readLine();
            while ((line1=br.readLine()) !=null){
                String[] estudiante=line1.split(splitBy);
                String ID=estudiante[0];
                String nombre=estudiante[1];
                String apellido=estudiante[2];
                String telefono=estudiante[3];
                String correo=estudiante[4];
                String programa=estudiante[5];
                modelo student=new modelo(ID, nombre, apellido, telefono, correo, programa);
                this.lstEstudiantes.add(student);
                
            }
        }catch (IOException e){
            System.out.println("No se logró");
            e.printStackTrace();
        }
    }

    public ArrayList<modelo> getLstEstudiantes() {
        return lstEstudiantes;
    }

    public void setLstEstudiantes(ArrayList<modelo> lstEstudiantes) {
        this.lstEstudiantes = lstEstudiantes;
    }

    @Override
    public String toString() {
        return "BaseDeDatos{" + "lstEstudiantes=" + lstEstudiantes + '}';
    }
}
