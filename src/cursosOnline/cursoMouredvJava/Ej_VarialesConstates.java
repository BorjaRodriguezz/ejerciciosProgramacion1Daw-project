package cursosOnline.cursoMouredvJava;

public class Ej_VarialesConstates {

	public static void main(String[] args) {
		
		// 1. Declara una variable de tipo String y ponle tu nombre.
		String name = "Borja";
		System.out.println("Nombre: " + name);
		
		// 2. Crea una variable de tipo int y asignale tu edad.
		int age = 22;
		System.out.println("Edad: " + age);
		
		// 3. Crea variable double con tu altura en metros
		double height = 1.75;
		System.out.println("Altura(m): " + height);
		
		// 4. Declara un booleanb que indique si te gusta programar.
		boolean programarMola = true;
		if (programarMola) System.out.println("Me gusta programar.");
		else System.out.println("No me gusta programar.");
		
		// 5. Declara una constante email.
		final String EMAIL = "borja@gmail.com";
		System.out.println("Correo: " + EMAIL);
		
		// 6. Crea variable de tipo char y guardale tu inicial.
		char inicial = 'B';
		System.out.println("Inicial del nombre: " + inicial);
		
		// 7. Declara una variable de tipo String con tu localidad y cambia su valor y vuelve a imprimirla
		String city = "Lucena";
		System.out.println("Localidad: " + city);
		city = "Sevilla";
		System.out.println("Localidad: " + city);
		
		// 8. Crea una variable int llamada a y otra b, imprime la suma de ambas.
		int a = 3;
		int b = 4;
		System.out.println("Suma: " + (a + b));
		
		// 9. Imprime el tipo de dos variables creadas anteriormente
		System.out.println(city.getClass().getName());
		// System.out.println(a.getClass().getName()); NO FUNCIONA.
		
		// 10. Intenta declara una variable sin inicializarla y luego asignale un valor antes de imprimirla.
		// System.out.println(deporte); ASI NO FUNCIONA
		var deporte = "Fútbol";
			System.out.println("Deporte: " + deporte);
	}

}
