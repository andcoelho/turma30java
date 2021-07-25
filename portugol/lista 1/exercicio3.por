programa
{
	
	funcao inicio(){

	/*
	 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
		inteiro segundos1, minutos, horas, segundos
		escreva("Digite o número de segundos: ")
		leia(segundos1)

		horas = segundos1 / 3600
		minutos = segundos1 % 3600 / 60
		segundos = segundos1 %3600 % 60

		/*
		 * minutos = o resto de segundos/3600 são os segundos que não completam
		 * uma hora, dividindo por 60 tem a quantidade de minutos
		 * 
		 * segundos = o resto de segundos/3600 são os segundos que não completam
		 * uma hora, o resto de segundos/3600 %60 são os segundos restantes
		 * que não completam um minuto		 * 
		 */

		escreva(horas, " horas, ", minutos," minutos e ", segundos, " segundos")
	}

		
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 723; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */