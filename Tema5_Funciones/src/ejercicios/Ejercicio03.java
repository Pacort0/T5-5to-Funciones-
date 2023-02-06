package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int longitud;
		int limite;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la longitud de la tabla: ");
		longitud = sc.nextInt();
		System.out.println("Introduzca el límite para los números de relleno: ");
		limite = sc.nextInt();
		
		System.out.println(Arrays.toString(rellenaPares(longitud, limite)));
		
		sc.close();
	}
	public static int[] rellenaPares(int longitud, int fin) {
		int tabla[] = new int[longitud];
		
		for(int i=0; i<tabla.length; i++) {
			do {
				tabla[i] = (int)((Math.random() * ((fin+1) - 2)) + 2);
			}while(tabla[i] % 2 != 0);
		}
		
		Arrays.sort(tabla);
		return tabla;
	}

}
