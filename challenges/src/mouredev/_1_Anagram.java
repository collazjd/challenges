package mouredev;


import java.util.Arrays;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 */

public class _1_Anagram {

	private static boolean isAnagram(String str1, String str2) {
		if (str1.equalsIgnoreCase(str2))
			return false;
		if (str1.length() != str2.length())
			return false;

		char[] arrayS1 = str1.toLowerCase().toCharArray();
		Arrays.sort(arrayS1);
		str1 = new String(arrayS1);

		char[] arrayS2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arrayS2);
		str2 = new String(arrayS2);

		return str1.equalsIgnoreCase(str2);
	}

	public static void main(String[] args) {
		System.out.println("1 " + isAnagram("mani", "iman"));
		System.out.println("2 " + isAnagram("mani", "mani"));
		System.out.println("3 " + isAnagram("mani", "iMaN"));
		System.out.println("4 " + isAnagram("mani", "mANi"));
		System.out.println("5 " + isAnagram("", ""));
	}

}
