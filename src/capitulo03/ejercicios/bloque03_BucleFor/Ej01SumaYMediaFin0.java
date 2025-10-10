package capitulo03.ejercicios.bloque03_BucleFor;

import java.util.Scanner;

public class Ej01SumaYMediaFin0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		
		int numero;
		float suma = 0;
		int contador = 0;
		
		System.out.println("Introduce numeros (introduzca 0 para terminar): ");
		
		//BUCLE
		
		for (; true;) {
			numero = sc.nextInt();
			
			if (numero == 0) {
				break; //FIN DE BUCLE
			}
			
			suma += numero;
			contador++; //PARA LA MEDIA
		}
		
		if (contador > 0) {
			float media = suma / contador;
			System.out.println("\nSuma total: " + suma);
			System.out.println("\nMedia: " + media);
		} else {
			System.out.println("\nValor no valido.");
		}
		
		sc.close();

	}

}
