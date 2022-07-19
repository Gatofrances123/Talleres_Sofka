Funcion Taller_Motos()
	
	Definir Hora,Usuario,PlacaMoto,aux,aux2, HoraS Como Caracter;
	Definir General, LLantas, Motor, Parachoques, Otros Como Entero;
	Escribir "----------------------------------------:";
	Escribir "_____________Cuestionario________________";
	Escribir "----------------------------------------:";
	Escribir "Nombre Usuario:";
	leer Usuario;
	Escribir "Placa Moto:";
	leer PlacaMoto;
	Escribir "Hora de entrada:";
	leer Hora;
	Escribir "Revision Geneal Si = 1, No = 0";
	leer General;
	Escribir "2. Cambir LLantas Si = 1, No = 0";
	leer LLantas;
	Escribir "3. Revision Motor Si = 1, No = 0";
	leer Motor;
	Escribir "4. Arreglar Parachoques Si = 1, No = 0";
	leer Parachoques;
	Escribir "5. Otros Si = 1, No = 0";
	leer Otros;
	
	aux<-"";
	Si General =  1 entonces
		aux<-Concatenar(aux,"Revision General: SI, ");
	SiNo
		aux<-Concatenar(aux,"Revision General: NO, ");
	FinSi
	Si LLantas =  1 entonces
		aux<-Concatenar(aux,"Cambiar Llantas: SI, ");
	SiNo
		aux<-Concatenar(aux,"Cambiar Llantas: NO, ");
	FinSi
	Si Motor =  1 entonces
		aux<-Concatenar(aux,"Revisar Motor: SI, ");
	SiNo
		aux<-Concatenar(aux,"Revisar Motor: NO, ");
	FinSi
	Si Parachoques =  1 entonces
		aux<-Concatenar(aux,"Arreglar Parachoques: SI, ");
	SiNo
		aux<-Concatenar(aux,"Arreglar Parachoques: NO, ");
	FinSi
	Si Otros =  1 entonces
		Escribir "Descripcion Otros";
		Leer aux2;
		aux<-Concatenar(Concatenar(aux,"Otros:"),aux2);
	SiNo
		aux<-Concatenar(aux,"Otros: NO, ");
	FinSi
	
	Escribir "Hora de salida:";
	leer HoraS;
	
	Escribir "";
	Escribir "";
	Escribir "---------------------------------------------";
	Escribir "Informacion de la motocicleta";
	Escribir concatenar("Usuario: ",Usuario);
	Escribir concatenar("Placa: ",PlacaMoto);
	Escribir concatenar("Hora entrada: ",Hora);
	Escribir concatenar("Hora Salida: ",HoraS);
	Escribir aux;
	
FinFuncion


Proceso Punto6
	Taller_Motos();
FinProceso
