package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int tam;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un tamaño para la tabla: ");
		tam = sc.nextInt();

		int tabla[] = new int[tam];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 5);
		}
		System.out.println(Arrays.toString(tabla));

		System.out.println("La tabla sin repetidos es: " + Arrays.toString(sinRepetidos(tabla)));
		sc.close();
	}

	public static int[] sinRepetidos(int tabla[]) {
		int tablaSR[] = new int[0];
		int cont = 0;

		for (int i = 0; i < tabla.length; i++) {
			if(!repetido(tabla, tablaSR, cont)) {
				cont++;
				tablaSR = Arrays.copyOf(tablaSR, tablaSR.length + 1);
				tablaSR[tablaSR.length - 1] = tabla[i];
			}
		}

		return tablaSR;
	}

	public static Boolean repetido(int tablaR[], int tablaSR[], int cont) {
		Boolean repetido = false;

		for (int i = 0; i < tablaSR.length; i++) {
			if (tablaR[cont] == tablaSR[i]) {
				repetido = true;
				break;
			}
		}
		return repetido;
	}
}
