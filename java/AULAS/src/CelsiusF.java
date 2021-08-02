import java.util.Locale;
import java.util.Scanner;

public class CelsiusF {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		double celsius;		
		
		System.out.println("Escreva a temperatura em Celsius: ");
		celsius = leia.nextDouble();
		
		double fahrenheit = celsius * 9 / 5 + 32 ;
		
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);				
		
	}
}
