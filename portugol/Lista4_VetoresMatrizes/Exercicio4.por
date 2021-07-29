programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 4. Crie um programa que receba valores do usuário para preencher 
	 * uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
	 * soma dos valores da primeira diagonal, ou seja, diagonal principal.
	 */

	 	inteiro matriz[3][3], l, c, soma = 0, somaDiagonalPrincipal = 0
	 
	 	para(l=0; l<3; l++){
	 		para(c=0; c<3; c++){
	 			escreva("Digite o valor para matriz[",l,"][",c,"] = ")
	 			leia(matriz[l][c])

	 			soma = soma + matriz[l][c]
	 			se(l == c) {
	 				somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[l][c]
	 			}
	 		}
	 	}
		limpa()
		
	 	escreva("A soma dos elementos é: ",soma)
	 	escreva("\nA soma dos elementos da diagonal principal é: ",somaDiagonalPrincipal)
	 	
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */