/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER1_VARIABLES_E_IMPRESION_PUNTO5.java."

import java.io.*;

public class taller1_variables_e_impresion_punto5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String edad_mascota;
		String nombre_dueno;
		String nombre_macota;
		String raza;
		String tipo_mascota;
		// 5:Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo.
		// Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) 
		// [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).
		System.out.println("Por favor escriba el nombre de la mascota.");
		nombre_macota = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba el tipo de mascota (ejemplo: Ave, Canino, Reptil, etc).  ");
		tipo_mascota = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba la raza de la mascota.");
		raza = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor la edad de la mascota.");
		edad_mascota = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Por favor escriba el nombre y apellidos del dueño de la mascota.  ");
		nombre_dueno = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println((nombre_macota)+" es un(a) "+(tipo_mascota)+", de raza  "+(raza)+" que tiene "+(edad_mascota)+" de edad y "+(nombre_dueno)+" es actualmente su dueño(a).");
	}


}

