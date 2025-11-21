package capitulo04.ejercicios.bloque10_ProfesionalesDeArrays;

public class Ej01_StringFromArray {

	public static void main(String[] args) {
		//Creamos array
		int [] num = {1, 2, 4, 8, 16};
		
		//Aplicamos método
		String resultado = stringFromArray(num);
		
		//Resultado
		System.out.println(resultado);

	}
	
	
	//Método stringFromArray
	public static String stringFromArray(int[] array) {
		//Creamos StringBuffer
		StringBuffer sb = new StringBuffer();
		
		//Bucle para recorrer el array
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			sb.append(" ");
		}
		
		//Devolvemos el array como String
		return sb.toString();
	}
}
