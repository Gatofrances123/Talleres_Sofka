
Funcion persona()
	
	
		definir peso,estatura,imc como real;	
		definir masa Como Caracter;
		
		Escribir "Por favor ingrese su peso en kilogramos";
		Leer peso;
		Escribir "Por favor ingrese su estatura en metros";
		Leer estatura;
		
		imc <- peso/(estatura*estatura);
		 
		Si imc < 18.5 Entonces
			masa <- "bajo de peso";
		SiNo
			si imc < 24.8 Entonces
				masa <- "peso normal";
			SiNo
				si imc <29.8 Entonces
					masa<-"sobrepeso";
				SiNo
					masa<-"Obeso";
				FinSi
				
			FinSi
		FinSi
		Escribir "Tu indice de masa corporal es: ",imc," te encuentras en el rango de ",masa,".";
FinFuncion

Proceso taller7
	persona();
FinProceso
