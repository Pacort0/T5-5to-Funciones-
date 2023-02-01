package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(tabla));
		System.out.println("El máximo elemento de la tabla es el: " + maximoTabla(tabla));
	}
	
	public static int maximoTabla (int[] tabla) {
		int max = 0;
		
		for(int i=0; i<tabla.length; i++) {
			if(tabla[i]>max) {
				max = tabla[i];
			}
		}
		
		return max;
	}

}
