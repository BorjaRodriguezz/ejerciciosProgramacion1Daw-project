package cursosOnline.cursoMouredvJava;

public class Metodos {

	public static void main(String[] args) {
		
		// Métodos
		
		int[] array = new int[] {0, 1, 2, 3, 4};
		
		sendEmail();
		imprimeArray(array);
		
		String email = "borja@gmail.com";
		sendEmailToUser(email);
		
		sendEmailToUser("borja@gmail.com", "Borja");
		
		if (esPar(1)) {
			System.out.println("El número es par.");
		} else System.out.println("El número es impar");
		
		esPar(array);
	}
	
	// Imprime arrays
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// Método sin parametros ni retornos
	public static void sendEmail() {
		System.out.println("Se envía email.");
	}
	
	// Método con parametros
	public static void sendEmailToUser(String email) {
		System.out.println("Se envía email: " + email);
	}
	
	// Sobrecarga de funciones
	public static void sendEmailToUser(String email, String name) {
		System.out.println("Se envía email a " + name + ": " + email);
	}
	
	// Método con retorno
	public static boolean esPar(int num) {
		if (num % 2 == 0) return true; else return false;
	}
	
	// Comprobar numeros array son pares o impares
	public static void esPar(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i] + " es par.");
			} else System.out.println(array[i] + " es impar");
		}
		
	}
}
