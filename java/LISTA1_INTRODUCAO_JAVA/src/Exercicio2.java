import java.util.Scanner;

/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
 *  expressa em anos, meses e dias. 
 */
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int diasTotal, mes, ano, dias;
		
		System.out.println("Digite sua idade em dias: ");
		diasTotal = leia.nextInt();
		
		ano = diasTotal / 365;
		mes = (diasTotal % 365) / 30;
		dias = (diasTotal % 365) % 30;
		
		System.out.println("Você tem " + ano + " anos, " + mes + " meses e " + dias + " dias");
		
		
	}

}
