Proceso taller3_Ciclos_punto2
	Definir A,B,C Como Entero;
	
	C <- 10;
	A <- 1;
	
	Mientras A <= C Hacer
		
		B <- 0;
		Mientras B <= (C - A) Hacer
			Escribir " " Sin Saltar;
			B <- B + 1;
		FinMientras
		
		B <- 1;
		Mientras B <= A Hacer
			Escribir "*" Sin Saltar;
			B <- B + 1;
		FinMientras
		
		A <- A + 1;
		Escribir "";
	FinMientras
	
FinProceso