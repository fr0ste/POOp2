package factura;

public class Factura {

	
	private double base;
	
	public void getTotalFactura() {
		
		System.out.println("el total es " + ((this.base * .16)+base));
		
		
	}

	
	
	
	//getter & setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
	
	
}
