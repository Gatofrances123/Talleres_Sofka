/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO5.java."

import java.io.*;

public class taller2_condicionales_punto5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cant;
		String nombrecompleto;
		int opcion;
		int opcion1;
		int opcion2;
		int prec1;
		int prec2;
		int prec3;
		// La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los productos que vende a sus clientes
		// y para ello, los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. 
		// Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y devoluciones en caso de que se presenten.
		prec1 = 400;
		prec2 = 300;
		prec3 = 250;
		System.out.println("Por favor escriba su nombre completo");
		nombrecompleto = bufEntrada.readLine();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(" Bienvenido a La Droguería Mi Salud señor(a) "+nombrecompleto);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("1.)Desea comprar algun producto.? ");
		System.out.println("2.)Desea consultar precios de los producto.? ");
		System.out.println("3.)Realizar devolucion de producto.? ");
		System.out.println("4.)salir ---->");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("por favor seleccione un producto");
			System.out.println("1.)Suero en sobre X 30Gms ");
			System.out.println("2.)Aspirina forte x800");
			System.out.println("3.)Alka seltzer ");
			opcion = Integer.parseInt(bufEntrada.readLine());
			if (opcion==1) {
				System.out.println("Suero en sobre X 30Gms");
				System.out.println("Por favor ingrese la cantidad");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" Valos a pagar  $ **** "+(cant*prec1));
				System.out.println("-------------------------------------------------------------------------");
			} else {
				if (opcion==2) {
					System.out.println("Aspirina forte x800");
					System.out.println("Por favor ingrese la cantidad");
					cant = Integer.parseInt(bufEntrada.readLine());
					System.out.println("-------------------------------------------------------------------------");
					System.out.println(" $ **** "+cant*prec2);
					System.out.println("-------------------------------------------------------------------------");
				} else {
					if (opcion==3) {
						System.out.println("Suero en sobre X 30Gms");
						System.out.println("Por favor ingrese la cantidad");
						cant = Integer.parseInt(bufEntrada.readLine());
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(" $ **** "+cant*prec3);
						System.out.println("-------------------------------------------------------------------------");
					} else {
						System.out.println("La opcion que elegiste no existe en la lista.");
					}
				}
			}
			System.out.println("por favor seleccione un producto");
			System.out.println("1.)Suero en sobre X 30Gms ");
			System.out.println("2.)Aspirina forte x800");
			System.out.println("3.)Alka seltzer ");
			opcion1 = Integer.parseInt(bufEntrada.readLine());
			if (opcion1==1) {
				System.out.println("Suero en sobre X 30Gms");
				System.out.println("Por favor ingrese la cantidad");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" Valos a pagar  $ **** "+(cant*prec1));
				System.out.println("-------------------------------------------------------------------------");
			} else {
				if (opcion1==2) {
					System.out.println("Aspirina forte x800");
					System.out.println("Por favor ingrese la cantidad");
					cant = Integer.parseInt(bufEntrada.readLine());
					System.out.println("-------------------------------------------------------------------------");
					System.out.println(" Valos a pagar  $ ****  "+cant*prec2);
					System.out.println("-------------------------------------------------------------------------");
				} else {
					if (opcion1==3) {
						System.out.println("Suero en sobre X 30Gms");
						System.out.println("Por favor ingrese la cantidad");
						cant = Integer.parseInt(bufEntrada.readLine());
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(" Valos a pagar  $ ****  "+cant*prec3);
						System.out.println("-------------------------------------------------------------------------");
					} else {
						System.out.println("La opcion que elegiste no existe en la lista.");
					}
				}
			}
			System.out.println("por favor seleccione un producto");
			System.out.println("1.)Suero en sobre X 30Gms ");
			System.out.println("2.)Aspirina forte x800");
			System.out.println("3.)Alka seltzer ");
			opcion2 = Integer.parseInt(bufEntrada.readLine());
			switch (opcion2) {
			case 1:
				System.out.println("Suero en sobre X 30Gms");
				System.out.println("Por favor ingrese la cantidad");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" Valos a pagar  $ ****  "+cant*prec1);
				System.out.println("-------------------------------------------------------------------------");
				break;
			case 2:
				System.out.println("Aspirina forte x800");
				System.out.println("Por favor ingrese la cantidad");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" Valos a pagar  $ ****  "+cant*prec2);
				System.out.println("-------------------------------------------------------------------------");
				break;
			case 3:
				System.out.println("Alka seltzer");
				System.out.println("Por favor ingrese la cantidad");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println(" Valos a pagar  $ ****  "+cant*prec3);
				System.out.println("-------------------------------------------------------------------------");
				break;
			default:
				System.out.println("La opcion que elegiste no existe en la lista.");
			}
			break;
		case 2:
			System.out.println("Lista de producros y precios");
			System.out.println("*****************************************");
			System.out.println("* Suero en sobre X 30Gms ******* $ 400  *");
			System.out.println("* Aspirina forte x800  ********* $ 300  *");
			System.out.println("* Alka seltzer   *************** $ 250  *");
			System.out.println("*****************************************");
			break;
		case 3:
			System.out.println("*****************************************");
			System.out.println("por favor seleccione un producto");
			System.out.println("1.)Suero en sobre X 30Gms ");
			System.out.println("2.)Aspirina forte x800");
			System.out.println("3.)Alka seltzer ");
			System.out.println("*****************************************");
			opcion = Integer.parseInt(bufEntrada.readLine());
			if (opcion==1) {
				System.out.println("Suero en sobre X 30Gms");
				System.out.println("Por favor digita la cantidad a devolver");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Devolucion realizada con exito, cantidad producto "+cant);
				System.out.println("-------------------------------------------------------------------------");
			} else {
				if (opcion==2) {
					System.out.println("Aspirina forte x800");
					System.out.println("Por favor digita la cantidad a devolver");
					cant = Integer.parseInt(bufEntrada.readLine());
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("Devolucion realizada con exito, cantidad producto "+cant);
					System.out.println("-------------------------------------------------------------------------");
				} else {
					if (opcion==3) {
						System.out.println("Alka seltzer ");
						System.out.println("Por favor digita la cantidad a devolver");
						cant = Integer.parseInt(bufEntrada.readLine());
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("Devolucion realizada con exito, cantidad producto "+cant);
						System.out.println("-------------------------------------------------------------------------");
					} else {
						System.out.println("La opcion que elegiste no existe en la lista.");
					}
				}
			}
			break;
		case 4:
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Gracias por su compra señor@ "+nombrecompleto);
			System.out.println("-------------------------------------------------------------------------");
			break;
		default:
			System.out.println("La opcion que elegiste no existe en la lista.");
		}
	}


}

