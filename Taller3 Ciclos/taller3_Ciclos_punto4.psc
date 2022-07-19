Proceso taller3_Ciclos_punto4
//Se requiere un programa que pueda crear la tabla de multiplicar del número que el usuario indique por medio del ciclo Para; esta debe ser impresa del 1 al 10.
//Ejemplo, si el usuario indica que desea crear la tabla del 5, entonces el resultado debería ser el siguiente:
	
	Definir A, M Como Entero;
	Escribir "Por favor digite un numero del cual desea crear latabla de multiplicar.";
	Leer A;
	
	Para M<-1 Hasta 10 Con Paso 1 Hacer
		Escribir M," X ", A," = ",(M*A);
	FinPara
	
FinProceso
