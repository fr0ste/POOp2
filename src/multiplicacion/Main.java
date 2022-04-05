/**************
 * 
 * Autor: Joel Francisco Figueroa Martinez
 * 
 * 
 * Fecha de creacion: 04/04/2022
 * 
 * 
 * Fecha de modificacion:
 * 
 * 
 * Descripcion: main para multiplicación de dos numeros enteros 
 * 
 * 
 * 
 */


package multiplicacion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Multiplicacion m = new Multiplicacion();
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("ingrese la primera cifra");
		m.setA(entrada.nextDouble());
		System.out.println("ingrese la segunda cifra");
		m.setB(entrada.nextDouble());
		
		m.multiplicar();
		
		System.out.println(m);
		
		entrada.close();
		

	}

}
