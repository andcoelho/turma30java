import java.util.Scanner;

/*
 *  5. Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
 *  No final, mostre a soma dos n�meros digitados.
 */
public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero, somaNumero = 0;

		do {
			System.out.printf("Digite o n�mero: ");
			numero = scan.nextInt();
			somaNumero += numero;
		} while (numero != 0);

		System.out.printf("A soma dos n�meros digitados � %d", somaNumero);

		scan.close();
	}
}
