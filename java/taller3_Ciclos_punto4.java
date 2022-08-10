/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO4.java."

import java.io.*;

public class taller3_ciclos_punto4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int m;
		// Se requiere un programa que pueda crear la tabla de multiplicar del número que el usuario indique por medio del ciclo Para; esta debe ser impresa del 1 al 10.
		// Ejemplo, si el usuario indica que desea crear la tabla del 5, entonces el resultado debería ser el siguiente:
		System.out.println("Por favor digite un numero del cual desea crear latabla de multiplicar.");
		a = Integer.parseInt(bufEntrada.readLine());
		for (m=1;m<=10;m++) {
			System.out.println(m+" X "+a+" = "+(m*a));
		}
	}


}

