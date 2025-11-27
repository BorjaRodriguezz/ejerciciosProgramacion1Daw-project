package cursosOnline.cursoMouredvJava;

public class Arrays {

	public static void main(String[] args) {
		
		// Declaración y creación
		int [] numbers = new int[5];
		System.out.println(numbers.length);
		
		String[] names = {"Borja", "Rodri", "Sevi"};
		
		// Imprimir
		System.out.println(names[1]);
		System.out.println(numbers[0]);
		
		// Modificación
		numbers[0] = 7;
		numbers[1] = 2;
		// numbers[5] = 3; Error porque el array es menor.
		System.out.println(numbers[0]);
		
		System.out.println(names[0]);
		names[0] = "borja@gmail.com";
		System.out.println(names[0]);
		
		System.out.println(names.length);
		names[2] = null;
		System.out.println(names.length); // Da igual el null la longitud no varia.

		// numbers[2] = null; Error
		
		boolean[] booleans = new boolean[5];
	}

}
