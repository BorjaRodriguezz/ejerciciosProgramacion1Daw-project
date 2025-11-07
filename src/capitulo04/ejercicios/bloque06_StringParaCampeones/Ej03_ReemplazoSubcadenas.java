package capitulo04.ejercicios.bloque06_StringParaCampeones;

import java.util.Scanner;

public class Ej03_ReemplazoSubcadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de cadenas
		System.out.println("Introduce cadena: ");
		String cad1 = sc.nextLine();
		
		System.out.println("Introduce subcadena: ");
		String subCad = sc.nextLine();
		
		System.out.println("Introduce cadena de reemplazo: ");
		String cad2 = sc.nextLine();
		
		//Aplicamos método
		String cadReemplazo = reemplazaCadena(cad1, subCad, cad2);
		
		//Resultado
		System.out.println("\nCadena reempalzada: " + cadReemplazo);
		
		sc.close();
	}
	
	//Método para reemplazar con subcadenas
	public static String reemplazaCadena(String cad1, String subCad, String cad2) {
		String nueva = "";
		int i = 0;
		
		while (i < cad1.length()) {
			//Comprobamos si comienza ahí la subcadena que queremos reemplazar (con cad1.subCadstring(i, i + subCad.length()).equals(subCad)).
			if (i + subCad.length() <= cad1.length() && cad1.substring(i, i + subCad.length()).equals(subCad)) {
				nueva += cad2;
				i += subCad.length();
			} else {
				nueva += cad1.charAt(i);
				i++;
			}
		}
		return nueva;
	}

}
