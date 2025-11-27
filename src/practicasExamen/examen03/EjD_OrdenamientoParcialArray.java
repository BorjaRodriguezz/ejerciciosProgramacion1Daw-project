package practicasExamen.examen03;

public class EjD_OrdenamientoParcialArray {

	public static void main(String[] args) {
		
		// Creamos array e imprimimos el original.
		int[] array = new int[] {2, 5, 1, 3, 6, 4};
		System.out.print("Array original: ");
		imprimeArray(array);
		
		// Aplicamos el método modificado para ordenar desde la posicion 1 hasta length -3 del array.
		ordBurbuja(array);
		
		// Resultado
		System.out.print("Array ordenado: ");
		imprimeArray(array);
	}
	
	// Imprime arrays
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	//Método para ordenar en burbuja
	public static void ordBurbuja(int[] a) {
		int n = a.length;
		boolean intercambio;
		
		//bucle para ordenar el array
		for (int i = 1; i < n - 3; i++) {
			intercambio = false;
			for (int j = 1; j < n - 3; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					intercambio = true;
				}
			}
			if (!intercambio) {
				break;
			}
		}
	}

}
