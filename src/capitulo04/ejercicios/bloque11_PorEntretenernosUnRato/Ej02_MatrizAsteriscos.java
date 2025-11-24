package capitulo04.ejercicios.bloque11_PorEntretenernosUnRato;

public class Ej02_MatrizAsteriscos {

	public static void main(String[] args) {
		//Creamos la matriz
		char[][] matriz = new char[10][30];
		
		//Recorremos las filas
		for (int fila = 0; fila < 10; fila++) {
			int cantidadAsteriscos = (int)(Math.random() * 30) + 1;
			
			//Generamos columnas con asteriscos
			for (int col = 0; col < cantidadAsteriscos; col++) {
				matriz[fila][col] = '*';
			}
			
			for(int col = cantidadAsteriscos; col < 30; col++) {
				matriz[fila][col] = ' ';
			}
		}
		
		//Mostramos la matriz
		for (int fila = 0; fila< 10; fila++) {
			for (int col = 0; col < 30; col++) {
				System.out.print(matriz[fila][col]);
			}
			System.out.println();
		}
	}

}
