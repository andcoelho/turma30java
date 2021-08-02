import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
 * consumidor.
 */
public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorInicial, valorFinal, imposto, distribuidor;
		double porcentagemImposto = 0.45, porcentagemDistribuidor = 0.28;
		
		System.out.println("Digite o valor de fábrica: ");
		valorInicial = leia.nextDouble();
		
		imposto = valorInicial * porcentagemImposto;
		distribuidor = valorInicial * porcentagemDistribuidor;
		
		valorFinal = valorInicial + imposto + distribuidor;
		
		System.out.printf("O valor final do automóvel é: %.2f", valorFinal);		
		
	}
}
