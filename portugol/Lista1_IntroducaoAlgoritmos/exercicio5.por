programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	/*
	 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final 
	 * deste aluno. Considerar que a média é ponderada e que o peso das notas 
	 * é: 2,3 e 5, respectivamente. 
	 */
		real nota1, nota2, nota3, media
		escreva("Digite o valor da primeira nota: ")
		leia(nota1)
		escreva("Digite o valor da segunda nota: ")
		leia(nota2)
		escreva("Digite o valor da terceira nota: ")
		leia(nota3)

		media = Matematica.arredondar((nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5),2)

		/*
		 * Biblioteca matemática para limitar casas decimais
		 */

		escreva("Sua média é: " + media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */