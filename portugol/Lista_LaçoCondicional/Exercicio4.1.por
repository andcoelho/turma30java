programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Digite o número: ")
		leia(numero)

		se(numero == 0){
			escreva("Número = 0, 0 é nulo")			
		}
		senao se(numero%2 == 0){
			se(numero > 0){
				escreva(numero," é par e positivo")
			}
			senao {
				escreva(numero," é par e negativo")
			}
		}
		senao se(numero%2 != 0){
			se(numero > 0){
				escreva(numero," é ímpar e positivo")
			}
			senao {
				escreva("teste")
				escreva(numero," é ímpar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */