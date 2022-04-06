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

package ejercicio4;

import java.util.Scanner;

public class Main {

	public static Scanner entrada;
	public static Ejercicio4 operacion;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		operacion = new Ejercicio4();
		
		System.out.println("ingrese la primera cifra");
		operacion.setA(entrada.nextDouble());
		System.out.println("ingrese la segunda cifra");
		operacion.setB(entrada.nextDouble());
		
		
		operacion.getResultados();
		
		

	}

}
