package cursosOnline.cursoMouredvJava.introduccion;

public class Operadores {

	public static void main(String[] args) {
		
		// Operadores
		
		// Aritméticos
		var a = 5;
		var b = 3;
		System.out.println(a + b); //Suma
		System.out.println(a - b); //Resta
		System.out.println(a * b); //Multiplicación
		System.out.println(a / b); //División
		System.out.println(a % b); //Resto de una división
		
		// Asignación
		a = b; // Cambio variable
		System.out.println(a);
		
		a = b * 2; 
		System.out.println(a);
		
		a += 1; //Sumo a la variable
		System.out.println(a);
		a -= 1; // Resto a la variable
		System.out.println(a);
		
		a *= 2; // Multiplico a la variable
		System.out.println(a);
		a /= 2; // Divido a la variable
		System.out.println(a);
		a %= 2; // El resto de 2 es 0
		System.out.println(a);
		
		// Comparación
		System.out.println(a == b); // Igualdad
		System.out.println(a == 0);
		System.out.println(a != b); // Desigualdad
		System.out.println(a < b); // Menor que
		System.out.println(a > b); // Mayor que
		System.out.println(a <= b); // Menor o igual que
		System.out.println(a >= b); // Mayor o igual que
		
		// Lógicos
		
		// Y (AND)
		System.out.println(true && true); // True

		System.out.println(true && false);
		System.out.println(false && true); // False
		System.out.println(false && false);
		
		System.out.println(5 > 2 && 2 == 1); // False
		System.out.println(3 > 1 && 2 < 7); // True
		
		// O (OR)
		System.out.println(true || true); 
		System.out.println(true || false); // True
		System.out.println(false || true);
		
		System.out.println(false || false); // False
		
		System.out.println(5 < 2 || 2 == 1); // False
		System.out.println(3 > 1 || 2 > 7); // True
		
		// NO (NOT) lo contrario
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!(3 > 1) || 2 > 7); // Antes era true y ahora es false
		
		// Unirarios
		System.out.println(+b); // Positivo
		System.out.println(-b); // Negativo
		System.out.println(++b); // Aumento estático
		System.out.println(--b); // Decrece estático
		System.out.println(b++); // Aumenta cada vez que se usa la variable
		System.out.println(b--); // Decrece cada vez que se usa la variable
	}

}
