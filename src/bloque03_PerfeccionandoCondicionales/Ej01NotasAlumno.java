package bloque03_PerfeccionandoCondicionales;

public class Ej01NotasAlumno {

	public static void main(String[] args) {
		
		//Nota del alumno
		
		int nota = 10;
		
		//switch con resultados sobre la nota
		
		switch (nota) {
		case 0:
		case 1:
			System.out.println("Muy deficiente");
			break;
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Perfecto");
			break;
		default:
			System.out.println("Error, el valor no pertenece a ninguna nota");
		}

	}

}
