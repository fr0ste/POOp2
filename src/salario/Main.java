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

package salario;

import java.util.Scanner;

public class Main {

	private static Scanner scan;
	private static Salario salario;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("ingrese las horas trabajadas");
		int horasTrabajadas = scan.nextInt();

		salario = new Salario();

		salario.setHorasTrabajadas(horasTrabajadas);

		System.out.println("el total de horas es " + horasTrabajadas + "\npor lo que su salario es: "
				+ salario.getSalario(horasTrabajadas) + " euros");

	}

}
