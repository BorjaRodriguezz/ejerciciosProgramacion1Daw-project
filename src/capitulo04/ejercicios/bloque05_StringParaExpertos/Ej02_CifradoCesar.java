package capitulo04.ejercicios.bloque05_StringParaExpertos;
import java.util.Scanner;

public class Ej02_CifradoCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de texto y desplazamiento
		System.out.println("Introduce texto: ");
		String str = sc.nextLine();
		System.out.println("Desplazamiento del cifrado (introduce número): ");
		int desplazamiento = sc.nextInt();
		
		//Aplicamos método
		String cifrado = cifradoCesar(str, desplazamiento);
		
		//Resultado
		System.out.println("Texto cifrado: " + cifrado);
		
		sc.close();
	}
	
	//Método para cifrado César
	public static String cifradoCesar(String cadena, int desplazamiento) {
		String resultado = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			
			if (c >= 'a' && c <= 'z') {
				c = (char) (c + desplazamiento);
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) (c + desplazamiento);
			}
			resultado = resultado + c;
		}
		return resultado;
	}
}
