/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TALLER2_CONDICIONALES_PUNTO7.java."

import java.io.*;

public class taller2_condicionales_punto7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double estatura;
		double imc;
		String masa;
		double peso;
		System.out.println("Por favor ingrese su peso en kilogramos");
		peso = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Por favor ingrese su estatura en metros");
		estatura = Double.parseDouble(bufEntrada.readLine());
		imc = peso/(estatura*estatura);
		if (imc<18.5) {
			masa = "bajo de peso";
		} else {
			if (imc<24.8) {
				masa = "peso normal";
			} else {
				if (imc<29.8) {
					masa = "sobrepeso";
				} else {
					masa = "Obeso";
				}
			}
		}
		System.out.println("Tu indice de masa corporal es: "+imc+" te encuentras en el rango de "+masa+".");
	}


}

