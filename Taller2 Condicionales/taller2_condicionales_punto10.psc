Proceso taller2_condicionales_punto10
	//El banco "Su banco fiel" es un banco que inicia sus actividades financieras y necesita una aplicación para llevar las cuentas de sus usuarios; por lo tanto, se sugiere que la cuenta tenga los atributos titular y cantidad.
	//Para cada cliente las cuentas permitirán realizar ingresos, retiros o consultas de valor. En los ingresos no se pueden insertar valores negativos y para los retiros el valor no puede ser mayor al valor que tiene en la cuenta.
	Definir nombrecompleto, nombre1, documento1, nombre2, documento2, nombre3, documento3, documento,cuenta1, cuenta2, cuenta3, cuenta Como Caracter;
	Definir ingreso, retiro, saldo, saldo1, saldo2, saldo3, opcion Como Entero;
	documento1<-"10121";
	cuenta1<-"10";
	nombre1<-"Maria Rodriguez";
	saldo1<-20000;
	
	documento2<-"10122";
	cuenta1<-"20";
	nombre2<-"Jose Castro";
	saldo2<-25000;
	
	documento3<-"10123";
	cuenta1<-"30";
	nombre3<-"Mariana Betancourt";
	saldo3<-30000;	
	
	Escribir "---------------------------------------------------";
	Escribir "          Bienvenido a su Banco Fiel";
	Escribir "           Por favor elija la opcion";
	Escribir "---------------------------------------------------";
	
	Escribir "1. Consultar saldo.?";
	Escribir "2. Realizar un retiro.?";
	Escribir "3. realizar consignacion.?";
	Escribir "4. --> salir.?";
	Leer opcion;
	
	
	
	Segun opcion Hacer
		1:
			Escribir "Por favor digite su documento tal cual como fue ingreado al sistema. ";
			Leer documento;
			Escribir "Por favor digite su numero de cuenta. ";
			Leer cuenta;   
			
			Si documento = "10121" Y cuenta = "10" Entonces
				Escribir "Bienvenido(a) señor(a) ",nombre1;	
				Escribir "-------------------------------------------------------------------------------------------";
				Escribir "Usted tiene actualmente un saldo de $*** ",saldo1;
				Escribir "-------------------------------------------------------------------------------------------";
				
			SiNo
				Si documento = "10122" Y cuenta = "20" Entonces
					Escribir "Bienvenido(a) señor(a) ",nombre2;
					Escribir "-------------------------------------------------------------------------------------------";
					Escribir "Usted tiene actualmente un saldo de $*** ",saldo2;
					Escribir "-------------------------------------------------------------------------------------------";
				SiNo
					Si documento = "10123" Y cuenta = "30" Entonces
						Escribir "Bienvenido(a) señor(a) ",nombre3;
						Escribir "-------------------------------------------------------------------------------------------";
						Escribir "Usted tiene actualmente un saldo de $*** ",saldo3;
						Escribir "-------------------------------------------------------------------------------------------";
					SiNo
						Escribir "-------------------------------------------------------------------------------------------------------";
						Escribir  "Lo sentimos su nombre o documento estan mal escritos, o quizas usted, no es usuario de nuestro Banco";
						Escribir "-------------------------------------------------------------------------------------------";
					FinSi
				FinSi
			FinSi
		2:
			
			Escribir "Por favor digite su documento tal cual como fue ingreado al sistema. ";
			Leer documento;
			Escribir "Por favor digite su numero de cuenta. ";
			Leer cuenta;   			
			
			Si documento = "10121" Y cuenta = "10" Entonces
				Escribir "Bienvenido(a) señor(a) ",nombre1;				
				Escribir "Por favor digite la cantidad de dinero a retirar $*** ?";
				Leer retiro;
				Si retiro <= saldo1 Entonces
					Escribir "-------------------------------------------------------------------------------------------";
					Escribir "Su retieo fue efectuado con Exito, su nuevo saldo es $****** ",(saldo1-retiro);
					Escribir "-------------------------------------------------------------------------------------------";
				SiNo		
					Escribir "-------------------------------------------------------------------------------------------";
					escribir "usted no tiene fondos suficientes para este retiro, saldo $******** ",saldo1;
					Escribir "-------------------------------------------------------------------------------------------";
				FinSi
				
			SiNo
				Si documento = "10122" Y cuenta = "20" Entonces
					Escribir "Bienvenido(a) señor(a) ",nombre2;
					Escribir "Por favor digite la cantidad de dinero a retirar $*** ?";
					Leer retiro;
					Si retiro <= saldo2 Entonces
						Escribir "-------------------------------------------------------------------------------------------";
						Escribir "Su retieo fue efectuado con Exito, su nuevo saldo es $****** ",(saldo2-retiro);
						Escribir "-------------------------------------------------------------------------------------------";
					SiNo		
						Escribir "-------------------------------------------------------------------------------------------";
						escribir "usted no tiene fondos suficiente para este retiro, saldo $******** ",saldo2;
						Escribir "-------------------------------------------------------------------------------------------";
					FinSi
				SiNo
					Si documento = "10123" Y cuenta = "30" Entonces
						Escribir "Bienvenido(a) señor(a) ",nombre3;
						Escribir "Por favor digite la cantidad de dinero a retirar $*** ?";
						Leer retiro;
						Si retiro <= saldo3 Entonces
							Escribir "-------------------------------------------------------------------------------------------";
							Escribir "Su retieo fue efectuado con Exito, su nuevo saldo es $****** ",(saldo3-retiro);
							Escribir "-------------------------------------------------------------------------------------------";
						SiNo		
							Escribir "-------------------------------------------------------------------------------------------";
							escribir "usted no tiene fondos suficiente para este retiro, saldo $******** ",saldo3;
							Escribir "-------------------------------------------------------------------------------------------";
						FinSi
					SiNo
						Escribir  "Lo sentimos su nombre o documento estan mal escritos, o quizas usted, no es usuario de nuestro Banco";
					FinSi
				FinSi
			FinSi
		3:
			Escribir "Por favor digite su documento tal cual como fue ingreado al sistema. ";
			Leer documento;
			Escribir "Por favor digite su numero de cuenta. ";
			Leer cuenta;   
			
			Si documento = "10121" Y cuenta = "10" Entonces
				Escribir "Bienvenido(a) señor(a) ",nombre1;
				Escribir "Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?";
				Leer ingreso;
				Si ingreso >0 Entonces
					Escribir "-------------------------------------------------------------------------------------------";
					Escribir "Su consignacion fue efectuada con Exito, su nuevo saldo es $****** ",(saldo1+ingreso);
					Escribir "-------------------------------------------------------------------------------------------";
				SiNo		
					Escribir "-------------------------------------------------------------------------------------------";
					escribir "Usted esta digitando valores no permitidos para esta operacion  ";
					Escribir "-------------------------------------------------------------------------------------------";
				FinSi			
				
				
			SiNo
				Si documento = "10122" Y cuenta = "20" Entonces
					Escribir "Bienvenido(a) señor(a) ",nombre2;
					Escribir "Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?";
					Leer ingreso;
					Si ingreso >0 Entonces
						Escribir "-------------------------------------------------------------------------------------------";
						Escribir "Su consignacion fue efectuada con Exito, su nuevo saldo es $****** ",(saldo2+ingreso);
						Escribir "-------------------------------------------------------------------------------------------";
					SiNo		
						Escribir "-------------------------------------------------------------------------------------------";
						escribir "Usted esta digitando valores no permitidos para esta operacion  ";
						Escribir "-------------------------------------------------------------------------------------------";
					FinSi	
				SiNo
					Si documento = "10123" Y cuenta = "30" Entonces
						Escribir "Bienvenido(a) señor(a) ",nombre3;
						Escribir "Por favor digite la cantidad de dinero que desea consignar en su cuenta $*** ?";
						Leer ingreso;
						Si ingreso >0 Entonces
							Escribir "-------------------------------------------------------------------------------------------";
							Escribir "Su consinacion fue efectuada con Exito, su nuevo saldo es $****** ",(saldo3+ingreso);
							Escribir "-------------------------------------------------------------------------------------------";
						SiNo		
							Escribir "-------------------------------------------------------------------------------------------";
							escribir "Usted esta digitando valores no permitidos para esta operacion  ";
							Escribir "-------------------------------------------------------------------------------------------";
						FinSi	
					SiNo
						Escribir  "Lo sentimos su documento o numero de cuenta estan mal escritos, o quizas usted, no es usuario de nuestro Banco";
					FinSi
				FinSi			
			FinSi
		4:	
			Escribir "-------------------------------------------------------------";
			Escribir "********  Fue un placer servirle, hasta luego  ***********";
			Escribir "-------------------------------------------------------------";
		De Otro Modo:
			Escribir "Esta opcion no esta permitida.";
	FinSegun
	
	
FinProceso
