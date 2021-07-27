programa
{
	
	funcao inicio()
	{
	/*
	 * Um sistema de equações lineares do tipo: 
	 * 
	 * AX + BY = C
	 * DX + EY = F, Pode ser resolvido segundo mostrado abaixo:
	 * 
	 * X = ( CE - BF ) / ( AE  - BD )
	 * Y = ( AF - CD ) / (AE - BD
	 * 
	 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
	 * e calcula e mostra os valores de x e y. 
	 */
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

		y = ((a * f) - (c * d)) / ((a * e1) - (b * d))

		escreva("Resultado de X: " + x)
		escreva("Resultado de Y: " + y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 742; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */