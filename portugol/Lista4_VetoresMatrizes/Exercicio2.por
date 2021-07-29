programa
{
	inclua biblioteca Util --> U
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
	 * e apresente também quantas foram as ocorrências da maior pontuação.
	 */

		const inteiro MAX = 10
	 	inteiro dado[MAX], x, maiorValor = 0
	 	real media, contador = 0.0

	 	para(x = 0; x< 10; x++){
	 		dado[x] = U.sorteia(1,6)
	 		escreva("\nLançamento [",x + 1,"] = ",dado[x])
	 		contador = contador + dado[x]	 	
	 		se(dado[x] > maiorValor){
	 			maiorValor = dado[x]
	 				
	 		}
	 	}
	 	escreva("\nContador = ", contador)
	 	media = contador / 10
	 	escreva("\nMédia dos lançamentos: ",media)
	 	escreva("\nMaior valor :",maiorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 558; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 19, 11, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */