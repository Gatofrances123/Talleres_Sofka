/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) {
		int columna;
		int contador;
		int fila;
		int matriz[][];
		matriz = new int[4][5];
		contador = 1;
		System.out.println("------------MATRIZ INICIAL --------");
		do {
			for (fila=0;fila<=3;fila++) {
				System.out.println("");
				for (columna=0;columna<=4;columna++) {
					matriz[fila][columna] = contador;
					if (contador<=9) {
						System.out.print(0+matriz[fila][columna]+"");
					} else {
						System.out.print(matriz[fila][columna]+"");
					}
					contador = contador+1;
				}
			}
		} while (contador<20);
		contador = 1;
		System.out.println("");
		System.out.println("--------MATRIZ CON CAMBIO-------------");
		do {
			for (fila=0;fila<=3;fila++) {
				if (fila==0 || fila==2) {
					System.out.println("");
					for (columna=0;columna<=4;columna++) {
						if (contador<=9) {
							System.out.print(0+matriz[fila][columna]+" ");
						} else {
							System.out.print(matriz[fila][columna]+" ");
						}
						contador = contador+1;
					}
					System.out.println("");
				}
				if (fila==1 || fila==3) {
					for (columna=4;columna>=0;columna--) {
						if (matriz[fila][columna]<=9) {
							System.out.print(0+matriz[fila][columna]+" ");
						} else {
							System.out.print(0+matriz[fila][columna]+" ");
						}
						contador = contador+1;
					}
				}
			}
		} while (contador<20);
	}


}

