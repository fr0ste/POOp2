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

public class Triangulo {

	private double base;
	private double altura;
	
	
	
	
	public Double getArea() {
		
		return ((base * altura)/2);
		
		
	}
	
	public void imprimirArea() {
		
		System.out.println("El area del triangulo es: " + this.getArea());
		
	}

	
	//getters & setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
	
}
