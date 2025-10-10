package bloque01_TiposOperadores;

import javax.swing.JOptionPane;

public class pide2VariablesYCambialasEntreSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pide 2 variables y cambialas entre si, muestra el antes y después
		String stringNum1 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num1 = Integer.parseInt(stringNum1);
		
		String stringNum2 = JOptionPane.showInputDialog("Introduzca un número entero");
		int num2 = Integer.parseInt(stringNum2);
		
		System.out.println("Valor de primera variable:" + num1);
		System.out.println("Valor de segunda variable:" + num2);
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("Valor de primera variable:" + num1);
		System.out.println("Valor de segunda variable:" + num2);
	}

}
