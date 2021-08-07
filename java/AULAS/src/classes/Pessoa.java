package classes;

public class Pessoa {

	// Atributos
	private String nome;
	private int anoNascimento;
	private String cpf;
	private char pronome; // M,F,E
	private boolean ativo;
	
	
	
	//Construtores
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Método
	public void mostrarIdade() {
		System.out.println("idade: " + (2021 - anoNascimento));
	}

	public int calcIdade(int anoAtual) {
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}

}
