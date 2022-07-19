Funcion lafiesta()
	Definir nombre Como Caracter;
	Definir apellidos Como Caracter;
	Definir edad Como Entero;
	
	Escribir "Hola! por favor escriba su nombre.";
	Leer nombre;
	Escribir "Por favor escriba sus apellidos.";
	Leer apellidos;
	Escribir "Por favor digite su edad.";
	Leer edad;
	Limpiar Pantalla;
	
	Si edad > 17 Entonces
		Escribir nombre," ",apellidos," usted es mayor de edad, por lo tanto puede entrar a la fiesta.¡Bienvenido!";
		
	SiNo
		Escribir nombre," ",apellidos," usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.";
	FinSi
	
FinFuncion


Proceso lafiestafuncion
	
	lafiesta();
	
FinProceso
