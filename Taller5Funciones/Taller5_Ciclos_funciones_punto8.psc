
	//8. La escuela automovilística "El Maestro" requiere una aplicación que permita registrar a sus clientes en los cursos de enseñanza automovilística y establecer quienes lo han
	//aprobado para continuar con el trámite de adquirir la licencia de conducción. Para cada usuario se debe permitir registrar su ingreso al curso, consultar usuarios que hayan
	//presentado el curso y resultados de la prueba del curso (si fueron aprobados o no). Recuerde que el sistema debe terminar cuando el
	//usuario así lo indique. Tenga presente que la escuela tiene capacidad máxima de gestionar 8 usuarios en su totalidad.    
	Funcion Automovilistoco()
	Definir NomUser1, NomUser2, Nomuser3, NomUser4, NomUser5, NomUser6, NomUser7, NomUser8 Como Caracter;
	Definir R1, R2, R3, R4, R5, R6, R7, R8, Curso1, curso2, curso3, curso4, curso5, N, curso6, curso7, curso8, I Como Caracter;
	Definir Opcion Como Entero;
	NomUser1<-"";NomUser2<-"";NomUser3<-"";NomUser4<-"";NomUser5<-"";NomUser6<-"";NomUser7<-"";NomUser8<-""; I<-"";
	R1<-""; R1<-""; R2<-""; R3<-""; R4<-""; R5<-""; R6<-""; R7<-""; R8<-""; curso1<-""; curso2<-""; curso3<-""; curso4<-""; curso5<-""; curso6<-""; curso7<-""; curso8<-"";
	
	Mientras I <> "3" Hacer
		Escribir "-----------------------------------------------------------------------";
		Escribir "Por favor seleccione una opcion ";
		Escribir "-----------------------------------------------------------------------";
		Escribir "1.) Ingresar nombre del aprendiz al sistema ";
		Escribir "2.) Consultar usuarios y sus resultados";
		Escribir "3.) Salir ------>";
		Leer I;
		
		Si I = "1" Entonces
			Escribir "------------------------------------------------";
			Escribir "Ten encuenta que en esta aplicacion solo podras ingresar un total de 8 usuarios,";
			Escribir " digita del 1 hasta el 8 para segun sea el usuario a guardar  ";
			Escribir "------------------------------------------------";
			Leer  Opcion;
			segun Opcion Hacer
				1:
					Escribir "Digite el nombre completo del usuario 1";
					Leer NomUser1;
					Escribir NomUser1," Ya presento el examen? digite si, o no";
					Leer curso1;
					si curso1 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R1;
					FinSi
				2:	
					Escribir "Digite el nombre completo del usuario 2";
					Leer NomUser2;
					Escribir NomUser2," Ya presento el examen? digite si, o no";
					Leer curso2;
					si curso2 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R2;
					FinSi
				3:
					Escribir "Digite el nombre completo del usuario 3";
					Leer NomUser3;
					Escribir NomUser3," Ya presento el examen? digite si, o no";
					Leer curso3;
					si curso3 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R3;
					FinSi
				4:
					Escribir "Digite el nombre completo del usuario 4";
					Leer NomUser4;
					Escribir NomUser4," Ya presento el examen? digite si, o no";
					Leer curso4;
					si curso4 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R4;
					FinSi
				5:
					Escribir "Digite el nombre completo del usuario 1";
					Leer NomUser5;
					Escribir NomUser5," Ya presento el examen? digite si, o no";
					Leer curso5;
					si curso5 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R5;
					FinSi
				6:
					Escribir "Digite el nombre completo del usuario 6";
					Leer NomUser6;
					Escribir NomUser6," Ya presento el examen? digite si, o no";
					Leer curso6;
					si curso6 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R6;
					FinSi
				7:
					Escribir "Digite el nombre completo del usuario 8";
					Leer NomUser7;
					Escribir NomUser7," Ya presento el examen? digite si, o no";
					Leer curso7;
					si curso7 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R7;
					FinSi
				8:
					Escribir "Digite el nombre completo del usuario 8";
					Leer NomUser8;
					Escribir NomUser8," Ya presento el examen? digite si, o no";
					Leer curso8;
					si curso8 = "si" Entonces
						Escribir "Que resultado octuvo? Aprobo o Reprobo?";
						Leer R8;
					FinSi
				De Otro Modo:
					Escribir "La opcion que elegistes no esta disponible";
			FinSegun
		FinSi			
		
		
		
		Si I = "2" Entonces
			Si Curso1 = "si" Entonces
				Escribir "-----------------------------------------------------------------------";
				Escribir "Señor(a) ",NomUser1,"  ",R1," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso2 ="si" Entonces
				Escribir "Señor(a) ",NomUser2,"  ",R2," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso3 ="si" Entonces
				Escribir "Señor(a) ",NomUser3,"  ",R3," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso4 ="si" Entonces
				Escribir "Señor(a) ",NomUser4,"  ",R4," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso5 ="si" Entonces
				Escribir "Señor(a) ",NomUser5,"  ",R5," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";	
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso6 ="si" Entonces
				Escribir "Señor(a) ",NomUser6,"  ",R6," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso6 ="si" Entonces
				Escribir "Señor(a) ",NomUser7,"  ",R7," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Curso8 ="si" Entonces
				Escribir "Señor(a) ",NomUser8," ",R8," el examen";
				Escribir "Usted puede continuar Tramite de licencia ";
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
		FinSi
		
		Si I = "3"	Entonces
			Escribir "Gracias por usar esta aplicacion";
			
		FinSi
		
		
	FinMientras
	
FinFuncion

Proceso taller8
	
	Automovilistoco();
	
FinProceso

