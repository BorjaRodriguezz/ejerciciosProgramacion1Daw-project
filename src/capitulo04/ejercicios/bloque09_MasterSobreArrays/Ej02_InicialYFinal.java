package capitulo04.ejercicios.bloque09_MasterSobreArrays;

import java.util.Scanner;

public class Ej02_InicialYFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		//No está bien terminado!!!
		
		//Pedimos números para el array
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce el número " + i + ": ");
			num[i] = sc.nextInt();
		}
		
		//Mostramos el array
		System.out.println("\nArray original: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". " + num[i]);
		}
		
		int inicial, fin;
		
		//Bucle para poner inicial y final
		do {
			System.out.print("\nPosición inicial (0-9): ");
			inicial = sc.nextInt();
			System.out.print("\nPosición final (0-9): ");
			fin = sc.nextInt();
		} while(inicial < 0 || inicial > 9 || fin < 0 || fin > 9 || inicial >= fin);
		
		int ultimo = num[9];	
		
		//Movemos a la derecha
		for (int i = 9; i > fin; i--) {
			num[i] = num[i - 1];
		}
		
		//Movemos a la izquierda
		for (int i = inicial; i >= inicial; i--) {
			num[i + 1] = num[i];
		}
		
		//Colocamos el último número guardado
		num[inicial] = ultimo;
		
		//Resultado
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ". " + num[i]);
		}
		
		sc.close();
	}

}
