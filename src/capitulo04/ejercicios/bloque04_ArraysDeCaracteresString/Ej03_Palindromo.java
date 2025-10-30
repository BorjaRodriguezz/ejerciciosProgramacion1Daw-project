package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;

import java.util.Scanner;

public class Ej03_Palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de caracteres
		System.out.println("Introduce caracteres: ");
		String str = sc.nextLine();
		
		//Aplicamos método
		boolean palindromo = palindromo(str);
		
		//Resultado
		if (palindromo) {
			System.out.println("Si es palíndromo.");
		} else {
			System.out.println("No es palíndromo.");
		}
		
		sc.close();
	}
	
	//Método para saber si la palabra es palíndromo
	public static boolean palindromo(String cadena) {
		//volvemos todas las letras minúsculas
		cadena = cadena.toLowerCase().replace(" "," ");
		
		int i = 0;
		int j = cadena.length() - 1;
		
		//Comprobamos si las letras coinciden
		while (i < j) {
			if (cadena.charAt(i) != cadena.charAt(j)) {
				return false; //Si no coinciden las letras, no es
			}
			i++;
			j--;
		}
		return true; //En caso de coincidir, si es
	}

}
