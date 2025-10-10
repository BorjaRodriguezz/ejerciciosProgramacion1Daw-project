package bloque01_BucleFor;

import java.util.Scanner;

public class Ej03PideNumerosMasConteo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int positivos = 0;
		int negativos = 0;
		int neutro = 0;
		
		//Pedir numeros
		
		System.out.println("¿Cuantos numeros desea introducir?");
		int pedir = sc.nextInt();
		
		//Bucle
		
		for (int i = 1; i <= pedir; i++) {
			System.out.println("Introduzca el numero " + i + " : ");
			int numero = sc.nextInt();
			
			//Separamos en positivos y negativos
			
			if (numero > 0) {
				positivos++;
			}
			if (numero < 0){
				negativos++;
			}
			if (numero == 0) {
				neutro++;
			}
			
		}
		
		//Resultados
		
		System.out.println("\nRESULTADOS");
		System.out.println("Numeros postivos: " + positivos);
		System.out.println("Numeros negativos: " + negativos);
		System.out.println("Veces que ha salido el 0: " + neutro);
	
		sc.close();

	}

}
