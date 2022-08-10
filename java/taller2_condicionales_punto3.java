/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO3.java."

import java.io.*;

public class taller2_condicionales_punto3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellidos;
		int edad;
		String nombre;
		// 3:Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. 
		// Si la persona es mayor o igual a 18 años, entonce se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad,
		// por lo tanto puede entrar a la fiesta. Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje:
		// [Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
		System.out.println("Hola! por favor escriba su nombre.");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor escriba sus apellidos.");
		apellidos = bufEntrada.readLine();
		System.out.println("Por favor digite su edad.");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		if (edad>17) {
			System.out.println(nombre+" "+apellidos+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.¡Bienvenido!");
		} else {
			System.out.println(nombre+" "+apellidos+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
		}
	}


}

