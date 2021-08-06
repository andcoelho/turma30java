package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		cliente1.nome = leia.next();
		
		System.out.println("Digite o código do cliente: ");
		cliente1.codigo = leia.nextInt();
		
		System.out.println("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento = leia.nextInt();
		
		cliente1.idade(2021);	
		System.out.println("Nome: " + cliente1.nome + "\nCódigo: " + cliente1.codigo);
		
	}

}
