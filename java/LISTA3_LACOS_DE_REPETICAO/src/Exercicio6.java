import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
 */
public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0, somaNumerosMultiplosDe3 = 0, quantidadeNumeros = 0, media = 0;

		do {
			System.out.printf("Digite o n�mero: ");
			numero = scan.nextInt();
			if ((numero % 3) == 0 && numero !=0) {
				somaNumerosMultiplosDe3 += numero;
				quantidadeNumeros++;
			}
		} while (numero != 0);

		media = somaNumerosMultiplosDe3 / quantidadeNumeros;

		System.out.printf("A m�dia dos n�meros multiplos de 3 � : %d", media);

		scan.close();
	}

}
