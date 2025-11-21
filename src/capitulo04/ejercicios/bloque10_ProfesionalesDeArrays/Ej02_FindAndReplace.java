package capitulo04.ejercicios.bloque10_ProfesionalesDeArrays;

public class Ej02_FindAndReplace {

	public static void main(String[] args) {
		//Creamos array
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		//Mostramos array original
		mostrarArray(array);
		
		//Aplicamos método
		findAndReplace(array, 5, 7);
		
		//Mostramos resultado
		mostrarArray(array);
	}
	
	//Método mostrar Array
	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método findAndReplace (Busca y reemplaza para los amigos)
	public static void findAndReplace(int[] array, int buscar, int reemplazar) {
		//Bucle para buscar y reemplazar
		for (int i = 0; i < array.length; i++) {
			if (array[i] == buscar) array[i] = reemplazar;
		}
	}
}
