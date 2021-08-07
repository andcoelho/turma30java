package programas;

import java.util.Scanner;

import classes.Cliente;

public class Exercicio1Cliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		cliente1.nome = leia.next();
		
		System.out.println("Digite o ano de nascimento do cliente: ");
		cliente1.anoNascimento = leia.nextInt();
		
		System.out.println("Digite o código do cliente: ");
		cliente1.codigo = leia.nextInt();		
		
		cliente1.mostraNome();
		cliente1.idade(2021);
		cliente1.mostraCodigo();

	}

}
