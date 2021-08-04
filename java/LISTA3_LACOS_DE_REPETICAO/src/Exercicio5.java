import java.util.Scanner;

/*
 *  5. Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.
 */
public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero, somaNumero = 0;

		do {
			System.out.printf("Digite o número: ");
			numero = scan.nextInt();
			somaNumero += numero;
		} while (numero != 0);

		System.out.printf("A soma dos números digitados é %d", somaNumero);

		scan.close();
	}
}
