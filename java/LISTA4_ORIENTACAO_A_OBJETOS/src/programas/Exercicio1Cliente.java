package programas;

/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
 *  esta classe, em seguida crie um objeto cliente, defina as instancias deste
 *   objeto e apresente as informa��es deste objeto no console.
 */

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
		
		System.out.println("Digite o c�digo do cliente: ");
		cliente1.codigo = leia.nextInt();		
		
		cliente1.mostraNome();
		cliente1.idade(2021);
		cliente1.mostraCodigo();

	}

}
