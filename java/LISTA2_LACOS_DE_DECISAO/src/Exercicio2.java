import java.util.Scanner;

/*
 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
public class Exercicio2 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int numero1, numero2, numero3;
			
			System.out.println("Digite o primeiro n�mero: ");
			numero1 = leia.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			numero2 = leia.nextInt();
			System.out.println("Digite o terceiro n�mero: ");
			numero3 = leia.nextInt();
			
			if(numero1 >= numero2 && numero1 >= numero3) {
				if(numero2> numero3)
					System.out.printf("%d � maior que %d que � %d", numero1, numero2, numero3);
					
				else
					System.out.printf("%d � maior que %d que � %d", numero1, numero3, numero2);
			}
			else if(numero2 >= numero1 && numero2 >= numero3) {
				if(numero1 > numero3)
					System.out.printf("%d � maior que %d que � %d", numero2, numero1, numero3);
				else
					System.out.printf("%d � maior que %d que � %d", numero2, numero3, numero1);
			}
			else{
				if(numero1> numero2)
					System.out.printf("%d � maior que %d que � %d", numero3, numero1, numero2);
				else
					System.out.printf("%d � maior que %d que � %d", numero3, numero2, numero1);
			}	
					
		}
}
