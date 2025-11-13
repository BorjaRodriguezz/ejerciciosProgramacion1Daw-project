package capitulo04.ejercicios.bloque07_Matrices;

import java.util.Scanner;

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
		
		//Aplicamos método matriz diagonal
		if (esDiagonal(m)) {
			System.out.println("\nLa matriz es diagonal.");
		} else {
			System.out.println("\nLa matriz no es diagonal.");
		}
		
		//Aplicamos método matriz triangular
		if (esTriangular(m)) {
			System.out.println("\nLa matriz es triangular.");
		} else {
			System.out.println("\nLa matriz no es triangular.");
		}
		
		//Aplicamos método matriz dipsersa
		if (esDispersa(m)) {
			System.out.println("\nLa matriz es dispersa.");
		} else {
			System.out.println("\nLa matriz no es dispersa.");
		}
		
		//Aplicamos metodo para convertir a unidimensional
		int[] unidimensional = convertirAUnidimensional(m);
        System.out.println("\nMatriz convertida en array unidimensional:");
        for (int num : unidimensional) System.out.print(num + " ");
        System.out.println();
        
        //Aplicamos método para tener matriz traspuesta
        System.out.println("\nMatriz traspuesta:");
        imprimeMatriz(traspuesta(m));
        
        //Aplicamos método matriz opuesta
        System.out.println("\nMatriz opuesta: ");
        imprimeMatriz(opuesta(m));
        
        //Aplicamos método para eliminar fila matriz
        System.out.println();
        eliminarFila(m);
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
	
	//Método para saber si es diagonal
	public static boolean esDiagonal(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (i != j && m[i][j] != 0) return false;
			}
		}
		return true;
	}
	
	//Método para saber si es triangular
	public static boolean esTriangular(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < i; j++) {
				if (m[i][j] != 0) return false;
			}
		}
		return true;
	}
	
	//Método para saber si es dispersa
	static boolean esDispersa(int[][] m) {
        for (int i = 0; i < m.length; i++) { //Cada fila debe tener un 0
            boolean filaCero = false;
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] == 0) filaCero = true;
            if (!filaCero) return false;
        }
        for (int j = 0; j < m[0].length; j++) { //Cada columna debe tener un 0
            boolean colCero = false;
            for (int i = 0; i < m.length; i++)
                if (m[i][j] == 0) colCero = true;
            if (!colCero) return false;
        }
        return true;
    }
	
	//Método para convertir a unidimensional
	static int[] convertirAUnidimensional(int[][] m) {
        int[] res = new int[m.length * m[0].length];
        int pos = 0;
        for (int[] fila : m)
            for (int n : fila)
                res[pos++] = n;
        return res;
    }
	
	//Método para saber si es simétrica
    static boolean esSimetrica(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] != m[j][i]) return false;
        return true;
    }
    
    //Método para saber si es traspuesta
    static int[][] traspuesta(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                t[j][i] = m[i][j];
        return t;
    }
    
    //Método para saber si es opuesta
    static int[][] opuesta(int[][] m) {
        int[][] o = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                o[i][j] = -m[i][j];
        return o;
    }
    
    //Método para eliminar filas
    static void eliminarFila(int[][] m) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de fila a eliminar (0-4): ");
        int f = sc.nextInt();

        if (f < 0 || f >= m.length) {
            System.out.println("Fila fuera de rango.");
            return;
        }

        int[][] nueva = new int[m.length - 1][m[0].length];
        int nf = 0;
        for (int i = 0; i < m.length; i++) {
            if (i == f) continue;
            nueva[nf++] = m[i];
        }

        System.out.println("Matriz sin la fila " + f + ":");
        imprimeMatriz(nueva);
    }
}
