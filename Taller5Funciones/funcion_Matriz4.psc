
	
	Funcion nuevafuncion()
	Definir  fila , columna , contador Como Entero;
	Definir matriz como entero; 
	Dimension matriz[4,5];
	contador <- 1;
	
	Escribir "------------MATRIZ INICIAL --------";
	Repetir
		Para fila <- 0 Hasta 3 Con Paso 1 Hacer
			
			Escribir "";
			para columna <- 0 Hasta 4 Con Paso 1 Hacer
				matriz[fila,columna] <- contador;
				si contador <= 9 Entonces
					Escribir 0 ,matriz[fila,columna],"";sin saltar
				SiNo
					Escribir matriz[fila,columna],"";sin saltar
				FinSi
				contador <- contador +1;
			FinPara
		FinPara
	Hasta Que contador >= 20
	contador <- 1;
	Escribir "";
	Escribir "--------MATRIZ CON CAMBIO-------------";
	Repetir
		Para fila<- 0  Hasta 3 Con Paso 1 Hacer
			Si fila=0 o fila=2 Entonces
				Escribir "";
				Para columna <- 0 Hasta 4 Con Paso 1 Hacer
					Si contador<=9 Entonces
						Escribir 0,matriz[fila,columna]," "; Sin Saltar
					SiNo
						Escribir matriz[fila,columna]," "; Sin Saltar
					FinSi
					contador <- contador + 1;
				FinPara
				Escribir "";
			FinSi
			Si fila = 1 o fila = 3 Entonces
				Para columna <- 4 Hasta 0 Con Paso -1 Hacer
					Si matriz[fila,columna]<=9 Entonces
						Escribir 0,matriz[fila,columna]," ";sin saltar
					SiNo
						Escribir 0,matriz[fila,columna]," ";sin saltar
					FinSi
					contador <- contador + 1;
				FinPara
			FinSi
		FinPara
	Hasta Que contador >= 20
FinFuncion

	
Proceso taller4
	
	nuevafuncion();
FinProceso

