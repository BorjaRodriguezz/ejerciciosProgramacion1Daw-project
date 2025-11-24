package capitulo04.ejercicios.bloque11_PorEntretenernosUnRato;

public class Ej05_GeneraPrimitiva {

	public static void main(String[] args) {
		int[] primitiva = new int[7];
		
		//Inicializamos array
		for (int i = 0; i < primitiva.length; i++) {
			int num;
			//Bucle para generar números sin que se repitan
			do {
				num = (int)(Math.random() * 49) + 1; //Genera números
			} while (existe(primitiva, num, i));
			//Si no se repite colocamos el número en el array
			primitiva[i] = num;
		}
		
		//Ordenamos los primeros 6 números del array
		ordBurbuja(primitiva);
		
		//Mostramos el boleto sacado
		System.out.print("Combinación: ");
		for (int i = 0; i < primitiva.length - 1; i++) {
			System.out.print(primitiva[i] + " ");
		}
		System.out.println("\nComplementario: " + primitiva[6]);
	}
	
	//Método para que no se repitan números
	public static boolean existe(int[] array, int num, int lim) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) return true; //Si está es true
		}
		return false; //Si no está es false
	}
	
	//Método para ordenar en burbuja
	public static void ordBurbuja(int[] a) {
		int n = a.length - 1; //Para que no ordene el último número generado
		boolean intercambio;
		
		//bucle para ordenar el array
		for (int i = 0; i < n - 1; i++) {
			intercambio = false;
			for (int j = 0; j < n - 1; j++) {
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
