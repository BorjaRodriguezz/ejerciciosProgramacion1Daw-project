package capitulo2;

import java.util.Scanner;

public class parImparConAndIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pido numero al usuario
		
		System.out.println("Introduzca un numero: ");
		int num = sc.nextInt();
		
		//Uso & para saber si es par o impar
		
		if ((num & 1) == 0) {
			System.out.println("El numero " + num + " es par");
		}
		else {
			System.out.println("El numero " + num + " es impar");
		}
		
		sc.close();
	}

}
