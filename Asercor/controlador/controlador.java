
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.BaseDeDatos;
import modelo.Conexion;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;
import vista.vista4;
import vista.vista5;
import vista.vista6;
import vista.vista7;
import vista.vista8;

public class controlador implements ActionListener {

	// Atributos de la clase
	modelo model;
	vista1 menu;
	vista2 supervisor;
	vista3 gestionar;
	vista4 modificar;
	vista5 lista;
	vista6 login;
	vista7 listadoUsuarios;
	vista8 creacion;
	BaseDeDatos bd;

	public controlador() { // constructor
		this.bd = new BaseDeDatos();
		this.menu = new vista1();
		this.supervisor = new vista2(); // Nuevo objeto de la vista2
		this.gestionar = new vista3(); // nuevo objeto vista 3 buscar
		this.modificar = new vista4(); // nuevo objeto vista 4 modificar
		this.lista = new vista5();
		this.login = new vista6();
		this.listadoUsuarios = new vista7();
		this.creacion = new vista8();

		// Activar botones
		// menu.getBtn_ingresar().addActionListener(this);
		menu.getBtn_salir().addActionListener(this);
		menu.getBtn_buscar().addActionListener(this);
		// menu.getBtn_modificar().addActionListener(this);
		// menu.getBtn_eliminar().addActionListener(this);
		menu.getBtn_ver().addActionListener(this);
		supervisor.getBtn_salirSupervisor().addActionListener(this);
		supervisor.getBtn_ImportarBase().addActionListener(this);
		supervisor.getBtn_ExpBaseGeneral().addActionListener(this);
		supervisor.getBtn_ImportarBase().addActionListener(this);
		supervisor.getBtn_ExpGestiones().addActionListener(this);
		supervisor.getBtn_ImportarGestiones().addActionListener(this);
		supervisor.getBtn_EliminarRegistro().addActionListener(this);
		supervisor.getBtnGestionar().addActionListener(this);
		supervisor.getBtn_crearUsuarios().addActionListener(this);
		supervisor.getBtn_listaUsuarios().addActionListener(this);
		gestionar.getBtn_buscar().addActionListener(this);
		gestionar.getBtn_cancelar().addActionListener(this);
		gestionar.getBtn_guardar().addActionListener(this);
		gestionar.getBtnModificar().addActionListener(this);
		modificar.getBtn_buscar().addActionListener(this);
		modificar.getBtn_modificar().addActionListener(this);
		modificar.getBtn_cancelar().addActionListener(this);
		lista.getAtras().addActionListener(this);
		creacion.getBtn_crearUsuario().addActionListener(this);
		creacion.getBtn_salir().addActionListener(this);
		listadoUsuarios.getBtn_ModificarUsuarios().addActionListener(this);
		listadoUsuarios.getBtn_SalirUsuarios().addActionListener(this);
		login.getBtnEntrar().addActionListener(this);
		// login.getBtn_salirIngreso().addActionListener(this);

	}

	public void iniciar() throws IOException, FileNotFoundException, ClassNotFoundException {

		login.setVisible(true);
		// menu.setVisible(true);
	}

