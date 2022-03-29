package mouredev;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Reto #7
 * CONTANDO PALABRAS
 * Fecha publicaci�n enunciado: 14/02/22
 * Fecha publicaci�n resoluci�n: 21/02/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuaci�n no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en may�sculas y min�sculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan autom�ticamente.
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
