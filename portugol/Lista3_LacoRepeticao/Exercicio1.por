programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus 
	 * habitantes, coletando dados sobre o salário e número de filhos. 
	 * A prefeitura deseja saber:   
	 * a) média do salário da população; 
      * b) média do número de filhos; 
      * c) maior salário; 
      * d) percentual de pessoas com salário até R$100,00.  
	 *
	 */

	inteiro habitante, filhos, filhosTotal = 0, maximoHabitantes = 20
	 real salario, mediaSalario, salarioTotal = 0, mediaFilhos, salarioAte100 = 0
	 real maiorSalario = 0, porcentagemSalario = 0

	 para(habitante = 1; habitante <= maximoHabitantes; habitante++) {
	 	escreva("Digite seu salário: ")
	 	leia(salario)
		salarioTotal = salarioTotal + salario

		 se(salario > maiorSalario) {
		 	maiorSalario = salario
		 }

		 se(salario <= 100){
		 	salarioAte100 = salarioAte100 + 1
		 	
		 }

		//b) média do número de filhos;
		escreva("Digite o número de filhos: ")
		leia(filhos)
		filhosTotal = filhosTotal + filhos
		
	 	
	 }
	 limpa()

	 mediaSalario = salarioTotal / maximoHabitantes
	 mediaFilhos = filhosTotal / maximoHabitantes

	 porcentagemSalario = (salarioAte100 / maximoHabitantes) * 100
	 

	 escreva("Salario total: ",salarioTotal)
	 escreva("\nMédia salário: ", mediaSalario)

	 escreva("\nTotal de filhos: ", filhosTotal)
	 escreva("\nMédia filhos: ", mediaFilhos)

	 escreva("\nO maior salário é: ", maiorSalario)

	 escreva("\nPorcentagem salário até 100: ", porcentagemSalario, "%")

	  

	 
	 

	 

	 

	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 501; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */