/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER1_VARIABLES_E_IMPRESION_PUNTO2.java."

import java.io.*;

public class taller1_variables_e_impresion_punto2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		int edad;
		double estatura;
		String nombre;
		System.out.println("Escriba su nombre ");
		nombre = bufEntrada.readLine();
		System.out.println("Escriba sus apellidos ");
		apellidos = bufEntrada.readLine();
		System.out.println("Cuantos años tiene? ");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Digite su estatura por favor ");
		estatura = Double.parseDouble(bufEntrada.readLine());
	}


}

