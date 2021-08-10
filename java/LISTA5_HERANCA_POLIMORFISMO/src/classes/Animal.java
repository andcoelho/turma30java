package classes;

public class Animal {
	
	//Atributos
	private String nome;
	private int idade;
	private boolean som;	
	
	//Construtor
	public Animal(String nome, int idade, boolean som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}

	//encapsuladores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}
	
	public void correr(boolean corre) {
		if(corre) {
			System.out.println("Corre");
		}
		else {
			System.out.println("Não corre");
		}
	}
	
	//Metodos
	public void emiteSom() {
		System.out.println("Emitindo som...");
	}
	
	
	
	
	
	

}
