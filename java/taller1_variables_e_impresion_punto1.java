
 import java.io.*;

public class taller1_variables_e_impresion_punto1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellido;
		String nombre;
		// 1. Realizar un programa el cual solicite su nombre y apellidos.
		System.out.println("Por favor escriba su nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Por favor escriba su apellido");
		apellido = bufEntrada.readLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("Su nombre completo es: "+nombre+" "+apellido);
	}

}

