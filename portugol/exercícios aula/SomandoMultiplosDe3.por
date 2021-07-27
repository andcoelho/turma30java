programa
{
	
	funcao inicio()
	{
	/*
	 * Some todos os múltiplos de 3, de 1 a 100
	 * 
	 * 
	 */

	 	inteiro total = 0

	 	para(inteiro x = 1; x <= 100; x++){
	 		se((x % 3) == 0){
	 			total = total + x // total += x
	 		}	 				 		
	 	}
	 	escreva("\nTotal: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */