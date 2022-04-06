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

package volCono;

import java.util.Scanner;


public class Main {

	private static Scanner scan;
	private static Cono cono;

	public static void main(String[] args) {
		
		 scan = new Scanner(System.in);
		 
		 
		 
		 System.out.println("ingresa el radio");
		 double radio = scan.nextDouble();
		 System.out.println("ingresa la altura");
		 double altura = scan.nextDouble();
		 
		 
		 cono = new Cono();
		 cono.setAltura(altura);
		 cono.setRadio(radio);
		 
		 cono.getVolumen();
		 
		 scan.close();
		
	}
	
}
