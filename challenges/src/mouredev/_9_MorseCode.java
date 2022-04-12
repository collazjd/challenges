package mouredev;

import java.util.HashMap;
import java.util.Map;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 */

public class _9_MorseCode {

	private static Map<String, String> naturalConversion = new HashMap();
	private static Map<String, String> morseConversion = new HashMap();

	static {
		naturalConversion.put("A", ".-");
		naturalConversion.put("B", "-...");
		naturalConversion.put("C", "-.-.");
		naturalConversion.put("CH", "----");
		naturalConversion.put("D", "-..");
		naturalConversion.put("E", ".");
		naturalConversion.put("F", "..-.");
		naturalConversion.put("G", "--.");
		naturalConversion.put("H", "....");
		naturalConversion.put("I", "..");
		naturalConversion.put("J", ".---");
		naturalConversion.put("K", "-.-");
		naturalConversion.put("L", ".-..");
		naturalConversion.put("M", "--");
		naturalConversion.put("N", "-.");
		naturalConversion.put("Ñ", "--.--");
		naturalConversion.put("O", "---");
		naturalConversion.put("P", ".--.");
		naturalConversion.put("Q", "--.-");
		naturalConversion.put("R", ".-.");
		naturalConversion.put("S", "...");
		naturalConversion.put("T", "-");
		naturalConversion.put("U", "..-");
		naturalConversion.put("V", "...-");
		naturalConversion.put("W", ".--");
		naturalConversion.put("X", "-..-");
		naturalConversion.put("Y", "-.--");
		naturalConversion.put("Z", "--..");
		naturalConversion.put("0", "-----");
		naturalConversion.put("1", ".----");
		naturalConversion.put("2", "..---");
		naturalConversion.put("3", "...--");
		naturalConversion.put("4", "....-");
		naturalConversion.put("5", ".....");
		naturalConversion.put("6", "-....");
		naturalConversion.put("7", "--...");
		naturalConversion.put("8", "---..");
		naturalConversion.put("9", "----.");
		naturalConversion.put(".", ".-.-.-");
		naturalConversion.put(",", "--..--");
		naturalConversion.put("?", "..--..");
		naturalConversion.put("\"", ".-..-.");
		naturalConversion.put("/", "-..-.");
	}

	static {
		morseConversion.put(".-", "A");
		morseConversion.put("-...", "B");
		morseConversion.put("-.-.", "C");
		morseConversion.put("----", "CH");
		morseConversion.put("-..", "D");
		morseConversion.put(".", "E");
		morseConversion.put("..-.", "F");
		morseConversion.put("--.", "G");
		morseConversion.put("....", "H");
		morseConversion.put("..", "I");
		morseConversion.put(".---", "J");
		morseConversion.put("-.-", "K");
		morseConversion.put(".-..", "L");
		morseConversion.put("--", "M");
		morseConversion.put("-.", "N");
		morseConversion.put("--.--", "Ñ");
		morseConversion.put("---", "O");
		morseConversion.put(".--.", "P");
		morseConversion.put("--.-", "Q");
		morseConversion.put(".-.", "R");
		morseConversion.put("...", "S");
		morseConversion.put("-", "T");
		morseConversion.put("..-", "U");
		morseConversion.put("...-", "V");
		morseConversion.put(".--", "W");
		morseConversion.put("-..-", "X");
		morseConversion.put("-.--", "Y");
		morseConversion.put("--..", "Z");
		morseConversion.put("-----", "0");
		morseConversion.put(".----", "1");
		morseConversion.put("..---", "2");
		morseConversion.put("...--", "3");
		morseConversion.put("....-", "4");
		morseConversion.put(".....", "5");
		morseConversion.put("-....", "6");
		morseConversion.put("--...", "7");
		morseConversion.put("---..", "8");
		morseConversion.put("----.", "9");
		morseConversion.put(".-.-.-", ".");
		morseConversion.put("--..--", ",");
		morseConversion.put("..--..", "?");
		morseConversion.put(".-..-.", "\"");
		morseConversion.put("-..-.", "/");
	}

	public static String conversion(String s) {

		if (s.contains("-") || (s.contains(".") && s.length() == 1))
			return morseToNatural(s);
		return naturalToMorse(s);
	}

	private static String naturalToMorse(String s) {
		char c;
		s = s.toUpperCase();
		StringBuilder sConverted = new StringBuilder("");

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == ' ')
				sConverted.append("/ ");
			else {
				sConverted.append(naturalConversion.get(String.valueOf(c)));
				sConverted.append(" ");
			}
		}
		return sConverted.toString().substring(0, sConverted.length() - 1);
	}

	private static String morseToNatural(String s) {
		String[] words = s.split(" ");
		StringBuilder sConverted = new StringBuilder("");

		for (String word : words) {
			if (word.equals("/"))
				sConverted.append(" ");
			else
				sConverted.append(morseConversion.get(word));
		}

		return sConverted.toString();
	}

	public static void main(String[] args) {
		System.out.println(conversion("kdskjf 895489 fdsa8890932jofonkaf9"));
		System.out.println(conversion("-.- -.. ... -.- .--- ..-. / ---.. ----."
				+ " ..... ....- ---.. ----. / ..-. -.. ... .- ---.. ---.. ----."
				+ " ----- ----. ...-- ..--- .--- --- ..-. --- -. -.- .- ..-. ----."));
	}

}
