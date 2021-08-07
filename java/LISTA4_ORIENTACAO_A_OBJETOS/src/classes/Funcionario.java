package classes;

public class Funcionario {

	public String nome;
	public int cracha; // número do crachá
	public int idade;
	public String periodo; // noturno ou diurno
	public String uniforme; // azul ou vermelho
	public String diaFolga; // qual dia da semana tira a folga
	public double salario; // salário em real

	public void perfilFuncionario() {
		System.out.printf("Nome: %s\nCrachá: %d\nIdade: %d anos\nPeríodo: %s\n", nome, cracha, idade, periodo);
		System.out.printf("Cor do uniforme: %s\nFolga da semana: %s\nSalario: R$ %.2f", uniforme, diaFolga, salario);
	}

}
