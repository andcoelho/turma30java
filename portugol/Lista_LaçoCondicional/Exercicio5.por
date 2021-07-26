programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
	 * 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
	 * O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe 
	 * para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas 
	 * atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo 
	 * são intimadas a suspenderem suas atividades, se o índice atingir 0,5 
	 * todos os grupos devem ser notificados a paralisarem suas atividades. 
	 * Faça um sistema que leia o índice de poluição medido e emita a 
	 * notificação adequada aos diferentes grupos de empresas.
	 */

	 	real indicePoluicao 

	 	escreva("igite o índice de poluição: ")
	 	leia(indicePoluicao)
	 	limpa()

	 	se(indicePoluicao >= 0.05 e indicePoluicao <= 0.25) {
	 		escreva("Valor índice: ", indicePoluicao,"\nÍndice aceitável")
	 	}
	 	senao se(indicePoluicao > 0.25 e indicePoluicao <= 0.30) {
	 		escreva("Valor índice: ", indicePoluicao)
	 		escreva("\nEmpresas do 1º grupo: ATIVIDADES SUSPENSAS!")
	 	}
	 	senao se(indicePoluicao > 0.3 e indicePoluicao <= 0.4) {
	 		escreva("Valor índice: ", indicePoluicao)
	 		escreva("\nEmpresas do 1º e 2º grupo: ATIVIDADES SUSPENSAS!")
	 	}
	 	senao se(indicePoluicao > 0.4 e indicePoluicao <= 0.5) {
	 		escreva("Valor índice: ", indicePoluicao)
	 		escreva("\nEmpresas de todos os grupos: ATIVIDADES SUSPENSAS!")
	 	}
	 	
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */