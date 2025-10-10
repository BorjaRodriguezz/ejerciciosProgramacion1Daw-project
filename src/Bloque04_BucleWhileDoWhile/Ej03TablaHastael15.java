package Bloque04_BucleWhileDoWhile;

public class Ej03TablaHastael15 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		do {
			System.out.println("\nTabla del " + numero + ":");
			int multiplicador = 1;
			
			do {
				System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
				multiplicador++;
			} while (multiplicador <= 10);
			
			numero++;
		} while (numero <= 15);
	}

}
