programa
{
	
	funcao inicio()
	{
	/*
	 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias. 
	 */

	 
		inteiro ano, mes, dias, total    // variáveis
		escreva("Digite sua idade em anos: ")
		leia(ano)
		escreva("Digite em meses: ")
		leia(mes)
		escreva("Digite em dias: ")
		leia(dias)

		total = (ano * 365) + (mes * 30) + dias

		escreva("Você tem ", total, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */