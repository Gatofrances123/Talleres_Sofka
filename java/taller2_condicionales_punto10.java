/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO10.java."

import java.io.*;

public class taller2_condicionales_punto10 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String cuenta;
		String cuenta1;
		String cuenta2;
		String cuenta3;
		String documento;
		String documento1;
		String documento2;
		String documento3;
		int ingreso;
		String nombre1;
		String nombre2;
		String nombre3;
		String nombrecompleto;
		int opcion;
		int retiro;
		int saldo;
		int saldo1;
		int saldo2;
		int saldo3;
		// El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para llevar las cuentas de sus usuarios; por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad.
		// Para cada cliente las cuentas permitirán realizar ingresos, retiros o consultas de valor. En los ingresos no se pueden insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
		documento1 = "10121";
		cuenta1 = "10";
		nombre1 = "Maria Rodriguez";
		saldo1 = 20000;
		documento2 = "10122";
		cuenta1 = "20";
		nombre2 = "Jose Castro";
		saldo2 = 25000;
		documento3 = "10123";
		cuenta1 = "30";
		nombre3 = "Mariana Betancourt";
		saldo3 = 30000;
		System.out.println("---------------------------------------------------");
		System.out.println("          Bienvenido a su Banco Fiel");
		System.out.println("           Por favor elija la opcion");
		System.out.println("---------------------------------------------------");
		System.out.println("1. Consultar saldo.?");
		System.out.println("2. Realizar un retiro.?");
		System.out.println("3. realizar consignacion.?");
		System.out.println("4. --> salir.?");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Por favor digite su documento tal cual como fue ingreado al sistema. ");
			documento = bufEntrada.readLine();
			System.out.println("Por favor digite su numero de cuenta. ");
			cuenta = bufEntrada.readLine();
			if (documento.equals("10121") && cuenta.equals("10")) {
				System.out.println("Bienvenido(a) señor(a) "+nombre1);
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("Usted tiene actualmente un saldo de $*** "+saldo1);
				System.out.println("-------------------------------------------------------------------------------------------");
			} else {
				if (documento.equals("10122") && cuenta.equals("20")) {
					System.out.println("Bienvenido(a) señor(a) "+nombre2);
					System.out.println("-------------------------------------------------------------------------------------------");
					System.out.println("Usted tiene actualmente un saldo de $*** "+saldo2);
					System.out.println("-------------------------------------------------------------------------------------------");
				} else {
					if (documento.equals("10123") && cuenta.equals("30")) {
						System.out.println("Bienvenido(a) señor(a) "+nombre3);
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("Usted tiene actualmente un saldo de $*** "+saldo3);
						System.out.println("-------------------------------------------------------------------------------------------");
					} else {
						System.out.println("-------------------------------------------------------------------------------------------------------");
						System.out.println("Lo sentimos su nombre o documento estan mal escritos, o quizas usted, no es usuario de nuestro Banco");
						System.out.println("-------------------------------------------------------------------------------------------");
					}
				}
			}
			break;
		case 2:
			System.out.println("Por favor digite su documento tal cual como fue ingreado al sistema. ");
			documento = bufEntrada.readLine();
			System.out.println("Por favor digite su numero de cuenta. ");
			cuenta = bufEntrada.readLine();
			if (documento.equals("10121") && cuenta.equals("10")) {
				System.out.println("Bienvenido(a) señor(a) "+nombre1);
				System.out.println("Por favor digite la cantidad de dinero a retirar $*** ?");
				retiro = Integer.parseInt(bufEntrada.readLine());
				if (retiro<=saldo1) {
					System.out.println("-------------------------------------------------------------------------------------------");
					System.out.println("Su retieo fue efectuado con Exito, su nuevo saldo es $****** "+(saldo1-retiro));
					System.out.println("-------------------------------------------------------------------------------------------");
				} else {
					System.out.println("-------------------------------------------------------------------------------------------");
					System.out.println("usted no tiene fondos suficientes para este retiro, saldo $******** "+saldo1);
					System.out.println("-------------------------------------------------------------------------------------------");
				}
			} else {
				if (documento.equals("10122") && cuenta.equals("20")) {
					System.out.println("Bienvenido(a) señor(a) "+nombre2);
					System.out.println("Por favor digite la cantidad de dinero a retirar $*** ?");
					retiro = Integer.parseInt(bufEntrada.readLine());
					if (retiro<=saldo2) {
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("Su retieo fue efectuado con Exito, su nuevo saldo es $****** "+(saldo2-retiro));
						System.out.println("-------------------------------------------------------------------------------------------");
					} else {
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("usted no tiene fondos suficiente para este retiro, saldo $******** "+saldo2);
						System.out.println("-------------------------------------------------------------------------------------------");
					}
				} else {
					if (documento.equals("10123") && cuenta.equals("30")) {
						System.out.println("Bienvenido(a) señor(a) "+nombre3);
						System.out.println("Por favor digite la cantidad de dinero a retirar $*** ?");
						retiro = Integer.parseInt(bufEntrada.readLine());
						if (retiro<=saldo3) {
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("Su retieo fue efectuado con Exito, su nuevo saldo es $****** "+(saldo3-retiro));
							System.out.println("-------------------------------------------------------------------------------------------");
						} else {
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("usted no tiene fondos suficiente para este retiro, saldo $******** "+saldo3);
							System.out.println("-------------------------------------------------------------------------------------------");
						}
					} else {
						System.out.println("Lo sentimos su nombre o documento estan mal escritos, o quizas usted, no es usuario de nuestro Banco");
					}
				}
			}
			break;
		case 3:
			System.out.println("Por favor digite su documento tal cual como fue ingreado al sistema. ");
			documento = bufEntrada.readLine();
			System.out.println("Por favor digite su numero de cuenta. ");
			cuenta = bufEntrada.readLine();
			if (documento.equals("10121") && cuenta.equals("10")) {
				System.out.println("Bienvenido(a) señor(a) "+nombre1);
				System.out.println("Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?");
				ingreso = Integer.parseInt(bufEntrada.readLine());
				if (ingreso>0) {
					System.out.println("-------------------------------------------------------------------------------------------");
					System.out.println("Su consignacion fue efectuada con Exito, su nuevo saldo es $****** "+(saldo1+ingreso));
					System.out.println("-------------------------------------------------------------------------------------------");
				} else {
					System.out.println("-------------------------------------------------------------------------------------------");
					System.out.println("Usted esta digitando valores no permitidos para esta operacion  ");
					System.out.println("-------------------------------------------------------------------------------------------");
				}
			} else {
				if (documento.equals("10122") && cuenta.equals("20")) {
					System.out.println("Bienvenido(a) señor(a) "+nombre2);
					System.out.println("Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?");
					ingreso = Integer.parseInt(bufEntrada.readLine());
					if (ingreso>0) {
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("Su consignacion fue efectuada con Exito, su nuevo saldo es $****** "+(saldo2+ingreso));
						System.out.println("-------------------------------------------------------------------------------------------");
					} else {
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("Usted esta digitando valores no permitidos para esta operacion  ");
						System.out.println("-------------------------------------------------------------------------------------------");
					}
				} else {
					if (documento.equals("10123") && cuenta.equals("30")) {
						System.out.println("Bienvenido(a) señor(a) "+nombre3);
						System.out.println("Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?");
						ingreso = Integer.parseInt(bufEntrada.readLine());
						if (ingreso>0) {
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("Su consinacion fue efectuada con Exito, su nuevo saldo es $****** "+(saldo3+ingreso));
							System.out.println("-------------------------------------------------------------------------------------------");
						} else {
							System.out.println("-------------------------------------------------------------------------------------------");
							System.out.println("Usted esta digitando valores no permitidos para esta operacion  ");
							System.out.println("-------------------------------------------------------------------------------------------");
						}
					} else {
						System.out.println("Lo sentimos su documento o numero de cuenta estan mal escritos, o quizas usted, no es usuario de nuestro Banco");
					}
				}
			}
			break;
		case 4:
			System.out.println("-------------------------------------------------------------");
			System.out.println("********  Fue un placer servirle, hasta luego  ***********");
			System.out.println("-------------------------------------------------------------");
			break;
		default:
			System.out.println("Esta opcion no esta permitida.");
		}
	}


}

