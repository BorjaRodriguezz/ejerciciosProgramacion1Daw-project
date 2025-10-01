package ejerciciosBloque1Cap1;

import javax.swing.JOptionPane;

public class pideUsuario3NumerosAlMomento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Petición de un número entero
		String stringNumero = JOptionPane.showInputDialog("Introduzca un número entero");
		int numero = Integer.parseInt(stringNumero);
		System.out.print("Valor de numeroEntero: " + numero);

		// Petición de un número flotante
		String stringNumeroFlotante = JOptionPane.showInputDialog("Introduzca un número flotante");
		float numeroFlotante = Float.parseFloat(stringNumeroFlotante);
		System.out.print(" Valor de numeroFlotante: " + numeroFlotante);
		
		// Petición de un número doble
		String stringNumeroDoble = JOptionPane.showInputDialog("Introduzca un número doble");
		double numeroDoble = Double.parseDouble(stringNumeroDoble);
		System.out.print(" Valor de numeroDoble: " + numeroDoble);
	}

}
