import java.util.Scanner;

/*
 * 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
 *	calcule a seguinte expressão:
 *
 * D = (R + S) / 2, onde R = (A + B)^2 e S = (B + C)^2
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		System.out.printf("O valor de D é %.2f", d);
				

	}

}
