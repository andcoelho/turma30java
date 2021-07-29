programa
{
	
	funcao inicio()
	{
	/*
	 * Anderson Coelho
	 * GENERATION T-30
	 * 
	 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de
		mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.

	 */

		inteiro matriz1[4][6], matriz2[4][6], l, c, M1[4][6]

		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva("Digite o valor da Matriz1[",l,"][",c,"] = ")
				leia(matriz1[l][c])
			}			
		}

		limpa()

		
		

		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva("Digite o valor da Matriz2[",l,"][",c,"] = ")
				leia(matriz2[l][c])		
			}		
		}

		limpa()

		escreva("\n\nMatriz 1\n\n")
		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva(" ", matriz1[l][c])
				
			}
			escreva("\n")
		}

		escreva("\n\nMatriz 2\n\n")
		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva(" ", matriz2[l][c])
				
			}
			escreva("\n")
		}

		

		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				M1[l][c] = matriz1[l][c] + matriz2[l][c]
			}
		}

		escreva("\n\nMatriz M1\n\n")
		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva(" ", M1[l][c])
				
			}
			escreva("\n")
		}

		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				M1[l][c] = matriz1[l][c] - matriz2[l][c]
			}
		}

		escreva("\n\nMatriz M2\n\n")
		para(l = 0; l<4; l++){
			para(c = 0; c<6; c++){
				escreva(" ", M1[l][c])
				
			}
			escreva("\n")
		}
		

	}

		
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */