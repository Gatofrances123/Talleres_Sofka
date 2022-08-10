/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "NUMEROS_PRIMOS.java."

import java.io.*;

public class numeros_primos {

	public static void main(String args[]) {
		int contador;
		int n;
		int num;
		int x;
		System.out.println("Ingresa un numero");
		n = 1000;
		num = 0;
		while (n>0) {
			num = num+1;
			x = 1;
			contador = 0;
			while (x<=num) {
				if (num%x==0) {
					contador = contador+1;
				}
				x = x+1;
			}
			if (contador==2) {
				System.out.println("El numero "+num+" Es primo");
				n = n-1;
			}
		}
	}


}

