Proceso sin_titulo
	Definir i,num Como Entero;
	Definir  c Como Entero;
	definir repetido Como Logico;
	Para i <- 0 Hasta 20 Con Paso 1 Hacer
		num <- 1 + azar (100);
	
		Si num%2=0 Entonces
			Escribir " es un numero par";
			Escribir num;
		SiNo
			Escribir "no es un numero par";
			Escribir num ;
		FinSi
FinPara


FinProceso
