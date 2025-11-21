package capitulo04.ejercicios.bloque10_ProfesionalesDeArrays;

public class Ej05_RemoveIntenger {

	public static void main(String[] args) {
		//Creamos array
		int[] array = {1, 2, 7, 4, 7, 6, 7, 8, 9, 0};
		
		//Mostramos array original
		mostrarArray(array);
		
		//Aplicamos método
		array = removeIntenger(array, 7);
		
		//Resultado
		mostrarArray(array);

	}
	
	//Método removeIntenger
	public static int[] removeIntenger(int[] array, int num) {
		//Contador para un valor
		int contador = 0;
		
		//Bucle para saber cuantas veces sale un valor
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) contador++;
		}
		
		int[] nuevoArray = new int[array.length - contador];
		
		int j = 0;
		//Bucle para copiar arrays
		for (int i = 0; i < array.length; i++) {
			if (array[i] != num) {
				nuevoArray[j] = array[i];
				j++;
			}
		}
		
		//Devuelvo el array nuevo
		return nuevoArray;
	}
	
	//Método mostrar Array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
