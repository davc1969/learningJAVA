package data_types;

public class dataType_primitive {

	public static void main(String[] args) {
		
		System.out.println("Valores numéricos enteros: ");
		
		//Numéricos: Enteros
		byte entero_corto;
		short entero_medio;
		int entero_normal;
		long entero_largo;
		
		entero_corto = -128;
		System.out.println("tipo BYTE, valor mínimo: " + entero_corto);
		entero_corto = 127;
		System.out.println("tipo BYTE, valor máximo: " + entero_corto);
		System.out.println();
		
		entero_medio = -32768;
		System.out.println("tipo SHORT, valor mínimo: " + entero_medio);
		entero_medio = 32767;
		System.out.println("tipo SHORT, valor máximo: " + entero_medio);
		System.out.println();
		
		entero_normal = -2147483648;
		System.out.println("tipo INT, valor mínimo: " + entero_normal);
		entero_normal = 2147483647;
		System.out.println("tipo INT, valor máximo: " + entero_normal);
		System.out.println();
		
		entero_largo = -9223372036854775808L;
		System.out.println("tipo LONG, valor mínimo: " + entero_largo);
		entero_largo = 9223372036854775807L;
		System.out.println("tipo LONG, valor máximo: " + entero_largo);
		System.out.println();
		

		

	}

}




