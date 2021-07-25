programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
	/*
	 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos 
	 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
	 * A fórmula que efetua tal cálculo é
	 * 
	 * D = Raiz( (X2 - X1)² + (Y2 - Y1)² )
	 */
		real x1, x2, y1, y2, p1, p2, d

		escreva("Digite o valor de x1: ")
		leia(x1)
		escreva("Digite o valor de x2: ")
		leia(x2)
		escreva("Digite o valor de y1: ")
		leia(y1)
		escreva("Digite o valor de y2: ")
		leia(y2)

		p1 = mat.potencia((x1 - x2), 2) // Função potencia para calcular potencia
		p2 = mat.potencia((y1 - y2), 2)

		d = mat.raiz((p1 + p2), 2) // Função raiz para calcular raiz

		escreva(d)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 718; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */