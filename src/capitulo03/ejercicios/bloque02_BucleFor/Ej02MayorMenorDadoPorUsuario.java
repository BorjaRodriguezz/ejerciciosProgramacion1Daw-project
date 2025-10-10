package capitulo03.ejercicios.bloque02_BucleFor;

import java.util.Scanner;

public class Ej02MayorMenorDadoPorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int mayor;
		int menor;
		int numero;
		
		//Solicitud
		
		System.out.println("Introduzca la cantidad de numeros que desea: ");
		int pedir = sc.nextInt();
		
		System.out.println("Introduzca el numero 1: ");
		numero = sc.nextInt();
		
		mayor = numero;
		menor = numero;
		
		//Bucle
		
		for (int i = 2; i <= pedir; i++) {
			System.out.println("Introduzca el numero " + i + " : ");
			numero = sc.nextInt();
			
			if (numero > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}
		
		//Resultado
		
		System.out.println("\nEl numero mayor es: " + mayor);
		System.out.println("\nEl numero menor es: " + menor);
		
		sc.close();

	}

}
