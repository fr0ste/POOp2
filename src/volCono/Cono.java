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

public class Cono {

	double altura;
	double radio;

	public void getVolumen() {

		System.out.println("el volumen del cono es: " + ((3.1416 / 3) * (this.radio * this.radio) * this.altura));

	}

	// getters & setters
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
