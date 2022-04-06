package precioProducto;

import java.util.Scanner;

import conversorKbMb.Conversion;

public class Main {

	
	public static Factura fact;
	public static Scanner scan;
	
	public static void main(String[] args) {
		
		
		boolean salir = true;
		short opc = 0;
		scan = new Scanner(System.in);
		
		System.out.println("ingrese la base");
		double base = scan.nextDouble();
		fact = new Factura();
		fact.setBaseImponible(base);
		
		
		do {

			System.out.println("\ningrese el tipo de iva: ");
			System.out.println("(1)nopro\n (2) mitad\n (3) menos5 \n (4) 5porc.");
			opc = scan.nextShort();
			

			switch (opc) {

			case 1:
			case 2:
			case 3:
			case 4:

				
				fact.getDescuento(opc);
				System.out.println(fact);
				
				
				break;
			case 5:
				salir=false;
				
				break;

			default:

				System.out.println("opcion incorrecta");

			}

		} while (salir);
		
		
	}
	
	
	
}
