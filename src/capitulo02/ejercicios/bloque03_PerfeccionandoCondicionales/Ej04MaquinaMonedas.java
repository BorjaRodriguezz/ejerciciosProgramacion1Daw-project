package capitulo02.ejercicios.bloque03_PerfeccionandoCondicionales;

import java.util.Scanner;

public class Ej04MaquinaMonedas {

	public static void main(String[] args) {
		//Maquina esxpendedora con monedas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("IMPORTANTE: introducir valores en formato centimos, gracias.");
		
		//Compra de producto
		
		System.out.println("\nIntroduce el valor del producto: ");
		int valor = sc.nextInt();
		System.out.println("Introduce el pago: ");
		int pago = sc.nextInt();
		int cambio = pago - valor;
		
		if (cambio < 0) {
			System.out.println("Cantidad insuficiente, falta " + (-cambio) + " unidades");
		} else if (cambio == 0) {
			System.out.println("Gracias por su compra");
		} else {
			int moneda100 = cambio / 100;
			cambio = cambio % 100;
			int moneda50 = cambio / 50;
			cambio = cambio % 50;
			int moneda20 = cambio / 20;
			cambio = cambio % 20;
			int moneda5 = cambio / 5;
			cambio = cambio % 5;
			int moneda1 = cambio / 1;
			cambio = cambio % 1;
			System.out.println("Su cambio es: ");
			System.out.println("\n Cantidad de monedas de 100: " + moneda100);
			System.out.println("\n Cantidad de monedas de 500: " + moneda50);
			System.out.println("\n Cantidad de monedas de 20: " + moneda20);
			System.out.println("\n Cantidad de monedas de 5: " + moneda5);
			System.out.println("\n Cantidad de monedas de 1: " + moneda1);
			System.out.println("\n Gracias por su compra");
		}
		
		sc.close();

	}

}
