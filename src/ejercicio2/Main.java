package ejercicio2;

import java.util.Scanner;

public class Main {

	private static Convercion convertir;
	private static Scanner entrada;

	public static void main(String[] args) {

		boolean salir = true;
		short opc = 0;
		entrada = new Scanner(System.in);

		do {

			System.out.println("\ningrese la opcion a elegir: ");
			System.out.println("(1) convertir de pesos a dolares\n (2) convertir de dolares a pesos\n (3) salir.");
			opc = entrada.nextShort();

			switch (opc) {

			case 1:

				convertir = new Convercion();
				System.out.println("ingrese la cantidad de pesos a convertir");
				double cantidad = entrada.nextDouble();

				System.out.println("pesos \t\t dolares");
				System.out.println(cantidad + "\t\t" + (convertir.convertirPesos(cantidad)));

				break;

			case 2:

				convertir = new Convercion();

				System.out.println("ingrese la cantidad de dolares a convertir");
				double cantidad1 = entrada.nextDouble();

				System.out.println("dolares \t\t pesos");
				System.out.println(cantidad1 + "---->" + convertir.convertirDolares(cantidad1));

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
