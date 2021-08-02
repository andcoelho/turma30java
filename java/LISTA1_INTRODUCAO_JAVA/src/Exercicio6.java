import java.util.Scanner;

/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
 * que efetua tal cálculo é: 
 *  d = raizquadrada ( (X2 - X1)^2 + (Y2 - Y1)^2 )
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1, x2, y1, y2, quadradoX, quadradoY, d;
		
		System.out.println("Digite o valor de X1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = leia.nextDouble();
		
		quadradoX = Math.pow((x2 - x1), 2);
		quadradoY = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(quadradoX + quadradoY);
		
		System.out.printf("O valor de D é: %.2f", d);		

	}

}
