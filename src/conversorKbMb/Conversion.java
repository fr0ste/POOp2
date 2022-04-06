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

package conversorKbMb;

public class Conversion {

	private double kilo;
	private double mega;

	public double calcularKbMb() {

		return this.kilo * 0.001;

	}

	public double calcularMbKb() {

		return this.mega * 1000;

	}

	// getters & setters

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo = kilo;
	}

	public double getMega() {
		return mega;
	}

	public void setMega(double mega) {
		this.mega = mega;
	}

}
