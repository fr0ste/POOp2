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

package precioProducto;

public class Factura {

	private double baseImponible;
	private double cod;
	private double total;

	public double getIva() {

		return this.baseImponible * 0.1;

	}

	public double getPrecioConIva() {

		return this.getIva() + this.baseImponible;

	}

	public double getNoPro() {

		return 0;

	}

	public double getMitad() {

		return this.baseImponible / 2;

	}

	public double getMenos5() {

		return this.baseImponible - 5;

	}

	public double get5Porc() {

		return this.baseImponible * 0.05;

	}
	
	public double getDescuento(int opc) {
		
		
		
		switch (opc) {
		
		case 1:
			cod=this.getNoPro();
			return this.getNoPro();
		case 2:
			cod=this.getMitad();
			return this.getMitad();
		case 3:
			cod=this.getMenos5();
			return this.getMenos5();
		case 4:
			cod=this.get5Porc();
			return this.get5Porc();
		default:
			return -9999;
			
		
		
		}
		
		
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nbase imponible: ");
		sb.append(this.getBaseImponible());
		sb.append("\nIVA\n");
		sb.append(this.getIva());
		sb.append("\ncodigo promo");
		sb.append(this.cod);
		sb.append("\ntotal");
		this.total= this.baseImponible + this.getIva() - cod;
		sb.append(this.total);
		
		return sb.toString();
		
	}

	// getters & setters
	public double getBaseImponible() {
		return baseImponible;
	}

	public void setBaseImponible(double baseImponible) {
		this.baseImponible = baseImponible;
	}

}
