package practicasExamen.examen01;

import java.util.Random;

public class Metodos {

		// =============================
	    // 🔸 MÉTODOS REUTILIZABLES 🔸
	    // =============================

	    // Inicializa un array con números aleatorios entre un mínimo y un máximo
	    public static int[] inicializarArrayAleatorio(int tamaño, int minimo, int maximo) {
	    	Random random = new Random();
	        int[] array = new int[tamaño];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = random.nextInt(maximo - minimo + 1) + minimo;
	        }
	        return array;
	    }

	    // Muestra el contenido de un array
	    public static void mostrarArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }

	    // Devuelve la suma de los números pares
	    public static int sumaPares(int[] array) {
	        int suma = 0;
	        for (int num : array) {
	            if (num % 2 == 0) suma += num;
	        }
	        return suma;
	    }

	    // Devuelve la suma de los números impares
	    public static int sumaImpares(int[] array) {
	        int suma = 0;
	        for (int num : array) {
	            if (num % 2 != 0) suma += num;
	        }
	        return suma;
	    }

	    // Busca un valor en el array y devuelve su posición, o -1 si no está
	    public static int buscarValor(int[] array, int valor) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == valor) return i;
	        }
	        return -1;
	    }

	    // Cambia el signo de los números pares
	    public static void cambiarSignoPares(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] % 2 == 0) {
	                array[i] = -array[i];
	            }
	        }
	    }

	    // Devuelve el valor máximo
	    public static int obtenerMaximo(int[] array) {
	        int max = array[0];
	        for (int num : array) {
	            if (num > max) max = num;
	        }
	        return max;
	    }

	    // Devuelve el valor mínimo
	    public static int obtenerMinimo(int[] array) {
	        int min = array[0];
	        for (int num : array) {
	            if (num < min) min = num;
	        }
	        return min;
	    }

	    // Devuelve la media de los valores
	    public static double obtenerMedia(int[] array) {
	        int suma = 0;
	        for (int num : array) {
	            suma += num;
	        }
	        return (double) suma / array.length;
	    }
	    
	    //Método para buscar un número
	    public boolean contiene(int[] arr, int valor) {
	        for (int n : arr) {
	            if (n == valor) return true;
	        }
	        return false;
	    }

	    // Contar repeticiones
	    public int contar(int[] arr, int valor) {
	        int contador = 0;

	        for (int n : arr) {
	            if (n == valor) contador++;
	        }
	        return contador;
	    }
	    
	    // Devolver la posicion de un número
	    public int buscarPosicion(int[] arr, int valor) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == valor) return i;
	        }
	        return -1;
	    }
	    
	    // eliminar un número de un array
	    public int[] removeInteger(int[] arr, int valor) {
	        int rep = contar(arr, valor);
	        int[] nuevo = new int[arr.length - rep];

	        int pos = 0;
	        for (int n : arr) {
	            if (n != valor) {
	                nuevo[pos] = n;
	                pos++;
	            }
	        }
	        return nuevo;
	    }
	    
	    // MÉTODO MATRICES
	    
	    // Método para rellenar matriz con num aleatorios sin repetirlos
	    public int[][] matrizSinRepetidos() {
	        int[][] m = new int[6][10];
	        boolean[] usado = new boolean[1001];

	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 10; j++) {

	                int num;
	                do {
	                    num = (int)(Math.random() * 1001);
	                } while (usado[num]);

	                usado[num] = true;
	                m[i][j] = num;
	            }
	        }
	        return m;
	    }
	    
	    // Imprimir matriz
	    public void imprimirMatriz(int[][] m) {
	        for (int[] fila : m) {
	            for (int n : fila) {
	                System.out.printf("%4d ", n);
	            }
	            System.out.println();
	        }
	    }
	    
	    // Obtener max de una matriz
	    public int maximo(int[][] m) {
	        int max = m[0][0];

	        for (int[] fila : m) {
	            for (int n : fila) {
	                if (n > max) max = n;
	            }
	        }
	        return max;
	    }
	    
	    // Obtener min de una matriz
	    public int minimo(int[][] m) {
	        int min = m[0][0];

	        for (int[] fila : m) {
	            for (int n : fila) {
	                if (n < min) min = n;
	            }
	        }
	        return min;
	    }
	    
	    // Buscar posicion de num en una matriz
	    public String posicionEnMatriz(int[][] m, int valor) {
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++) {
	                if (m[i][j] == valor) {
	                    return "Fila " + i + ", Columna " + j;
	                }
	            }
	        }
	        return "No encontrado";
	    }
	    
	    // MÉTODOS APARTE
	    
	    // Numeros primos
	    public boolean esPrimo(int n) {
	        if (n <= 1) return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	    
	    // Saber si una letra es vocal
	    public boolean esVocal(char c) {
	        c = Character.toLowerCase(c);
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }


	}
