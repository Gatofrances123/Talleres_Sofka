/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO6.java."

import java.io.*;

public class taller3_ciclos_punto6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String confi;
		String consultar;
		String eliminar;
		String guardar;
		String guardar1;
		String guardar2;
		String i;
		String nombre;
		String nombre1;
		String nombre2;
		int opc;
		int opc1;
		int opc2;
		String org;
		String org1;
		String org2;
		String tel;
		String tel1;
		String tel2;
		// Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo. Para ello cada contacto debe contener nombre 
		// completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos verificando que el número no esté almacenado, buscar contactos almacenados y eliminar 
		// contactos si el usuario lo requiere. Recuerde que el sistema debe terminar cuando el usuario así lo indique.
		nombre = "";
		nombre1 = "";
		nombre2 = "";
		tel = "";
		tel1 = "";
		tel2 = "";
		org = "";
		org1 = "";
		org2 = "";
		i = "";
		consultar = "";
		eliminar = "";
		confi = "";
		while (!i.equals("4")) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Por favor seleccione una opcion ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.) Ingresar Datos al sistema ");
			System.out.println("2.) Consultar");
			System.out.println("3.) Eliminar ");
			System.out.println("4.) Salir ------>");
			i = bufEntrada.readLine();
			if (i.equals("1")) {
				System.out.println("------------------------------------------------");
				System.out.println("Ten encuenta que en esta ajenda solo podras ingresar un total de 3 usuarios,");
				System.out.println(" digita del 1, 2 ó 3 segun sea el cliente a guardar  ");
				System.out.println("------------------------------------------------");
				opc = Integer.parseInt(bufEntrada.readLine());
				switch (opc) {
				case 1:
					System.out.println("Digite el nombre completo del usuario N°1");
					nombre = bufEntrada.readLine();
					System.out.println("Por favor digite el nombre de la organizacion");
					org = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario N°1");
					tel = bufEntrada.readLine();
					if (!tel.equals(tel1)&!tel.equals(tel2)) {
						System.out.println("Ingresado al sistema con exito");
					} else {
						System.out.println("Este numero de contacto ya existe en la ajenda de registro");
						nombre = "";
						org = "";
						tel = "";
						System.out.println("No se guardaran datos, intente de nuevo por favor."+nombre+org+tel);
					}
					break;
				case 2:
					System.out.println("Digite el nombre completo del usuario N°2");
					nombre1 = bufEntrada.readLine();
					System.out.println("Por favor digite el nombre de la organizacion");
					org1 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario N°2");
					tel1 = bufEntrada.readLine();
					if (!tel1.equals(tel)&!tel1.equals(tel2)) {
						System.out.println("Ingresado al sistema con exito");
					} else {
						System.out.println("Este numero de contacto ya existe en la ajenda de registro.");
						nombre1 = "";
						org1 = "";
						tel1 = "";
						System.out.println("No se guardaran datos, intente de nuevo por favor."+nombre1+org1+tel1);
					}
					break;
				case 3:
					System.out.println("Digite el nombre completo del usuario N°3");
					nombre2 = bufEntrada.readLine();
					System.out.println("Por favor digite el nombre de la organizacion");
					org2 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario N°3");
					tel2 = bufEntrada.readLine();
					if (!tel2.equals(tel1)&!tel2.equals(tel)) {
						System.out.println("Ingresado al sistema con exito");
					} else {
						System.out.println("Este numero de contacto ya existe en la ajenda de registro.");
						nombre2 = "";
						org2 = "";
						tel2 = "";
						System.out.println("No se guardaran datos, intente de nuevo por favor."+nombre2+org2+tel2);
					}
					break;
				default:
					System.out.println("La opcion que elegistes no esta disponible");
				}
			}
			if (i.equals("2")) {
				System.out.println("Desea ver los contactos de la ajenda ? si o no?.");
				consultar = bufEntrada.readLine();
				if (consultar.equals("si") || consultar.equals("SI") || consultar.equals("Si")) {
					System.out.println("");
					System.out.println("********** Lista de contactos   ********************");
					System.out.println("");
					System.out.println("**Nombre->  "+nombre+"   **Organizacion ->  "+org+" **CELULAR ->  "+tel);
					System.out.println("**Nombre->  "+nombre1+"   **Organizacion ->  "+org1+" **CELULAR ->  "+tel1);
					System.out.println("**Nombre->  "+nombre2+"   **Organizacion ->  "+org2+" **CELULAR ->  "+tel2);
				}
			}
			if (i.equals("3")) {
				System.out.println("Por favor digite el numero del contacto a eliminar");
				eliminar = bufEntrada.readLine();
				if (eliminar.equals(tel)) {
					tel = "";
					nombre = "";
					org = "";
					System.out.println(tel+nombre+org);
					System.out.println("El contacto ha sido eliminado.");
				} else {
					if (eliminar.equals(tel1)) {
						tel1 = "";
						nombre1 = "";
						org1 = "";
						System.out.println(tel1+nombre1+org1);
						System.out.println("El contacto ha sido eliminado.");
					} else {
						if (eliminar.equals(tel2)) {
							tel2 = "";
							nombre2 = "";
							org2 = "";
							System.out.println(tel2+nombre2+org2);
							System.out.println("El contacto ha sido eliminado.");
						} else {
							System.out.println("El dato ingresado no existe en la ajenda de registro.");
						}
					}
				}
			}
			if (i.equals("4")) {
				System.out.println("Gracias por usar esta aplicacion");
			}
		}
	}


}

