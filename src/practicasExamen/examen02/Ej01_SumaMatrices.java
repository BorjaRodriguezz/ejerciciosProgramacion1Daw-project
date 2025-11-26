package practicasExamen.examen02;

public class Ej01_SumaMatrices {

	public static void main(String[] args) {
		//Matrices
		int[][] matriz1 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matriz2 = new int[][] {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		System.out.println("Matriz 1: ");
		imprimeMatriz(matriz1);
		System.out.println("\nMatriz 2: ");
		imprimeMatriz(matriz2);
		
		//Aplicamos método
		System.out.println("\nLa suma de matrices es: ");
		int[][] sumaMatrices = sumaMatrices(matriz1, matriz2);
		imprimeMatriz(sumaMatrices);
	}
	
	//Método para sumar matrices
	public static int[][] sumaMatrices(int[][] m1, int[][] m2) {
		//Si no miden igual no pueden sumarse
		if (m1.length != m2.length) {
			System.out.println("Error, las matrices son de diferente tamaño.");
		}
		
		int[][] m3 = new int[3][3];
		
		//bucle que suma matrices
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < 3; j++) {
				m3[i][j] = m1[i][j] + m2[i][j]; 
			}
		}
		return m3;
	}
	
	//Método que imprime matriz
	public static void imprimeMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
