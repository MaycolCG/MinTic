/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.BaseDeDatos;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;
import vista.vista4;
import vista.vista5;

public class controlador implements ActionListener {

    //Atributos de la clase
    modelo model;
    vista1 menu;
    vista2 ingresar;
    vista3 buscar;
    vista4 modificar;
    vista5 lista;
    BaseDeDatos bd;

    public controlador() { //constructor
        this.menu = new vista1();
        this.ingresar = new vista2(); //Nuevo objeto de la vista2
        this.bd = new BaseDeDatos(); //Nuevo objeto de base de dato
        this.buscar = new vista3(); //nuevo objeto vista 3 buscar
        this.modificar = new vista4(); //nuevo objeto vista 4 modificar
        this.lista = new vista5();
        menu.getBtn_ingresar().addActionListener(this);
        menu.getBtn_salir().addActionListener(this);
        menu.getBtn_buscar().addActionListener(this);
        menu.getBtn_modificar().addActionListener(this);
        menu.getBtn_eliminar().addActionListener(this);
        menu.getBtn_ver().addActionListener(this);
        menu.getBtn_exportarCSV().addActionListener(this);
        ingresar.getBtn_guardar().addActionListener(this);
        ingresar.getBtn_cancelar().addActionListener(this);
        buscar.getBtn_buscar().addActionListener(this);
        buscar.getBtn_cancelar().addActionListener(this);
        modificar.getBtn_buscar().addActionListener(this);
        modificar.getBtn_modificar().addActionListener(this);
        modificar.getBtn_cancelar().addActionListener(this);
        lista.getAtras().addActionListener(this);
    }

    public void iniciar() throws IOException, FileNotFoundException, ClassNotFoundException {
        //bd.recuperarArchivo();

        menu.setVisible(true);
    }

    @Override
    //Darle vida a los botones
    public void actionPerformed(ActionEvent e) {
        // Aqui los botones del menu
        if (e.getSource() == menu.getBtn_ingresar()) {
            ingresar.setVisible(true);
            menu.dispose();
        }
        if (e.getSource() == menu.getBtn_buscar()) {
            buscar.setVisible(true);
            menu.dispose();
        }

        if (e.getSource() == menu.getBtn_modificar()) {
            modificar.setVisible(true);
            menu.dispose();
        }

        if (e.getSource() == menu.getBtn_eliminar()) {
            int idEliminar = Integer.parseInt(JOptionPane.showInputDialog(menu, "Ingrese el id a eliminar", "Eliminar Registro", 2));
            int confirmoEliminar = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar el ID " + idEliminar + "?", "Eliminar Registro", JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmoEliminar == 0) {
                eliminar(idEliminar);
            }               
         }

        if (e.getSource() == menu.getBtn_ver()) {
            lista.setVisible(true);
            listar();
            menu.dispose();
        }

        if (e.getSource() == menu.getBtn_exportarCSV()) {
            bd.exportarCSV();
        }
        if (e.getSource() == menu.getBtn_salir()) {
            System.exit(0);
        }
        // Aqui los botones de vista_ingresar
        if (e.getSource() == ingresar.getBtn_guardar()) {
            guardar();
            ingresar.dispose();
            menu.setVisible(true);
        }

        // Aqui los botones del buscar
        if (e.getSource() == buscar.getBtn_buscar()) {
            buscar();
        }

        // Aqui los botones del modificar
        if (e.getSource() == modificar.getBtn_buscar()) {
            mod_buscar();
        }

        if (e.getSource() == modificar.getBtn_modificar()) {
            modificar();
        }

