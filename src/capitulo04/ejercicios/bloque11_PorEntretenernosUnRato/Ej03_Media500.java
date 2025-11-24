package capitulo04.ejercicios.bloque11_PorEntretenernosUnRato;

public class Ej03_Media500 {

	public static void main(String[] args) {
		//Variables
		double suma = 0;
		int contador = 0;
		double media = 0;
		
		//Bucle para generar numeros hasta llegar a la media indicada
		while (media < 499.5 || media > 500.5) {
			int num = (int)(Math.random() * 1000) + 1;
			
			suma += num;
			contador++;
			
			media = suma / contador;
		}
		
		//Resultado
		if (contador == 1) {
			System.out.println("Se generó " + contador + " número."); //Por si se da la casualidad que el primer número es 500
		} else {
			System.out.println("Se generaron " + contador + " números.");
		}
		System.out.println("Media final: " + media);
	}

}
