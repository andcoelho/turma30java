package programas;

public class Aluno {
	
	//atributos - parace vari�vel mas n�o �
	public String nome;
	public String matricula;
	public boolean ativo;
	public int nota;
	public int anoNascimento;
	
	
	//sobrecarga - mais do mesmo
	//construtores
	//encapsulamento - seguran�a - getters and setters
	//metodos
	public void mostraIdade() {
		System.out.println("Sua idade �: " + (2021 - anoNascimento));
	}
	public void mostraIdade(int anoAtual) {
		System.out.println("Sua idade �: " + (anoAtual - anoNascimento));
	}
	
	//polimorfismo
	//heran�a
	//abstra��o
	//delegacao//

}
