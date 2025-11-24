package capitulo04.ejercicios.bloque11_PorEntretenernosUnRato;

public class Ej01_MatrizConCerosUnos {

	public static void main(String[] args) {
		//Creamos la matriz
		char[][] matriz = new char[20][10];
		
		//Rellenar matriz con espacios
		for(int fila = 0; fila < 20; fila++) {
			for (int col = 0; col < 10; col++) {
				matriz[fila][col] = ' ';
			}
		}
		
		//Rellenamos bordes con asteriscos
		for (int fila = 0; fila < 20; fila++) {
			matriz[fila][0] = '*';
			matriz[fila][9] = '*';
		}
		
		for (int col = 0; col < 10; col++) {
			matriz[0][col] = '*';
			matriz[19][col] = '*';
		}
		
		for (int fila = 1; fila < 19; fila++) {
			for (int col = 1; col < 9; col++) {
				matriz[fila][col] = Math.random() < 0.5 ? '0' : '1';
			}
		}
		
		//Resultado
		for (int fila = 0; fila< 20; fila++) {
			for (int col = 0; col < 10; col++) {
				System.out.print(matriz[fila][col]);
			}
			System.out.println();
		}

	}

}
