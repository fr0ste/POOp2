/**************
 * 
 * Autor: Joel Francisco Figueroa Martinez
 * 
 * 
 * Fecha de creacion: 05/04/2022
 * 
 * 
 * Fecha de modificacion:
 * 
 * 
 * Descripcion: ejercicio 4 
 * 
 * 
 */

package ejercicio4;

public class Ejercicio4 {

	private double a;
	private double b;
	
	

	public double sumar() {

		return a + b;

	}
	
	public double restar() {

		return a - b;

	}
	
	public double multiplicar() {

		return a * b;

	}
	
	public double dividir() {

		return a / b;

	}
	
	
	public void getResultados() {
		
		System.out.println("la suma de " + a + "+" + b + "=" + this.sumar());
		System.out.println("la resta de " + a + "-" + b + "=" + this.restar());
		System.out.println("la multiplicacion de " + a + "*" + b + "=" + this.multiplicar());
		System.out.println("la divicion de " + a + "/" + b + "=" + this.dividir());
		
	}

	
	
	
	//getters & setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	
	

}
