
Funcion vector()	
// 1) Definirmos en tipo de dato que queremos tener 
Definir number Como entero;
// 2) Definimos el nombre el bucle 
Definir  indice Como entero;
// 3) Comenzamos a definir los bucles con la palabra Dimension 
Dimension number[5];//Pero nunca llega a 5 - el sero ceunta como posicion 1
// laa pisicion de 0 hasta 4 se va a llamar indice
number[0]<- 55;
number[1]<- 99;
number[2]<- 11;
number[3]<- 56;
number[4]<- 69;

// 4) Ahora si quiero que se muestren todos los nombres necesito poner lo que se llama bucle para
// 4.a) llamamos el nombre del bucle que declaramos arriba
// 4.b) le inidcamos que cominece en 0 hasta que termine en 4 
// 4.c) ahora le decimos que con paso 1 haga imprimir 
// 4.d) Ahora la secuencia_de_accion que va a realizar que es Escribir persona[indice(pocicion)
Para indice <- 0 Hasta 4 Con Paso 1 Hacer
	Escribir number[indice];
FinPara
FinFuncion

Proceso mi_primer_vector
vector();	
FinProceso