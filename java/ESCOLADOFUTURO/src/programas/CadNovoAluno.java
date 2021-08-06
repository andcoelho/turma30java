package programas;

public class CadNovoAluno {

	public static void main(String[] args) {
		
		//instanciar um aluno
		
		Aluno exemplo1 = new Aluno();
		Aluno exemplo2 = new Aluno();
		exemplo1.nome = "EPAMINONDAS";
		exemplo1.matricula = "MAT-1";
		exemplo1.nota = 5;
		exemplo1.anoNascimento = 2005;
		
		exemplo2.nome = "MARIA";
		exemplo2.matricula = "MAT-200";
		exemplo2.nota = 10;
		exemplo2.anoNascimento = 1978;
		
		exemplo1.mostraIdade(2030);
		exemplo2.mostraIdade();
		
		
	}

}
