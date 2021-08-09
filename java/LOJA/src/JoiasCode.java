import java.text.DecimalFormat;
import java.util.Scanner;

public class JoiasCode {
	public static void main(String[] args) {

		// FUNÇÕES - BIBLIOTECAS
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		// VARIÁVEIS
		final int TAM = 10;
		String produto[] = { "PULSEIRA ICY", "ANEL TOPÁZIO", "COlAR SAFIRA", "PULSEIRA LIZ", "ANEL CRISTAL",
				"BRINCO JASPE", "PINGENTE LUA", "COLAR AMÉLIA", "ANEL CRISTAL", "BRINCO ÁGATA" };
		String carrinho[] = new String[TAM];
		String codigo[] = new String[TAM];
		String auxCod = "";
		char op = 'S', op1 = 'S', op2 = 'S', op3 = 'S';
		boolean formato = false; // VALOR BOLEANO - VERDADEIRO OU FALSO
		double valores[] = { 70.99, 50.99, 39.99, 59.99, 65.59, 85.99, 45.59, 40.59, 99.59, 59.79 };
		double valorCompra[] = new double[TAM];
		double contador = 0.0, contador2 = 0.0;
		int estoque[] = new int[TAM];
		int contEstoque[] = new int[TAM];
		int auxQntd[] = new int[TAM]; // CONTADOR
		int pagamento = 0;

		// GERADOR DE CÓDIGO
		for (int x = 0; x < 10; x++) {
			codigo[x] = "G7-0" + (x + 1);
			auxQntd[x] = 0;
			contEstoque[x] = 0;
			estoque[x] = 10;
		}

		linha();
		System.out.print("\n\t\t    \n");
		nome();
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO\t        PRODUTO\t\t   PREÇO\t  ESTOQUE\n");

		for (int x = 0; x < 10; x++) {
			System.out.print("\n " + codigo[x] + "\t\t" + produto[x] + "\t  " + valores[x] + "\t\t  " + estoque[x]);
		}

		linha();
		System.out.println("DESEJA FAZER COMPRAS? ");
		System.out.print("\n(DIGITE 'S' PARA SIM E 'N' PARA NÃO): ");
		op = leia.next().toUpperCase().charAt(0);
		linha();

		if (op == 'S') {

			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS

			do {
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.next().toUpperCase();

				for (int x = 0; x < 10; x++) {
					if (auxCod.equals(codigo[x])) {
						System.out.print("INFORME A QUANTIDADE QUE DESEJA: ");
						contEstoque[x] = leia.nextInt();
						auxQntd[x] += contEstoque[x];

						if (contEstoque[x] > estoque[x]) {
							auxQntd[x] = 0;
							linha();
							System.out.println("QUANTIDADE INVÁLIDA");
							System.out.println("\nO ESTOQUE É DE: " + estoque[x]);

						} else if (contEstoque[x] <= 0) {
							System.out.println("QUANTIDADE INVÁLIDA");
							System.out.println("\nO ESTOQUE É DE: " + estoque[x]);
						} else if (contEstoque[x] <= estoque[x]) {
							// VALIDAÇÃO E O PRIMEIRO CARRINHO DO CÓDIGO
							estoque[x] = estoque[x] - contEstoque[x];
							valorCompra[x] = valores[x] * auxQntd[x];
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							linha();
							System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");

							for (x = 0; x < 10; x++) {
								if (auxQntd[x] > 0) {
									System.out.print("\n " + codigo[x] + "\t     " + produto[x] + "\t  R$"
											+ df.format(valorCompra[x]) + "\t    " + auxQntd[x]);
								}
							}

						}
					}
					/*
					 * if (auxCod != "G7-01" && auxCod != "G7-02" && auxCod != "G7-03") {
					 * System.out.println("Código invalido!"); break; }
					 */
					if (auxCod.equals("G7-01") == false && auxCod.equals("G7-02") == false
							&& auxCod.equals("G7-03") == false && auxCod.equals("G7-04") == false
							&& auxCod.equals("G7-05") == false && auxCod.equals("G7-06") == false
							&& auxCod.equals("G7-07") == false && auxCod.equals("G7-08") == false
							&& auxCod.equals("G7-09") == false && auxCod.equals("G7-010") == false) {
						System.out.println("CÓDIGO INVÁLIDO!");
						break;
					}

				}
				// FUNÇÃO DE CONTINUAR COMPRANDO
				System.out.println("DESEJA CONTINUAR COMPRANDO?");
				System.out.print("\nDIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op = leia.next().toUpperCase().charAt(0);
				linha();

				if (op == 'S') {
					System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
					linha();
					System.out.print("CÓDIGO\t        PRODUTO\t\t   PREÇO\t  ESTOQUE\n");

					for (int x = 0; x < 10; x++) {
						System.out.print(
								"\n " + codigo[x] + "\t\t" + produto[x] + "\t  " + valores[x] + "\t\t  " + estoque[x]);
					}
				}

			} while (op == 'S');

			if (op == 'N') {
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				linha();
				System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");

				for (int x = 0; x < 10; x++) {
					if (auxQntd[x] > 0) {
						System.out.print("\n " + codigo[x] + "\t     " + produto[x] + "\t  R$"
								+ df.format(valorCompra[x]) + "\t    " + auxQntd[x]);
					}
				}

				System.out.print("\nDESEJA MODIFICAR O PEDIDO?");
				System.out.print("\nDIGITE 'S' PARA SIM OU 'N' PARA NÃO: ");
				op2 = leia.next().toUpperCase().charAt(0);

				while (op2 == 'S') {

					System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
					auxCod = leia.next().toUpperCase();

					for (int x = 0; x < 10; x++) {
						if (auxCod.equals(codigo[x])) {
							System.out.print("\nINFORME A QUANTIDADE QUE DESEJA RETIRAR DO PRODUTO: ");
							contEstoque[x] = leia.nextInt();
							auxQntd[x] -= contEstoque[x];
							estoque[x] = estoque[x] + contEstoque[x];
							valorCompra[x] = valores[x] * auxQntd[x];
						}
					}

					System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
					linha();
					System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");

					for (int x = 0; x < 10; x++) {
						if (auxQntd[x] > 0) {
							System.out.print("\n " + codigo[x] + "\t     " + produto[x] + "\t  R$"
									+ df.format(valorCompra[x]) + "\t    " + auxQntd[x]);
						}
					}

					System.out.print("\nDESEJA CONTINUAR MODIFICANDO?");
					System.out.print("\nDIGITE 'S' PARA SIM OU 'N' PARA NÃO: ");
					op2 = leia.next().toUpperCase().charAt(0);

				}

				for (int x = 0; x < 10; x++) {
					contador += (auxQntd[x] * valores[x]);
				}

				if (contador != 0) {
					System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
					linha();
					System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");

					for (int y = 0; y < 10; y++) {
						if (auxQntd[y] > 0) {
							System.out.print("\n " + codigo[y] + "\t     " + produto[y] + "\t  R$"
									+ df.format(valorCompra[y]) + "\t    " + auxQntd[y]);
						}

					}
					// FINALIZAÇÃO DAS COMPRAS
					linha();
					System.out.printf("\t   VALOR TOTAL DA COMPRA: R$ %.2f", contador);
					linha();
					System.out.print("\t\tFORMA DE PAGAMENTOS:\n\n");
					System.out.print(" OPÇÃO 1 - A VISTA COM 10% DESCONTO\n");
					System.out.print(" OPÇÃO 2 - NO CARTÃO COM ACRESCIMO DE 10%\n");
					System.out.print(" OPÇÃO 3 - EM 2X COM 15% TOTAL DE ACRESCIMENTO\n");
					linha();

					do {
						System.out.print("INSIRA AQUI SUA FORMA DE PAGAMENTO: ");
						pagamento = leia.nextInt();

						switch (pagamento) {
						case 1:
							linha();
							nome();
							linha();
							contador2 = contador * 0.9;
							System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
							System.out.print("\t\t\n VALOR TOTAL: R$ " + df.format(contador2));
							contador2 = contador * 0.09;
							System.out.print("\t\t\n 9% DE IMPOSTOS: R$ " + df.format(contador2));
							linha();
							break;

						case 2:
							linha();
							nome();
							linha();
							contador2 = contador * 1.1;
							System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
							System.out.print("\t\t\n VALOR TOTAL: R$ " + df.format(contador2));
							contador2 = contador * 0.09;
							System.out.print("\t\t\n 9% DE IMPOSTOS: R$ " + df.format(contador2));
							linha();
							break;

						case 3:
							linha();
							nome();
							linha();
							contador = (contador * 1.15) / 2;
							System.out.print("\n\t\t   ✧ NOTA FISCAL ✧\n\n");
							System.out.print("\n\tPARCELADO EM 2X | 15% DE ACRÉSCIMO\n");
							System.out.print("\tVALOR TOTAL DE CADA PARCELA: R$ " + df.format(contador));
							contador2 = contador * 0.09;
							System.out.print("\n\t 9% DE IMPOSTOS: R$ " + df.format(contador2));
							linha();
							break;

						default:
							System.out.printf("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.\n");
							break;
						}

					} while (pagamento > 3);

					System.out.print("\n\n\t        ✧ RELAÇÃO DE PRODUTOS ✧");
					linha();
					System.out.print("CÓDIGO\t        PRODUTO\t\t   PREÇO\t  ESTOQUE\n");

					for (int x = 0; x < 10; x++) {
						System.out.print(
								"\n " + codigo[x] + "\t\t" + produto[x] + "\t  " + valores[x] + "\t\t  " + estoque[x]);
					}

					linha();
					System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
					linha();
					System.out.println("CÓDIGO\t        PRODUTO\t\t   PREÇOS\t  QNTDE\n");

				}

				else {
					linha();
					System.out.print("\n\t\t      \n");
					nome();
					linha();
					System.out.println("\t\t ATÉ BREVE !!");
				}

			}

		} else if (op == 'N') {

			linha();
			System.out.print("\n\t\t      \n");
			nome();
			linha();
			System.out.println("\t\t ATÉ BREVE!!");

		} else {
			System.out.println("OPÇÃO INVÁLIDA");

		}

	}

	// Função Slogan - Mostra no INICIO -
	public static void nome() {

		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n"); // GAMBIARRA!!!!!!!!!!!!!!
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n"); // NÃO MEXER!!!!!!!!!!!!!!!!
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
	}// Função Linha - Separação das opções -

	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════\n");
	}

}