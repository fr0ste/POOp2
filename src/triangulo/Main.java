/**************
 * 
 * Autor: Joel Francisco Figueroa Martinez

 * 
 * 
 * Fecha de creacion: 06/04/2022
 * 
 * 
 * Fecha de modificacion:
 * 
 * 
 * Descripcion: 
 * 
 * 
 */

package triangulo;

import java.util.Scanner;

import rectangulo.Rectangulo;

public class Main {

	private static Scanner scan;
	private static Triangulo triangulo;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("ingresa la base");
		double base = scan.nextDouble();
		System.out.println("ingresa la altura");
		double altura = scan.nextDouble();

		triangulo = new Triangulo();
		triangulo.setAltura(altura);
		triangulo.setBase(base);

		triangulo.imprimirArea();

		scan.close();

	}
}
