package ejerciciosBloque1;

import javax.swing.JOptionPane;

public class cuotaMensualHipoteca {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cuota menusal de hipotéca
		
		//Datos solicitados al ususario
		String stringEuribor = JOptionPane.showInputDialog("Introduzca el valor del Euribor: ");
		float euribor = Float.parseFloat(stringEuribor);
		
		String stringDiferencial = JOptionPane.showInputDialog("Introduzca el valor del diferencial: ");
		float diferencial = Float.parseFloat(stringDiferencial);
		
		String stringCapital = JOptionPane.showInputDialog("Introduzca el valor del capital: ");
		float capital = Float.parseFloat(stringCapital);
		
		String stringPlazosMensuales = JOptionPane.showInputDialog("Introduzca el número de plazos mensuales: ");
		int plazosMensuales = Integer.parseInt(stringPlazosMensuales);
		
		//Interés Anual
		float interesAnual = (euribor + diferencial);
		
		//Interés Mensual
		float InteresMensual = ((interesAnual / 12f) / 100f);
		
		//Cuota Mensual
		float CuotaMensual = (capital * ((InteresMensual * (float)Math.pow(1f + InteresMensual, plazosMensuales)) / ((float)Math.pow(1f + InteresMensual, plazosMensuales) - 1f)));
		
		System.out.println("Importe de cuota mensual: " + CuotaMensual);
	}

}
