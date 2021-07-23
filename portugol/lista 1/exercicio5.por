programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media
		escreva("Digite o valor da primeira nota: ")
		leia(nota1)
		escreva("Digite o valor da segunda nota: ")
		leia(nota2)
		escreva("Digite o valor da terceira nota: ")
		leia(nota3)

		media = Matematica.arredondar((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5),2)

		escreva("Sua média é: " + media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */