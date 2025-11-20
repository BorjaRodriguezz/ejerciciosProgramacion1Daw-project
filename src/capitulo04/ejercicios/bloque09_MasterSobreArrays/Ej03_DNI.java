package capitulo04.ejercicios.bloque09_MasterSobreArrays;

import java.util.Scanner;

public class Ej03_DNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de DNI (sin letra)
		System.out.println("Introduce tu número de DNI sin letra: ");
		int dni = sc.nextInt();
		
		//Nétodo + resultado
		char letraDni = letraDNI(dni);
		System.out.println("Su DNI completo es: " + dni + letraDni);
		
		sc.close();
	}
	
	//Método para calcular letra del DNI
	public static char letraDNI(int dni) {
		//Array con las letras
		char[] letras = {
				'T','R','W','A','G','M','Y','F','P','D','X','B',
	            'N','J','Z','S','Q','V','H','L','C','K','E'
		};
		
		int resto = dni % 23; //Para que esté entre 0 y 22 en el array
		return letras[resto];
	}

}
