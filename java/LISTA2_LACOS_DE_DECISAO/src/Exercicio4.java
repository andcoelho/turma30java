import java.util.Scanner;

/*
 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 * ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero, raiz, numeroQuadrado;
		
		System.out.println("Digite o número: ");
		numero = scan.nextDouble();
		
		if( (numero%2) == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O número %.2f é par, sua raiz é %.2f", numero, raiz);
		}
		else {
			numeroQuadrado = numero * numero;
			System.out.printf("O número %.2f é ímpar, seu quadrado é %.2f", numero, numeroQuadrado);
		}

	}

}
