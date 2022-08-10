/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PUNTO_5.java."

import java.io.*;

public class punto_5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cifrascinco[][];
		int columnas;
		int filas;
		int multiplo1;
		int multiplo2;
		double mutiplo1;
		int numeroguia;
		cifrascinco = new int[11][11];
		multiplo1 = 1;
		multiplo2 = 1;
		System.out.println("Columnas");
		for (filas=0;filas<=10;filas++) {
			for (columnas=0;columnas<=10;columnas++) {
				if (columnas==0) {
					System.out.println(""+filas-1+" ");
				} else {
					if (filas>=0 && filas<=9) {
						if (filas==0) {
							if (columnas==1) {
								System.out.print(" "+columnas-1+" ");
							} else {
								System.out.print(""+columnas-1+""+);
							}
						} else {
							System.out.print("  "+columnas+"x"+filas+" ");
						}
					} else {
						System.out.print("  "+columnas+"x"+filas+" ");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("¿Cual resultado le gustaria conocer? seleccione una columna");
		multiplo1 = Integer.parseInt(bufEntrada.readLine());
		while (multiplo1>=10) {
			System.out.println("Numero no valido , Selecciones una columna");
			multiplo1 = Integer.parseInt(bufEntrada.readLine());
		}
		System.out.println("Seleccione una fila");
		multiplo2 = Integer.parseInt(bufEntrada.readLine());
		while (multiplo2>=10) {
			System.out.println("Numero no valido ,Seleccione una fila");
			multiplo2 = Integer.parseInt(bufEntrada.readLine());
		}
		System.out.println("a");
		for (filas=1;filas<=10;filas++) {
			for (columnas=1;columnas<=10;columnas++) {
				cifrascinco[10][10] = (filas*columnas);
				System.out.print(cifrascinco[10][10]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("el numero que ha escogido es"+(mutiplo1+1)*(multiplo2+1));
	}


}

