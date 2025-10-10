package capitulo02.ejercicios.bloque02_MasCondicionales;

import java.util.Scanner;

public class Ej02AcumulaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int numNegativos = 0;
		int numBajos = 0;
		int numMedios = 0;
		int numGrandes = 0;
		
		//Pedimos 5 numeros
		
		System.out.println("Introduzca 5 numero");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		//Hacemos la formula de conteo
		
		if (n1 < 0) {
			numNegativos++;
		} else if (n1 >= 0 && n1 <= 25) {
			numBajos++;
		} else if (n1 >= 26 && n1 <=250) {
			numMedios++;
		} else if (n1 > 250 ) {
			numGrandes++;
		}
		
		if (n2 < 0) {
			numNegativos++;
		} else if (n2 >= 0 && n2 <= 25) {
			numBajos++;
		} else if (n2 >= 26 && n2 <=250) {
			numMedios++;
		} else if (n2 > 250 ) {
			numGrandes++;
		}
		
		if (n3 < 0) {
			numNegativos++;
		} else if (n3 >= 0 && n3 <= 25) {
			numBajos++;
		} else if (n3 >= 26 && n3 <=250) {
			numMedios++;
		} else if (n3 > 250 ) {
			numGrandes++;
		}
		
		if (n4 < 0) {
			numNegativos++;
		} else if (n4 >= 0 && n4 <= 25) {
			numBajos++;
		} else if (n4 >= 26 && n4 <=250) {
			numMedios++;
		} else if (n4 > 250 ) {
			numGrandes++;
		}
		
		if (n5 < 0) {
			numNegativos++;
		} else if (n5 >= 0 && n5 <= 25) {
			numBajos++;
		} else if (n5 >= 26 && n5 <=250) {
			numMedios++;
		} else if (n5 > 250 ) {
			numGrandes++;
		}
		
		//Mostramos el resultado final
		System.out.println("RESULTADOS");
		System.out.println("Suma de numeros negativos: " + numNegativos);
		System.out.println("Suma de numeros bajos: " + numBajos);
		System.out.println("Suma de numeros medios: " + numMedios);
		System.out.println("Suma de numeros grandes: " + numGrandes);
		
		sc.close();

	}

}
