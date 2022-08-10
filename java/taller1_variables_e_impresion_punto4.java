/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER1_VARIABLES_E_IMPRESION_PUNTO4.java."

import java.io.*;

public class taller1_variables_e_impresion_punto4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre_ciudad;
		String nombre_pais;
		// 4:Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla 
		// el siguiente mensaje "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País].
		System.out.println("Por favor escriba el nombre de una ciudad capital ");
		nombre_ciudad = bufEntrada.readLine();
		System.out.println("Por favor escriba el nombre del pais que tiene como capital la ciudad mencionada anteriormente ");
		nombre_pais = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("La ciudad  "+(nombre_ciudad)+", es la capital del pais  "+(nombre_pais));
	}


}