	@Override
	// Darle vida a los botones
	public void actionPerformed(ActionEvent e) {

		// Logueo
		if (e.getSource() == login.getBtnEntrar()) {
			logine();
			login.dispose();
		}

		// Aqui los botones del vista1 = ASESOR

		if (e.getSource() == menu.getBtn_buscar()) {
			gestionar.setVisible(true);
			menu.dispose();
			mostrarTiempo();

		}
		if (e.getSource() == menu.getBtn_salir()) {
			System.exit(0);
		}

		if (e.getSource() == menu.getBtn_ver()) {
			lista.setVisible(true);
			listar();
			menu.dispose();
		}

		// Aqui los botones del vista2 = SUPERVISOR
		if (e.getSource() == supervisor.getBtn_EliminarRegistro()) {
			int idEliminar = Integer
					.parseInt(JOptionPane.showInputDialog(menu, "Ingrese el id a eliminar", "Eliminar Registro", 2));
			int confirmoEliminar = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar el ID " + idEliminar + "?",
					"Eliminar Registro", JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			if (confirmoEliminar == 0) {
				eliminar(idEliminar);
				System.out.println("Operacion Cancelada");
				supervisor.dispose();
			}
		}
		if (e.getSource() == supervisor.getBtnGestionar()) {
			gestionar.setVisible(true);
			supervisor.dispose();
			mostrarTiempo();
		}

		if (e.getSource() == supervisor.getBtn_ExpBaseGeneral()) {
			bd.exportarCSV();

		}
		if (e.getSource() == supervisor.getBtn_ExpGestiones()) {
			bd.ExportarGestiones();
		}

		if (e.getSource() == supervisor.getBtn_salirSupervisor()) {
			System.exit(0);
			login.dispose();
		}

		if (e.getSource() == supervisor.getBtn_crearUsuarios()) {
			creacion.setVisible(true);
		}

		if (e.getSource() == supervisor.getBtn_listaUsuarios()) {
			listadoUsuarios.setVisible(true);
			listUsuarios();
		}
		if (e.getSource() == supervisor.getBtnGestionar()) {
			gestionar.setVisible(true);
			supervisor.dispose();
		}

		// botones listado usuario
		if (e.getSource() == listadoUsuarios.getBtn_SalirUsuarios()) {
			listadoUsuarios.dispose();
			supervisor.setVisible(true);
		}

		// botones creacion usuario
		if (e.getSource() == creacion.getBtn_crearUsuario()) {
			creacionUsuario();
		}
		if (e.getSource() == creacion.getBtn_salir()) {
			creacion.dispose();
			supervisor.setVisible(true);
		}

		// Aqui los botones del Gestionar
		if (e.getSource() == gestionar.getBtn_buscar()) {
			buscar();
		}
		// Guardar gestion
		if (e.getSource() == gestionar.getBtn_guardar()) {
			guardar();
		}
		if (e.getSource() == gestionar.getBtn_cancelar()) {
			gestionar.dispose();
			menu.setVisible(true);
		}

		if (e.getSource() == gestionar.getBtnModificar()) {
			modificar.setVisible(true);
			System.out.println("Estoy modificando con el btn");
			// menu.dispose();
		}

		if (e.getSource() == modificar.getBtn_modificar()) {
			modificar();
		}
		if (e.getSource() == modificar.getBtn_buscar()) {
			mod_buscar();
		}
		if(e.getSource() == modificar.getBtn_cancelar()){
			modificar.dispose();
			
		}

		// Aqui los botones del comun de todas las vistas
		if (e.getSource() == gestionar.getBtn_cancelar() 
				|| e.getSource() == lista.getAtras()) {
			supervisor.dispose();
			creacion.dispose();
			listadoUsuarios.dispose();
			gestionar.dispose();
			modificar.dispose();
			lista.dispose();
			menu.setVisible(true);
			gestionar.getTxt_cedula().setText(null);
			gestionar.getTxt_nombre().setText(null);
			gestionar.getTxt_correo().setText(null);
			gestionar.getTxt_telefono1().setText(null);
			gestionar.getTxt_telefono2().setText(null);
			gestionar.getTxt_telefono3().setText(null);
			gestionar.getTxt_telefono4().setText(null);
			gestionar.getTxt_correo().setText(null);
			gestionar.getTxt_direccion().setText(null);
			gestionar.getTxt_ciudad().setText(null);
			gestionar.getTxt_dpto().setText(null);
			gestionar.getLblInformacinDeObligaci().setText(null);
			modificar.getTxt_cedula().setText(null);
			modificar.getTxt_nombre().setText(null);
			modificar.getTxt_telefono().setText(null);
			modificar.getTxt_correo().setText(null);
			modificar.getTxtDireccion().setText(null);
			modificar.getTxtCiudad().setText(null);
			modificar.getTxtDepartamento().setText(null);
		}
	}

