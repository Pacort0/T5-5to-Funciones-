package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tam;
		int clave;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño de la tabla: ");
		tam = sc.nextInt();
		
		int tabla[] = new int[tam];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = (int)(Math.random()*10);
		}
		
		System.out.println(Arrays.toString(tabla));
		System.out.println("Introduzca el valor entero a buscar en la tabla: ");
		clave = sc.nextInt();
		
		if(buscar(tabla, clave) > 0) {
			System.out.println("El valor introducido se encuentra en la posición " + buscar(tabla, clave));
		}
		else {
			System.out.println("El valor que se busca no se encuentra en la tabla.");
		}
		
		sc.close();
	}
	
	public static int buscar(int tabla[], int clave) {
		int indice = 0;
		
		while(indice < tabla.length && clave != tabla[indice]) {
			indice++;
		}
		if(indice >= tabla.length) {
			indice = -1;
		}
		
		return indice;	
	}

}
