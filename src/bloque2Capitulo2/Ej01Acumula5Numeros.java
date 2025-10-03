package bloque2Capitulo2;

import java.util.Scanner;

public class Ej01Acumula5Numeros {

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
		
		//Formula para la suma
		
		if (n1 < 0) {
			numNegativos += n1;
		} else if (n1 >= 0 && n1 <= 25) {
			numBajos += n1;
		} else if (n1 >= 26 && n1 <=250) {
			numMedios += n1;
		} else if (n1 > 250 ) {
			numGrandes += n1;
		}
		
		if (n2 < 0) {
			numNegativos += n2;
		} else if (n2 >= 0 && n2 <= 25) {
			numBajos += n2;
		} else if (n2 >= 26 && n2 <=250) {
			numMedios += n2;
		} else if (n2 > 250 ) {
			numGrandes += n2;
		}
		
		if (n3 < 0) {
			numNegativos += n3;
		} else if (n3 >= 0 && n3 <= 25) {
			numBajos += n3;
		} else if (n3 >= 26 && n3 <=250) {
			numMedios += n3;
		} else if (n3 > 250 ) {
			numGrandes += n3;
		}
		
		if (n4 < 0) {
			numNegativos += n4;
		} else if (n4 >= 0 && n4 <= 25) {
			numBajos += n4;
		} else if (n4 >= 26 && n4 <=250) {
			numMedios += n4;
		} else if (n4 > 250 ) {
			numGrandes += n4;
		}
		
		if (n5 < 0) {
			numNegativos += n5;
		} else if (n5 >= 0 && n5 <= 25) {
			numBajos += n5;
		} else if (n5 >= 26 && n5 <=250) {
			numMedios += n5;
		} else if (n5 > 250 ) {
			numGrandes += n5;
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
