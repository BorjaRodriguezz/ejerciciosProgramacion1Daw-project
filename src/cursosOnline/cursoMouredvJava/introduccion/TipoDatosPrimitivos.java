package cursosOnline.cursoMouredvJava.introduccion;

public class TipoDatosPrimitivos {

	public static void main(String[] args) {
		//Tipo de dato
		
		//Número entero
		int age = 22;
		System.out.println(age);
		
		//Número con decimales
		double altura = 1.70;
		System.out.println(altura);
		
		//Carácter
		char letra = 'a';
		System.out.println(letra);
		
		//Banderas
		boolean myBoolean = true;
		myBoolean = false;
		System.out.println(myBoolean);
		
		//Cadena de texto (no es dato primitivo)
		String name = "Borja";
		System.out.println(name);
		
		//AVANZADO
		//Si quiero saber de que tipo es una variable
		System.out.println(name.getClass().getName());
	}

}
