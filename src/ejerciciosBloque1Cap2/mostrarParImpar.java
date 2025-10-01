package ejerciciosBloque1Cap2;

import java.util.Scanner;

public class mostrarParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un numero al usuario
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		
		//Usamos % para dividir entre 2 y sacar el numero par o impar
		if (num % 2 == 0) {
			System.out.println("El numero " + num +  " es par");
		}
		else {
			System.out.println("El numero " + num + " es impar");
		}
		
		sc.close();

	}

}
