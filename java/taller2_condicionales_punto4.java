/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO4.java."

import java.io.*;

public class taller2_condicionales_punto4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String alquilar;
		String alquilar1;
		String alquilar2;
		String alquilar3;
		String entregar;
		String entregar1;
		String entregar2;
		String entregar3;
		String nombrecompleto;
		String observacion;
		String observacion1;
		String observacion2;
		String observacion3;
		int opc;
		int opc1;
		int opc2;
		int opc3;
		// La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
		// Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar
		// daños u otra novedad sobre la película.
		entregar = "";
		entregar1 = "";
		entregar2 = "";
		entregar3 = "";
		observacion = "";
		observacion1 = "";
		observacion2 = "";
		observacion3 = "";
		alquilar = "no";
		alquilar1 = "";
		alquilar2 = "";
		alquilar3 = "";
		System.out.println("********* INGRESE EL NOMBRE DEL CLIENTE POR FAVOR *******************");
		nombrecompleto = bufEntrada.readLine();
		System.out.println("");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("");
		do {
			System.out.println("*********************   POR FAVOR ELIJA UNA OPCION    ***************");
			System.out.println("*********************      1. ALQUILAR PELICULA       ***************");
			System.out.println("*********************      2. CONSULTAR PELICULAS     ***************");
			System.out.println("*********************      3. DEVOLVER PELICULA      ***************");
			System.out.println("*********************      4. SALIR DEL SISTEMA       ***************");
			opc1 = Integer.parseInt(bufEntrada.readLine());
			System.out.println("");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("");
			switch (opc1) {
			case 1:
				System.out.println("*********************      ELIJA LA PELICULA          ***************");
				System.out.println("*********************      1. LA MONJA                ***************");
				System.out.println("*********************      2. SPIDER-MAN NO WAY HOME  ***************");
				System.out.println("*********************      3. EXODO                   ***************");
				System.out.println("*********************      4. LA CIUDAD PERDIDA       ***************");
				opc = Integer.parseInt(bufEntrada.readLine());
				System.out.println("");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("");
				switch (opc) {
				case 1:
					System.out.println("Desea alquilar la pelicula --> LA MONJA? digite si o no ");
					alquilar = bufEntrada.readLine();
					if (alquilar.equals("si") || alquilar.equals("Si") || alquilar.equals("SI")) {
						System.out.println("Sr@ "+nombrecompleto+" usted ha alquilado con exito la pelicula --> LA MONJA");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 2:
					System.out.println("Desea alquilar la pelicula --> SPIDER-MAN NO WAY HOME? digite si o no ");
					alquilar1 = bufEntrada.readLine();
					if (alquilar1.equals("si") || alquilar1.equals("Si") || alquilar1.equals("SI")) {
						System.out.println("Sr@ "+nombrecompleto+" usted ha alquilado con exito la pelicula --> SPIDER-MAN NO WAY HOME");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 3:
					System.out.println("Desea alquilar la pelicula --> EXODO? digite si o no ");
					alquilar2 = bufEntrada.readLine();
					if (alquilar2.equals("si") || alquilar2.equals("Si") || alquilar2.equals("SI")) {
						System.out.println("Sr@ "+nombrecompleto+" usted ha alquilado con exito la pelicula --> EXODO");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 4:
					System.out.println("Desea alquilar la pelicula --> LA CIUDAD PERDIDA? digite si o no ");
					alquilar3 = bufEntrada.readLine();
					if (alquilar3.equals("si") || alquilar3.equals("Si") || alquilar3.equals("SI")) {
						System.out.println("Sr@ "+nombrecompleto+" usted ha alquilado con exito la pelicula --> LA CIUDAD PERDIDA");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				default:
					System.out.println("Por favor seleccione una opcion valida para el sistema");
					System.out.println("");
					System.out.println("---------------------------------------------------------------------");
					System.out.println("");
				}
				break;
			case 2:
				System.out.println("*********************      LISTA DE PELICULAS           ***************");
				if (alquilar.equals("si") || alquilar.equals("SI") || alquilar.equals("Si")) {
					System.out.println("Pelicula ---> LA MONJA               no esta disponible");
				} else {
					System.out.println("Pelicula ---> LA MONJA               esta disponible");
				}
				if (alquilar1.equals("si") || alquilar1.equals("SI") || alquilar1.equals("Si")) {
					System.out.println("Pelicula ---> SPIDER-MAN NO WAY HOME no esta disponible");
				} else {
					System.out.println("Pelicula ---> SPIDER-MAN NO WAY HOME esta disponible");
				}
				if (alquilar2.equals("si") || alquilar2.equals("SI") || alquilar2.equals("Si")) {
					System.out.println("Pelicula ---> EXODO                  no esta disponible");
				} else {
					System.out.println("Pelicula ---> EXODO                  esta disponible");
				}
				if (alquilar3.equals("si") || alquilar3.equals("SI") || alquilar3.equals("Si")) {
					System.out.println("Pelicula ---> LA CIUDAD PERDIDA      no esta disponible");
				} else {
					System.out.println("Pelicula ---> LA CIUDAD PERDIDA      esta disponible");
				}
				System.out.println("");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("");
				break;
			case 3:
				System.out.println("*********************  CUAL PELICULA DESEA ENTREGAR   ***************");
				System.out.println("*********************      1. LA MONJA                ***************");
				System.out.println("*********************      2. SPIDER-MAN NO WAY HOME  ***************");
				System.out.println("*********************      3. EXODO                   ***************");
				System.out.println("*********************      4. LA CIUDAD PERDIDA       ***************");
				opc2 = Integer.parseInt(bufEntrada.readLine());
				System.out.println("");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("");
				switch (opc2) {
				case 1:
					System.out.println("*********************      DEVOLVER PELICULA           ***************");
					if (alquilar.equals("si") || alquilar.equals("SI") || alquilar.equals("Si")) {
						System.out.println("Pelicula ---> LA MONJA desea entregarla? si o no");
						entregar = bufEntrada.readLine();
						if (entregar.equals("si") || entregar.equals("Si") || entregar.equals("SI")) {
							System.out.println("Por favor de su comentario.");
							observacion = bufEntrada.readLine();
							System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
							System.out.println(""); // no hay forma directa de borrar la consola en Java
							System.out.println("Sr@ "+nombrecompleto+" usted ha regresado la pelicula --> LA MONJA con exito");
							System.out.println("Observacion "+observacion);
							System.out.println("");
							System.out.println("---------------------------------------------------------------------");
							System.out.println("");
						}
					} else {
						System.out.println("Pelicula ---> LA MONJA no ha sido alquilada, por ello no se puede regresar.");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 2:
					System.out.println("*********************      DEVOLVER PELICULA           ***************");
					if (alquilar1.equals("si") || alquilar1.equals("SI") || alquilar1.equals("Si")) {
						System.out.println("Pelicula ---> SPIDER-MAN NO WAY HOME desea entregarla? si o no");
						entregar1 = bufEntrada.readLine();
						if (entregar1.equals("si") || entregar1.equals("Si") || entregar1.equals("SI")) {
							System.out.println("Por favor de su comentario.");
							observacion1 = bufEntrada.readLine();
							System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
							System.out.println(""); // no hay forma directa de borrar la consola en Java
							System.out.println("Sr@ "+nombrecompleto+" usted ha regresado la pelicula --> SPIDER-MAN NO WAY HOME con exito");
							System.out.println("Observacion "+observacion1);
							System.out.println("");
							System.out.println("---------------------------------------------------------------------");
							System.out.println("");
						}
					} else {
						System.out.println("Pelicula ---> SPIDER-MAN NO WAY HOME no ha sido alquilada, por ello no se puede regresar.");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 3:
					System.out.println("*********************      DEVOLVER PELICULA           ***************");
					if (alquilar2.equals("si") || alquilar2.equals("SI") || alquilar2.equals("Si")) {
						System.out.println("Pelicula ---> EXODO desea entregarla? si o no");
						entregar2 = bufEntrada.readLine();
						if (entregar2.equals("si") || entregar2.equals("Si") || entregar2.equals("SI")) {
							System.out.println("Por favor de su comentario.");
							observacion2 = bufEntrada.readLine();
							System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
							System.out.println(""); // no hay forma directa de borrar la consola en Java
							System.out.println("Sr@ "+nombrecompleto+" usted ha regresado la pelicula --> EXODO con exito");
							System.out.println("Observacion "+observacion2);
							System.out.println("");
							System.out.println("---------------------------------------------------------------------");
							System.out.println("");
						}
					} else {
						System.out.println("Pelicula ---> EXODO no ha sido alquilada, por ello no se puede regresar.");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				case 4:
					System.out.println("*********************      DEVOLVER PELICULA           ***************");
					if (alquilar3.equals("si") || alquilar3.equals("SI") || alquilar3.equals("Si")) {
						System.out.println("Pelicula ---> LA CIUDAD PERDIDA desea entregarla? si o no");
						entregar3 = bufEntrada.readLine();
						if (entregar3.equals("si") || entregar3.equals("Si") || entregar3.equals("SI")) {
							System.out.println("Por favor de su comentario.");
							observacion3 = bufEntrada.readLine();
							System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
							System.out.println(""); // no hay forma directa de borrar la consola en Java
							System.out.println("Sr@ "+nombrecompleto+" usted ha regresado la pelicula --> LA CIUDAD PERDIDA con exito");
							System.out.println("Observacion "+observacion3);
							System.out.println("");
							System.out.println("---------------------------------------------------------------------");
							System.out.println("");
						}
					} else {
						System.out.println("Pelicula ---> LA CIUDAD PERDIDA no ha sido alquilada, por ello no se puede regresar.");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------");
						System.out.println("");
					}
					break;
				default:
					System.out.println("Seleccione un opcion valida.");
				}
				break;
			default:
				System.out.println("Usted ha seleccionado una opcion que no esta disponible..");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
			}
		} while (opc1!=4);
	}


}

