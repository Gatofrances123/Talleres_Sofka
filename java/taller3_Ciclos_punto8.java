/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO8.java."

import java.io.*;

public class taller3_ciclos_punto8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String curso1;
		String curso2;
		String curso3;
		String curso4;
		String curso5;
		String curso6;
		String curso7;
		String curso8;
		String i;
		String n;
		String nomuser1;
		String nomuser2;
		String nomuser3;
		String nomuser4;
		String nomuser5;
		String nomuser6;
		String nomuser7;
		String nomuser8;
		int opcion;
		String r1;
		String r2;
		String r3;
		String r4;
		String r5;
		String r6;
		String r7;
		String r8;
		// 8. La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística y establecer quienes lo han
		// aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir registrar su ingreso al curso, consultar usuarios que hayan
		// presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). Recuerde que el sistema debe terminar cuando el
		// usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.    
		nomuser1 = "";
		nomuser2 = "";
		nomuser3 = "";
		nomuser4 = "";
		nomuser5 = "";
		nomuser6 = "";
		nomuser7 = "";
		nomuser8 = "";
		i = "";
		r1 = "";
		r1 = "";
		r2 = "";
		r3 = "";
		r4 = "";
		r5 = "";
		r6 = "";
		r7 = "";
		r8 = "";
		curso1 = "";
		curso2 = "";
		curso3 = "";
		curso4 = "";
		curso5 = "";
		curso6 = "";
		curso7 = "";
		curso8 = "";
		while (!i.equals("3")) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Por favor seleccione una opcion ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.) Ingresar nombre del aprendiz al sistema ");
			System.out.println("2.) Consultar usuarios y sus resultados");
			System.out.println("3.) Salir ------>");
			i = bufEntrada.readLine();
			if (i.equals("1")) {
				System.out.println("------------------------------------------------");
				System.out.println("Ten encuenta que en esta aplicacion solo podras ingresar un total de 8 usuarios,");
				System.out.println(" digita del 1 hasta el 8 para segun sea el usuario a guardar  ");
				System.out.println("------------------------------------------------");
				opcion = Integer.parseInt(bufEntrada.readLine());
				switch (opcion) {
				case 1:
					System.out.println("Digite el nombre completo del usuario 1");
					nomuser1 = bufEntrada.readLine();
					System.out.println(nomuser1+" Ya presento el examen? digite si, o no");
					curso1 = bufEntrada.readLine();
					if (curso1.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r1 = bufEntrada.readLine();
					}
					break;
				case 2:
					System.out.println("Digite el nombre completo del usuario 2");
					nomuser2 = bufEntrada.readLine();
					System.out.println(nomuser2+" Ya presento el examen? digite si, o no");
					curso2 = bufEntrada.readLine();
					if (curso2.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r2 = bufEntrada.readLine();
					}
					break;
				case 3:
					System.out.println("Digite el nombre completo del usuario 3");
					nomuser3 = bufEntrada.readLine();
					System.out.println(nomuser3+" Ya presento el examen? digite si, o no");
					curso3 = bufEntrada.readLine();
					if (curso3.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r3 = bufEntrada.readLine();
					}
					break;
				case 4:
					System.out.println("Digite el nombre completo del usuario 4");
					nomuser4 = bufEntrada.readLine();
					System.out.println(nomuser4+" Ya presento el examen? digite si, o no");
					curso4 = bufEntrada.readLine();
					if (curso4.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r4 = bufEntrada.readLine();
					}
					break;
				case 5:
					System.out.println("Digite el nombre completo del usuario 1");
					nomuser5 = bufEntrada.readLine();
					System.out.println(nomuser5+" Ya presento el examen? digite si, o no");
					curso5 = bufEntrada.readLine();
					if (curso5.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r5 = bufEntrada.readLine();
					}
					break;
				case 6:
					System.out.println("Digite el nombre completo del usuario 6");
					nomuser6 = bufEntrada.readLine();
					System.out.println(nomuser6+" Ya presento el examen? digite si, o no");
					curso6 = bufEntrada.readLine();
					if (curso6.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r6 = bufEntrada.readLine();
					}
					break;
				case 7:
					System.out.println("Digite el nombre completo del usuario 8");
					nomuser7 = bufEntrada.readLine();
					System.out.println(nomuser7+" Ya presento el examen? digite si, o no");
					curso7 = bufEntrada.readLine();
					if (curso7.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r7 = bufEntrada.readLine();
					}
					break;
				case 8:
					System.out.println("Digite el nombre completo del usuario 8");
					nomuser8 = bufEntrada.readLine();
					System.out.println(nomuser8+" Ya presento el examen? digite si, o no");
					curso8 = bufEntrada.readLine();
					if (curso8.equals("si")) {
						System.out.println("Que resultado octuvo? Aprobo o Reprobo?");
						r8 = bufEntrada.readLine();
					}
					break;
				default:
					System.out.println("La opcion que elegistes no esta disponible");
				}
			}
			if (i.equals("2")) {
				if (curso1.equals("si")) {
					System.out.println("-----------------------------------------------------------------------");
					System.out.println("Señor(a) "+nomuser1+"  "+r1+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso2.equals("si")) {
					System.out.println("Señor(a) "+nomuser2+"  "+r2+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso3.equals("si")) {
					System.out.println("Señor(a) "+nomuser3+"  "+r3+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso4.equals("si")) {
					System.out.println("Señor(a) "+nomuser4+"  "+r4+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso5.equals("si")) {
					System.out.println("Señor(a) "+nomuser5+"  "+r5+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso6.equals("si")) {
					System.out.println("Señor(a) "+nomuser6+"  "+r6+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso6.equals("si")) {
					System.out.println("Señor(a) "+nomuser7+"  "+r7+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
				if (curso8.equals("si")) {
					System.out.println("Señor(a) "+nomuser8+" "+r8+" el examen");
					System.out.println("Usted puede continuar Tramite de licencia ");
					System.out.println("-----------------------------------------------------------------------");
				}
			}
			if (i.equals("3")) {
				System.out.println("Gracias por usar esta aplicacion");
			}
		}
	}


}

