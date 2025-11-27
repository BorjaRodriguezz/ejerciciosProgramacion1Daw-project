package practicasExamen.examen03;

public class EjC_FactorialMasCercano {

	public static void main(String[] args) {
		
		// Creamo una variable con el número que queremos calcular el factorial mas cercano y aplicamos el método.
		int num = 120;
		System.out.println("El factorial mayor mas cercano es: " + factorialCercano(num) + "! para " + num);
	}
	
	// Método para calcular factorial de un número
	public static int factorial(int num) {
		int suma = 1;
		for (int i = num; i > 1; i--) {
			suma *= i;
		}
		return suma;
	}
	
	// Método para sacar el factorial mas cercano de un numero.
	public static int factorialCercano(int num) {
		int number = 0;
		for (int i = 1; factorial(i) < num; i++) {
			number = i + 1;
		}
		return number;
	}

}
