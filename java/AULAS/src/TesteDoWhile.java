import java.util.Scanner;

public class TesteDoWhile {
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		//Vari�veis
		String nome = "", nomeMaiorSalario = "";
		int salario = 0, maiorSalario = 0;
		
		//Entrada
		
		do{
			if (salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
			System.out.printf("Digite o nome: ");
			nome = scan.next();
			System.out.print("Digite o seu sal�rio: ");
			salario = scan.nextInt();
			
		}while(salario > 0);
		
		System.out.printf("O maior salario � %d da pessoa %s", maiorSalario, nomeMaiorSalario);
		
		scan.close();
		
	}
}
