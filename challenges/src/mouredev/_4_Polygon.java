package mouredev;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
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