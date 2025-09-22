package ejerciciosBloque1;

import javax.swing.JOptionPane;

public class cuotaMensualHipoteca {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cuota menusal de hipotéca
		
		//Datos solicitados al ususario
		String stringEuribor = JOptionPane.showInputDialog("Introduzca el valor del Euribor: ");
		float Euribor = Float.parseFloat(stringEuribor);
		
		String stringDiferencial = JOptionPane.showInputDialog("Introduzca el valor del diferencial: ");
		float Diferencial = Float.parseFloat(stringDiferencial);
		
		String stringCapital = JOptionPane.showInputDialog("Introduzca el valor del capital: ");
		float Capital = Float.parseFloat(stringCapital);
		
		String stringPlazosMensuales = JOptionPane.showInputDialog("Introduzca el número de plazos mensuales: ");
		int PlazosMensuales = Integer.parseInt(stringPlazosMensuales);
		
		//Interés Anual
		float InteresAnual = (Euribor + Diferencial);
		
		//Interés Mensual
		float InteresMensual = ((InteresAnual / 12f) / 100f);
		
		//Cuota Mensual
		float CuotaMensual = (Capital * ((InteresMensual * (float)Math.pow(1f + InteresMensual, PlazosMensuales)) / ((float)Math.pow(1f + InteresMensual, PlazosMensuales) - 1f)));
		
		System.out.println("Importe de cuota mensual: " + CuotaMensual);
	}

}
