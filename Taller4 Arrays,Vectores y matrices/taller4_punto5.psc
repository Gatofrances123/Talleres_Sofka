Proceso punto_5
	Definir filas,columnas,numeroguia ,multiplo1,multiplo2 Como Entero;
	Definir cifrascinco Como Entero;
	Dimension cifrascinco[11,11];
	multiplo1 <- 1;
	multiplo2 <- 1;
	Escribir "Columnas";
	Para filas <- 0 Hasta 10 Con Paso 1 Hacer
		Para columnas <- 0 Hasta 10 Con Paso 1 Hacer
			Si columnas = 0 Entonces
				Escribir "" , filas -1," ";
			SiNo
				Si filas >= 0 y filas <= 9 Entonces
					Si filas = 0 Entonces
						Si columnas = 1 Entonces
							Escribir " ",columnas -1," "Sin Saltar;
						SiNo
							Escribir  "" , columnas -1 , "",Sin Saltar;
						FinSi
						
					SiNo
						Escribir "  ", columnas , "x", filas ," " Sin Saltar;
					FinSi
				SiNo
					Escribir "  ", columnas , "x", filas ," " Sin Saltar; 
				FinSi
			FinSi
			
			FinPara
			Escribir "";
	FinPara
	Escribir "¿Cual resultado le gustaria conocer? seleccione una columna";
	leer multiplo1;
	Mientras multiplo1 >= 10 Hacer
		Escribir "Numero no valido , Selecciones una columna";
		leer multiplo1;
	FinMientras
	Escribir "Seleccione una fila";
	leer multiplo2;
	Mientras multiplo2 >= 10 Hacer
		Escribir "Numero no valido ,Seleccione una fila";
		Leer multiplo2;
	FinMientras
	Escribir "a";
	Para filas <- 1 Hasta 10 Con Paso 1 Hacer
		Para columnas <- 1 Hasta 10 Con Paso 1 Hacer
			cifrascinco[10,10] <- (filas * columnas);
			Escribir cifrascinco[10,10]," " Sin Saltar;
		FinPara
		Escribir " ";
	FinPara
	Escribir "el numero que ha escogido es" , (mutiplo1 + 1) * (multiplo2 + 1);
	
	
FinProceso
