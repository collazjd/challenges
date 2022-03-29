package mouredev;

/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 * 
 */

public class _8_DecimalToBinary {

	public static String decimalToBinary(int number) {
		StringBuilder binary = new StringBuilder();
		while (number > 0) {
			binary.insert(0, number % 2);
			number /= 2;
		}
		return binary.length() == 0 ? "0" : binary.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(387));
		System.out.println(decimalToBinary(0));
		System.out.println(decimalToBinary(1));
		System.out.println(decimalToBinary(386));
	}

}
