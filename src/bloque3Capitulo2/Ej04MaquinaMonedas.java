package bloque3Capitulo2;

import java.util.Scanner;

public class Ej04MaquinaMonedas {

	public static void main(String[] args) {
		//Maquina esxpendedora con monedas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("IMPORTANTE: introducir valores en formato centimos, gracias.");
		
		//Compra de producto
		
		System.out.println("Introduce el valor del producto: ");
		int valor = sc.nextInt();
		System.out.println("Introduce el pago: ");
		int pago = sc.nextInt();
		int cambio = pago - valor;
		
		if (cambio < 0) {
			System.out.println("Cantidad insuficiente, falta " + (-cambio) + " unidades");
		} else if (cambio == 0) {
			System.out.println("Gracias por su compra");
		} else {
			System.out.println("Cambio a devolver: " + cambio + "unidades");
			int moneda100 = 100;
			int moneda50 = 50;
			int moneda20 = 20;
			int moneda5 = 5;
			int moneda1 = 1;
			System.out.println("Cantidad de monedas de 100: " + moneda100);
			System.out.println("Cantidad de monedas de 500: " + moneda50);
			System.out.println("Cantidad de monedas de 20: " + moneda20);
			System.out.println("Cantidad de monedas de 5: " + moneda5);
			System.out.println("Cantidad de monedas de 1: " + moneda1);
		}
		
		sc.close();

	}

}
