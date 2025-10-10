package capitulo03.ejercicios.bloque01_BucleFor;

import java.util.Scanner;

public class Ej01Suma4NumerosMayores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
		//Pedimos 4 numeros
		
		for (int i = 1; i<= 4; i++) {
			System.out.println("Introduce el numero " + i + " : ");
			int numero = sc.nextInt();
			
			//Sumamos los que sean mayores que 10
			
			if (numero > 10) {
				suma += numero;
			}
		}
		
		//Suma
		
		System.out.println("La suma de los numeros mayores que 10 es: " + suma);
		
		sc.close();

	}

}
