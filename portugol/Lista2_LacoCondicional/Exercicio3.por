programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho - GENERATION T-30
	 * 
	 * 3) Desenvolva um sistema em que:
	 *Leia 4 (quatro) números;
	 *Calcule o quadrado de cada um;
	 *Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	 *Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */

	 	real numero1, numero2, numero3, numero4
	 	real quadrado1, quadrado2, quadrado3, quadrado4

	 	escreva("Digite o primeiro número: ")
	 	leia(numero1)
	 	escreva("Digite o segundo número: ")
	 	leia(numero2)
	 	escreva("Digite o terceiro número: ")
	 	leia(numero3)
	 	escreva("Digite o quarto número: ")
	 	leia(numero4)

		quadrado1 = numero1 * numero1
		quadrado2 = numero2 * numero2
		quadrado3 = numero3 * numero3
		quadrado4 = numero4 * numero4
		limpa()

		se(quadrado3 >= 1000){
			escreva("quadrado de ", numero3,"= ", quadrado3)
		}
		senao{
			escreva("quadrado de ", numero1,"= ", quadrado1)
			escreva("\nquadrado de ", numero2,"= ", quadrado2)
			escreva("\nquadrado de ", numero3,"= ", quadrado3)
			escreva("\nquadrado de ", numero4,"= ", quadrado4)
		}
		
	 

	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 898; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */