package examenes.examen20251024;

import java.util.Random;

public class Ej02_MediaArray {
	public static void mediaArray() {
		int mayor;
		int menor;
		int media;
		
		
		
		
	}
	
	public static int[] inicializarArrayAleatorio() {
    	Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

}
