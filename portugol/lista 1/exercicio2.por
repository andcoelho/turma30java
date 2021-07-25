programa
{
	
	funcao inicio()
	{

	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
	 * e mostre-a expressa em anos, meses e dias. 

	 */
		inteiro dia, ano, mes, dia1 // variáveis
		escreva("Digite sua idade em dias: ")
		leia(dia)

		ano = dia/365    
		mes = dia%365 / 30
		dia1 = (dia%365) % 30

		/*
		 * mes = o resto de dia/365 são os dias que não completam um ano,
		 * dividindo-se por 30 tem-se os meses
		 * 
		 * dia = o resto de dia/365 são os dias que não completam um ano,
		 * o resto da divisão (dia%365) %30 são os dias que não completam um mês
		 */
		escreva("Você tem ", ano, " anos, ", mes," meses, e ", dia1," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */