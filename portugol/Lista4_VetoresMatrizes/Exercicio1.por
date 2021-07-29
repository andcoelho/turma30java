programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação 
	 * de uma atividade e o escreva em seguida. Encontre após a maior pontuação e a 
	 * apresente. 
	 */

		const inteiro MAX = 5
		inteiro vetor[MAX], i, maiorValor = 0

		para(i = 0; i<5; i++){
			escreva("Digite o valor: ")
			leia(vetor[i])	
			se(vetor[i] > maiorValor){
				maiorValor = vetor[i]
			}
					
		}
		limpa()

		para(i = 0; i<5; i++){
			escreva("Vetor[", i,"] = ",vetor[i], "\n")
		}

		escreva("\nO maior valor é: ", maiorValor)
		

		

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */