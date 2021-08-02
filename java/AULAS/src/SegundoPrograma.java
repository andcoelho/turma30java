import java.util.Scanner;

public class SegundoPrograma {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // criar um teclado
		String nome;
		int anoNascimento;
		int idade;
				
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		
		System.out.println("Olá " + nome + ", sua idade é " + idade + " anos");
		
		
		
		
		
		
		
		
	}

}
