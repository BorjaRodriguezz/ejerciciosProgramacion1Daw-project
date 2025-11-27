package practicasExamen.examen03;

public class EjB_PotenciasDe3 {

	public static void main(String[] args) {
		int num = 39;
		
		int potencia = sacarPotencia(num);
		
		potEs(potencia);
		
	}
	
	// Método para sacar el resultado de una potencia
	public static int sacarPotencia(int num) {
		int potencia = 0;
		for (int i = 2; i < num; i++) {
			for(int j = 1; j <= 3; i++) {
				if ((int)(Math.pow(i, j)) >= num) {
					potencia = i;
				} 
			}
		}
		return potencia;
	}
	
	// Método para saber si tiene o no potencia.
	public static void potEs(int num) {
		int posible = sacarPotencia(num);
		
		if (posible == num) {
			for (int i = 1; i <= 3; i++) {
				System.out.print(num + "^" + i + "+" + " ");
				if (i == 3) System.out.print(num + "^" + i + "=" + " " + posible);
			}
		} else {
			System.out.println("No es posible sacar la potencia deseada.");
		}
	}

}
