package Entidades;

public class Carrinho extends Produto {

	//Atributos
	private String auxCod;
	private int auxEstoque;
	private double valorTotal;

	//Construtores
	public Carrinho(String codigo, double valor, int estoque, String nome, String auxCod, int auxEstoque,
			double valorTotal) {
		super(codigo, nome, valor, estoque);
		this.auxCod = auxCod;
		this.auxEstoque = auxEstoque;
		this.valorTotal = valorTotal;
	}
	
	//Encapsuladores
	public String getAuxCod() {
		return auxCod;
	}

	public void setAuxCod(String auxCod) {
		this.auxCod = auxCod;
	}

	public int getAuxEstoque() {
		return auxEstoque;
	}

	public void setAuxEstoque(int auxEstoque) {
		this.auxEstoque = auxEstoque;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	//Métodos
	

	public void modificarEstoque(int qntd) {
		if (qntd < auxEstoque) {
			System.out.println("VAI DÁ NAO");
		} else {
			this.auxEstoque += qntd;
		}
	}

}
