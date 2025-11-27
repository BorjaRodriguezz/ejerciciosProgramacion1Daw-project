package practicasExamen.examen01;

public class Utilidades {

    // ============================================
    //                  ARRAYS 1D
    // ============================================

    public static void imprimirArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static boolean contiene(int[] arr, int valor) {
        for (int n : arr) {
            if (n == valor) return true;
        }
        return false;
    }

    public static int contar(int[] arr, int valor) {
        int contador = 0;
        for (int n : arr) {
            if (n == valor) contador++;
        }
        return contador;
    }

    public static int buscarPosicion(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) return i;
        }
        return -1;
    }

    public static int[] removeInteger(int[] arr, int valor) {
        int rep = contar(arr, valor);
        int[] nuevo = new int[arr.length - rep];
        int pos = 0;

        for (int n : arr) {
            if (n != valor) {
                nuevo[pos++] = n;
            }
        }
        return nuevo;
    }


    // ============================================
    //                   MATRICES
    // ============================================

    public static int[][] matrizSinRepetidos() {
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

    public static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int n : fila) {
                System.out.printf("%4d ", n);
            }
            System.out.println();
        }
    }

    public static int maximo(int[][] m) {
        int max = m[0][0];
        for (int[] fila : m) {
            for (int n : fila) {
                if (n > max) max = n;
            }
        }
        return max;
    }

    public static int minimo(int[][] m) {
        int min = m[0][0];
        for (int[] fila : m) {
            for (int n : fila) {
                if (n < min) min = n;
            }
        }
        return min;
    }

    public static String posicionEnMatriz(int[][] m, int valor) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == valor) {
                    return "Fila " + i + ", Columna " + j;
                }
            }
        }
        return "No encontrado";
    }


    // ============================================
    //           STRINGS Y CARACTERES
    // ============================================

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean esMayuscula(char c) {
        return Character.isUpperCase(c);
    }

    public static int contarVocales(String s) {
        int contador = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (esVocal(c)) contador++;
        }
        return contador;
    }

    public static String invertir(String s) {
        String invertido = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertido += s.charAt(i);
        }
        return invertido;
    }


    // ============================================
    //         VALIDACIONES BOOLEANAS
    // ============================================

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    // ============================================
    //                  MENÚS
    // ============================================

    public static void imprimirMenu() {
        System.out.println("1. Insertar");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Salir");
    }
}

