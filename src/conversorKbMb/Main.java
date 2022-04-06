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

package conversorKbMb;

import java.util.Scanner;

public class Main {

	public static Conversion conv;
	public static Scanner e;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = true;
		short opc = 0;
		e = new Scanner(System.in);

		do {

			System.out.println("\ningrese la opcion a elegir: ");
			System.out.println("(1) convertir de kb a mb\n (2) convertir de mb a kb\n (3) salir.");
			opc = e.nextShort();

			switch (opc) {

			case 1:

				conv = new Conversion();
				System.out.println("ingrese la cantidad de kb a convertir");
				double cantidad = e.nextDouble();
				conv.setKilo(cantidad);
				System.out.println("kb \t\tmb");
				System.out.println(cantidad + "\t\t" + (conv.calcularKbMb()));

				break;

			case 2:

				conv = new Conversion();

				System.out.println("ingrese la cantidad de mb a convertir");
				double cantidad1 = e.nextDouble();
				conv.setMega(cantidad1);
				System.out.println("mb \t\t kb");
				System.out.println(cantidad1 + "---->" + conv.calcularMbKb());

				break;

			case 3:

				System.out.println("programa terminado");
				salir = false;

				break;

			default:

				System.out.println("opcion incorrecta");

			}

		} while (salir);

	}

}
