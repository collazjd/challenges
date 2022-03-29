package mouredev;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicación enunciado: 14/02/22
 * Fecha publicación resolución: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 * 
 */

public class _7_CountingWords {

	public static Map<String, Long> countWords(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", " ").replaceAll("  ", " ");
		return Stream.of(s.split(" ")).collect(Collectors.groupingBy(element -> element, Collectors.counting()));
	}

	public static void main(String[] args) {
		System.out.println(countWords("Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev)."));
	}

}
