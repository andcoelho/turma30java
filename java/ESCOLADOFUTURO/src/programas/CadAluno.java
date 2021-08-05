package programas;

import java.util.Scanner;

public class CadAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String alunes[] = { "Ana Beatriz Yujra Espejo", "Ana Carolina Gonzalez de Souza", "Ana Paula Souza Dias",
				"Anderson Coelho da Costa", "Andrei Felipe Corr�a de Souza", "Ariel de Barros Pirangy Soares",
				"Beatriz dos Santos Teixeira", "Beatriz Gomes de Abreu", "Caio Saldanha Motta",
				"C�ssia de Arruda Nicolau Santos", "Emerson da Silva Santana", "Enzo Fulaneto",
				"Ester Gomes Neves Nascimento", "F�bio Campaner Suzuki", "Felipe Matos de Lima",
				"Felipe Souza da Silva", "Fl�vio Augusto da Costa", "Giovanna Siqueira Paiva dos Penedos",
				"Gustavo Mesquita Ferreira", "Henrique Uriel Lopes", "Jo�o Pedro Cruz Gomes",
				"Jos� Paulo de Matos Ferreira Neto", "Let�cia Porto Martins", "Lucas Silva Nunes de Aguiar",
				"Maicon Gomes Cerqueira", "Marcos Vinicius Coutinho Rego", "Matheus de Araujo Farina",
				"Matheus de Brito Milani", "Nat�lia Regina dos Santos Rocha", "Pamela Paulino",
				"Renata dos Santos Ferreira", "Rodrigo Roseo Lopes da Costa", "Sabrina Alves de Paiva",
				"Sergio de Jesus Severo", "Stefani Fernanda Pereira Tosi",
				"Talita gleice maria da gloria da Silva Lima", "Thiago da Silva Machado", "Vin�cios Lisboa da Silva",
				"Vinicius Cardoso Siqueira Francisco" };
		int notas[] = new int[alunes.length];
		String matriculas[] = new String[alunes.length];
		boolean ativo[] = new boolean[alunes.length];
		char op = 'S';
		String entraMatricula, auxAtivo;

		for (int x = 0; x < alunes.length; x++) {
			if (x < 9) {
				matriculas[x] = "MAT-0" + (x + 1);
			} else {
				matriculas[x] = "MAT-" + (x + 1);
			}
			ativo[x] = true;
		}

		for (int x = 0; x < alunes.length; x++) {
			System.out.printf("MATRICULA %s \tALUNE %s \t\t NOTA %d SITUACAO ", matriculas[x], alunes[x], notas[x]);
			if (ativo[x] == true) {
				System.out.print(" ATIVO \n");
			} else {
				System.out.print(" INATIVO \n");
			}
		}
		do {
			System.out.println("INFORME A MATR�CULA DO ALUNE");
			entraMatricula = leia.next().toUpperCase();
			for (int x = 0; x < alunes.length; x++) {
				if (entraMatricula.equals(matriculas[x])) {
					System.out.printf("ALUNE: %s\n", alunes[x]);
					System.out.println("QUAL A NOTA DO ALUNE");
					notas[x] = leia.nextInt();
					System.out.println("QUAL O STATUS DO ALUNE:  [ativo / inativo]");
					auxAtivo = leia.next().toUpperCase();
					if (auxAtivo.equals("ATIVO")) {
						ativo[x] = true;
					} else if (auxAtivo.equals("INATIVO")) {
						ativo[x] = false;
					} else {
						System.out.println("STATUS INV�LIDO, SITUA��O INALTERADA!!!");
					}
				}
			}
			System.out.println("CONTINUAR? [ s / n ]");
			op = leia.next().toUpperCase().charAt(0);
		} while (op == 'S');

		for (int x = 0; x < alunes.length; x++) {
			if (notas[x] != 0) {
				if (ativo[x] == true) {
					System.out.printf("ALUNE %s \t NOTA %d\t\t", alunes[x], notas[x]);
					if (notas[x] > 5) {
						System.out.println("�timo! Continue assim!\n\n");
					} else if (notas[x] < 5) {
						System.out.println("Estude Mais\n\n");
					}
				}
			}
		}

		// la�o e pede :
		// pede pela matricula 1 aluno
		// informar a nota deste aluno
		// vai informar se o aluno ainda continua ativo ou n�o [o usuario n�o pode
		// digitar true ou false
		// tem que fazer o processo at� que pergunta continua sim ou n�o seja n�o
		// ap�s mostra todos os alunos com nota pela regra
		// at� 5 - estude mais
		// acima de 5 - otimo, continue assim
		// aluno inativo ou aluno ativo baseado no true ou false de ativo
		// somente dos alunos que tem nota

		
		
		
		
	}

}
