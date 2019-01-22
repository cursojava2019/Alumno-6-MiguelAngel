package es.indra.ejercicio2;

public class Persona {
	static char HOMBRE = 'H';
	static char MUJER = 'M';
	static int PESO_BAJO = -1;
	static int PESO_IDEAL = 0;
	static int PESO_ALTO = 1;
	
	private String nombre;
	private Integer edad;
	private String dni;
	private Character sexo;
	private Float peso;
	private Float altura;

	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.dni = generaDNI();
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, Character sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = generaDNI();
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, Character sexo, Float peso, Float altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
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
	
	public int calcularIMC() {
		float imc = 0;
		float media = (float) (this.getPeso()/(Math.pow(this.getAltura(), 2)));
		imc = this.getPeso()/media;
		
		if (imc<20) {
			return PESO_BAJO;
		} else if (imc >= 20 && imc <=20) {
			return PESO_IDEAL;
		} else {
			return PESO_ALTO;
		}
	}
	
	public boolean esMayorDeEdad() {
		if (this.getEdad()>18) {
			return true;
		} else {
			return false;
		}
	}
	
	public char comprobarSexo(char sexo) {
		if (this.getSexo()==HOMBRE || this.getSexo()==MUJER) {
			return this.sexo;
		} else {
			return HOMBRE;
		}
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + "]";
	}
	
	private static char generaLetraDNI(int var1) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[var1];
	}

	public static String generaDNI() {
		 final int divisor = 23;
		 String dni;
		 
	     int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
	     int var1 = numDNI - (numDNI / divisor * divisor);
	 
	     char letraDNI = generaLetraDNI(var1);
	 
	     dni = Integer.toString(numDNI) + letraDNI;
	     return dni;
		
	}
	
}
