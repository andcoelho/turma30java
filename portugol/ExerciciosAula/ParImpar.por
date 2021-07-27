programa
{
	
	funcao inicio()
	{
	/*
	 * Digite um número e calcule se ele é par ou ímpar
	 */
		inteiro numero
		escreva("Digite o número: ")
		leia(numero)

		se( numero == 0){
			escreva("Número neutro, digite outro número")
		}
		senao se( numero < 0){
			escreva("Número negativo, digite outro número")
		}
		senao{
			se(numero%2 == 0){
				escreva("Número par")
			}
			senao{
				escreva("Número impar")
			}
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 94; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */