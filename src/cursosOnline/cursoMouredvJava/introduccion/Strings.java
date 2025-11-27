package cursosOnline.cursoMouredvJava.introduccion;

public class Strings {

	public static void main(String[] args) {
		
		// Cadenas de texto
		
		String name = "Borja";
		String surname = "Rodríguez";
		
		// Operaciones básicas
		
		// Concatenación
		System.out.println(name + " " + surname);
		
		// Longitud de la variable
		System.out.println(name.length());
		
		// Obtener caracter
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(name.length() - 1));
		
		// Subcadena
		System.out.println(name.substring(2));
		
		//Mayúsculas y minúsculas
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		// Continua pero no lo he dado
	}

}
