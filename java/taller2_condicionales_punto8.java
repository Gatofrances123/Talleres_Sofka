/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO8.java."

import java.io.*;

public class taller2_condicionales_punto8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int cant;
		int contador;
		int doc;
		String nomb;
		int opc;
		int prec1;
		int prec2;
		int prec3;
		int prec4;
		int total;
		// 8. El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que lepermita registrar los pedidos de los clientes 
		// en cuanto a las tortas que realiza.Cada torta tiene unas características propias como sabor, cantidad (porciones) y decoraciones). 
		// Se requiere que la aplicación permita registrar los pedidos, las tortas disponibles y las ventas que se registren diariamente.
		prec1 = 5000;
		prec4 = 6000;
		prec3 = 2500;
		prec2 = 3000;
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Bienvenidos a pasteleria don Carlos, ingresa y seleciona lo que deseas");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Datos de clientes.");
		System.out.println("Por favor ingrese su nombre completo.");
		nomb = bufEntrada.readLine();
		System.out.println("Por favor digite su documento.");
		doc = Integer.parseInt(bufEntrada.readLine());
		do {
			System.out.println("Elija una opcion segun guste.");
			System.out.println("1.) Torta grande Chocolate 12 porciones.");
			System.out.println("2.) Torta grande Frutos Rojos 12 porciones.");
			System.out.println("3.) Torta pequeña chocolate 6 porciones.");
			System.out.println("4.) Torta pequeña Frutos Rojos 6 porciones.");
			System.out.println("5.) Salir ----->");
			opc = Integer.parseInt(bufEntrada.readLine());
			switch (opc) {
			case 1:
				System.out.println("Usted ha seleccionado Torta grande Chocolate 12 porciones. $**  "+prec1);
				System.out.println("Por favor digite cantidad que desea llevar");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Señor(a)  "+nomb);
				System.out.println("Pedido de compra realizado con exito");
				System.out.println("********** Torta grande Chocolate 12 porciones");
				System.out.println("********** Catidad  "+cant+" Total a pagar $ "+(cant*prec1));
				System.out.println("------------------------------------------------------------------------");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			case 2:
				System.out.println("Usted ha seleccionado Torta grande Frutos Rojos 12 porciones. $**  "+prec4);
				System.out.println("Por favor digite cantidad que desea llevar");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Señor(a)  "+nomb);
				System.out.println("Pedido de compra realizado con exito");
				System.out.println("********** Torta grande Frutos Rojos 12 porciones");
				System.out.println("********** Catidad  "+cant+" Total a pagar $ "+(cant*prec2));
				System.out.println("------------------------------------------------------------------------");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			case 3:
				System.out.println("Usted ha seleccionado Torta pequeña Chocolate 6 porciones. $**  "+prec3);
				System.out.println("Por favor digite cantidad que desea llevar");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Señor(a)  "+nomb);
				System.out.println("Pedido de compra realizado con exito");
				System.out.println("********** Torta pequeña Chocolate 6 porciones");
				System.out.println("********** Catidad  "+cant+" Total a pagar $ "+(cant*prec3));
				System.out.println("------------------------------------------------------------------------");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			case 4:
				System.out.println("Usted ha seleccionado Torta pequeña Frutos Rojos 6 porciones. $**  "+prec2);
				System.out.println("Por favor digite cantidad que desea llevar");
				cant = Integer.parseInt(bufEntrada.readLine());
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Señor(a)  "+nomb);
				System.out.println("Pedido de compra realizado con exito");
				System.out.println("********** Torta pequeña Frutos Rojos 6 porciones");
				System.out.println("********** Catidad  "+cant+" Total a pagar $ "+(cant*prec2));
				System.out.println("------------------------------------------------------------------------");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				break;
			default:
				System.out.println("Usted ha seleccionado una opcion que no esta disponible..");
				System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				System.out.println(""); // no hay forma directa de borrar la consola en Java
			}
		} while (opc!=5);
	}


}

