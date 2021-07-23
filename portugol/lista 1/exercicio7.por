programa
{
	
	funcao inicio()
	{
		real a, b, c, d, e1, f, x, y

		escreva("Digite o valor da letra A: ")
		leia(a)
		escreva("Digite o valor da letra B: ")
		leia(b)
		escreva("Digite o valor da letra C: ")
		leia(c)
		escreva("Digite o valor da letra D: ")
		leia(d)
		escreva("Digite o valor da letra E: ")
		leia(e1)
		escreva("Digite o valor da letra F: ")
		leia(f)

		x =  ((c * e1) - (b * f)) / ((a * e1) - (b * d))

		y = ((a * f) - (c * a)) / ((a * e1) - (b * d))

		escreva("Resultado de X: " + x)
		escreva("Resultado de Y: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */