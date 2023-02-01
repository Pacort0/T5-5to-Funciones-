package ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("La suma de todos los valores de la tabla es: " + sumaEnteros(tabla));
	}
	
	public static int sumaEnteros (int[] tabla) {
		int suma = 0;
		for(int i=0; i<tabla.length; i++) {
			suma += tabla[i];
		}
		return suma;
	}

}
