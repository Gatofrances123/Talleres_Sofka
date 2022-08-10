/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO9.java."

import java.io.*;

public class taller2_condicionales_punto9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double area_r;
		double area_t;
		double area_tra;
		double base;
		double basemayor;
		double basemenor;
		int opcion;
		// 9. El profesor de geometría está explicando a sus estudiantes las fórmulas para calcular el área de diferentes figuras geométricas, para ello requiere
		// una aplicación que le facilite el ejercicio solicitándole los valores al estudiante. La aplicación debe permitir que el estudiante seleccione si desea
		// calcular el área de un rectángulo, triángulo o trapecio. No olvide solicitar los datos necesarios para realizar cada cálculo y mostrar su respectivo resultado.
		System.out.println("---------------------------------------------------");
		System.out.println("           Por favor elija la opcion");
		System.out.println("---------------------------------------------------");
		System.out.println("1. Calcular el area de un retangulo.?");
		System.out.println("2. Calcular el area de un triangulo.?");
		System.out.println("3. Calcular el area de un trapecio.?");
		System.out.println("4. --> salir.?");
		opcion = Integer.parseInt(bufEntrada.readLine());
		switch (opcion) {
		case 1:
			System.out.println("Por favor digite la * base * del retangulo");
			base = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Por favor digite la * altura * del retangulo");
			altura = Double.parseDouble(bufEntrada.readLine());
			area_r = (base*altura);
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("---------------------------------------------------");
			System.out.println("El area del retangulo es: "+area_r);
			System.out.println("---------------------------------------------------");
			break;
		case 2:
			System.out.println("Por favor digite la * base * del triangulo");
			base = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Por favor digite la * altura * del triangulo");
			altura = Double.parseDouble(bufEntrada.readLine());
			area_t = (base*altura)/2;
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("---------------------------------------------------");
			System.out.println("El area del triangulo es: "+area_t);
			System.out.println("---------------------------------------------------");
			break;
		case 3:
			System.out.println("Por favor digite la * base mayor * del trapecio");
			basemayor = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Por favor digite la * base menor * del trapecio");
			basemenor = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Por favor digite la * altura * del trapecio");
			altura = Double.parseDouble(bufEntrada.readLine());
			area_tra = ((basemayor+basemenor)*altura);
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			System.out.println("---------------------------------------------------");
			System.out.println("El area del trapecio es: "+area_tra);
			System.out.println("---------------------------------------------------");
			break;
		case 4:
			System.out.println("---------------------------------------------------");
			System.out.println("Gracias por usar la aplicacion");
			System.out.println("---------------------------------------------------");
			break;
		default:
			System.out.println("---------------------------------------------------");
			System.out.println("La opcion que has elegido no existe");
			System.out.println("---------------------------------------------------");
		}
	}


}

