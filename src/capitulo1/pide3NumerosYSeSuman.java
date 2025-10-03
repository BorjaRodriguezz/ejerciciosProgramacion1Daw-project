package capitulo1;

import javax.swing.JOptionPane;

public class pide3NumerosYSeSuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Petición de un número entero
		String stringNum1 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num1 = Integer.parseInt(stringNum1);
		
		String stringNum2 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num2 = Integer.parseInt(stringNum2);
		
		String stringNum3 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num3 = Integer.parseInt(stringNum3);
		
		System.out.print("La suma de los valores es: " + (num1 + num2 + num3));
	}

}
