package capitulo04.ejercicios.bloque08_Juego3EnRaya;

import java.util.Scanner;

public class Ejercicio3EnRaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] tablero = new int[3][3];
		int turno = 1;
		boolean fin = false;
		
		//Métodos aplicados
		inicializaTablero(tablero);
		
		//Bucle del juego
		do {
			imprimeTablero(tablero);
			System.out.println("Turno del jugador " + turno);
			
			int fila, columna;
			
			do {
				System.out.print("Introduce fila (0-2): ");
				fila = sc.nextInt();
				System.out.print("Introduce columna (0-2): ");
				columna = sc.nextInt();
			} while (!esMovimientoValido(tablero, fila, columna));
			
			realizaMovimiento(tablero, fila, columna, turno);
			
			if (haGanadoJugador(tablero, turno)) {
				imprimeTablero(tablero);
				System.out.println("¡El jugador " + turno + " ha ganado!");
				fin = true;
			} else if (hayEmpate(tablero)){
				imprimeTablero(tablero);
				System.out.println("¡Empate!");
				fin = true;
			} else {
				turno = cambiaTurno(turno);
			}
		} while (!fin);
		
		sc.close();
	}
	
	//Métodos
	public static void inicializaTablero(int[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = 0;
			}
		}
	}
	
	public static void imprimeTablero(int[][] tablero) {
		System.out.println("Tablero actual: ");
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				char simbolo;
				if (tablero[i][j] == 1) simbolo = 'X';
				else if (tablero[i][j] == 2) simbolo = 'O';
				else simbolo = '-';
				System.out.print(" " + simbolo + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean esMovimientoValido(int[][] tablero, int fila, int columna) {
		if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
			System.out.println("Movimiento no valido.");
			return false;
		}
		if (tablero[fila][columna] != 0) {
			System.out.println("casilla ocupada, elige otra.");
			return false;
		}
		//Si elige bien devolvemos true
		return true;
	}
	
	//Método para realizar los movimientos
	public static void realizaMovimiento(int[][] tablero, int fila, int columna, int jugador) {
		tablero[fila][columna] = jugador;
	}
	
	//Método para saber si un jugador gana
	public static boolean haGanadoJugador(int[][] t, int j) {
		//Filas
		for (int i = 0; i < 3; i++) {
			if (t[0][i] == j && t[i][1] == j && t[i][2] == j) return true;
		}
		
		//Columnas
		for (int i = 0; i < 3; i++) {
			if (t[0][i] == j && t[1][i] == j && t[2][i] == j) return true;
		}
		
		//Diagonales
		if (t[0][0] == j && t[1][1] == j && t[2][2] == j) return true;
		
		if (t[0][2] == j && t[1][1] == j && t[2][0] == j) return true;
		
		//En caso de que no haya victoria
		return false;
	}
	
	//Métod para saber si hay empate
	public static boolean hayEmpate(int[][] t) {
		for (int i = 0 ; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (t[i][j] == 0) return false;
			}
		}
		return true;
	}
	
	public static int cambiaTurno(int turno) {
		return (turno % 2) + 1;
	}
}
