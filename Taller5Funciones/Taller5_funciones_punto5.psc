Funcion Drogueria()
	Definir opcion, opcion1, opcion2, prec1, cant, prec2, prec3 Como Entero;
	Definir NombreCompleto Como Caracter;
	prec1<-400;
	prec2<-300;
	prec3<-250;
	
	Escribir "Por favor escriba su nombre completo";
	Leer NombreCompleto;
	
	Escribir "-------------------------------------------------------------------------";
	Escribir " Bienvenido a La Droguería Mi Salud señor(a) ",NombreCompleto;
	Escribir "--------------------------------------------------------------------------";
	
	Escribir "1.)Desea comprar algun producto.? ";
	Escribir "2.)Desea consultar precios de los producto.? ";
	Escribir "3.)Realizar devolucion de producto.? ";
	Escribir "4.)salir ---->";
	Leer opcion;
	
	Segun opcion Hacer
		1:
			Escribir "por favor seleccione un producto";
			Escribir "1.)Suero en sobre X 30Gms ";
			Escribir "2.)Aspirina forte x800";
			Escribir "3.)Alka seltzer ";			
			
			Leer opcion;			
			Si opcion = 1 Entonces
				Escribir "Suero en sobre X 30Gms";	
				Escribir "Por favor ingrese la cantidad";
				Leer cant;
				Escribir "-------------------------------------------------------------------------";
				Escribir " Valos a pagar  $ **** ",(cant * prec1);
				Escribir "-------------------------------------------------------------------------";
				
			SiNo Si opcion = 2 Entonces
					Escribir "Aspirina forte x800";	
					Escribir "Por favor ingrese la cantidad";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir " $ **** ",cant * prec2;
					Escribir "-------------------------------------------------------------------------";
				SiNo Si opcion = 3 Entonces
						Escribir "Suero en sobre X 30Gms";	
						Escribir "Por favor ingrese la cantidad";
						Leer cant;
						Escribir "-------------------------------------------------------------------------";
						Escribir " $ **** ",cant * prec3;
						Escribir "-------------------------------------------------------------------------";					
					SiNo
						Escribir "La opcion que elegiste no existe en la lista.";
						
					FinSi
				FinSi
			FinSi
			
			Escribir "por favor seleccione un producto";
			Escribir "1.)Suero en sobre X 30Gms ";
			Escribir "2.)Aspirina forte x800";
			Escribir "3.)Alka seltzer ";
			
			Leer opcion1;
			Si opcion1 = 1 Entonces
				Escribir "Suero en sobre X 30Gms";	
				Escribir "Por favor ingrese la cantidad";
				Leer cant;
				Escribir "-------------------------------------------------------------------------";
				Escribir " Valos a pagar  $ **** ",(cant * prec1);
				Escribir "-------------------------------------------------------------------------";
				
			SiNo Si opcion1 = 2 Entonces
					Escribir "Aspirina forte x800";	
					Escribir "Por favor ingrese la cantidad";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir " Valos a pagar  $ ****  ",cant * prec2;
					Escribir "-------------------------------------------------------------------------";
				SiNo Si opcion1 = 3 Entonces
						Escribir "Suero en sobre X 30Gms";	
						Escribir "Por favor ingrese la cantidad";
						Leer cant;
						Escribir "-------------------------------------------------------------------------";
						Escribir " Valos a pagar  $ ****  ",cant * prec3;
						Escribir "-------------------------------------------------------------------------";
					SiNo
						Escribir "La opcion que elegiste no existe en la lista.";			
					FinSi
				FinSi
			FinSi			
			
			Escribir "por favor seleccione un producto";
			Escribir "1.)Suero en sobre X 30Gms ";
			Escribir "2.)Aspirina forte x800";
			Escribir "3.)Alka seltzer ";
			
			Leer opcion2;						
			Segun opcion2 Hacer
				1:
					Escribir "Suero en sobre X 30Gms";	
					Escribir "Por favor ingrese la cantidad";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir " Valos a pagar  $ ****  ",cant * prec1;
					Escribir "-------------------------------------------------------------------------";
					
				2:
					Escribir "Aspirina forte x800";	
					Escribir "Por favor ingrese la cantidad";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir " Valos a pagar  $ ****  ",cant * prec2;
					Escribir "-------------------------------------------------------------------------";
				3:
					Escribir "Alka seltzer";
					Escribir "Por favor ingrese la cantidad";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir " Valos a pagar  $ ****  ",cant * prec3;
					Escribir "-------------------------------------------------------------------------";
					
				De Otro Modo:
					Escribir "La opcion que elegiste no existe en la lista.";
			FinSegun	
			
			
		2:	
			Escribir "Lista de producros y precios";
			Escribir "*****************************************";
			Escribir "* Suero en sobre X 30Gms ******* $ 400  *";	
			Escribir "* Aspirina forte x800  ********* $ 300  *";
			Escribir "* Alka seltzer   *************** $ 250  *";			
			Escribir "*****************************************";
		3:
			Escribir "*****************************************";
			Escribir "por favor seleccione un producto";
			Escribir "1.)Suero en sobre X 30Gms ";
			Escribir "2.)Aspirina forte x800";
			Escribir "3.)Alka seltzer ";			
			Escribir "*****************************************";
			
			Leer opcion;
			
			Si opcion = 1 Entonces
				Escribir "Suero en sobre X 30Gms";	
				Escribir "Por favor digita la cantidad a devolver";
				Leer cant;
				Escribir "-------------------------------------------------------------------------";
				Escribir "Devolucion realizada con exito, cantidad producto ",cant;
				Escribir "-------------------------------------------------------------------------";
				
			SiNo Si opcion = 2 Entonces
					Escribir "Aspirina forte x800";
					Escribir "Por favor digita la cantidad a devolver";
					Leer cant;
					Escribir "-------------------------------------------------------------------------";
					Escribir "Devolucion realizada con exito, cantidad producto ",cant;
					Escribir "-------------------------------------------------------------------------";
				SiNo Si opcion = 3 Entonces
						Escribir "Alka seltzer ";
						Escribir "Por favor digita la cantidad a devolver";
						Leer cant;
						Escribir "-------------------------------------------------------------------------";
						Escribir "Devolucion realizada con exito, cantidad producto ",cant;
						Escribir "-------------------------------------------------------------------------";							
						
					SiNo
						Escribir "La opcion que elegiste no existe en la lista.";						
					FinSi
				FinSi
			FinSi
		4:
			Escribir "-------------------------------------------------------------------------";
			Escribir "Gracias por su compra señor@ ", NombreCompleto;
			Escribir "-------------------------------------------------------------------------";			
		De Otro Modo:
			Escribir "La opcion que elegiste no existe en la lista.";		
	FinSegun
FinFuncion

Proceso punto5
	
	Drogueria();
	
FinProceso
