Proceso taller3_Ciclos_punto6
	//Se está creando una aplicación que va a estar conectada con un prototipo que permita almacenar contactos telefónicos en el dispositivo. Para ello cada contacto debe contener nombre 
	//completo, teléfono y organización. Se requiere que la aplicación permita añadir 3 contactos verificando que el número no esté almacenado, buscar contactos almacenados y eliminar 
	//contactos si el usuario lo requiere. Recuerde que el sistema debe terminar cuando el usuario así lo indique.
	
	Definir nombre, nombre1, nombre2, tel, tel1, tel2, org, org1, org2, I Como Caracter;
	definir guardar, guardar1, guardar2, consultar, eliminar, confi Como Caracter;
	Definir opc, opc1, opc2 Como Entero;
	
	nombre<-""; nombre1<-""; nombre2<-""; tel<-""; tel1<-""; tel2<-""; org<-""; org1<-""; org2<-""; I<-""; consultar<-"";
	eliminar<-""; confi<-"";
	
	Mientras I <> "4" Hacer
		Escribir "-----------------------------------------------------------------------";
		Escribir "Por favor seleccione una opcion ";
		Escribir "-----------------------------------------------------------------------";
		Escribir "1.) Ingresar Datos al sistema ";
		Escribir "2.) Consultar";
		Escribir "3.) Eliminar ";
		Escribir "4.) Salir ------>";
		Leer I;		
		
		Si I = "1" Entonces
			Escribir "------------------------------------------------";
			Escribir "Ten encuenta que en esta ajenda solo podras ingresar un total de 3 usuarios,";
			Escribir " digita del 1, 2 ó 3 segun sea el cliente a guardar  ";
			Escribir "------------------------------------------------";
			Leer  opc;
			segun opc Hacer
				1:
					Escribir "Digite el nombre completo del usuario N°1";
					Leer nombre;
					Escribir "Por favor digite el nombre de la organizacion";
					Leer org;
					Escribir "Digite el telefono del usuario N°1";
					Leer tel;
			            si tel <> tel1 Y tel <> tel2 Entonces
							Escribir "Ingresado al sistema con exito";	
						SiNo
							Escribir "Este numero de contacto ya existe en la ajenda de registro";
							nombre<-"";
							org<-"";
							tel<-"";
							Escribir "No se guardaran datos, intente de nuevo por favor.",nombre,org,tel;
						FinSi
												
					
				2:	
					Escribir "Digite el nombre completo del usuario N°2";
					Leer nombre1;
					Escribir "Por favor digite el nombre de la organizacion";
					Leer org1;
					Escribir "Digite el telefono del usuario N°2";
					Leer tel1;
					si tel1 <> tel Y tel1 <> tel2 Entonces
						Escribir "Ingresado al sistema con exito";	
					SiNo
						Escribir "Este numero de contacto ya existe en la ajenda de registro.";
						nombre1<-"";
						org1<-"";
						tel1<-"";
						Escribir "No se guardaran datos, intente de nuevo por favor.",nombre1,org1,tel1;						
					FinSi
					
				3:
					Escribir "Digite el nombre completo del usuario N°3";
					Leer nombre2;
					Escribir "Por favor digite el nombre de la organizacion";
					Leer org2;
					Escribir "Digite el telefono del usuario N°3";
					Leer tel2;
					si tel2 <> tel1 Y tel2 <> tel Entonces
						Escribir "Ingresado al sistema con exito";	
					SiNo
						Escribir "Este numero de contacto ya existe en la ajenda de registro.";	
						nombre2<-"";
						org2<-"";
						tel2<-"";
						Escribir "No se guardaran datos, intente de nuevo por favor.",nombre2,org2,tel2;
					FinSi				
			
				De Otro Modo:
					Escribir "La opcion que elegistes no esta disponible";
			FinSegun
		FinSi	
		
		Si I = "2" Entonces
			Escribir "Desea ver los contactos de la ajenda ? si o no?.";
			Leer consultar;
			si consultar = "si" O consultar = "SI" O consultar = "Si" Entonces
				Escribir "";
				Escribir "********** Lista de contactos   ********************";
				Escribir "";
				Escribir "**Nombre->  ", nombre,"   **Organizacion ->  ",org,    " **CELULAR ->  ",tel;
				Escribir "**Nombre->  ", nombre1,"   **Organizacion ->  ",org1,    " **CELULAR ->  ",tel1;
				Escribir "**Nombre->  ", nombre2,"   **Organizacion ->  ",org2,    " **CELULAR ->  ",tel2;
				
			FinSi
		FinSi
			
	
	Si I = "3"	Entonces		
		Escribir "Por favor digite el numero del contacto a eliminar";
		Leer eliminar;				
		si eliminar == tel Entonces				
			    tel<-"";
				nombre<-"";
				org<-"";		
				
				Escribir tel,nombre,org;					
				Escribir "El contacto ha sido eliminado.";	
			SiNo
				si eliminar = tel1 Entonces
					tel1<-"";
					nombre1<-"";
					org1<-"";				
					Escribir tel1,nombre1,org1;					
					Escribir "El contacto ha sido eliminado.";	
				SiNo
					si eliminar = tel2 Entonces
						tel2<-"";
						nombre2<-"";
						org2<-"";				
						Escribir tel2,nombre2,org2;					
						Escribir "El contacto ha sido eliminado.";	
					SiNo				 
						Escribir "El dato ingresado no existe en la ajenda de registro.";
					FinSi
				FinSi									
			FinSi		
	FinSi 		
	Si I = "4"	Entonces
		Escribir "Gracias por usar esta aplicacion";
		
	FinSi	
		
	FinMientras
	
FinProceso
