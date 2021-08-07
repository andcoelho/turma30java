package classes;

public class Cliente {
	
	public String nome;
	public int codigo;
	public int anoNascimento;
	
	public void mostraNome() {
		System.out.println("Nome: " + nome);
	}
	
	public void idade(int anoAtual) {
		System.out.println("Idade: " + (anoAtual - anoNascimento));		
	}
	
	public void mostraCodigo() {
		System.out.println("Código: " + codigo);
	}

}
