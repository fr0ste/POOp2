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

package factura;

import java.util.Scanner;

public class Main {

	public static Factura factura;
	public static Scanner e;

	public static void main(String[] args) {

		e = new Scanner(System.in);

		System.out.println("ingrese la base para generar su factura");
		double base = e.nextDouble();

		factura = new Factura();

		factura.setBase(base);

		factura.getTotalFactura();

	}

}
