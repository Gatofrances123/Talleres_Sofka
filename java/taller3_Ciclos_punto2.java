/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO2.java."

import java.io.*;

public class taller3_ciclos_punto2 {

	public static void main(String args[]) {
		int a;
		int b;
		int c;
		c = 10;
		a = 1;
		while (a<=c) {
			b = 0;
			while (b<=(c-a)) {
				System.out.print(" ");
				b = b+1;
			}
			b = 1;
			while (b<=a) {
				System.out.print("*");
				b = b+1;
			}
			a = a+1;
			System.out.println("");
		}
	}


}

