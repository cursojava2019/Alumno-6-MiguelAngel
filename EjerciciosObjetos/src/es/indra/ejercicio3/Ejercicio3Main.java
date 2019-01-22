package es.indra.ejercicio3;

import java.util.Scanner;

public class Ejercicio3Main {

	public static void main(String[] args) {
	
		Scanner entrada= new Scanner(System.in);	
		
        System.out.println("Introduce el numero de contraseñas");
        int tamano=entrada.nextInt();
        System.out.println("Introduce la longitud de la contraseña");
        int longitud=entrada.nextInt();
        Password lista[]=new Password[tamano];
        boolean fuerte[]=new boolean[tamano];
        
        for (int i=0;i<lista.length;i++) {
        	lista[i]=new Password(longitud);
        	fuerte[i]=lista[i].esFuerte();
            System.out.println(lista[i].getcontrasenia()+" "+fuerte[i]);
        }

	}

}