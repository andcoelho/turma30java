package Exercicio1;

public class Cliente {
	
	public String nome;
	public int codigo;
	public int anoNascimento;
	
	public void idade(int anoAtual) {
		System.out.println("Idade: " + (anoAtual - anoNascimento));		
	}

}
