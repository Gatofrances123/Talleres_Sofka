

Proceso taller2_condicionales_punto4
	//La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios.
	//Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar
	//daños u otra novedad sobre la película.
	
	Definir nombreCompleto Como Caracter;
	Definir opc, opc1,opc2, opc3 Como Entero;
	definir  alquilar, alquilar1,alquilar2,alquilar3,entregar,entregar1,entregar2,entregar3,observacion,observacion1,observacion2,observacion3 Como Caracter;
	
	entregar<-""; entregar1<-""; entregar2<-""; entregar3<-""; observacion<-""; observacion1<-""; observacion2<-""; observacion3<-"";
	alquilar <-"no";alquilar1 <-"";alquilar2 <-"";alquilar3 <-"";
	
	Escribir "********* INGRESE EL NOMBRE DEL CLIENTE POR FAVOR *******************";
	Leer nombreCompleto;
	Escribir "";
	Escribir "---------------------------------------------------------------------";
	Escribir "";
	
	Repetir
		
	
	Escribir "*********************   POR FAVOR ELIJA UNA OPCION    ***************";
	Escribir "*********************      1. ALQUILAR PELICULA       ***************";	
	Escribir "*********************      2. CONSULTAR PELICULAS     ***************";
	Escribir "*********************      3. DEVOLVER PELICULA      ***************";
	Escribir "*********************      4. SALIR DEL SISTEMA       ***************";
	Leer opc1;
	Escribir "";
	Escribir "---------------------------------------------------------------------";
	Escribir "";
	
	Segun opc1 Hacer
			1:
				Escribir "*********************      ELIJA LA PELICULA          ***************";
				Escribir "*********************      1. LA MONJA                ***************";
				Escribir "*********************      2. SPIDER-MAN NO WAY HOME  ***************";
				Escribir "*********************      3. EXODO                   ***************";
				Escribir "*********************      4. LA CIUDAD PERDIDA       ***************";
				Leer opc;
				Escribir "";
				Escribir "---------------------------------------------------------------------";
				Escribir "";
				Segun opc  Hacer
					1:
						Escribir "Desea alquilar la pelicula --> LA MONJA? digite si o no ";
						Leer alquilar;
						si alquilar = "si" O alquilar = "Si" O alquilar = "SI" Entonces
							Escribir "Sr@ ", nombreCompleto, " usted ha alquilado con exito la pelicula --> LA MONJA";
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";						
							
						FinSi
						
						
					2:
						Escribir "Desea alquilar la pelicula --> SPIDER-MAN NO WAY HOME? digite si o no ";
						Leer alquilar1;
						si alquilar1 = "si" O alquilar1 = "Si" O alquilar1 = "SI" Entonces
							Escribir "Sr@ ", nombreCompleto, " usted ha alquilado con exito la pelicula --> SPIDER-MAN NO WAY HOME";
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";						
							
						FinSi
					3:
						Escribir "Desea alquilar la pelicula --> EXODO? digite si o no ";
						Leer alquilar2;
						si alquilar2 = "si" O alquilar2 = "Si" O alquilar2 = "SI" Entonces
							Escribir "Sr@ ", nombreCompleto, " usted ha alquilado con exito la pelicula --> EXODO";
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";						
							
						FinSi
					4:
						Escribir "Desea alquilar la pelicula --> LA CIUDAD PERDIDA? digite si o no ";
						Leer alquilar3;
						si alquilar3 = "si" O alquilar3 = "Si" O alquilar3 = "SI" Entonces
							Escribir "Sr@ ", nombreCompleto, " usted ha alquilado con exito la pelicula --> LA CIUDAD PERDIDA";
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";						
							
						FinSi	
					De Otro Modo:
						Escribir "Por favor seleccione una opcion valida para el sistema";
						Escribir "";
						Escribir "---------------------------------------------------------------------";
						Escribir "";
				FinSegun
				
				
		2:
			Escribir "*********************      LISTA DE PELICULAS           ***************";
			si alquilar = "si" O alquilar = "SI" O alquilar = "Si" Entonces
				Escribir "Pelicula ---> LA MONJA               no esta disponible";
			SiNo
				Escribir "Pelicula ---> LA MONJA               esta disponible";
				
			FinSi
			
			si alquilar1 = "si" O alquilar1 = "SI" O alquilar1 = "Si" Entonces
				Escribir "Pelicula ---> SPIDER-MAN NO WAY HOME no esta disponible";
			SiNo
				Escribir "Pelicula ---> SPIDER-MAN NO WAY HOME esta disponible";
				
			FinSi
		
			si alquilar2 = "si" O alquilar2 = "SI" O alquilar2 = "Si" Entonces
				Escribir "Pelicula ---> EXODO                  no esta disponible";
			SiNo
				Escribir "Pelicula ---> EXODO                  esta disponible";
				
			FinSi
		
			si alquilar3 = "si" O alquilar3 = "SI" O alquilar3 = "Si" Entonces
				Escribir "Pelicula ---> LA CIUDAD PERDIDA      no esta disponible";
			SiNo
				Escribir "Pelicula ---> LA CIUDAD PERDIDA      esta disponible";
				
			FinSi
						
			Escribir "";
			Escribir "---------------------------------------------------------------------";
			Escribir "";
		3:
			Escribir "*********************  CUAL PELICULA DESEA ENTREGAR   ***************";
			Escribir "*********************      1. LA MONJA                ***************";
			Escribir "*********************      2. SPIDER-MAN NO WAY HOME  ***************";
			Escribir "*********************      3. EXODO                   ***************";
			Escribir "*********************      4. LA CIUDAD PERDIDA       ***************";
			Leer opc2;
			Escribir "";
			Escribir "---------------------------------------------------------------------";
			Escribir "";
			Segun opc2 Hacer
				1:
					Escribir "*********************      DEVOLVER PELICULA           ***************";
					si alquilar = "si" O alquilar = "SI" O alquilar = "Si" Entonces
						Escribir "Pelicula ---> LA MONJA desea entregarla? si o no" ;
						Leer entregar;
						si entregar ="si" O entregar ="Si" O entregar = "SI" Entonces
							Escribir "Por favor de su comentario.";
							Leer observacion;
							Esperar Tecla;
							Limpiar Pantalla;
							Escribir "Sr@ ",nombreCompleto," usted ha regresado la pelicula --> LA MONJA con exito";
							Escribir "Observacion ",observacion;
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";
							
						FinSi
					SiNo
						Escribir "Pelicula ---> LA MONJA no ha sido alquilada, por ello no se puede regresar.";
						Escribir "";
						Escribir "---------------------------------------------------------------------";
						Escribir "";
						
					FinSi
				
				2:
					Escribir "*********************      DEVOLVER PELICULA           ***************";
					si alquilar1 = "si" O alquilar1 = "SI" O alquilar1 = "Si" Entonces
						Escribir "Pelicula ---> SPIDER-MAN NO WAY HOME desea entregarla? si o no" ;
						Leer entregar1;
						si entregar1 ="si" O entregar1 ="Si" O entregar1 = "SI" Entonces
							Escribir "Por favor de su comentario.";
							Leer observacion1;
							Esperar Tecla;
							Limpiar Pantalla;
							Escribir "Sr@ ",nombreCompleto," usted ha regresado la pelicula --> SPIDER-MAN NO WAY HOME con exito";
							Escribir "Observacion ",observacion1;
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";
							
						FinSi
					SiNo
						Escribir "Pelicula ---> SPIDER-MAN NO WAY HOME no ha sido alquilada, por ello no se puede regresar.";
						Escribir "";
						Escribir "---------------------------------------------------------------------";
						Escribir "";
						
					FinSi
				3:
					Escribir "*********************      DEVOLVER PELICULA           ***************";
					si alquilar2 = "si" O alquilar2 = "SI" O alquilar2 = "Si" Entonces
						Escribir "Pelicula ---> EXODO desea entregarla? si o no" ;
						Leer entregar2;
						si entregar2 ="si" O entregar2 ="Si" O entregar2 = "SI" Entonces
							Escribir "Por favor de su comentario.";
							Leer observacion2;
							Esperar Tecla;
							Limpiar Pantalla;
							Escribir "Sr@ ",nombreCompleto," usted ha regresado la pelicula --> EXODO con exito";
							Escribir "Observacion ",observacion2;
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";
							
						FinSi
					SiNo
						Escribir "Pelicula ---> EXODO no ha sido alquilada, por ello no se puede regresar.";
						Escribir "";
						Escribir "---------------------------------------------------------------------";
						Escribir "";
						
					FinSi
				4:
					Escribir "*********************      DEVOLVER PELICULA           ***************";
					si alquilar3 = "si" O alquilar3 = "SI" O alquilar3 = "Si" Entonces  
						Escribir "Pelicula ---> LA CIUDAD PERDIDA desea entregarla? si o no" ;
						Leer entregar3;
						si entregar3 ="si" O entregar3 ="Si" O entregar3 = "SI" Entonces
							Escribir "Por favor de su comentario.";
							Leer observacion3;
							Esperar Tecla;
							Limpiar Pantalla;
							Escribir "Sr@ ",nombreCompleto," usted ha regresado la pelicula --> LA CIUDAD PERDIDA con exito";
							Escribir "Observacion ",observacion3;
							Escribir "";
							Escribir "---------------------------------------------------------------------";
							Escribir "";
							
						FinSi
					SiNo
						Escribir "Pelicula ---> LA CIUDAD PERDIDA no ha sido alquilada, por ello no se puede regresar.";
						Escribir "";
						Escribir "---------------------------------------------------------------------";
						Escribir "";
						
					FinSi	
					
				De Otro Modo:
					Escribir "Seleccione un opcion valida.";
			FinSegun
			
			
			
			
			
		De Otro Modo:
			Escribir "Usted ha seleccionado una opcion que no esta disponible..";
			Esperar Tecla;
			Limpiar Pantalla;
	FinSegun
	
	

		
	Hasta Que opc1 = 4;
	
FinProceso

			
			
			
			
			
