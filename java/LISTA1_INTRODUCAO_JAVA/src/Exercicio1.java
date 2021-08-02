import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
 *  meses e dias e mostre-a expressa apenas em dias. 
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int ano, meses, dias, totalDias;
		
		System.out.println("Digite sua idade em anos: ");
		ano = leia.nextInt();
		System.out.println("Digite sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		totalDias = (ano * 365) + (meses * 30) + dias;
		
		System.out.println("Você tem " + totalDias +" dias de vida");
		
		
		
		
		
		
		
		
	}

}
