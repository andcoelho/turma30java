import java.util.Scanner;

/*
 * 2. Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, x, par = 0, impar;
		
		for(x = 1; x <=10; x ++) {
			System.out.println("Digite o n�mero: ");
			numero = scan.nextInt();
			if((numero % 2) == 0) {
				par++;
			}
		}
		impar = 10 - par;
		
		System.out.printf("\nQuantidade de pares: %d\n", par);
		System.out.printf("Quantidade de �mpares: %d", impar);
		
		scan.close();
	}

}
