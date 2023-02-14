package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int tam;
		int numElementos;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un tamaño para el array: ");
		tam = sc.nextInt();

		int tabla[] = new int[tam];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(tabla));
		
		System.out.println("Introduzca el número de elementos en el que agrupar el array: ");
		numElementos = sc.nextInt();
		
		System.out.println(Arrays.toString(suma(tabla, numElementos)));
		
		sc.close();
	}
	
	public static int[] suma(int tabla[], int numElementos) {
		int tablaSuma[] = new int [0];
		int suma;
		
		for(int i=0; i<tabla.length; i++) {
			suma = 0;
			for(int j=0; j<numElementos; j++) {
				suma += tabla[i+j];
			}
			tablaSuma = Arrays.copyOf(tablaSuma, tablaSuma.length+1);
			tablaSuma[tablaSuma.length-1] = suma;
		}
		
		return tablaSuma;
	}

}
