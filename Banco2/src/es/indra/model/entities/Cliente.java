package es.indra.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private List<Cuenta> propiedades = new ArrayList<Cuenta>();;

	public Cliente() {
		super();
	}
	
	public Cliente(String dni) {
		super();
		this.dni = dni;
	}
	
	public Cliente(String dni, String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Cuenta> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(List<Cuenta> propiedades) {
		this.propiedades = propiedades;
	}
}