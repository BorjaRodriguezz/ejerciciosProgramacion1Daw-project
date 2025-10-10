package bloque01_TiposOperadores;

import javax.swing.JOptionPane;

public class media3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Media de 3 números
		String stringNum1 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num1 = Integer.parseInt(stringNum1);
		
		String stringNum2 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num2 = Integer.parseInt(stringNum2);
		
		String stringNum3 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num3 = Integer.parseInt(stringNum3);
		
		System.out.print("La media de los valores es: " + ((num1 + num2 + num3) / 3));
	}

}
