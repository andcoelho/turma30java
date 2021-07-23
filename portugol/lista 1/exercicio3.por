programa
{
	
	funcao inicio(){
		inteiro segundos1, minutos, horas, segundos
		escreva("Digite o número de segundos: ")
		leia(segundos1)

		horas = segundos1 / 3600
		minutos = segundos1 % 3600 / 60
		segundos = segundos1 %3600 % 60

		escreva(horas, " horas, ", minutos," minutos e ", segundos, " segundos")
	}

		
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */