package capitulo04.ejercicios.bloque09_MasterSobreArrays;

public class Ej01_OrdenaParesImpares {

	public static void main(String[] args) {
		//Arrays
		int[] num = new int[20];
		int[] pares = new int[20];
		int[] impares = new int[20];
		
		//Contadores
		int contPar = 0;
		int contImpar = 0;
		
		//Bucle que inicia array y diferencia los números
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101);
			if (num[i] % 2 == 0) {
				pares[contPar++] = num[i];
			} else {
				impares[contImpar++] = num[i];
			}
		}
		
		//Mostramos array original
		System.out.println("\nArray original: ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		//Puntero del array
		int indice = 0;
		
		//Bucles para colocar los números de izquierda a derecha
		for (int i = 0; i < contPar; i++) {
			num[indice++] = pares[i];
		}
		
		for (int i = 0; i < contImpar; i++) {
			num[indice++] = impares[i];
		}
		
		//Resultado
		System.out.println("\nArray ordenado (primero pares, luego impares, no es de menor a mayor): ");
		for (int n : num) {
			System.out.print(n + " ");
		}
	}

}
