package Entidades;

public class Revista extends Produto { // Heran�a de produto
	
	//atributos
	private String editora;
	
	//construtor
	
	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		super(codigo, nome, valor, estoque); // referencia da heran�a Produto
		this.editora = editora;
	}
	
	//encapsuladores
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
