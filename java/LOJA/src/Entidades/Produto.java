package Entidades;

public class Produto {
	
	// private - segurança total || atributos - é, tem, está
	private String codigo;  // codigo e nome - construtores
	private String nome;
	private double valor;
	private int estoque;	
	
	//CONSTRUTOR
	public Produto(String codigo, String nome) { // unico método com mesmo nome da classe: construtor
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public Produto(String codigo, String nome, double valor, int estoque) { // sobrecarga
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		if(estoque < 0) {
			this.estoque = 0;
		} 
		else {
			this.estoque = estoque;
		}
	}
	
	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	//encapsulamento - metodo

	public String getCodigo() { // mostrar / trazer (retorna o valor)
		return codigo;
	}

	public void setCodigo(String codigo) { // alterar
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	/*public void setEstoque(int estoque) {
		this.estoque = estoque;
	}*/
	
	//METODOS
	
	public void incluirEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade incorreta!");
		}
		else {
		this.estoque = this.estoque + quantidade;
		}
		
	}
	
	public void retiraEstoque(int quantidade) {
		if(quantidade > estoque) {
			System.out.println("Quantidade indisponível");
		}
		else {
			this.estoque = this.estoque - quantidade;
		}
	}
	

}
