/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER1_VARIABLES_E_IMPRESION_PUNTO3.java."

import java.io.*;

public class taller1_variables_e_impresion_punto3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos_hijo;
		String apellidos_madre;
		String apellidos_padre;
		String nomb_hijo;
		String nomb_madre;
		String nomb_padre;
		// 3:Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. 
		// Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre]. 
		System.out.println("Por favor escriba su nombre ");
		nomb_hijo = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba sus apellidos ");
		apellidos_hijo = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba el nombre su padre ");
		nomb_padre = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba los apellidos de su padre ");
		apellidos_padre = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba el nombre de su madre  ");
		nomb_madre = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba los apellidos madre ");
		apellidos_madre = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Yo, "+(nomb_hijo)+" "+(apellidos_hijo)+", soy hijo de "+(nomb_madre)+" "+(apellidos_madre)+" y "+(nomb_padre)+" "+(apellidos_padre));
	}


}

