import java.util.Scanner;

/*
 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 * �mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero, raiz, numeroQuadrado;
		
		System.out.println("Digite o n�mero: ");
		numero = scan.nextDouble();
		
		if( (numero%2) == 0) {
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero %.2f � par, sua raiz � %.2f", numero, raiz);
		}
		else {
			numeroQuadrado = numero * numero;
			System.out.printf("O n�mero %.2f � �mpar, seu quadrado � %.2f", numero, numeroQuadrado);
		}

	}

}
