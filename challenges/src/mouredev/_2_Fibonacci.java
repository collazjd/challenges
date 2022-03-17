package mouredev;

/*
 * Reto #2
 * LA SUCESI�N DE FIBONACCI
 * Fecha publicaci�n enunciado: 10/01/22
 * Fecha publicaci�n resoluci�n: 17/01/22
 * Dificultad: DIF�CIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros n�meros de la sucesi�n de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesi�n de n�meros en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class _2_Fibonacci {

	private static void fibonacci() {
		long f1 = 0;
		long f2 = 1;
		long fTmp;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 0; i <= 50 - 3; i++) {
			fTmp = f2;
			f2 = f1 + f2;
			f1 = fTmp;
			System.out.print(f2 + " ");
		}
	}

	public static void main(String[] args) {
		fibonacci();
	}

}
