package es.indra.ejercicio2;

public class Persona {
	static char HOMBRE = 'H';
	static char MUJER = 'M';
	
	private String nombre;
	private String edad;
	private String dni;
	private Character sexo;
	private Float peso;
	private Float altura

	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.dni = generaDNI(null);
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, String edad, Character sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI(null);
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, String edad, String dni, Character sexo, Float peso, Float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI(null);
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	
	
	
	}
	
	
	
	
}
