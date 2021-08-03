import java.util.Scanner;

/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.printf("%d é maior que %d e %d", numero1, numero2, numero3);
		}
		else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.printf("%d é maior que %d e %d", numero2, numero1, numero3);
		}
		else{
			System.out.printf("%d é maior que %d e %d", numero3, numero1, numero2);
		}
		

	}

}
