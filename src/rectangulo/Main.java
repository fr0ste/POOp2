package rectangulo;

import java.util.Scanner;

public class Main{
	
	
	private static Scanner scan;
	private static Rectangulo rectangulo;
	

	public static void main(String[] args) {
		
		 scan = new Scanner(System.in);
		 
		 
		 
		 System.out.println("ingresa la base");
		 double base = scan.nextDouble();
		 System.out.println("ingresa la altura");
		 double altura = scan.nextDouble();
		 
		 
		 rectangulo = new Rectangulo();
		 rectangulo.setAltura(altura);
		 rectangulo.setBase(base);
		 
		 rectangulo.imprimirArea();
		 
		 scan.close();
		
	}

}
