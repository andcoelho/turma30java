import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String agenda[][] = new String[24][31]; // linha 0 - 23 | coluna 1 -31
		int auxDia, auxHora;
		char op;

		do {

			System.out.printf("Digite o dia do evento: ");
			auxDia = scan.nextInt() - 1;
			System.out.printf("Digite a hora do evento: ");
			auxHora = scan.nextInt();
			scan.nextLine();

			System.out.printf("Digite o evento: ");
			agenda[auxHora][auxDia] = scan.nextLine();

			System.out.printf("Contiua? S/N: ");
			op = scan.next().toUpperCase().charAt(0);
		} while (op == 'S');

		System.out.printf("Mostrando agenda\n");
		for (int dia = 0; dia < 31; dia++) {
			for (int hora = 0; hora < 24; hora++) {
				if (agenda[hora][dia] != null) {
					System.out.printf("Dia %d - Hora %d : %s \n", dia + 1, hora, agenda[hora][dia]);

				}
			}
		}

	}

}
