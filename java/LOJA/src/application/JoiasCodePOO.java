package application;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Produto;

public class JoiasCodePOO {

	public static void main(String[] args) {
		
		// FUNÇÕES
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		// VARIAVEIS
		String auxCod;
		int pos, x, auxQntd, pagamento;
		char op, op2, op3;
		
		// LISTAS
		ArrayList<Produto> itens = new ArrayList<>();
		ArrayList<Produto> carrinho = new ArrayList<>();

		itens.add(new Produto("G7-01", "PULSEIRA ICY", 70.99, 10));
		itens.add(new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 10));
		itens.add(new Produto("G7-03", "COlAR SAFIRA", 39.99, 10));
		itens.add(new Produto("G7-04", "PULSEIRA LIZ", 59.99, 10));
		itens.add(new Produto("G7-05", "ANEL CRISTAL", 65.59, 10));
		itens.add(new Produto("G7-06", "BRINCO JASPE", 85.99, 10));
		itens.add(new Produto("G7-07", "PINGENTE LUA", 45.59, 10));
		itens.add(new Produto("G7-08", "COLAR AMÉLIA", 40.59, 10));
		itens.add(new Produto("G7-09", "ANEL CRISTAL", 99.59, 10));
		itens.add(new Produto("G7-10", "BRINCO ÁGATA", 59.79, 10));

		// TABELA RELAÇÃO PRODUTOS + NOME/SLOGAN
		linha();
		System.out.print("\n\t\t    \n");
		nome();
		for (Produto lista : itens) {
			System.out.print("\n" + lista.getCodigo() + "\t" + lista.getNome() + "\t  " + df.format(lista.getValor()) + "\t       "
					+ lista.getEstoque());
		}

		// VALIDAÇÃO DE COMPRA
		linha();
		System.out.print("DESEJA FAZER COMPRAS? ");
		System.out.print("\n(DIGITE 'S' PARA SIM E 'N' PARA NÃO): ");
		op = leia.next().toUpperCase().charAt(0);
		linha();
		if (op == 'S') {
			
			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS
			do {
				leia.nextLine();
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.nextLine().toUpperCase();

				//LAÇO DA VALIDAÇÃO DO CÓDIGO DO PRODUTO
				for (x = 0; x < itens.size(); x++) {
					// LAÇO CONDICIONAL DE VALIDAÇÃO DO CÓDIGO INSERIDO
					if (itens.get(x).getCodigo().equals(auxCod)) {
						pos = x;
						System.out.print("\nCÓDIGO\tPRODUTO \tPREÇO \tESTOQUE");
						System.out.print("\n" + itens.get(pos).getCodigo() + "\t" + itens.get(pos).getNome() + "\t"
								+ itens.get(pos).getValor() + "\t  " + itens.get(pos).getEstoque() + "\n"); 
						System.out.print("\nINFORME A QUANTIDADE QUE DESEJA: ");
						auxQntd = leia.nextInt();

						// LAÇO CONDICIONAL DE VALIDAÇÃO DA QUANTIDADE NO ESTOQUE
						if (auxQntd > itens.get(pos).getEstoque()) {
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.println("O ESTOQUE É DE: " + itens.get(pos).getEstoque());

						} else if (auxQntd <= 0) {
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque());

						} else if (itens.get(pos).getEstoque() == 0) {
							System.out.println("QUANTIDADE INVÁLIDA.");
							System.out.print("O ESTOQUE É DE: " + itens.get(pos).getEstoque());
							
						} else {
							carrinho.add(new Produto(itens.get(pos).getCodigo(), itens.get(pos).getNome(),
									itens.get(pos).getValor(), auxQntd));
							
							itens.get(pos).retirarEstoque(auxQntd);
							leia.nextLine();
							
							// EXIBIÇÃO DE CARRINHO
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							for (Produto lista2: carrinho) {
								System.out.print("\n" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t  " + lista2.getValor() + " \t" + lista2.getEstoque());
							}
							linha();
						}
					}
				}
				
				// CONDICIONAL QUE SAI DO LAÇO DO..WHILE
				System.out.println("DESEJA CONTINUAR COMPRANDO?");
				System.out.print("\nDIGITE 'S' PARA SIM E 'N' PARA NÃO: ");
				op = leia.next().toUpperCase().charAt(0);
				linha();
				
			} while (op == 'S');
			
			if (true) {
				System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
				for (Produto lista2: carrinho) {
					System.out.print("\n" + lista2.getCodigo() + "\t" + lista2.getNome() + "\t  " + df.format(lista2.getValor()) + " \t" + lista2.getEstoque());
				}
			}
			// FINALIZAÇÃO DAS COMPRAS
			linha();
			System.out.printf("\t   VALOR TOTAL DA COMPRA: R$ %.2f", carrinho.get(0).getValor());
			linha();
			System.out.print("\t\tFORMA DE PAGAMENTOS:\n\n");
			System.out.print(" OPÇÃO 1 - A VISTA COM 10% DESCONTO\n");
			System.out.print(" OPÇÃO 2 - NO CARTÃO COM ACRESCIMO DE 10%\n");
			System.out.print(" OPÇÃO 3 - EM 2X COM 15% TOTAL DE ACRESCIMENTO\n");
			linha();

			do {
				System.out.print("INSIRA AQUI SUA FORMA DE PAGAMENTO: ");
				pagamento = leia.nextInt();
			}while(true);
		}

	}

	// FUNÇÕES EXTRAS
	public static void nome() {
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\t    ☆   ╔════════════════════╗	  ☆\n");
		System.out.print("\t    ☆    ❝    JÓIAS CODE     ❞	  ☆\n"); // GAMBIARRA!!!!!!!!!!!!!!
		System.out.print("\t    ☆   ╚════════════════════╝	  ☆\n"); // NÃO MEXER!!!!!!!!!!!!!!!!
		System.out.print("\t    ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆ ☆\n");
		System.out.print("\n\t   ✧ TRAZENDO SEU BRILHO INTERIOR ✧");
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO \tPRODUTO\t\t  PREÇO\t    ESTOQUE");
	}
	public static void linha() {
		System.out.println("\n══════════════════════════════════════════════════════════");
	}

}