package Entidades;

public class Revista extends Produto { // Herança de produto
	
	//atributos
	private String editora;
	
	//construtor
	
	public Revista(String codigo, String nome, double valor, int estoque, String editora) {
		super(codigo, nome, valor, estoque); // referencia da herança Produto
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
