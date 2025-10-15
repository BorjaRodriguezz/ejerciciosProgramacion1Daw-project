package capitulo03.ejercicios.bloque05_BuclesParaConocedores;

import java.util.Scanner;

public class Ej05_TrianguloPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//SOLICITO FILAS
		System.out.print("Introduce el número de filas del Triángulo de Pascal: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
            
            int coeficiente = 1; 

            for (int k = 0; k < numero - i; k++) {
            }

            for (int j = 0; j <= i; j++) {
                
                System.out.print(coeficiente);
                
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            
            // SALTO DE LÍNEA
            System.out.println();
        }

		sc.close();

	}

}
