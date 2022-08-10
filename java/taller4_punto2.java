/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;

public class sin_titulo {

	public static void main(String args[]) {
		int c;
		int i;
		int num;
		boolean repetido;
		for (i=0;i<=20;i++) {
			num = 1+Math.floor(Math.random()*100);
			if (num%2==0) {
				System.out.println(" es un numero par");
				System.out.println(num);
			} else {
				System.out.println("no es un numero par");
				System.out.println(num);
			}
		}
	}


}

