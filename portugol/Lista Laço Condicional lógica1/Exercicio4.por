programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
	 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
	 */

	 	inteiro numero
	 	escreva("Digite o número: ")
	 	leia(numero)
	 	limpa()

	 	se(numero == 0){
	 		escreva("Número neutro")
	 	}
	 	senao se( numero < 0){
	 		escreva("Número negativo")
	 	}
	 	senao {
	 		se((numero % 2) == 0){
	 			escreva("Número positivo e par")
	 		}
	 		senao{
	 			escreva("Número positivo e ímpar")
	 		}
	 		
	 	}
	 	
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 560; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */