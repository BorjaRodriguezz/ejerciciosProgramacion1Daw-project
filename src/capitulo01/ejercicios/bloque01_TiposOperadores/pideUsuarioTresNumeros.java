package capitulo01.ejercicios.bloque01_TiposOperadores;

import javax.swing.JOptionPane;

public class pideUsuarioTresNumeros {

	public static void main(String[] args) {
		// Petición de un número entero
		String stringNumero = JOptionPane.showInputDialog("Introduzca un número entero");
		int numero = Integer.parseInt(stringNumero);

		// Petición de un número flotante
		String stringNumeroFlotante = JOptionPane.showInputDialog("Introduzca un número flotante");
		float numeroFlotante = Float.parseFloat(stringNumeroFlotante);
		
		// Petición de un número doble
		String stringNumeroDoble = JOptionPane.showInputDialog("Introduzca un número doble");
		double numeroDoble = Double.parseDouble(stringNumeroDoble);
		System.out.print("Valor de numero: " + numero + " Valor de numeroFlotante: " + numeroFlotante + " Valor de numeroDoble: " + numeroDoble);
	}

}
