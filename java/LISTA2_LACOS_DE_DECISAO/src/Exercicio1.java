import java.util.Scanner;

/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.printf("%d � maior que %d e %d", numero1, numero2, numero3);
		}
		else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.printf("%d � maior que %d e %d", numero2, numero1, numero3);
		}
		else{
			System.out.printf("%d � maior que %d e %d", numero3, numero1, numero2);
		}
		

	}

}
