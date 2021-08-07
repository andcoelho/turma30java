package classes;

public class ProdutoEletronico {
	
	public String nome;
	public int geracao;
	public int memoria;
	public double preco;
	
	public void aparelho() {
		System.out.printf("\nNome: %s\nGeração: %dª geração\nMemória: %d GB\nValor: R$ %.2f", nome, geracao, memoria, preco);
	}

}
