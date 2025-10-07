package bloque2Bucles;

import java.util.Scanner;

public class Ej04MultiplosNumeroUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nMULTIPLOS DE NUMERO DADO POR USUARIO");
		
		//SOLICITUD
		
		System.out.println("\nIntroduzca un numero: ");
		int numero = sc.nextInt();
		
		System.out.println("Multiplo maximo que quiere saber: ");
		int pedido = sc.nextInt();
		
		//RESULTADO
		
		System.out.println("\nMultiplos de " + numero + " hasta " + pedido);
		
		for (int i = 1; i * numero <= pedido; i++) {
			System.out.println(numero * i);
		}
		
		sc.close();

	}

}
