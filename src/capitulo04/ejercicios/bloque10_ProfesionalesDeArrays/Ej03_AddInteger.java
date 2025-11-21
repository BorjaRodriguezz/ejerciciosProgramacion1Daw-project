package capitulo04.ejercicios.bloque10_ProfesionalesDeArrays;

public class Ej03_AddInteger {

	public static void main(String[] args) {
		//Creamos array
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		//Mostramos array original
		mostrarArray(array);
		
		//Aplicamos método
		int[] nuevoArray = addIntenger(array, 7);
		
		//Resultado
		mostrarArray(nuevoArray);

	}
	
	//Método AddIntenger
	public static int[] addIntenger(int[] array, int num) {
		int[] nuevoArray = new int[array.length + 1];
		
		//Bucle para copiar arrays
		for (int i = 0; i < array.length; i++) {
			nuevoArray[i] = array[i];
		}
		
		//Colocamos el nuevo valor en el ultimo peusto del array
		nuevoArray[nuevoArray.length - 1] = num;
		
		//Devolvemos el array
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
