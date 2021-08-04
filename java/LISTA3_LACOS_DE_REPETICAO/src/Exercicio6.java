import java.util.Scanner;

/*
 * Escrever um programa que receba vários números inteiros no teclado.
 *  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 */
public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0, somaNumerosMultiplosDe3 = 0, quantidadeNumeros = 0, media = 0;

		do {
			System.out.printf("Digite o número: ");
			numero = scan.nextInt();
			if ((numero % 3) == 0 && numero !=0) {
				somaNumerosMultiplosDe3 += numero;
				quantidadeNumeros++;
			}
		} while (numero != 0);

		media = somaNumerosMultiplosDe3 / quantidadeNumeros;

		System.out.printf("A média dos números multiplos de 3 é : %d", media);

		scan.close();
	}

}
