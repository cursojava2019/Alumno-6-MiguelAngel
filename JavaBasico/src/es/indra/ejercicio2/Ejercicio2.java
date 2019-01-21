package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int leido=entrada.nextInt();
		System.out.println("Introduzca otro número");
		int leido1=entrada.nextInt();
		int mayor;
		int menor;
		
		if(leido>leido1) {
			mayor=leido;
			menor=leido1;
		}
		else {
			mayor=leido1;
			menor=leido;
		}
		int leido2=leido-leido1;
		String numeros="";
		for(int i=menor+1; i<mayor; ++i) {
			numeros=numeros+i+" ";
			
		}
		System.out.println("Los números que se encuentran entre ambos son:"+numeros);
	}

}
