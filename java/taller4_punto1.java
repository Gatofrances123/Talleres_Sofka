/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MI_PRIMER_VECTOR.java."

import java.io.*;

public class mi_primer_vector {

	public static void main(String args[]) {
		int indice;
		int number[];
		// 1) Definirmos en tipo de dato que queremos tener 
		// 2) Definimos el nombre el bucle 
		// 3) Comenzamos a definir los bucles con la palabra Dimension 
		// Pero nunca llega a 5 - el sero ceunta como posicion 1
		number = new int[5];
		// laa pisicion de 0 hasta 4 se va a llamar indice
		number[0] = 55;
		number[1] = 99;
		number[2] = 11;
		number[3] = 56;
		number[4] = 69;
		// 4) Ahora si quiero que se muestren todos los nombres necesito poner lo que se llama bucle para
		// 4.a) llamamos el nombre del bucle que declaramos arriba
		// 4.b) le inidcamos que cominece en 0 hasta que termine en 4 
		// 4.c) ahora le decimos que con paso 1 haga imprimir 
		// 4.d) Ahora la secuencia_de_accion que va a realizar que es Escribir persona[indice(pocicion)
		for (indice=0;indice<=4;indice++) {
			System.out.println(number[indice]);
		}
	}


}

