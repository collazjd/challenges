package mouredev;

/*
 * Reto #3
 * �ES UN N�MERO PRIMO?
 * Fecha publicaci�n enunciado: 17/01/22
 * Fecha publicaci�n resoluci�n: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un n�mero es o no primo.
 * Hecho esto, imprime los n�meros primos entre 1 y 100.
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
