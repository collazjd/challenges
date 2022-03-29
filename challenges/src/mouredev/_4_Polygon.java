package mouredev;

/*
 * Reto #4
 * �REA DE UN POL�GONO
 * Fecha publicaci�n enunciado: 24/01/22
 * Fecha publicaci�n resoluci�n: 31/01/22
 * Dificultad: F�CIL
 *
 * Enunciado: Crea UNA �NICA FUNCI�N (importante que s�lo sea una) que sea capaz de calcular y retornar el �rea de un pol�gono.
 * - La funci�n recibir� por par�metro s�lo UN pol�gono a la vez.
 * - Los pol�gonos soportados ser�n Tri�ngulo, Cuadrado y Rect�ngulo.
 * - Imprime el c�lculo del �rea de un pol�gono de cada tipo.
 * 
 */

public class _4_Polygon {

	public static double area(Polygon polygon) {
		return polygon.area();
	}

	public static void main(String[] args) {
		System.out.println(area(new Triangle(10.0, 5.0)));
		System.out.println(area(new Rectangle(5.0, 7.0)));
		System.out.println(area(new Square(4.0)));
	}

}

interface Polygon {
	public double area();
}

class Square implements Polygon {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}
}

class Rectangle implements Polygon {

	private double side_1, side_2;

	public Rectangle(double side_1, double side_2) {
		this.side_1 = side_1;
		this.side_2 = side_2;
	}

	@Override
	public double area() {
		return side_1 * side_2;
	}
}

class Triangle implements Polygon {

	private double base, height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}
}