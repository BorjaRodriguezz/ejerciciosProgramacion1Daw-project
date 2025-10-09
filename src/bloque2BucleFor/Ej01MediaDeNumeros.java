package bloque2BucleFor;

import java.util.Scanner;

public class Ej01MediaDeNumeros {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		float suma = 0;
		
		System.out.println("Indica cuantos numeros desea introducir: ");
		int pedir = sc.nextInt();
		
		//Bucle
		
		for (int i = 1; i <= pedir; i++) {
			System.out.println("Introduzca el numero " + i + " : ");
			float numero  = sc.nextFloat();
			suma += numero;
		}
		
		//Calculo de la media
		
		float media = suma / pedir;
		
		System.out.println("\nLa media de los numeros es: " + media);
		
		sc.close();
	}

}
