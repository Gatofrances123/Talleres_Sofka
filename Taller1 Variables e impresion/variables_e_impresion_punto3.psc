Proceso taller1_variables_e_impresion_punto3
	// 3:Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. 
	//Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].	
	
	Definir nomb_hijo, nomb_padre, nomb_madre Como Caracter;
	Definir apellidos_hijo, apellidos_padre, apellidos_madre Como Caracter;
	
	
	Escribir "Por favor escriba su nombre ";
	Leer nomb_hijo ;
	Limpiar Pantalla;
	Escribir "Por favor escriba sus apellidos ";
	Leer apellidos_hijo ;
	Limpiar Pantalla;
	Escribir "Por favor escriba el nombre su padre ";
	Leer nomb_padre ;
	Limpiar Pantalla;
	Escribir "Por favor escriba los apellidos de su padre ";
	Leer apellidos_padre ;
	Limpiar Pantalla;Escribir "Por favor escriba el nombre de su madre  ";
	Leer nomb_madre ;
	Limpiar Pantalla;
	Escribir "Por favor escriba los apellidos madre ";
	Leer apellidos_madre ;
	Limpiar Pantalla;
	
	Escribir "Yo, ",[nomb_hijo]," ",[apellidos_hijo],", soy hijo de ",[nomb_madre]," ",[apellidos_madre]," y ",[nomb_padre]," ",[apellidos_padre];
	
	
	
FinProceso
