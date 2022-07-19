Proceso taller2_condicionales_punto2
	//2: Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, deberá mostrar en pantalla:
	//Usted aún es un niño(a).
	
	Definir edad Como Entero;
	
	Escribir "Hola! por favor digite su edad.";
	Leer edad;
	
	Si edad < 18 Entonces
		Escribir "Usted aún es un niño(a).";
		
	SiNo
		Escribir "Usted ya no es un niño(a).";
		
	FinSi
	
	
FinProceso
