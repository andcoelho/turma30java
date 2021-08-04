import java.util.Scanner;

/*
 * 3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
 */
public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade, menor21 = 0, maior50 = 0;

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			} else {

			}

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

		}

		System.out.println("A quantidade de pessoas com menos de 21 é: " + menor21);
		System.out.println("A quantidade de pessoas com mais de 50 é: " + maior50);

		leia.close();

	}

}
