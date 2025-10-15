package capitulo03.ejercicios.bloque05_BuclesParaConocedores;

public class Ej02_Fibonacci {

	public static void main(String[] args) {
		
		//VARIABLES
		int num1 = 0;
		int num2 = 1;
		int num3;
		
		System.out.println("\nSECUENCIA DE FIBONACCI");
		
		//BUCLE FOR
		for (int i = 3; i <= 10; i++) {
			num3 = num1 + num2;
			
			System.out.println("\n" + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
