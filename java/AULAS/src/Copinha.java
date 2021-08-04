import java.util.Scanner;

public class Copinha {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String time1 = "SANTOS", time2 = "SPFC", time3 = "PALMEIRAS", time4 = "CORINTHIANS";
		int ponto1 = 0, ponto2 = 0, ponto3 = 0, ponto4 = 0;
		
		char opcao; //G = ganhou = 3 pontos | P = perdeu = 0 pontos | E = empatou = 1 ponto
		
		for(int x = 1; x <= 2; x++) {
			
			System.out.printf("Rodada %d\n ", x);
			System.out.printf("%s G - Ganhou | P - Perdeu | E - Empatou\n", time1);
			opcao = scan.next().toUpperCase().charAt(0);
			if(opcao == 'G') {
				ponto1 += 3;
			}
			else if(opcao == 'P'){
				ponto1 += 0;				
			}
			else if(opcao == 'E') {
				ponto1 += 1;
			}
			else {
				System.out.println("Digitou errado, tente novamente.");
			}
		}
		for(int x = 1; x <= 2; x++) {
			
			System.out.printf("Rodada %d\n ", x);
			System.out.printf("%s G - Ganhou | P - Perdeu | E - Empatou\n", time2);
			opcao = scan.next().toUpperCase().charAt(0);
			if(opcao == 'G') {
				ponto2 += 3;
			}
			else if(opcao == 'P'){
				ponto2 += 0;				
			}
			else if(opcao == 'E') {
				ponto2 += 1;
			}
			else {
				System.out.println("Digitou errado, tente novamente.");
			}
		}
		for(int x = 1; x <= 2; x++) {
			
			System.out.printf("Rodada %d\n ", x);
			System.out.printf("%s G - Ganhou | P - Perdeu | E - Empatou\n", time3);
			opcao = scan.next().toUpperCase().charAt(0);
			if(opcao == 'G') {
				ponto3 += 3;
			}
			else if(opcao == 'P'){
				ponto3 += 0;				
			}
			else if(opcao == 'E') {
				ponto3 += 1;
			}
			else {
				System.out.println("Digitou errado, tente novamente.");
			}
		}
		for(int x = 1; x <= 2; x++) {
			
			System.out.printf("Rodada %d\n ", x);
			System.out.printf("%s G - Ganhou | P - Perdeu | E - Empatou\n", time4);
			opcao = scan.next().toUpperCase().charAt(0);
			if(opcao == 'G') {
				ponto4 += 3;
			}
			else if(opcao == 'P'){
				ponto4 += 0;				
			}
			else if(opcao == 'E') {
				ponto4 += 1;
			}
			else {
				System.out.println("Digitou errado, tente novamente.");
			}
		}
			
			System.out.printf("\nTABELA\n");
			System.out.printf("\nTIME %s \t\tPONTOS ATUAIS: \t%d PONTOS\n", time1, ponto1);
			System.out.printf("TIME %s \t\tPONTOS ATUAIS: \t%d PONTOS\n", time2, ponto2);
			System.out.printf("TIME %s \t\tPONTOS ATUAIS: \t%d PONTOS\n", time3, ponto3);
			System.out.printf("TIME %s \tPONTOS ATUAIS: \t%d PONTOS", time4, ponto4);			
		
		
		scan.close();
	}

}
