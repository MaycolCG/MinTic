package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	public static final String URL = "jdbc:mysql://localhost:3306/aplicativo";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public static Connection obtenerConexion () {
    
        /*String url= "jdbc:mysql://localhost:3306/login,"
                + "'root',"
                + "''";*/
        
        try {
            Connection con = DriverManager.getConnection(URL, USER, CLAVE);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }       
    }

}
