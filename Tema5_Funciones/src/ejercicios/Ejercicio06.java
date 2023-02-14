package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tam;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un tamaño para la tabla: ");
		tam = sc.nextInt();

		int tabla[] = new int[tam];

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		System.out.println("La tabla inicial es: " + Arrays.toString(tabla));

		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt(); // Guardamos el número introducido
		
		System.out.print("La tabla final es: " + Arrays.toString(sinMayores(tabla, num))); //Mostramos la tabla final
		
		sc.close();

	}

	public static int[] sinMayores(int tablaOg[], int num) {
		int tablaNueva[] = tablaOg;
		int cont = 0;

		while (cont < tablaNueva.length) { // Mientras el contador no supere la longitud de la tabla
			if (tablaNueva[cont] > num) { // Si el valor de tabla[i] es superior al del número techo:
				System.arraycopy(tablaNueva, cont + 1, tablaNueva, cont, (tablaNueva.length - 1 - cont)); // Machacamos el valor en tabla[i]
				tablaNueva = Arrays.copyOf(tablaNueva, tablaNueva.length - 1);// Nos deshacemos del 0 al final de la tabla
			} else {
				cont++; // Si no es mayor que el número techo, aumentamos el contador
			}
		}
		return tablaNueva;
	}

}
