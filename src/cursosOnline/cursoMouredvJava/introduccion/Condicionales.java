package cursosOnline.cursoMouredvJava.introduccion;

public class Condicionales {

	public static void main(String[] args) {

		// Condicionales
		
		// If Else
		var age = 22;
		
		if (age >= 18) {
			System.out.println("El usuario es mayor de edad.");
		} else {
			System.out.println("El usuario es menor de edad.");
		}
		
		// Switch
		
		var day = 5;
		
		switch (day) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}

}
