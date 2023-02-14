package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int tam;
		int valor;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un tamaño para el array: ");
		tam = sc.nextInt();

		int tabla[] = new int[tam];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(tabla));

		System.out.println("Introduzca un valor a buscar en la tabla: ");
		valor = sc.nextInt();

		System.out.println("Ese valor se encuentra en el/los índice(s) " + Arrays.toString(buscaTodos(tabla, valor)));

		sc.close();
	}

	public static int[] buscaTodos(int tabla[], int valor) {
		int buscaTodos[] = new int[0];

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == valor) {
				buscaTodos = Arrays.copyOf(buscaTodos, buscaTodos.length + 1);
				buscaTodos[buscaTodos.length - 1] = i;
			}
		}
		return buscaTodos;
	}

}
