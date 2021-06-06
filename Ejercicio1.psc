Algoritmo PseudocodigoEjercicio1
	Definir N, impares, pares Como Entero
	Escribir "Ingrse un numero:"
	Leer N
	Para i<-1 Hasta N Con Paso 1 Hacer
		numAle <- Aleatorio(1,100)
		Si numAle MOD 2 = 0 Entonces
			pares <- pares+1;
		SiNo
			impares <- impares+1
		Fin Si
	Fin Para
	
	Escribir N
	Escribir "Numero pares ", pares
	Escribir "numeros impares ", impares
	
FinAlgoritmo
