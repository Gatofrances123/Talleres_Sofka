Proceso numeros_primos
	Definir n , num , x , contador Como Entero;
	Escribir "Ingresa un numero"; 
	n <- 1000 ;
	num <- 0 ;
	Mientras n > 0 Hacer
		num <- num + 1;
		x <- 1;
		contador <- 0;
		Mientras x <= num Hacer
			si num mod x==0 Entonces
				contador <- contador + 1 ;
			FinSi
			x <- x + 1 ;
		FinMientras
		Si contador == 2 Entonces
			Escribir "El numero " , num , " Es primo";
			n <- n - 1;
		FinSi
	FinMientras
	
FinProceso
