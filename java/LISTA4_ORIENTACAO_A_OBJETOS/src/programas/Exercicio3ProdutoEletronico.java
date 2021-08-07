package programas;

import java.util.Scanner;

import classes.ProdutoEletronico;

public class Exercicio3ProdutoEletronico {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		System.out.println("Digite o modelo do celular: ");
		celular.nome = scan.nextLine().toUpperCase();
		
		System.out.println("Digite a geração do celular: ");
		celular.geracao = scan.nextInt();
		
		System.out.println("Digite a memória do celular: ");
		celular.memoria = scan.nextInt();
		
		System.out.println("Digite o valor do celular: ");
		celular.preco = scan.nextDouble();
		
		celular.aparelho();
		

	}

}
