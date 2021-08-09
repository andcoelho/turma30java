package programas;

import Entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("001", "camisa");
		Produto prod2 = new Produto("002", "calça", 100.50, 10);
		
		prod1.setNome("Camiseta");
		
		System.out.println(prod1.getNome());
		
		prod2.retiraEstoque(5);
		prod1.incluirEstoque(10);
		
		System.out.println(prod2.getNome() + " qtde " + prod2.getEstoque());
		System.out.println(prod1.getNome() + " qtde " + prod1.getEstoque());
		
		prod2.retiraEstoque(5);
		prod1.incluirEstoque(-1);
		System.out.println(prod1.getNome()+" qtde "+prod1.getEstoque());
		System.out.println(prod2.getNome()+" qtde "+prod2.getEstoque());
		prod2.retiraEstoque(2);
		System.out.println(prod2.getNome()+" qtde "+prod2.getEstoque());
		prod2.retiraEstoque(5);
		System.out.println(prod2.getNome()+" qtde "+prod2.getEstoque());
	}

}
