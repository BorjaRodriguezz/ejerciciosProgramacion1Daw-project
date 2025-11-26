package examenes.simulacroExamen;

import java.util.Scanner;

public class Ej_JuegoBolos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Aplicamos metodo para inicializar array
		int[] bolos = new int[10];
		iniBolos(bolos);
		int[] prob = new int[10];
		
		mostrarBolos(bolos);
		
		int tirada = 0;
		do {
			for (int i = 0; i < bolos.length; i++) {
				bolos[i] = (int)(Math.random() < 0.5 ? 0 : 1);
			}
			tirada++;
			System.out.println("\nTirada: " + tirada);
			mostrarBolos(bolos);
			System.out.println("\nDesea seguir jugando(1 = si / 0 = no): ");
			int pre = sc.nextInt();
			if (pre == 0) break;
		} while (finJuego(bolos));
		
		sc.close();
	}
	
	//a) Método para inicializar el juego
	public static void iniBolos (int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
	}
	
	//b) Método para mostrar bolos forma pirámide
	public static void mostrarBolos(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if (i == 3) {
				System.out.println();
			}
			if (i == 6) {
				System.out.println();
			}
			if (i == 8) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//Método para terminar el juego
	public static boolean finJuego(int[] array) {
		for (int i = 0; i < array.length; i++) {
			while (array[i] == 0) {
				return true;
			}
			if (array[i] != 0) return false;
		}
		return true;
	}
}
