programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	/*
	 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	 * com a percentagem do distribuidor e dos impostos 
	 * (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor 
	 * seja de 28% e os impostos de 45%, escrever um sistema que leia 
	 * o custo de fábrica de um carro e escreva o custo ao consumidor. 
	 */
		real valorInicial, valorFinal, imposto, distribuicao
		escreva("Digite o valor de fábrica: ")
		leia(valorInicial)

		imposto = Matematica.arredondar((valorInicial * 0.45),2)
		distribuicao = Matematica.arredondar((valorInicial * 0.28),2) 

		valorFinal = Matematica.arredondar((valorInicial + imposto + distribuicao),2)

		/*
		 * Função arredondar para limitar casas decimais
		 */
		 
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
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */