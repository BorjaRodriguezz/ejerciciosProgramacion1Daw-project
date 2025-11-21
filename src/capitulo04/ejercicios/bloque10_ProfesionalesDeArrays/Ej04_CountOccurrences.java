package capitulo04.ejercicios.bloque10_ProfesionalesDeArrays;

public class Ej04_CountOccurrences {

	public static void main(String[] args) {
		//Creamos array
		int[] array = {1, 2, 7, 4, 7, 6, 7, 8, 9, 0};
		
		//Mostramos array original
		mostrarArray(array);
		
		//Aplicamos método
		int contador = countOccurrences(array, 7);
		
		//Resultado
		System.out.println("Número de veces que está la ocurrencia: " + contador);
	}
	
	//Método CountOccurrrences
	public static int countOccurrences(int[] array, int num) {
		int contador = 0;
		
		//Bucle para contar las veces que esta le número
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) contador++;
		}
		
		//Devolvemos le contador
		return contador;
	}
	
	//Método mostrar Array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
