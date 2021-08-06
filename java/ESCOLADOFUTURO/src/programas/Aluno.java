package programas;

public class Aluno {
	
	//atributos - parace variável mas não é
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	
	//sobrecarga - mais do mesmo
	//construtores
	//encapsulamento - segurança - getters and setters
	//metodos
	public void mostraIdade() {
		System.out.println("Sua idade é: " + (2021 - anoNascimento));
	}
	public void mostraIdade(int anoAtual) {
		System.out.println("Sua idade é: " + (anoAtual - anoNascimento));
	}
	
	//polimorfismo
	//herança
	//abstração
	//delegacao//

}
