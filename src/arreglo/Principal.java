package arreglo;

public class Principal {

	private static int x;
	private static int y;
	private static int array[] = new int[3];
	private static byte bytepuntos[] = { 1, 2, 3 };
	private static short shortpuntos[] = { 1, 2, 3 };
	private static int intpuntos[] = { 1, 2, 3 };
	private static float floatpuntos[] = { (float) 1.6, (float) 2.1, (float) 3.2 };

	// matrices
	private static byte matriz1[][] = { { 1, 2 }, { 3, 4 } };
	private static short matriz2[][] = { { 5, 6 }, { 7, 8 } };
	private static int matriz3[][] = new int[2][2];

	public static void main(String[] args) {

		x = 5;
		y = 10;
		int mult = 0;
		int i, j, k;
		array[0] = ++x;
		array[1] = y / x;
		array[2] = ++y;

		System.out.println(array[2]);

		for (i = 0; i < 3; i++) {

			System.out.println("byte-short-int-float-");
			System.out.println(bytepuntos[i] + "--" + shortpuntos[i] + "--" + intpuntos[i] + "--" + floatpuntos[i]);

		}

		// suma de matrices

		for (i = 0; i < matriz3.length; i++) {

			for (j = 0; j < matriz3[i].length; j++) {

				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

			}

		}

		// impresion

		System.out.println("\nsuma de matrices:");

		for (i = 0; i < 2; i++) {

			for (j = 0; j < 2; j++) {

				System.out.print("[" + matriz3[i][j] + "]");

			}

			System.out.print("\n");

		}

		// multiplicacion
		System.out.println();

		for (i = 0; i < 2; i++) {

			for (j = 0; j < 2; j++) {

				for (k = 0; k < 2; k++) {

					mult += matriz1[i][k] * matriz2[k][j];

				}

				matriz3[i][j] = mult;
				mult = 0;
			}

		}

		// impresión
		System.out.println("multiplicacion de matrices:");

		for (i = 0; i < 2; i++) {

			for (j = 0; j < 2; j++) {

				System.out.print("[" + matriz3[i][j] + "]");

			}

			System.out.print("\n");

		}

	}

}
