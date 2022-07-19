Proceso taller3_Ciclos_punto7
	//7. El parqueadero "El guardián" presta sus servicios de parqueadero nocturno para los usuarios del barrio y requiere una aplicación que permita registrar los vehículos que se
	//cuidan en estas instalaciones. Se sugiere que el parqueadero tenga los atributos del vehículo como son, placa y marca, y los datos del cliente como son nombre completo y número de teléfono. 
	//Para cada vehículo se debe permitir la opción de ingresar al parqueadero, retirar del parqueadero y consultar si un vehículo se encuentra en el parqueadero. Recuerde que
	//el sistema debe terminar cuando el usuario así lo indique. Tenga en presente que el parqueadero solo puede almacenar máximo 5 vehículos.
	
	Definir Placa1, Placa2, Placa3, Placa4, Placa5, Marca1, Marca2, Marca3, Marca4, Marca5  Como Caracter;
	Definir Cliente1, Cliente2, Cliente3, Cliente4, Cliente5, Tel1, Tel2, Tel3, Tel4, Tel5, R1, R2, R3, R4, R5, Placa, I Como Caracter;
	Definir Ingresar1, Ingresar2, Ingresar3, Ingresar4, Ingresar5 Como Caracter;
	Definir Opcion Como Entero;
	Placa1<-"";Placa2<-"";Placa3<-"";Placa4<-"";Placa5<-"";Marca1<-"";Marca2<-"";Marca3<-"";Marca4<-"";Marca5<-"";Ingresar1<-"";Ingresar2<-"";Ingresar3<-"";Ingresar4<-"";Ingresar5<-""; I<-"";
	Tel1<-""; Tel5<-""; Tel2<-""; Tel3<-""; Tel4<-""; Cliente1<-""; Cliente2<-""; Cliente3<-""; Cliente4<-"";  Cliente5<-"";Placa<-""; 
	
	Mientras I <> "4" Hacer
		Escribir "-----------------------------------------------------------------------";
		Escribir "Por favor seleccione una opcion ";
		Escribir "-----------------------------------------------------------------------";
		Escribir "1.) Ingresar Datos al sistema ";
		Escribir "2.) Consultar y dar salida";
		Escribir "3.) Consultar vehiculos que estan en el parqueadero ";
		Escribir "4.) Salir ------>";
		Leer I;
		
		Si I = "1" Entonces
			Escribir "------------------------------------------------";
			Escribir "Ten encuenta que en esta aplicacion solo podras ingresar un total de 5 usuarios,";
			Escribir " digita del 1 hasta el 5 para segun sea el cliente a guardar  ";
			Escribir "------------------------------------------------";
			Leer  Opcion;
			segun Opcion Hacer
				1:
					Escribir "Digite el nombre completo del usuario 1";
					Leer Cliente1;
					Escribir "Digite el telefono del usuario 1";
					Leer Tel1;
					Escribir "Por favor digite la placa del vehiculo";
					Leer Placa1;
					Escribir "Por favor digite la marca del vehiculo";
					Leer Marca1;
					Escribir "Desea ingresar el vehiculo? digite si o no";
					Leer Ingresar1;
					si Ingresar1 = "si" O Ingresar1 = "SI" Entonces
						Escribir "Ingresado al sistema con exito";																		
					FinSi
					
					
				2:	
					Escribir "Digite el nombre completo del usuario 2";
					Leer Cliente2;
					Escribir "Digite el telefono del usuario 2";
					Leer Tel2;
					Escribir "Por favor digite la placa del vehiculo";
					Leer Placa2;
					Escribir "Por favor digite la marca del vehiculo";
					Leer Marca2;
					Escribir "Desea ingresar el vehiculo? digite si o no";
					Leer Ingresar2;
					si Ingresar2 = "si" O Ingresar2 = "SI" Entonces
						Escribir "Ingresado al sistema con exito";																		
					FinSi
				3:
					Escribir "Digite el nombre completo del usuario 3";
					Leer Cliente3;
					Escribir "Digite el telefono del usuario 3";
					Leer Tel3;
					Escribir "Por favor digite la placa del vehiculo";
					Leer Placa3;
					Escribir "Por favor digite la marca del vehiculo";
					Leer Marca3;
					Escribir "Desea ingresar el vehiculo? digite si o no";
					Leer Ingresar3;
					si Ingresar3 = "si" O Ingresar3 = "SI" Entonces
						Escribir "Ingresado al sistema con exito";																		
					FinSi
				4:
					Escribir "Digite el nombre completo del usuario 4";
					Leer Cliente4;
					Escribir "Digite el telefono del usuario 4";
					Leer Tel4;
					Escribir "Por favor digite la placa del vehiculo";
					Leer Placa4;
					Escribir "Por favor digite la marca del vehiculo";
					Leer Marca4;
					Escribir "Desea ingresar el vehiculo? digite si o no";
					Leer Ingresar4;
					si Ingresar4 = "si" O Ingresar4 = "SI" Entonces
						Escribir "Ingresado al sistema con exito";																		
					FinSi
				5:
					Escribir "Digite el nombre completo del usuario 5";
					Leer Cliente5;
					Escribir "Digite el telefono del usuario 5";
					Leer Tel5;
					Escribir "Por favor digite la placa del vehiculo";
					Leer Placa5;
					Escribir "Por favor digite la marca del vehiculo";
					Leer Marca5;
					Escribir "Desea ingresar el vehiculo? digite si o no";
					Leer Ingresar5;
					si Ingresar5 = "si" O Ingresar5 = "SI" Entonces
						Escribir "Ingresado al sistema con exito";																		
					FinSi				
					
				De Otro Modo:
					Escribir "La opcion que elegistes no esta disponible";
			FinSegun
		FinSi			
		
		
		
		Si I = "2" Entonces
			Si Ingresar1 = "si" O Ingresar1 = "SI" Entonces
				Escribir "-----------------------Datos-------------------------------------------";
				Escribir "Cliente ",Cliente1,", Telefono ",Tel1;
				Escribir "El vehiculo de placas ",Placa1,", marca ",Marca1;
				Escribir "se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ";
				Leer Ingresar1;
				si Ingresar1 = "si" O Ingresar1 = "SI" Entonces
					Escribir "su vehiculo placas ",Placa1," marca ",marca1, " continua en nuestras instalaciones";																		
				FinSi
				si Ingresar1 = "no" O Ingresar1 = "NO" Entonces
					Escribir "-----------------------------------------------------------------------";
					Escribir "Se ha dado salida, vehiculo placas ",Placa1," marca ",marca1;
					Escribir "Señor@ ", Cliente1," Gracias por usar nuestro sevcio. Vuelva Pronto!";
					Escribir "-----------------------------------------------------------------------";
					
				FinSi
				
			FinSi
			
			
		    Si Ingresar2 = "si" O Ingresar2 = "SI" Entonces
				Escribir "-----------------------Datos-------------------------------------------";
				Escribir "Cliente ",Cliente2,", Telefono ",Tel2;
				Escribir "El vehiculo de placas ",Placa2,", marca ",Marca2;
				Escribir "se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ";
				Leer Ingresar2;
				si Ingresar2 = "si" O Ingresar2 = "SI" Entonces
					Escribir "su vehiculo placas ",Placa2," marca ",marca2, " continua en nuestras instalaciones";																		
				FinSi
				si Ingresar2 = "no" O Ingresar2 = "NO" Entonces
					Escribir "-----------------------------------------------------------------------";
					Escribir "Se ha dado salida, vehiculo placas ",Placa2," marca ",marca2;	
					Escribir "Señor@ ", Cliente2," Gracias por usar nuestro sevcio. Vuelva Pronto!";
				FinSi
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Ingresar3 = "si" O Ingresar3 = "SI" Entonces
				Escribir "-----------------------Datos-------------------------------------------";
				Escribir "Cliente ",Cliente3,", Telefono ",Tel3;
				Escribir "El vehiculo de placas ",Placa3,", marca ",Marca3;
				Escribir "se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ";
				Leer Ingresar3;
				si Ingresar3 = "si" O Ingresar3 = "SI" Entonces
					Escribir "su vehiculo placas ",Placa3," marca ",marca3, " continua en nuestras instalaciones";																		
				FinSi
				si Ingresar3 = "no" O Ingresar3 = "NO" Entonces
					Escribir "-----------------------------------------------------------------------";
					Escribir "Se ha dado salida, vehiculo placas ",Placa3," marca ",marca3;
					Escribir "Señor@ ", Cliente3," Gracias por usar nuestro sevcio. Vuelva Pronto!";
					Escribir "-----------------------------------------------------------------------";
				FinSi
				
			FinSi
			
			Si Ingresar4 = "si" O Ingresar4 = "SI" Entonces
				Escribir "-----------------------Datos-------------------------------------------";
				Escribir "Cliente ",Cliente4,", Telefono ",Tel4;
				Escribir "El vehiculo de placas ",Placa4,", marca ",Marca4;
				Escribir "se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ";
				Leer Ingresar4;
				si Ingresar4 = "si" O Ingresar4 = "SI" Entonces
					Escribir "su vehiculo placas ",Placa4," marca ",marca4, " continua en nuestras instalaciones";																		
				FinSi
				si Ingresar4 = "no" O Ingresar4 = "NO" Entonces
					Escribir "-----------------------------------------------------------------------";
					Escribir "Se ha dado salida, vehiculo placas ",Placa4," marca ",marca4;
					Escribir "Señor@ ", Cliente4," Gracias por usar nuestro sevcio. Vuelva Pronto!";
				FinSi
				Escribir "-----------------------------------------------------------------------";
			FinSi
			
			Si Ingresar5 = "si" O Ingresar5 = "SI" Entonces
				Escribir "-----------------------Datos-------------------------------------------";
				Escribir "Cliente ",Cliente5,", Telefono ",Tel5;
				Escribir "El vehiculo de placas ",Placa5,", marca ",Marca5;
				Escribir "se encuentra en nuestra instalaciones, desea que continue en el parqueadero? si, no ";
				Leer Ingresar5;
				si Ingresar5 = "si" O Ingresar5 = "SI" Entonces
					Escribir "su vehiculo placas ",Placa5," marca ",marca5, " continua en nuestras instalaciones";																		
				FinSi
				si Ingresar5 = "no" O Ingresar3 = "NO" Entonces
					Escribir "-----------------------------------------------------------------------";
					Escribir "Se ha dado salida, vehiculo placas ",Placa5," marca ",marca5;
					Escribir "Señor@ ", Cliente5," Gracias por usar nuestro sevcio. Vuelva Pronto!";
				FinSi
				Escribir "-----------------------------------------------------------------------";
			FinSi			
			
		FinSi 
		
		Si I = "3"	Entonces
			Escribir "Por favor digite la placa del vehiculo que desea consultar";
			Leer Placa;	
			Si Placa == Placa1 Entonces
				Escribir "El vehiculo de placas ",Placa1, " Se encuentra en nuestras instalaciones";
			FinSi
			
			Si Placa == Placa2 Entonces
				Escribir "El vehiculo de placas ",Placa2, " Se encuentra en nuestras instalaciones";
			FinSi
			Si Placa == Placa3 Entonces
				Escribir "El vehiculo de placas ",Placa3, " Se encuentra en nuestras instalaciones";
			FinSi
			Si Placa == Placa4 Entonces
				Escribir "El vehiculo de placas ",Placa4, " Se encuentra en nuestras instalaciones";
			FinSi
			Si Placa == Placa5 Entonces
				Escribir "El vehiculo de placas ",Placa5, " Se encuentra en nuestras instalaciones";
			FinSi
			Si Placa <> Placa1 Y Placa <> Placa2 Y Placa <> Placa3 Y Placa <> Placa4 Y Placa <> Placa5 Entonces
				Escribir "El vehiculo de placas ",Placa, " no se encuentra en nuestras instalaciones";
			FinSi		
			
		FinSi	
		
		Si I = "4"	Entonces
			Escribir "Gracias por usar esta aplicacion";
			
		FinSi
		
		
	FinMientras	
	
FinProceso
