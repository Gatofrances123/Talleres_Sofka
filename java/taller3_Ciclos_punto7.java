/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER3_CICLOS_PUNTO7.java."

import java.io.*;

public class taller3_ciclos_punto7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String cliente1;
		String cliente2;
		String cliente3;
		String cliente4;
		String cliente5;
		String i;
		String ingresar1;
		String ingresar2;
		String ingresar3;
		String ingresar4;
		String ingresar5;
		String marca1;
		String marca2;
		String marca3;
		String marca4;
		String marca5;
		int opcion;
		String placa;
		String placa1;
		String placa2;
		String placa3;
		String placa4;
		String placa5;
		String r1;
		String r2;
		String r3;
		String r4;
		String r5;
		String tel1;
		String tel2;
		String tel3;
		String tel4;
		String tel5;
		// 7. El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere una aplicación que permita registrar los vehículos que se
		// cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y los datos del cliente como son nombre completo y número de teléfono. 
		// Para cada vehículo se debe permitir la opción de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. Recuerde que
		// el sistema debe terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
		placa1 = "";
		placa2 = "";
		placa3 = "";
		placa4 = "";
		placa5 = "";
		marca1 = "";
		marca2 = "";
		marca3 = "";
		marca4 = "";
		marca5 = "";
		ingresar1 = "";
		ingresar2 = "";
		ingresar3 = "";
		ingresar4 = "";
		ingresar5 = "";
		i = "";
		tel1 = "";
		tel5 = "";
		tel2 = "";
		tel3 = "";
		tel4 = "";
		cliente1 = "";
		cliente2 = "";
		cliente3 = "";
		cliente4 = "";
		cliente5 = "";
		placa = "";
		while (!i.equals("4")) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Por favor seleccione una opcion ");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.) Ingresar Datos al sistema ");
			System.out.println("2.) Consultar y dar salida");
			System.out.println("3.) Consultar vehiculos que estan en el parqueadero ");
			System.out.println("4.) Salir ------>");
			i = bufEntrada.readLine();
			if (i.equals("1")) {
				System.out.println("------------------------------------------------");
				System.out.println("Ten encuenta que en esta aplicacion solo podras ingresar un total de 5 usuarios,");
				System.out.println(" digita del 1 hasta el 5 para segun sea el cliente a guardar  ");
				System.out.println("------------------------------------------------");
				opcion = Integer.parseInt(bufEntrada.readLine());
				switch (opcion) {
				case 1:
					System.out.println("Digite el nombre completo del usuario 1");
					cliente1 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario 1");
					tel1 = bufEntrada.readLine();
					System.out.println("Por favor digite la placa del vehiculo");
					placa1 = bufEntrada.readLine();
					System.out.println("Por favor digite la marca del vehiculo");
					marca1 = bufEntrada.readLine();
					System.out.println("Desea ingresar el vehiculo? digite si o no");
					ingresar1 = bufEntrada.readLine();
					if (ingresar1.equals("si") || ingresar1.equals("SI")) {
						System.out.println("Ingresado al sistema con exito");
					}
					break;
				case 2:
					System.out.println("Digite el nombre completo del usuario 2");
					cliente2 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario 2");
					tel2 = bufEntrada.readLine();
					System.out.println("Por favor digite la placa del vehiculo");
					placa2 = bufEntrada.readLine();
					System.out.println("Por favor digite la marca del vehiculo");
					marca2 = bufEntrada.readLine();
					System.out.println("Desea ingresar el vehiculo? digite si o no");
					ingresar2 = bufEntrada.readLine();
					if (ingresar2.equals("si") || ingresar2.equals("SI")) {
						System.out.println("Ingresado al sistema con exito");
					}
					break;
				case 3:
					System.out.println("Digite el nombre completo del usuario 3");
					cliente3 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario 3");
					tel3 = bufEntrada.readLine();
					System.out.println("Por favor digite la placa del vehiculo");
					placa3 = bufEntrada.readLine();
					System.out.println("Por favor digite la marca del vehiculo");
					marca3 = bufEntrada.readLine();
					System.out.println("Desea ingresar el vehiculo? digite si o no");
					ingresar3 = bufEntrada.readLine();
					if (ingresar3.equals("si") || ingresar3.equals("SI")) {
						System.out.println("Ingresado al sistema con exito");
					}
					break;
				case 4:
					System.out.println("Digite el nombre completo del usuario 4");
					cliente4 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario 4");
					tel4 = bufEntrada.readLine();
					System.out.println("Por favor digite la placa del vehiculo");
					placa4 = bufEntrada.readLine();
					System.out.println("Por favor digite la marca del vehiculo");
					marca4 = bufEntrada.readLine();
					System.out.println("Desea ingresar el vehiculo? digite si o no");
					ingresar4 = bufEntrada.readLine();
					if (ingresar4.equals("si") || ingresar4.equals("SI")) {
						System.out.println("Ingresado al sistema con exito");
					}
					break;
				case 5:
					System.out.println("Digite el nombre completo del usuario 5");
					cliente5 = bufEntrada.readLine();
					System.out.println("Digite el telefono del usuario 5");
					tel5 = bufEntrada.readLine();
					System.out.println("Por favor digite la placa del vehiculo");
					placa5 = bufEntrada.readLine();
					System.out.println("Por favor digite la marca del vehiculo");
					marca5 = bufEntrada.readLine();
					System.out.println("Desea ingresar el vehiculo? digite si o no");
					ingresar5 = bufEntrada.readLine();
					if (ingresar5.equals("si") || ingresar5.equals("SI")) {
						System.out.println("Ingresado al sistema con exito");
					}
					break;
				default:
					System.out.println("La opcion que elegistes no esta disponible");
				}
			}
			if (i.equals("2")) {
				if (ingresar1.equals("si") || ingresar1.equals("SI")) {
					System.out.println("-----------------------Datos-------------------------------------------");
					System.out.println("Cliente "+cliente1+", Telefono "+tel1);
					System.out.println("El vehiculo de placas "+placa1+", marca "+marca1);
					System.out.println("se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ");
					ingresar1 = bufEntrada.readLine();
					if (ingresar1.equals("si") || ingresar1.equals("SI")) {
						System.out.println("su vehiculo placas "+placa1+" marca "+marca1+" continua en nuestras instalaciones");
					}
					if (ingresar1.equals("no") || ingresar1.equals("NO")) {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Se ha dado salida, vehiculo placas "+placa1+" marca "+marca1);
						System.out.println("Señor@ "+cliente1+" Gracias por usar nuestro sevcio. Vuelva Pronto!");
						System.out.println("-----------------------------------------------------------------------");
					}
				}
				if (ingresar2.equals("si") || ingresar2.equals("SI")) {
					System.out.println("-----------------------Datos-------------------------------------------");
					System.out.println("Cliente "+cliente2+", Telefono "+tel2);
					System.out.println("El vehiculo de placas "+placa2+", marca "+marca2);
					System.out.println("se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ");
					ingresar2 = bufEntrada.readLine();
					if (ingresar2.equals("si") || ingresar2.equals("SI")) {
						System.out.println("su vehiculo placas "+placa2+" marca "+marca2+" continua en nuestras instalaciones");
					}
					if (ingresar2.equals("no") || ingresar2.equals("NO")) {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Se ha dado salida, vehiculo placas "+placa2+" marca "+marca2);
						System.out.println("Señor@ "+cliente2+" Gracias por usar nuestro sevcio. Vuelva Pronto!");
					}
					System.out.println("-----------------------------------------------------------------------");
				}
				if (ingresar3.equals("si") || ingresar3.equals("SI")) {
					System.out.println("-----------------------Datos-------------------------------------------");
					System.out.println("Cliente "+cliente3+", Telefono "+tel3);
					System.out.println("El vehiculo de placas "+placa3+", marca "+marca3);
					System.out.println("se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ");
					ingresar3 = bufEntrada.readLine();
					if (ingresar3.equals("si") || ingresar3.equals("SI")) {
						System.out.println("su vehiculo placas "+placa3+" marca "+marca3+" continua en nuestras instalaciones");
					}
					if (ingresar3.equals("no") || ingresar3.equals("NO")) {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Se ha dado salida, vehiculo placas "+placa3+" marca "+marca3);
						System.out.println("Señor@ "+cliente3+" Gracias por usar nuestro sevcio. Vuelva Pronto!");
						System.out.println("-----------------------------------------------------------------------");
					}
				}
				if (ingresar4.equals("si") || ingresar4.equals("SI")) {
					System.out.println("-----------------------Datos-------------------------------------------");
					System.out.println("Cliente "+cliente4+", Telefono "+tel4);
					System.out.println("El vehiculo de placas "+placa4+", marca "+marca4);
					System.out.println("se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ");
					ingresar4 = bufEntrada.readLine();
					if (ingresar4.equals("si") || ingresar4.equals("SI")) {
						System.out.println("su vehiculo placas "+placa4+" marca "+marca4+" continua en nuestras instalaciones");
					}
					if (ingresar4.equals("no") || ingresar4.equals("NO")) {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Se ha dado salida, vehiculo placas "+placa4+" marca "+marca4);
						System.out.println("Señor@ "+cliente4+" Gracias por usar nuestro sevcio. Vuelva Pronto!");
					}
					System.out.println("-----------------------------------------------------------------------");
				}
				if (ingresar5.equals("si") || ingresar5.equals("SI")) {
					System.out.println("-----------------------Datos-------------------------------------------");
					System.out.println("Cliente "+cliente5+", Telefono "+tel5);
					System.out.println("El vehiculo de placas "+placa5+", marca "+marca5);
					System.out.println("se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ");
					ingresar5 = bufEntrada.readLine();
					if (ingresar5.equals("si") || ingresar5.equals("SI")) {
						System.out.println("su vehiculo placas "+placa5+" marca "+marca5+" continua en nuestras instalaciones");
					}
					if (ingresar5.equals("no") || ingresar3.equals("NO")) {
						System.out.println("-----------------------------------------------------------------------");
						System.out.println("Se ha dado salida, vehiculo placas "+placa5+" marca "+marca5);
						System.out.println("Señor@ "+cliente5+" Gracias por usar nuestro sevcio. Vuelva Pronto!");
					}
					System.out.println("-----------------------------------------------------------------------");
				}
			}
			if (i.equals("3")) {
				System.out.println("Por favor digite la placa del vehiculo que desea consultar");
				placa = bufEntrada.readLine();
				if (placa.equals(placa1)) {
					System.out.println("El vehiculo de placas "+placa1+" Se encuentra en nuestras instalaciones");
				}
				if (placa.equals(placa2)) {
					System.out.println("El vehiculo de placas "+placa2+" Se encuentra en nuestras instalaciones");
				}
				if (placa.equals(placa3)) {
					System.out.println("El vehiculo de placas "+placa3+" Se encuentra en nuestras instalaciones");
				}
				if (placa.equals(placa4)) {
					System.out.println("El vehiculo de placas "+placa4+" Se encuentra en nuestras instalaciones");
				}
				if (placa.equals(placa5)) {
					System.out.println("El vehiculo de placas "+placa5+" Se encuentra en nuestras instalaciones");
				}
				if (!placa.equals(placa1)&!placa.equals(placa2)&!placa.equals(placa3)&!placa.equals(placa4)&!placa.equals(placa5)) {
					System.out.println("El vehiculo de placas "+placa+" no se encuentra en nuestras instalaciones");
				}
			}
			if (i.equals("4")) {
				System.out.println("Gracias por usar esta aplicacion");
			}
		}
	}


}

