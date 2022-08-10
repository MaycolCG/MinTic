/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

import javax.swing.table.DefaultTableModel;

public class modelo implements Serializable { //clase modelo
    //Atributos principales Base General
    private String id;
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String telefono3;
    private String telefono4;
    private String correo;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String obligacion;
    private String referencia;
    private String producto;       
    private String saldo;
    private String diaMora;
    private String descuento;
    private String cedulaGestion;		 
	private String fechaGestion;
	private String hora;
	private String obligacionGestion;
	private String tipificacion;
	private String observacion;
	private String telefono_Contacto;
	private String asesor;
	private String fechaPago;
	private String vlrPago;
	private String contrasena;
	private String cedulaAsesor;
	private String usuario;
	private String privilegio;
	private String proyecto;

	
	
	
  //Constructor Base General
    public modelo(String id, String nombre, String telefono1, String telefono2, String telefono3, String telefono4,
			String correo, String direccion, String ciudad, String departamento, String obligacion, String referencia,
			String producto, String saldo, String diaMora, String descuento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.telefono3 = telefono3;
		this.telefono4 = telefono4;
		this.correo = correo;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.obligacion = obligacion;
		this.referencia = referencia;
		this.producto = producto;
		this.saldo = saldo;
		this.diaMora = diaMora;
		this.descuento = descuento;
		
  		
	}
  //constructor lista usuarios
public modelo(String cedulaAsesor, String asesor, String usuario, String contrasena,   String privilegio) {
	this.cedulaAsesor = cedulaAsesor;
	this.asesor = asesor;
	this.usuario = usuario;
	this.contrasena = contrasena;	
	this.privilegio = privilegio;
	
}





//Constructor gestion
public modelo(String cedulaGestion, String fechaGestion, String hora, String obligacionGestion, String tipificacion,
		String observacion, String telefono_Contacto, String asesor, String fechaPago, String vlrPago) {
	super();
	this.cedulaGestion = cedulaGestion;
	this.fechaGestion = fechaGestion;
	this.hora = hora;
	this.obligacionGestion = obligacionGestion;
	this.tipificacion = tipificacion;
	this.observacion = observacion;
	this.telefono_Contacto = telefono_Contacto;
	this.asesor = asesor;
	this.fechaPago = fechaPago;
	this.vlrPago = vlrPago;
}

//Constructor Buscar2
public modelo(String id, String nombre, String telefono2, String correo, String direccion, String ciudad,String departamento) {
	this.id = id;
	this.nombre = nombre;
	this.telefono2 = telefono2;
	this.correo = correo;
	this.direccion = direccion;
	this.ciudad = ciudad;
	this.departamento = departamento;
}

public modelo(String obligacion, String referencia, String producto, String saldo, String diaMora,
		String descuento) {
	super();	
	this.obligacion = obligacion;
	this.referencia = referencia;
	this.producto = producto;
	this.saldo = saldo;
	this.diaMora = diaMora;
	this.descuento = descuento;
}


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefono1() {
	return telefono1;
}

public void setTelefono1(String telefono1) {
	this.telefono1 = telefono1;
}

public String getTelefono2() {
	return telefono2;
}

public void setTelefono2(String telefono2) {
	this.telefono2 = telefono2;
}

public String getTelefono3() {
	return telefono3;
}



public void setTelefono3(String telefono3) {
	this.telefono3 = telefono3;
}



public String getTelefono4() {
	return telefono4;
}



public void setTelefono4(String telefono4) {
	this.telefono4 = telefono4;
}



public String getCorreo() {
	return correo;
}



public void setCorreo(String correo) {
	this.correo = correo;
}



public String getDireccion() {
	return direccion;
}



public void setDireccion(String direccion) {
	this.direccion = direccion;
}



public String getCiudad() {
	return ciudad;
}



public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}



public String getDepartamento() {
	return departamento;
}



public void setDepartamento(String departamento) {
	this.departamento = departamento;
}



public String getObligacion() {
	return obligacion;
}



public void setObligacion(String obligacion) {
	this.obligacion = obligacion;
}



public String getReferencia() {
	return referencia;
}



public void setReferencia(String referencia) {
	this.referencia = referencia;
}



public String getProducto() {
	return producto;
}



public void setProducto(String producto) {
	this.producto = producto;
}



public String getSaldo() {
	return saldo;
}



public void setSaldo(String saldo) {
	this.saldo = saldo;
}



public String getDiaMora() {
	return diaMora;
}



public void setDiaMora(String diaMora) {
	this.diaMora = diaMora;
}



public String getDescuento() {
	return descuento;
}



public void setDescuento(String descuento) {
	this.descuento = descuento;
}



public String getCedulaGestion() {
	return cedulaGestion;
}



public void setCedulaGestion(String cedulaGestion) {
	this.cedulaGestion = cedulaGestion;
}



public String getFechaGestion() {
	return fechaGestion;
}



public void setFechaGestion(String fechaGestion) {
	this.fechaGestion = fechaGestion;
}



public String getHora() {
	return hora;
}



public void setHora(String hora) {
	this.hora = hora;
}



public String getObligacionGestion() {
	return obligacionGestion;
}



public void setObligacionGestion(String obligacionGestion) {
	this.obligacionGestion = obligacionGestion;
}



public String getTipificacion() {
	return tipificacion;
}



public void setTipificacion(String tipificacion) {
	this.tipificacion = tipificacion;
}



public String getObservacion() {
	return observacion;
}



public void setObservacion(String observacion) {
	this.observacion = observacion;
}



public String getTelefono_Contacto() {
	return telefono_Contacto;
}



public void setTelefono_Contacto(String telefono_Contacto) {
	this.telefono_Contacto = telefono_Contacto;
}



public String getAsesor() {
	return asesor;
}



public void setAsesor(String asesor) {
	this.asesor = asesor;
}



public String getFechaPago() {
	return fechaPago;
}



public void setFechaPago(String fechaPago) {
	this.fechaPago = fechaPago;
}



public String getVlrPago() {
	return vlrPago;
}



public void setVlrPago(String vlrPago) {
	this.vlrPago = vlrPago;
}

public String getContrasena() {
	return contrasena;
}

public void setContraseña(String contrasena) {
	this.contrasena = contrasena;
}

public String getCedulaAsesor() {
	return cedulaAsesor;
}

public void setCedulaAsesor(String cedulaAsesor) {
	this.cedulaAsesor = cedulaAsesor;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}


public void setContrasena(String contrasena) {
	this.contrasena = contrasena;
}
public String getPrivilegio() {
	return privilegio;
}
public void setPrivilegio(String privilegio) {
	this.privilegio = privilegio;
}
public String getProyecto() {
	return proyecto;
}
public void setProyecto(String proyecto) {
	this.proyecto = proyecto;
}


	
}
