import java.util.Scanner;

public class CopinhaVetores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String codTime[] = new String[4];
		String nomesTimes[] = { "SANTOS    ", "SPFC     ", "PALMEIRAS", "CORINTHIANS" };
		int pontosTimes[] = { 0, 0, 0, 0 };
		char op;
		String auxCod;

		for (int x = 0; x < codTime.length; x++) { //length-conta o tamanho do vetor e converte em int
			if (x == 9) {
				codTime[x] = "CPF-" + (x + 1);
			} else {
				codTime[x] = "CPF-0" + (x + 1);
			}			
		}
		System.out.println("Início da tabela");
		System.out.println("Código\tTime    \tPontos");
		for (int x = 0; x < codTime.length; x++) {
			System.out.printf("%s\t%s\t%d\n", codTime[x], nomesTimes[x], pontosTimes[x]);		
		}
		
		System.out.println();
		for(int x = 0; x<3; x++) { // laço numero de rodadas
			System.out.printf("Rodada %d\n", (x+1));
			for(int y = 0; y < codTime.length; y++) { //laço para times em cada rodadacodTime[x] = "CPF-0" + (x + 1);
				System.out.printf("%s G - Ganhou | P - Perdeu | E - Empatou\n", nomesTimes[y]);
				op = scan.next().toUpperCase().charAt(0);
				if(op == 'G')
					pontosTimes[y] += 3;
				else if(op == 'P')
					pontosTimes[y] += 0;
				else if(op == 'E')
					pontosTimes[y] += 1;
			}
		}
		
		System.out.println("Após 3 rodadas - tabela");
		System.out.println("Código\tTime    \tPontos");
		for (int x = 0; x < codTime.length; x++) {
			System.out.printf("%s\t%s\t%d\n", codTime[x], nomesTimes[x], pontosTimes[x]);		
		}
		
		System.out.println("Digite o código do time que deseja selecionar ");
		auxCod = scan.next().toUpperCase();
		
		System.out.println("Código\tTime    \tPontos");
		for (int x = 0; x < codTime.length; x++) {
			if(auxCod.equals(codTime[x]))
				System.out.printf("%s\t%s\t%d\n", codTime[x], nomesTimes[x], pontosTimes[x]);		
		}
		
		
		

	}

}
