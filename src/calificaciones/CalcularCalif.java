package calificaciones;

public class CalcularCalif {
	
	
	
	private float nota;
	
	
	public void calcularNota(float notaDeseada) {
		
		System.out.println("para tener un " + notaDeseada + "necesitas un " + (this.nota*0.6-notaDeseada*0.4) );
		
	}
	
	
	//getters & setters

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
	

}
