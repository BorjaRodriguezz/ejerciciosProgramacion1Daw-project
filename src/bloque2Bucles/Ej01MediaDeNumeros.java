package bloque2Bucles;

import java.util.Scanner;

public class Ej01MediaDeNumeros {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		int suma;
		int pedir;
		
		System.out.println("Indica cuantos numeros desea introducir: ");
		pedir = sc.nextInt();
		
		for (int i = 1; i <= pedir; i++) {
			System.out.println("Introduzca el numero " + i + " : ");
			int numero  = sc.nextInt();
		}
		
		sc.close();

	}

}