        // Aqui los botones del comun de todas las vistas
        if (e.getSource() == ingresar.getBtn_cancelar() || e.getSource() == buscar.getBtn_cancelar() || e.getSource() == modificar.getBtn_cancelar() || e.getSource() == lista.getAtras()) {
            ingresar.dispose();
            buscar.dispose();
            modificar.dispose();
            lista.dispose();
            menu.setVisible(true);
            buscar.getTxt_cedula().setText(null);
            buscar.getTxt_nombre().setText(null);
            buscar.getTxt_apellido().setText(null);
            buscar.getTxt_correo().setText(null);
            buscar.getTxt_telefono().setText(null);
            buscar.getTxt_programa().setText(null);
            modificar.getTxt_cedula().setText(null);
            modificar.getTxt_nombre().setText(null);
            modificar.getTxt_apellido().setText(null);
            modificar.getTxt_correo().setText(null);
            modificar.getTxt_telefono().setText(null);
            modificar.getTxt_programa().setText(null);
        }
    }

    public void guardar() {
        
        String id = ingresar.getTxt_cedula().getText();
        String nombre = ingresar.getTxt_nombre().getText();
        String apellido = ingresar.getTxt_apellido().getText();
        String correo = ingresar.getTxt_correo().getText();
        String telefono = ingresar.getTxt_telefono().getText();
        String programa = ingresar.getTxt_programa().getText();
        modelo nuevoEst = new modelo(id, nombre, apellido, telefono, correo, programa);
        bd.guardarEstudiante(nuevoEst);   
        //System.out.println("Estudiante registrado correctamente");
        ingresar.getTxt_cedula().setText(null);
        ingresar.getTxt_nombre().setText(null);
        ingresar.getTxt_apellido().setText(null);
        ingresar.getTxt_correo().setText(null);
        ingresar.getTxt_telefono().setText(null);
        ingresar.getTxt_programa().setText(null);
        ingresar.getTxt_cedula().setText(null);

    }

    public void buscar() {
        int id = Integer.parseInt(buscar.getTxt_cedula().getText());
        modelo resultado = bd.buscarEstudiante(id);
        if (resultado != null) {
            buscar.getTxt_nombre().setText(resultado.getNombre());
            buscar.getTxt_apellido().setText(resultado.getApellido());
            buscar.getTxt_correo().setText(resultado.getCorreo());
            buscar.getTxt_telefono().setText(resultado.getTelefono());
            buscar.getTxt_programa().setText(resultado.getPrograma());
        } else {
            JOptionPane.showMessageDialog(buscar, "Resgistro no encontrado", "Buscar Registros", 2);
        }
    }

    public void mod_buscar() {
        int id = Integer.parseInt(modificar.getTxt_cedula().getText());
        modelo resultado = bd.buscarEstudiante(id);
        if (resultado != null) {
            modificar.getTxt_nombre().setText(resultado.getNombre());
            modificar.getTxt_apellido().setText(resultado.getApellido());
            modificar.getTxt_correo().setText(resultado.getCorreo());
            modificar.getTxt_telefono().setText(resultado.getTelefono());
            modificar.getTxt_programa().setText(resultado.getPrograma());
        } else {
            JOptionPane.showMessageDialog(buscar, "Registro no encontrado", "Buscar Registros", 2);
        }
    }

    public void modificar() {
        int id = Integer.parseInt(modificar.getTxt_cedula().getText());
        String nombre = modificar.getTxt_nombre().getText();
        String apellido = modificar.getTxt_apellido().getText();
        String correo = modificar.getTxt_correo().getText();
        String telefono = modificar.getTxt_telefono().getText();
        String programa = modificar.getTxt_programa().getText();
        
        if ("".equals(nombre) || "".equals(apellido)) {
            JOptionPane.showMessageDialog(modificar, "No hay datos para modificar", "Modificar Registros", JOptionPane.WARNING_MESSAGE);
        } else {
            modelo newEst = new modelo(Integer.toString(id), nombre, apellido, telefono, correo, programa);
            bd.modificarEst(id, newEst);
            //JOptionPane.showMessageDialog(modificar, "El estudiante " + nombre + ", fue modificado correctamente", "Modificar Registros", 1);
        }
        modificar.getTxt_cedula().setText(null);
        modificar.getTxt_nombre().setText(null);
        modificar.getTxt_apellido().setText(null);
        modificar.getTxt_correo().setText(null);
        modificar.getTxt_telefono().setText(null);
        modificar.getTxt_programa().setText(null);

    }

    public void eliminar(int id) {
        modelo estudiante = bd.buscarEstudiante(id);
        if (estudiante != null) {
            bd.eliminar(id);
            JOptionPane.showMessageDialog(null, "El registro con ID '" +id+ "' fue eliminado correctamente", "Eliminar Registro", 1);
        } else {
            JOptionPane.showMessageDialog(menu, "Registro no encontrado", "Eliminar Registro!", 0);
        }

    }

    public void listar() {
        bd.SQLtoList();
        ArrayList<modelo> Estudiantes = bd.getLstEstudiantes();
        ArrayList<Object[]> list = new ArrayList(0);//Lista de apoyo
        for (int i = 0; i < Estudiantes.size(); i++) {
            list.add(new Object[]{
                Estudiantes.get(i).getId(),
                Estudiantes.get(i).getNombre(),
                Estudiantes.get(i).getApellido(),
                Estudiantes.get(i).getCorreo(),
                Estudiantes.get(i).getTelefono(),
                Estudiantes.get(i).getPrograma(),});
            lista.getjTable1().setModel(new DefaultTableModel(list.toArray(new Object[][]{}),
                    new String[]{"ID", "Nombre", "Apellido", "Correo", "Telefono", "Programa"}));

        }
    }

}
