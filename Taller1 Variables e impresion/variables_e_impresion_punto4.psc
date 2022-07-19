Proceso taller1_variables_e_impresion_punto4
	// 4:Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla 
	//el siguiente mensaje "La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País].
	
	Definir nombre_ciudad, nombre_pais Como Caracter;	
	
	Escribir "Por favor escriba el nombre de una ciudad capital ";
	Leer nombre_ciudad ;	
	Escribir "Por favor escriba el nombre del pais que tiene como capital la ciudad mencionada anteriormente ";
	Leer nombre_pais;
	Limpiar Pantalla;	
	
	Escribir "La ciudad  ",[nombre_ciudad],", es la capital del pais  ",[nombre_pais];
	
FinProceso
