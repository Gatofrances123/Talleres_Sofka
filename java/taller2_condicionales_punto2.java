/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO2.java."

import java.io.*;

public class taller2_condicionales_punto2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		// 2: Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, deberá mostrar en pantalla:
		// Usted aún es un niño(a).
		System.out.println("Hola! por favor digite su edad.");
		edad = Integer.parseInt(bufEntrada.readLine());
		if (edad<18) {
			System.out.println("Usted aún es un niño(a).");
		} else {
			System.out.println("Usted ya no es un niño(a).");
		}
	}


}

