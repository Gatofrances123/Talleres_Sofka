/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO6.java."

import java.io.*;

public class taller2_condicionales_punto6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String aux;
		String aux2;
		int general;
		String hora;
		String horas;
		int llantas;
		int motor;
		int otros;
		int parachoques;
		String placamoto;
		String usuario;
		// El taller de motos "El Maquinista" recibe motocicletas de alto cilindraje para realizar las respectivas revisiones 
		// y requiere una aplicación que le permita registrar los servicios generados a sus clientes. Para cada motocicleta se 
		// debe tener registro del ingreso al taller y las observaciones por parte del cliente. También debe existir registro de
		// salida del taller con las novedades y otra de arreglos hechos por el mecánico en caso de que serequiera inventariar 
		// cambios repuestos en la motocicleta al entregarla.
		System.out.println("----------------------------------------:");
		System.out.println("_____________Cuestionario________________");
		System.out.println("----------------------------------------:");
		System.out.println("Nombre Usuario:");
		usuario = bufEntrada.readLine();
		System.out.println("Placa Moto:");
		placamoto = bufEntrada.readLine();
		System.out.println("Hora de entrada:");
		hora = bufEntrada.readLine();
		System.out.println("Revision Geneal Si = 1, No = 0");
		general = Integer.parseInt(bufEntrada.readLine());
		System.out.println("2. Cambir LLantas Si = 1, No = 0");
		llantas = Integer.parseInt(bufEntrada.readLine());
		System.out.println("3. Revision Motor Si = 1, No = 0");
		motor = Integer.parseInt(bufEntrada.readLine());
		System.out.println("4. Arreglar Parachoques Si = 1, No = 0");
		parachoques = Integer.parseInt(bufEntrada.readLine());
		System.out.println("5. Otros Si = 1, No = 0");
		otros = Integer.parseInt(bufEntrada.readLine());
		aux = "";
		if (general==1) {
			aux = aux.concat("Revision General: SI, ");
		} else {
			aux = aux.concat("Revision General: NO, ");
		}
		if (llantas==1) {
			aux = aux.concat("Cambiar Llantas: SI, ");
		} else {
			aux = aux.concat("Cambiar Llantas: NO, ");
		}
		if (motor==1) {
			aux = aux.concat("Revisar Motor: SI, ");
		} else {
			aux = aux.concat("Revisar Motor: NO, ");
		}
		if (parachoques==1) {
			aux = aux.concat("Arreglar Parachoques: SI, ");
		} else {
			aux = aux.concat("Arreglar Parachoques: NO, ");
		}
		if (otros==1) {
			System.out.println("Descripcion Otros");
			aux2 = bufEntrada.readLine();
			aux = aux.concat("Otros:").concat(aux2);
		} else {
			aux = aux.concat("Otros: NO, ");
		}
		System.out.println("Hora de salida:");
		horas = bufEntrada.readLine();
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------------");
		System.out.println("Informacion de la motocicleta");
		System.out.println("Usuario: ".concat(usuario));
		System.out.println("Placa: ".concat(placamoto));
		System.out.println("Hora entrada: ".concat(hora));
		System.out.println("Hora Salida: ".concat(horas));
		System.out.println(aux);
	}


}