	public void logine() {
		String user = login.getTxtUsuario().getText();
		String pass = login.getTxtPassword().getText();

		String url = "SELECT Usuario, Nombre, Contrasena, Privilegio  " + "FROM usuarios WHERE Usuario ='" + user + "'";

		// System.out.println(url);

		try {
			Connection con = Conexion.obtenerConexion();
			PreparedStatement ps = con.prepareStatement(url);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				String p = rs.getString("Contrasena");
				String priv = rs.getString("Privilegio");

				if (pass.equals(p)) {
					if (priv.equals("Asesor")) {
						menu.setVisible(true);
						gestionar.getTxt_asesor().setText("" + rs.getString("Nombre"));

					} else if (priv.equals("Supervisor")) {
						supervisor.setVisible(true);
						gestionar.getTxt_asesor().setText("" + rs.getString("Nombre"));
					}
				} else {
					JOptionPane.showInternalMessageDialog(null, "Contraseña Incorrecta");
				}
			} else {
				// Usuario no existe
				JOptionPane.showMessageDialog(null, "  El Usuario No Existe", "Ingreso a Sistema", 0);
			}
		} catch (SQLException ex) {
			System.out.println(ex.toString());
		}
	}

	// Mostrar base de datos
	public void listar() {
		bd.SQLtoList();
		ArrayList<modelo> clientes = bd.getListadoClientes();
		ArrayList<Object[]> list = new ArrayList(0);// Lista de apoyo
		for (int i = 0; i < clientes.size(); i++) {
			list.add(new Object[] { clientes.get(i).getId(), clientes.get(i).getNombre(),
					clientes.get(i).getTelefono1(), clientes.get(i).getTelefono2(), clientes.get(i).getTelefono3(),
					clientes.get(i).getTelefono4(), clientes.get(i).getCorreo(), clientes.get(i).getDireccion(),
					clientes.get(i).getCiudad(), clientes.get(i).getDepartamento(), clientes.get(i).getObligacion(),
					clientes.get(i).getReferencia(), clientes.get(i).getProducto(), clientes.get(i).getSaldo(),
					clientes.get(i).getDiaMora(), clientes.get(i).getDescuento() });

			lista.getjTable2()
					.setModel(new DefaultTableModel(list.toArray(new Object[][] {}),
							new String[] { "Cedula", "Nombre", "Telefono1", "Telefono2", "Telefono3", "Telefono4",
									"Correo", "Direccion", "Ciudad", "Departamento", "Obligacion", "Referencia",
									"Producto", "Saldo", "Dias_Mora", "Descuento" }));
		}
	}

	// Listar usuarios
	public void listUsuarios() {
		bd.BaseDeUsuarios();
		ArrayList<modelo> usuarios = bd.getListadoUsuarios();
		ArrayList<Object[]> list = new ArrayList(0);// Lista de apoyo
		for (int i = 0; i < usuarios.size(); i++) {
			list.add(new Object[] { usuarios.get(i).getCedulaAsesor(), usuarios.get(i).getAsesor(),
					usuarios.get(i).getUsuario(), usuarios.get(i).getContrasena(), usuarios.get(i).getPrivilegio() });

			listadoUsuarios.getJtableUser().setModel(new DefaultTableModel(list.toArray(new Object[][] {}),
					new String[] { "Cedula", "Nombre", "Usuario", "Contrasena", "Privilegio" }));

		}
		System.out.println("Usuarios lista");
	}

	// Guardar gestion
	public void guardar() {
		String cedulaGestion = gestionar.getTxt_cedula().getText();
		String fechaGestion = gestionar.getTxt_FechaGestion().getText();
		String hora = gestionar.getTxt_HoraGestion().getText();
		String obligacionGestion = gestionar.getTxt_obligacionGestion().getText();
		String tipificacion = gestionar.getLblInformacinDeGestin().getToolTipText();
		String observacion = gestionar.getTextArea().getText();
		String telefono_Contacto = gestionar.getTxt_telefonoGestion().getText();
		String asesor = gestionar.getTxt_asesor().getText();
		String fechaPago = gestionar.getTxt_FechaPago().getText();
		String vlrPago = gestionar.getTxt_VlrPago().getText();

		modelo nuevaGestion = new modelo(cedulaGestion, fechaGestion, hora, obligacionGestion, tipificacion,
				observacion, telefono_Contacto, asesor, fechaPago, vlrPago);
		bd.guardarGestion(nuevaGestion);

		System.out.println("Gestion guardada correctamente");

		gestionar.getTxt_obligacionGestion().setText(null);
		gestionar.getTxt_telefonoGestion().setText(null);
		gestionar.getTxt_FechaPago().setText(null);
		gestionar.getTxt_VlrPago().setText(null);
		gestionar.getTextArea().setText(null);

	}

	// Crea Usuarios
	public void creacionUsuario() {

		String cedulaAsesor = creacion.getTxt_cedulaAsesor().getText();
		String asesor = creacion.getTxt_nombreAsesor().getText();
		String usuario = creacion.getTxt_usuarioAsesor().getText();
		String contrasena = creacion.getTxt_contraseñaAsesor().getText();
		String privilegio = creacion.getTxt_privilegio().getText();

		modelo nuevoUsuario = new modelo(cedulaAsesor, asesor, usuario, contrasena, privilegio);
		bd.crearUsuario(nuevoUsuario);

		JOptionPane.showMessageDialog(null, "Usuario '" + usuario + "' fue creado correctamente", "Creacion Usuario",
				1);
		creacion.getTxt_cedulaAsesor().setText(null);
		creacion.getTxt_nombreAsesor().setText(null);
		creacion.getTxt_usuarioAsesor().setText(null);
		creacion.getTxt_contraseñaAsesor().setText(null);
		creacion.getTxt_privilegio().setText(null);
	}

	// Buscar clientes para iniciar la gestión
	public void buscar() {
		int id = Integer.parseInt(gestionar.getTxt_cedula().getText());
		modelo resultado = bd.buscarCliente(id);
		if (resultado != null) {
			gestionar.getTxt_nombre().setText(resultado.getNombre());
			gestionar.getTxt_telefono1().setText(resultado.getTelefono1());
			gestionar.getTxt_telefono2().setText(resultado.getTelefono2());
			gestionar.getTxt_telefono3().setText(resultado.getTelefono3());
			gestionar.getTxt_telefono4().setText(resultado.getTelefono4());
			gestionar.getTxt_correo().setText(resultado.getCorreo());
			gestionar.getTxt_direccion().setText(resultado.getDireccion());
			gestionar.getTxt_ciudad().setText(resultado.getCiudad());
			gestionar.getTxt_dpto().setText(resultado.getDepartamento());

		} else {
			JOptionPane.showMessageDialog(null, "Resgistro no encontrado", "Buscar Registros", 2);
		}

		bd.buscarInfo(id);
		ArrayList<modelo> clientesbd = bd.getListadoClientes();
		ArrayList<Object[]> list = new ArrayList<Object[]>(0);// Lista de apoyo

		for (int i = 0; i < clientesbd.size(); i++) {
			list.add(new Object[] {

					clientesbd.get(i).getObligacion(), clientesbd.get(i).getReferencia(),
					clientesbd.get(i).getProducto(), clientesbd.get(i).getSaldo(), clientesbd.get(i).getDiaMora(),
					clientesbd.get(i).getDescuento() });
			gestionar.getJtable_InfoObligacion().setModel(new DefaultTableModel(list.toArray(new Object[][] {}),
					new String[] { "Obligacion", "Referencia", "Producto", "Saldo", "Dias_Mora", "Descuento" }));
		}
		bd.buscarGest(id);
		ArrayList<modelo> gestion = bd.getGestionClientes();
		ArrayList<Object[]> listGestion = new ArrayList<Object[]>(0);// Lista de apoyo

		for (int i = 0; i < gestion.size(); i++) {
			listGestion.add(new Object[] {

					gestion.get(i).getCedulaGestion(), gestion.get(i).getFechaGestion(), gestion.get(i).getHora(),
					gestion.get(i).getObligacionGestion(), gestion.get(i).getTipificacion(),
					gestion.get(i).getObservacion(), gestion.get(i).getTelefono_Contacto(), gestion.get(i).getAsesor(),
					gestion.get(i).getFechaPago(), gestion.get(i).getVlrPago(), });

			gestionar.getTable_GestionHistorica()
					.setModel(new DefaultTableModel(listGestion.toArray(new Object[][] {}),
							new String[] { "Cedula", "Fecha_Gestion", "Hora", "Obligacion", "Tipificacion",
									"Observacion", "Telefono_Contacto", "Asesor", "Fecha_Pago", "Vlr_Pago" }));
		}
	}

	// Eliminar registro
	public void eliminar(int id) {
		modelo estudiante = bd.buscarCliente(id);
		if (estudiante != null) {
			bd.eliminar(id);
			JOptionPane.showMessageDialog(null, "El registro con ID '" + id + "' fue eliminado correctamente",
					"Eliminar Registro", 1);
		} else {
			JOptionPane.showMessageDialog(menu, "Registro no encontrado", "Eliminar Registro!", 0);
		}
	}

	public void mod_buscar() {
		int id = Integer.parseInt(modificar.getTxt_cedula().getText());
		modelo resultado = bd.buscarCliente(id);
		if (resultado != null) {
			modificar.getTxt_nombre().setText(resultado.getNombre());
			modificar.getTxt_telefono().setText(resultado.getTelefono2());
			modificar.getTxt_correo().setText(resultado.getCorreo());
			modificar.getTxtDireccion().setText(resultado.getDireccion());
			modificar.getTxtCiudad().setText(resultado.getCiudad());
			modificar.getTxtDepartamento().setText(resultado.getDepartamento());

		} else {
			JOptionPane.showMessageDialog(null, "Registro no encontrado", "Buscar Registros", 2);
		}
	}

	public void modificar() {

		int id = Integer.parseInt(modificar.getTxt_cedula().getText());
		String nombre = modificar.getTxt_nombre().getText();
		String telefono = modificar.getTxt_telefono().getText();
		String correo = modificar.getTxt_correo().getText();
		String direccion = modificar.getTxtDireccion().getText();
		String ciudad = modificar.getTxtCiudad().getText();
		String departamento = modificar.getTxtDepartamento().getText();

		if ("".equals(telefono) || "".equals(correo)) {
			JOptionPane.showMessageDialog(modificar, "No hay datos para modificar", "Modificar Registros",
					JOptionPane.WARNING_MESSAGE);

		} else {

			modelo newCliente = new modelo(Integer.toString(id), nombre, telefono, correo, direccion, ciudad,
					departamento);
			bd.modificarCliente(id, newCliente);

		}
		JOptionPane.showMessageDialog(modificar, "El Cliente " + nombre + ", fue modificado correctamente",
				"Modificar Registros", 1);
		modificar.getTxt_cedula().setText(null);
		modificar.getTxt_nombre().setText(null);
		modificar.getTxt_telefono().setText(null);
		modificar.getTxt_correo().setText(null);
		modificar.getTxtDireccion().setText(null);
		modificar.getTxtCiudad().setText(null);
		modificar.getTxtDepartamento().setText(null);
	}

	public void mostrarTiempo() {

		Calendar fecha = new GregorianCalendar();

		String years = Integer.toString(fecha.get(Calendar.YEAR));
		String mes = Integer.toString(fecha.get(Calendar.MONTH) + 1);
		String dia = Integer.toString(fecha.get(Calendar.DATE));

		String fechaCompleta = years + "-" + mes + "-" + dia;

		String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
		String minuto = Integer.toString(fecha.get(Calendar.MINUTE));

		String horaCompleta = hora + ":" + minuto;

		gestionar.getTxt_FechaGestion().setText(fechaCompleta);
		gestionar.getTxt_HoraGestion().setText(horaCompleta);

	}
   /* public void modificar() {
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

    }*/
          
}