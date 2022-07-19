Proceso taller3_Ciclos_punto5
	//Utilizando el ciclo que usted desee, crear un menú de ejecución infinita hasta que el usuario desee terminar dicho ciclo.
	Definir nombre Como Caracter;
	Definir saludo Como Caracter;
	Definir opcion Como Entero;	
	nombre<-"";
	
	
	Repetir
		Limpiar Pantalla;
		Escribir "Por favor eliga una opcion Menu.";
		Escribir "1. Guardar nombre.";
		Escribir "2. Saludar.";
		Escribir "3. Salir del sistema.";	
		Leer opcion;
		
        Segun opcion Hacer
			1:
				Escribir "Como te llamas?.";
				Leer nombre;
			2:	
				Si nombre  <> "" Entonces
					Escribir "Hola ", nombre;
					Esperar Tecla;
				SiNo
					
					Escribir "Para saludarte, primero debes guardar tu nombre.";
					Esperar Tecla;
				FinSi
				
			
				
			
			
				
			3:
				Escribir "Hasta luego, gracias por visitarnos.";
				Esperar Tecla;
		FinSegun
		
	Hasta Que opcion =3 
	
	
FinProceso