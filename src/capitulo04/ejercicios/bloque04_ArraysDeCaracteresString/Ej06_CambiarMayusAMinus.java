package capitulo04.ejercicios.bloque04_ArraysDeCaracteresString;
import java.util.Scanner;

public class Ej06_CambiarMayusAMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Info
		System.out.println("---CAMBIA MAYÚSCULAS POR MINÚSCULAS---");
		
		//Solicitud de texto
		System.out.println("\nIntroduce texto: ");
		String str = sc.nextLine();
		
		//Aplicamos método
		String resultado = cambiaMayusMinus(str);
		
		//Resultado
		System.out.println("Reusltado: " + resultado);
		
		sc.close();
	}
	
	//Método para cambiar de mayuscula a minuscula
	public static String cambiaMayusMinus(String cadena) {
		String nuevaCad = "";
		
		//Bucle para cambiar de mayuscula a minuscula
		for (int i = 0; i < cadena.length(); i++) {
			char cad = cadena.charAt(i);
			if (cad >= 'A' && cad <= 'Z') {
				cad += 32;
			}
		
		//Aplicamos el resultado del bucle
		nuevaCad += cad;
			
		}
		return nuevaCad;
	}
}
