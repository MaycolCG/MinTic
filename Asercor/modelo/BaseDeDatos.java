/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vista.vista1;
import vista.vista2;
import vista.vista3;
import vista.vista4;
import vista.vista5;
import vista.vista6;
import vista.vista7;
import vista.vista8;

public class BaseDeDatos {
	
	modelo model;
    vista1 menu;
    vista2 supervisor;
    vista3 gestionar;
    vista4 modificar;
    vista5 lista;
    vista6 login;
    vista8 creacion;
    BaseDeDatos bd;

	private ArrayList<modelo> listadoClientes; // unico atributo
	private ArrayList<modelo> gestionClientes;
	private ArrayList<modelo> listadoUsuarios;

	public static final String URL = "jdbc:mysql://localhost:3306/aplicativo";
	public static final String USER = "root";
	public static final String CLAVE = "";

	// Creación de BD
	public BaseDeDatos() {
		this.listadoClientes = new ArrayList(); // nueva lista vacia
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {

			String sql = "CREATE TABLE IF NOT EXISTS basedatos(Cedula INT(12) NOT NULL,"
					+ "  Nombre VARCHAR(100) NOT NULL," + "  Telefono1 VARCHAR(45) NOT NULL,"
					+ "  Telefono2 VARCHAR(45) DEFAULT NULL," + "  Telefono3 VARCHAR(45) DEFAULT NULL,"
					+ "  Telefono4 VARCHAR(45) DEFAULT NULL," + "  Correo VARCHAR(45) DEFAULT NULL,"
					+ "  Direccion VARCHAR(100) NOT NULL," + "  Ciudad VARCHAR(45) NOT NULL,"
					+ "  Departamento VARCHAR(45) NOT NULL," + "  Obligacion int(20) NOT NULL,"
					+ "  Referencia VARCHAR(20) NOT NULL," + "  Producto VARCHAR(30) NOT NULL,"
					+ "  Saldo VARCHAR(45) NOT NULL," + "  Dias_Mora VARCHAR(45) NOT NULL,"
					+ "  Plan_Descuento VARCHAR(10) DEFAULT NULL," + "  PRIMARY KEY (Obligacion))";
			stmt.executeUpdate(sql);
			System.out.println("Conectado a la base, pudimos crear o encontrar la tabla");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	

	// Creación de BD Usuarios
	public void CrearBaseUsuarios() {
		this.listadoUsuarios = new ArrayList(); // nueva lista vacia
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {

			String sql = "CREATE TABLE IF NOT EXISTS usuarios(Cedula INT(12) NOT NULL, "
					+ "Nombre VARCHAR(100) NOT NULL, "
					+ "Usuario VARCHAR(45) NOT NULL, "
					+ "Contrasena VARCHAR(45) NOT NULL, "
					+ "Privilegio VARCHAR(45) NOT NULL,"
					+ "PRIMARY KEY (Cedula)";
			stmt.executeUpdate(sql);
			System.out.println("Conectado a la base, pudimos crear o encontrar la tabla usuarios");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Listado de Usuarios
	public void BaseDeUsuarios() {
		ArrayList<modelo> temporal = new ArrayList(); // nueva lista vacia		
		try (Connection con = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = con.createStatement();) {
			String sql = "SELECT * FROM Usuarios";
			ResultSet resultado=stmt.executeQuery(sql);
			while (resultado.next()){
				
                int id=resultado.getInt("Cedula");
                String nombre = resultado.getString("Nombre");
                String usuario = resultado.getString("Usuario");
                String contrasena = resultado.getString("Contrasena");
                String privilegio = resultado.getString("Privilegio");
                
                modelo user = new modelo( Integer.toString(id), nombre, usuario, contrasena, privilegio);
                temporal.add(user);                
			}
			System.out.println("Base usuario encontrada");
            resultado.close();
            stmt.close();    
                
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.listadoUsuarios=temporal;
	}	
	
	
	
	// Para guardar gestiones
	public void guardarGestion(modelo cliente) { // Metodo recibe modelos
		this.gestionClientes = new ArrayList();
		int id = Integer.parseInt(cliente.getCedulaGestion());
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {
			String sql = "INSERT INTO gestion (Cedula, Fecha_Gestion, Hora, Obligacion, Tipificacion, Observacion, Telefono_Contacto, Asesor, Fecha_Pago, Vlr_Pago) VALUES( "
					+ id + ",'" + cliente.getFechaGestion() + "','" + cliente.getHora() + "','"
					+ cliente.getObligacionGestion() + "','" + cliente.getTipificacion() + "','"
					+ cliente.getObservacion() + "','" + cliente.getTelefono_Contacto() + "','" + cliente.getAsesor()
					+ "','" + cliente.getFechaPago() + "','" + cliente.getVlrPago() + "');";
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "La gestion ID '" + id + "' fue registrada correctamente",
					"Registro Gestion", 1);

		} catch (SQLException e) {
			System.out.println("No se pudo guardar la gestion");
			e.printStackTrace();
		}
	}
	
	// Crear Usuarios nuevos
	public void crearUsuario(modelo usuarios) { // Metodo recibe modelos
		
		this.listadoUsuarios = new ArrayList();			
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {
			String sql = "INSERT INTO usuarios (Cedula, Nombre, Usuario, Contrasena, Privilegio) VALUES( "+usuarios.getCedulaAsesor()+" ,'" + usuarios.getAsesor() + "','" + usuarios.getUsuario() + "','"
					+ usuarios.getContrasena() +"','"+usuarios.getPrivilegio()+"');";
			stmt.executeUpdate(sql);
			System.out.println("Asesor fue creado correctamente");

		} catch (SQLException e) {
			System.out.println("No se pudo crear usuario");
			e.printStackTrace();
		}
	}

	// Para buscar clientes a gestionar
	public modelo buscarCliente(int id) {
		modelo result = null; // Por defecto
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {
			String sql = "SELECT * FROM basedatos WHERE Cedula=" + id + ";";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String nombre = rs.getString("Nombre");
				String telefono1 = rs.getString("Telefono1");
				String telefono2 = rs.getString("Telefono2");
				String telefono3 = rs.getString("Telefono3");
				String telefono4 = rs.getString("Telefono4");
				String correo = rs.getString("Correo");
				String direccion = rs.getString("Direccion");
				String ciudad = rs.getString("Ciudad");
				String departamento = rs.getString("Departamento");
				String obligacion = rs.getString("Obligacion");
				String referencia = rs.getString("Referencia");
				String producto = rs.getString("Producto");
				String saldo = rs.getString("Saldo");
				String diaMora = rs.getString("Dias_Mora");
				String descuento = rs.getString("Plan_Descuento");

				result = new modelo(Integer.toString(id), nombre, telefono1, telefono2, telefono3, telefono4, correo,
						direccion, ciudad, departamento, obligacion, referencia, producto, saldo, diaMora, descuento);

			}
			System.out.println("Cliente encontrado");
			rs.close();
			stmt.close();

		} catch (SQLException e) {

			System.out.println("No nos pudimos conectar");
			e.printStackTrace();
		}
		return result;
	}

	// metodo para listar general
	public void SQLtoList() {
		ArrayList<modelo> temporal = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {
			String sql = "SELECT * FROM basedatos";
			ResultSet resultado = stmt.executeQuery(sql);
			while (resultado.next()) {
				int Cedula = resultado.getInt("Cedula");
				String nombre = resultado.getString("Nombre");
				String telefono1 = resultado.getString("Telefono1");
				String telefono2 = resultado.getString("Telefono2");
				String telefono3 = resultado.getString("Telefono3");
				String telefono4 = resultado.getString("Telefono4");
				String correo = resultado.getString("Correo");
				String direccion = resultado.getString("Direccion");
				String ciudad = resultado.getString("Ciudad");
				String departamento = resultado.getString("Departamento");
				String obligacion = resultado.getString("Obligacion");
				String referencia = resultado.getString("Referencia");
				String producto = resultado.getString("Producto");
				String saldo = resultado.getString("Saldo");
				String diaMora = resultado.getString("Dias_Mora");
				String descuento = resultado.getString("Plan_Descuento");
				modelo clientes = new modelo(Integer.toString(Cedula), nombre, telefono1, telefono2, telefono3,
						telefono4, correo, direccion, ciudad, departamento, obligacion, referencia, producto, saldo,
						diaMora, descuento);
				temporal.add(clientes);
			}
			System.out.println("Base Datos encontrada");
			resultado.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();
		}
		this.listadoClientes = temporal;
	}	
	
	
	// Buscar informacionObligacion de cliente para gestionar
	public modelo buscarInfo(int id) {
		// TODO Auto-generated method stub
		modelo clientes=null;
		ArrayList<modelo> temporal = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
			Statement stmt = conn.createStatement();) {
			String sql = "SELECT * FROM basedatos WHERE Cedula ="+id+";";
			ResultSet resultado = stmt.executeQuery(sql);
			while (resultado.next()) {
				String obligacion = resultado.getString("Obligacion");
				String referencia = resultado.getString("Referencia");
				String producto = resultado.getString("Producto");
				String saldo = resultado.getString("Saldo");
				String diaMora = resultado.getString("Dias_Mora");
				String descuento = resultado.getString("Plan_Descuento");

				clientes = new modelo(obligacion, referencia, producto, saldo, diaMora, descuento);
				temporal.add(clientes);
			}
			System.out.println("Obligacion encontrada");
			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();
		}
		this.listadoClientes = temporal;
		return clientes;
		
	}
		
	// Buscar gestionHistorica de cliente para gestionar	
	public modelo buscarGest(int id) {
		modelo gestiones=null;
		ArrayList<modelo> temporal = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
			Statement stmt = conn.createStatement();) {
			String sql = "SELECT * FROM gestion WHERE Cedula ="+id+";";
			ResultSet resultados = stmt.executeQuery(sql);
			
			while (resultados.next()) {
				String cedulaGestion = resultados.getString("Cedula");
				String fechaGestion = resultados.getString("Fecha_Gestion");
				String hora = resultados.getString("Hora");
				String obligacion = resultados.getString("Obligacion");
				String tipificacion = resultados.getString("Tipificacion");
				String observacion = resultados.getString("Observacion");
				String telefonoContacto = resultados.getString("Telefono_Contacto");
				String asesor = resultados.getString("Asesor");
				String fechaPago = resultados.getString("Fecha_Pago");
				String vlrPago = resultados.getString("Vlr_Pago");

				gestiones = new modelo(cedulaGestion, fechaGestion, hora, obligacion, tipificacion, observacion,
						telefonoContacto, asesor, fechaPago, vlrPago);
				temporal.add(gestiones);
			}
			System.out.println("Gestion encontrada");
			resultados.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();
		}
		this.gestionClientes = temporal;
		return gestiones;
	}
	
	
	// Eliminar registro
	public void eliminar(int id) {

		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) { // Eliminación en la base de datos
			String sql = "DELETE FROM basedatos WHERE cedula=" + id + ";";
			stmt.executeUpdate(sql);
			stmt.close();
			
		} catch (SQLException e) {

			System.out.println("No se pudo eliminar el registro");
			e.printStackTrace();
		}
	}
	
	
	// Exportar Base Datos
	public void exportarCSV() {
		String csvFilePath = "Base_Clientes.csv";
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {

			String sql = "SELECT * FROM basedatos";
			ResultSet resultado = stmt.executeQuery(sql);
			BufferedWriter lapiz = new BufferedWriter(new FileWriter(csvFilePath));

			// Escribir una linea que corresponda al header del archivo csv
			lapiz.write("Cedula,Nombre,Telefono1,Telefono2,Telefono3,Telefono4,Correo,Direccion,Ciudad,Departamento,"
					+ "Obligacion,Referencia,Producto,Saldo,Dias_Mora,Plan_Descuento");

			// Usamos el ResultSet resultado
			while (resultado.next()) {
				int Cedula = resultado.getInt("Cedula");
				String nombre = resultado.getString("Nombre");
				String telefono1 = resultado.getString("Telefono1");
				String telefono2 = resultado.getString("Telefono2");
				String telefono3 = resultado.getString("Telefono3");
				String telefono4 = resultado.getString("Telefono4");
				String correo = resultado.getString("Correo");
				String direccion = resultado.getString("Direccion");
				String ciudad = resultado.getString("Ciudad");
				String departamento = resultado.getString("Departamento");
				String obligacion = resultado.getString("Obligacion");
				String referencia = resultado.getString("Referencia");
				String producto = resultado.getString("Producto");
				String saldo = resultado.getString("Saldo");
				String diaMora = resultado.getString("Dias_Mora");
				String descuento = resultado.getString("Plan_Descuento");

				String linea = Cedula + "," + nombre + "," + telefono1 + "," + telefono2 + "," + telefono3 + ","
						+ telefono4 + "," + correo + "," + direccion + "," + ciudad + "," + departamento + ","
						+ obligacion + "," + referencia + "," + producto + "," + saldo + "," + diaMora + ","
						+ descuento;
				lapiz.newLine();
				lapiz.write(linea);
			}
			lapiz.close();
			resultado.close();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Archivo exportado correctamente", "Exportar Archivo CSV", 1);
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo exportar archivo", "Exportar Archivo CSV", 0);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File Error");
			e.printStackTrace();
		}
	}

	
	// Exportar Gestiones
	public void ExportarGestiones() {
		String csvFilePath = "Base_Gestiones.csv";
		try (Connection conn = DriverManager.getConnection(URL, USER, CLAVE);
				Statement stmt = conn.createStatement();) {

			String sql = "SELECT * FROM gestion";
			ResultSet resultado = stmt.executeQuery(sql);
			BufferedWriter lapiz = new BufferedWriter(new FileWriter(csvFilePath));

			// Escribir una linea que corresponda al header del archivo csv
			lapiz.write(
					"Cedula,Fecha_Gestion,Hora,Obligacion,Tipificacion,Observacion,Telefono_Contacto,Asesor,Fecha_Pago,Vlr_Pago");

			// Usamos el ResultSet resultado
			while (resultado.next()) {
				String cedulaGestion = resultado.getString("Cedula");
				String fechaGestion = resultado.getString("Fecha_Gestion");
				String hora = resultado.getString("Hora");
				String obligacion = resultado.getString("Obligacion");
				String tipificacion = resultado.getString("Tipificacion");
				String observacion = resultado.getString("Observacion");
				String telefonoContacto = resultado.getString("Telefono_Contacto");
				String asesor = resultado.getString("Asesor");
				String fechaPago = resultado.getString("Fecha_Pago");
				String vlrPago = resultado.getString("Vlr_Pago");

				String linea = cedulaGestion + "," + fechaGestion + "," + hora + "," + obligacion + "," + tipificacion
						+ "," + observacion + "," + telefonoContacto + "," + asesor + "," + fechaPago + "," + vlrPago;
				lapiz.newLine();
				lapiz.write(linea);
			}
			lapiz.close();
			resultado.close();
			stmt.close();
			JOptionPane.showMessageDialog(null, "Archivo exportado correctamente", "Exportar Archivo CSV", 1);
			stmt.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo exportar archivo", "Exportar Archivo CSV", 0);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File Error");
			e.printStackTrace();
		}
	}
		
		//Modificar Clientes
	  public void modificarCliente(int id, modelo cli) { 
		  try ( Connection conn =  DriverManager.getConnection(URL, USER, CLAVE); 
				Statement stmt =  conn.createStatement();) {  
			//Actualizacion BD
			  	String sql =  "UPDATE basedatos SET " 			  		
				+ "Nombre='" + cli.getNombre() + "',"				
				+ "Telefono2='" + cli.getTelefono2() + "',"					
				+ "Correo='" + cli.getCorreo() + "',"				
				+ "Direccion='" + cli.getDireccion() + "',"
				+ "Ciudad='" + cli.getCiudad() + "',"
				+ "Departamento='" + cli.getDepartamento() + "'"					
				+ "WHERE Cedula=" + id + ";"; 
				
			  stmt.executeUpdate(sql);			  
			  //JOptionPane.showMessageDialog(null, "El Cliente con ID '" +id+"' fue modificado correctamente", "Modificar Cliente", 1);
			  System.out.println("Estoy modificando"); 
			  } catch   (SQLException e) { 
				  System.out.println("No se pudo actualizar el Cliente");
			  	e.printStackTrace(); 
			  }
	  }
		

	public ArrayList<modelo> getListadoClientes() {
		return listadoClientes;
	}


	public void setListadoClientes(ArrayList<modelo> listadoClientes) {
		this.listadoClientes = listadoClientes;
	}


	public ArrayList<modelo> getGestionClientes() {
		return gestionClientes;
	}


	public void setGestionClientes(ArrayList<modelo> gestionClientes) {
		this.gestionClientes = gestionClientes;
	}
	public ArrayList<modelo> getListadoUsuarios() {
		return listadoUsuarios;
	}

	public void setListadoUsuarios(ArrayList<modelo> listadoUsuarios) {
		this.listadoUsuarios = listadoUsuarios;
	}
	
}
