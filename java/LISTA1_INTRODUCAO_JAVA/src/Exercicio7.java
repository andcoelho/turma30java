import java.util.Scanner;

/*
 * 7. Um sistema de equações lineares do tipo:
 * 
 * 		ax + by = c
 * 		dx + ey = f
 * 
 * pode ser resolvido segundo mostrado abaixo:
 * 
 * 		x = (ce -bf) / (ae - bd) | y = (af - cd) / (ae - bd)
 */


public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor de E: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.printf("Os valores de X e Y são: %.2f e %.2f", x, y);
		
		
	}

}
