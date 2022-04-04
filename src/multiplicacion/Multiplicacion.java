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
 * Descripcion: multiplicación de dos numeros enteros 
 * 
 * 
 * 
 * 
 */

package multiplicacion;

public class Multiplicacion {

	private double a;
	private double b;
	private double result;

	public void multiplicar() {

		this.result = a * b;

	}

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

	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		sb.append(a + " * " + b + " = " + result);
		return sb.toString();

	}

}
