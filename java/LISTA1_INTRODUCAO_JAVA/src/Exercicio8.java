import java.util.Scanner;

/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
 * consumidor.
 */
public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorInicial, valorFinal, imposto, distribuidor;
		double porcentagemImposto = 0.45, porcentagemDistribuidor = 0.28;
		
		System.out.println("Digite o valor de f�brica: ");
		valorInicial = leia.nextDouble();
		
		imposto = valorInicial * porcentagemImposto;
		distribuidor = valorInicial * porcentagemDistribuidor;
		
		valorFinal = valorInicial + imposto + distribuidor;
		
		System.out.printf("O valor final do autom�vel �: %.2f", valorFinal);		
		
	}
}
