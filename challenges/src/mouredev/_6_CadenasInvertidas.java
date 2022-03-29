package mouredev;

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicaci�n enunciado: 07/02/22
 * Fecha publicaci�n resoluci�n: 14/02/22
 * Dificultad: F�CIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias 
 * del lenguaje que lo hagan de forma autom�tica.
 * - Si le pasamos "Hola mundo" nos retornar�a "odnum aloH"
 * 
 */

public class _6_CadenasInvertidas {

	public static String reverse(String s) {
		StringBuilder stringReversed = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			stringReversed.append(s.charAt(i));
		}
		return stringReversed.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hola Mundo"));
	}

}
