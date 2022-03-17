package mouredev;

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 * 
 */

public class _3_Prime {

	private static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0)
				return false;
		return true;
	}

	private static void printPrimeNumbers(int aboveLimit) {
		for (int i = 1; i <= aboveLimit; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrime(14));
		printPrimeNumbers(100);
	}

}
