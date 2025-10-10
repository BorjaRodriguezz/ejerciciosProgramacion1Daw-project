package capitulo02.ejercicios.bloque03_PerfeccionandoCondicionales;

import java.util.Scanner;

public class Ej03ProgramaCalculos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		double pi = 3.1416;
		
		//Menu principal
		
		System.out.println("\n=== CALCULADORA DE FIGURAS ===");
		System.out.println("\n1. Hipotenusa (triangulo).");
		System.out.println("2. Superficie (circunferencia).");
		System.out.println("3. Perimetro (circunferencia).");
		System.out.println("4. Area (rectangulo).");
		System.out.println("5. Area (triangulo).");
		System.out.println("6. Salir.");
		System.out.println("\nElige una opcion: ");
		
		opcion = sc.nextInt();
		
		switch (opcion) {
			//Hipotenusa de un triangulo
			case 1:
				System.out.println("Introduce valor de cateto 1: ");
				double cateto1 = sc.nextDouble();
				System.out.println("Introduce valor de cateto 2: ");
				double cateto2 = sc.nextDouble();
				double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
				System.out.println("El valor de la hipotenusa es: " + hipotenusa);
				break;
			
			//Superficie circunferencia
			case 2:
				System.out.println("Introduce la longitud del radio de la circunferencia: ");
				double longRadio = sc.nextDouble();
				double areaCircunferencia = (pi * Math.pow(longRadio, 2));
				System.out.println("La superficie de la circunferencia es: " + areaCircunferencia);
				break;
				
			//Perimetro circunferencia
			case 3:
				System.out.println("Introduce la longitud del radio de la cirncunferencia: ");
				longRadio = sc.nextDouble();
				double superficieCircunferencia = (2 * pi * longRadio);
				System.out.println("El perimetro de la circuferencia es: " + superficieCircunferencia);
				break;
				
			//Area rectangulo
			case 4:
				System.out.println("Introduce la base del rectangulo: ");
				double baseR = sc.nextDouble();
				System.out.println("Introduce la altura del rectangulo: ");
				double alturaR = sc.nextDouble();
				double areaRectangulo = (baseR * alturaR);
				System.out.println("El area del rectangulo es: " + areaRectangulo);
				break;
				
			//Area triangulo
			case 5:
				System.out.println("Introduce la base del triangulo");
				double baseT = sc.nextDouble();
				System.out.println("Introduce la altura del triangulo: ");
				double alturaT = sc.nextDouble();
				double areaTriangulo = ((baseT * alturaT) / 2);
				System.out.println("El area del triangulo es: " + areaTriangulo);
				break;
				
			//Salir
			case 6:
				System.out.println("Saliendo de la calculadora...");
				break;
				
			default:
				System.out.println("Opcion incorrecta.");
				break;
		}
		
		
		sc.close();

	}

}
