Proceso taller2_condicionales_punto8
	//8. El pastelero Don Carlos es el mejor pastelero de la ciudad y requiere una aplicación que lepermita registrar los pedidos de los clientes 
	//en cuanto a las tortas que realiza.Cada torta tiene unas características propias como sabor, cantidad (porciones) y decoraciones). 
	//Se requiere que la aplicación permita registrar los pedidos, las tortas disponibles y las ventas que se registren diariamente.
	
	Definir doc, opc, cant, prec1, prec2, prec3, prec4, total, contador Como Entero;
	Definir nomb Como Caracter;
	prec1<-5000;
	prec4<-6000;
	prec3<-2500;
	prec2<-3000;
	
	
	Escribir "------------------------------------------------------------------------";
	Escribir "Bienvenidos a pasteleria don Carlos, ingresa y seleciona lo que deseas";
	Escribir "------------------------------------------------------------------------";
	Escribir "Datos de clientes.";
	Escribir "Por favor ingrese su nombre completo.";
	Leer nomb;
	Escribir "Por favor digite su documento.";
	Leer doc;
	
	Repetir
		
		Escribir "Elija una opcion segun guste.";
		Escribir "1.) Torta grande Chocolate 12 porciones.";
		Escribir "2.) Torta grande Frutos Rojos 12 porciones.";
		Escribir "3.) Torta pequeña chocolate 6 porciones.";
		Escribir "4.) Torta pequeña Frutos Rojos 6 porciones.";
		Escribir "5.) Salir ----->";
		Leer opc;
		Segun opc Hacer
			1:
				Escribir "Usted ha seleccionado Torta grande Chocolate 12 porciones. $**  ",prec1;
				Escribir "Por favor digite cantidad que desea llevar";
				Leer cant;
				Escribir "------------------------------------------------------------------------";
				Escribir "Señor(a)  ",nomb;
				Escribir "Pedido de compra realizado con exito";				
				Escribir "********** Torta grande Chocolate 12 porciones";
				Escribir "********** Catidad  ",cant," Total a pagar $ ",(cant*prec1);
				Escribir "------------------------------------------------------------------------";
				Esperar Tecla;
				Limpiar Pantalla;
				
	        2:
				Escribir "Usted ha seleccionado Torta grande Frutos Rojos 12 porciones. $**  ",prec4;
				Escribir "Por favor digite cantidad que desea llevar";
				Leer cant;
				Escribir "------------------------------------------------------------------------";
				Escribir "Señor(a)  ",nomb;
				Escribir "Pedido de compra realizado con exito";				
				Escribir "********** Torta grande Frutos Rojos 12 porciones";
				Escribir "********** Catidad  ",cant," Total a pagar $ ",(cant*prec2);
				Escribir "------------------------------------------------------------------------";
				Esperar Tecla;
				Limpiar Pantalla;
			3:
				Escribir "Usted ha seleccionado Torta pequeña Chocolate 6 porciones. $**  ",prec3;
				Escribir "Por favor digite cantidad que desea llevar";
				Leer cant;
				Escribir "------------------------------------------------------------------------";
				Escribir "Señor(a)  ",nomb;
				Escribir "Pedido de compra realizado con exito";				
				Escribir "********** Torta pequeña Chocolate 6 porciones";
				Escribir "********** Catidad  ",cant," Total a pagar $ ",(cant*prec3);
				Escribir "------------------------------------------------------------------------";
				Esperar Tecla;
				Limpiar Pantalla;
			4:
				Escribir "Usted ha seleccionado Torta pequeña Frutos Rojos 6 porciones. $**  ",prec2;
				Escribir "Por favor digite cantidad que desea llevar";
				Leer cant;
				Escribir "------------------------------------------------------------------------";
				Escribir "Señor(a)  ",nomb;
				Escribir "Pedido de compra realizado con exito";				
				Escribir "********** Torta pequeña Frutos Rojos 6 porciones";
				Escribir "********** Catidad  ",cant," Total a pagar $ ",(cant*prec2);
				Escribir "------------------------------------------------------------------------";
				Esperar Tecla;
				Limpiar Pantalla;
			De Otro Modo:
				Escribir "Usted ha seleccionado una opcion que no esta disponible..";
				Esperar Tecla;
				Limpiar Pantalla;
		FinSegun
		
	Hasta Que opc =5;
	
	
	
FinProceso
