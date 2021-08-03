import java.util.Scanner;

/*
 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
 * categoria ela se encontra:
 * 10-14 infantil
 * 15-17 juvenil
 * 18-25 adulto
 */
public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		if(idade >=10 && idade <= 14) {
			System.out.printf("Você é Infantil");
		}
		
		else if(idade >14 && idade <= 17) {
			System.out.printf("Você é juvenil");
		}
		
		else if(idade > 17 && idade <=25) {
			System.out.println("Você é adulto");
		}
		
		
		
		
		
	}
}
