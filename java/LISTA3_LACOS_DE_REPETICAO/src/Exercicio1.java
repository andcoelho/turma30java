/*
 * 1 .Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 
 */
public class Exercicio1 {

	public static void main(String[] args) {

		int numero;

		for (numero = 1000; numero < 2000; numero++) {
			if ((numero % 11) == 5) {
				System.out.println(numero);
			}
		}

	}

}
