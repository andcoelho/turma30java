programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real valorInicial, valorFinal, imposto, distribuicao
		escreva("Digite o valor de fábrica: ")
		leia(valorInicial)

		imposto = Matematica.arredondar((valorInicial * 0.45),2)
		distribuicao = Matematica.arredondar((valorInicial * 0.28),2) 

		valorFinal = Matematica.arredondar((valorInicial + imposto + distribuicao),2)

		escreva("\nCusto do imposto: " + imposto)
		escreva("\nCusto de distribuição: " + distribuicao)
		escreva("\nValor final: " + valorFinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */