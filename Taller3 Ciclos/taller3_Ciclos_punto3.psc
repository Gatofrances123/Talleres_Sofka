Proceso taller3_Ciclos_punto3
	
	
		Definir A,C,B Como Entero;
		C <-21;
		A <- 1;
		
		Mientras A <= C Hacer//copa del arbol		
			B <- 0;
			Mientras B <= (C - A) Hacer
				Escribir " " Sin Saltar;
				B <- B + 1;			
			FinMientras
			
			B <- 1;
			Mientras B <= A Hacer
				Escribir "* " Sin Saltar;
				B <- B +1;
			FinMientras		
			A <- (A + 2);
			Escribir "";		
			
		FinMientras
		A<-20;
		C<-21;
		
		Mientras A <= C Hacer
			B <- 0;
			Mientras B <= (C - 4) Hacer
				Escribir " " Sin Saltar;
				B <- B + 1;			
			FinMientras
			
			B <- 1;
			Mientras B <= 3 Hacer
				Escribir "* " Sin Saltar;
				B <- B +1;
			FinMientras		
			A <- (A + 1);//CANTIDAD DE FILAS
			Escribir "";	
		FinMientras
		
		A<-21;
		C<-21;
		
		Mientras A <= C Hacer
			B <- 0;
			Mientras B <= (C - 6) Hacer
				Escribir " " Sin Saltar;
				B <- B + 1;			
			FinMientras
			
			B <- 1;
			Mientras B <= 5 Hacer
				Escribir "* " Sin Saltar;
				B <- B +1;
			FinMientras		
			A <- (A + 1);//CANTIDAD DE FILAS
			Escribir "";	
		FinMientras
		
		A<-21;
		C<-21;
		
		Mientras A <= C Hacer
			B <- 0;
			Mientras B <= (C - 7) Hacer
				Escribir " " Sin Saltar;
				B <- B + 1;			
			FinMientras
			
			B <- 1;
			Mientras B <= 6 Hacer
				Escribir "* " Sin Saltar;
				B <- B +1;
			FinMientras		
			A <- (A + 1);//CANTIDAD DE FILAS
			Escribir "";	
		FinMientras
		
FinProceso
