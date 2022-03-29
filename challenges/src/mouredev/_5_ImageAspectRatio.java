package mouredev;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Fecha publicación enunciado: 01/02/22
 * Fecha publicación resolución: 07/02/22
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 * 
 */

public class _5_ImageAspectRatio {

	private static BufferedImage loadImage(String url) throws MalformedURLException, IOException {
		return ImageIO.read(new URL(url));
	}

	private static Dimension getDimension(BufferedImage image) {
		return new Dimension(image.getWidth(), image.getHeight());
	}

	private static Dimension getImageAspectRatio(Dimension dimension) {
		int divider = 2;
		// test

//		dimension.width = 1041;
//		dimension.height = 333;

		while (true) {
			if (dimension.width % divider == 0 && dimension.height % divider == 0) {
				dimension.width = dimension.width / divider;
				dimension.height = dimension.height / divider;
				divider = 2;
			} else {
				divider++;
				if (divider > (dimension.width / 2) || divider > (dimension.height / 2)) {
					break;
				}
			}
		}
		return dimension;
	}

	public static void main(String[] args) throws MalformedURLException, IOException {
		String url = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
		BufferedImage image = loadImage(url);
		Dimension dimension = getDimension(image);

		System.out.println("widht: \t" + dimension.width);
		System.out.println("height: " + dimension.height);

		dimension = getImageAspectRatio(dimension);
		System.out.println("ratio: \t" + dimension.width + " : " + dimension.height);
	}
}

class Dimension {
	public int width;
	public int height;

	public Dimension(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
