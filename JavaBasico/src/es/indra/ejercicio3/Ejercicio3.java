package es.indra.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner dia = new Scanner(System.in);
		System.out.println("Introduce el día de la semana");
		String leido = dia.next();
		
		switch(leido) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Hoy es día laborable");
			break;
		case "sabado":
		case "domingo":
			System.out.println("Hoy es festivo");
			break;
		}
	}

}