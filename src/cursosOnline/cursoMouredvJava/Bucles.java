package cursosOnline.cursoMouredvJava;

public class Bucles {

	public static void main(String[] args) {
		
		// Bucles

		// Bucle FOR
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Hola, Java!");
		}
		
		String[] names = {"Borja", "Rodri", "Sevi"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Bucle FOR EACH
		
		for (String name: names) {
			System.out.println(name);
		}
		
		// Bucle WHILE
		
		int i = 0;
		boolean find = false;
		while(!find) {
			System.out.println(names[i]);
			if (names[i] == "Rodri") {
				find = true;
			}
			i++;
		}
		
		// Bucle DO WHILE
		
		i = 0;
		do {
			System.out.println("Hola, Java!");
			i++;
		} while (i < 2);

	}

}
