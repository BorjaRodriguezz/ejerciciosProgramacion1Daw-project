package cursosOnline.cursoMouredvJava;

public class Ej_Operadores {

	public static void main(String[] args) {
		
		// 1. Crea una variable con el resultado de una operacion aritmética
		var a = 7;
		var b = 5;
		var suma = a + b;
		System.out.println(suma);
		
		// 2. Crea una variable para cada tipo de operación de asiganción
		var copia = a;
		System.out.println(copia);
		
		var sumario = a += 1;
		System.out.println(sumario);
		
		var resta = a -= 2;
		System.out.println(resta);
		
		var pro = a *= 2;
		System.out.println(pro);
		
		var div = a /= 2;
		System.out.println(div);
		
		var resto = a %= 3;
		System.out.println(resto);
		
		// 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación
		System.out.println(1 < 2);
		System.out.println(1 != 2);
		System.out.println(5 > 4);
		
		// 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación
		System.out.println(1 > 2);
		System.out.println(1 == 2);
		System.out.println(5 < 4);
		
		// 5. Utiliza el operador lógico AND
		System.out.println(2 > 0 && 4 <= 4); // true
		
		// 6. Utiliza el operador lógico OR
		System.out.println(2 > 5 || 4 <= 3); // false
		
		// 7. Combina ambos operadores lógicos.
		System.out.println((1 < 5 || 3 > 6) && (1 < 6 || 3 > 2));
		
		// 8. Imprime alguna negación.
		System.out.println(!(3 + 2 == 5));
		
		// 9. Imprime 3 ejemplos de uso de operadores unirarios.
		System.out.println(++a);
		System.out.println(-b);
		System.out.println(--b);
		
		// 10. Combina operadores aritméticos, de comparación y lógicos.
		System.out.println(((a += 1) == (b) || (7 + 5 == 1)));
	}

}
