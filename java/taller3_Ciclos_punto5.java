/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO5.java."

import java.io.*;

public class taller3_ciclos_punto5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre;
		int opcion;
		String saludo;
		// Utilizando el ciclo que usted desee, crear un menú de ejecución infinita hasta que el usuario desee terminar dicho ciclo.
		nombre = "";
		do {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("Por favor eliga una opcion Menu.");
			System.out.println("1. Guardar nombre.");
			System.out.println("2. Saludar.");
			System.out.println("3. Salir del sistema.");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println("Como te llamas?.");
				nombre = bufEntrada.readLine();
				break;
			case 2:
				if (!nombre.equals("")) {
					System.out.println("Hola "+nombre);
					System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				} else {
					System.out.println("Para saludarte, primero debes guardar tu nombre.");
					System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				}
				break;
			case 3:
				System.out.println("Hasta luego, gracias por visitarnos.");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				break;
			}
		} while (opcion!=3);
	}


}

