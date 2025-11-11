package capitulo04.ejercicios.bloque07_Matrices;

public class Ej_Matrices {

	public static void main(String[] args) {
		int m[][] = new int[][] {{1, 2, 3, 4, 0}, 
								 {5, 6, 7, 8, 9}, 
								 {10, 11, 12, 13, 14}, 
								 {0, 15, 16, 17, 18},
								 {19, 0, 20, 21, 22}};
				
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		
		//Salto de línea
		System.out.println();
		
		//Aplicamos método azar
		matrizAzar(m);
		
		//Aplicamos método que imprima matriz
		imprimeMatriz(m);
		
		//Método que comprueba si la matriz es positiva
		if (esMatrizPositiva(m)) {
			System.out.println("\nTodos los valores son positivos");
		} else {
			System.out.println("\nTodos los valores no son positivos");
		}
	}
	
	//Método para generar matriz al azar
	public static void matrizAzar(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) Math.round(Math.random() * 100);
			}
		}
	}
	
	//Método que imprime matriz
	public static void imprimeMatriz(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//Método que revise si todos los números son positivos
	public static boolean esMatrizPositiva(int m[][]) {
		//Bucle para devolver false si es negativo
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] < 0) return false;
			}
		}
		//Si es mayor es true
		return true;
	}

}
