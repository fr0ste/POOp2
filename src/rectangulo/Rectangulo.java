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

package rectangulo;

public class Rectangulo {

	private double base;
	private double altura;

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {

		this.altura = altura;
		this.base = base;

	}

	// metodos

	public Double getArea() {

		return base * altura;

	}

	public void imprimirArea() {

		System.out.println("El area del rectangulo es: " + this.getArea());

	}

	// getters & setters
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
