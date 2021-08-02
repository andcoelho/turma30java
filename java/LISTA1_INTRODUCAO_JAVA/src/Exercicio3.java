import java.util.Scanner;

/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int segundosTotal, minutos, horas, segundos;
		
		System.out.println("Digite a quantidade total de segundos: ");
		segundosTotal = leia.nextInt();
		
		horas = segundosTotal / 3600;
		minutos = (segundosTotal%3600) / 60;
		segundos = (segundosTotal%3600) % 60;
		
		System.out.printf("%d Horas, %d minutos e %d segundos", horas, minutos, segundos);
		
	}
}
