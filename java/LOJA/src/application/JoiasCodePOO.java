package application;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Produto;

public class JoiasCodePOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		ArrayList<Produto> itens = new ArrayList<Produto>();
		ArrayList<Produto> carrinho = new ArrayList<>();

		String auxCod;
		int pos = 0, x;
		char op, op2, op3;

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

		carrinho.add(new Produto("G7-01", "PULSEIRA ICY", 70.99, 0));
		carrinho.add(new Produto("G7-02", "ANEL TOPÁZIO", 50.99, 0));
		carrinho.add(new Produto("G7-03", "COlAR SAFIRA", 39.99, 0));
		carrinho.add(new Produto("G7-04", "PULSEIRA LIZ", 59.99, 0));
		carrinho.add(new Produto("G7-05", "ANEL CRISTAL", 65.59, 0));
		carrinho.add(new Produto("G7-06", "BRINCO JASPE", 85.99, 0));
		carrinho.add(new Produto("G7-07", "PINGENTE LUA", 45.59, 0));
		carrinho.add(new Produto("G7-08", "COLAR AMÉLIA", 40.59, 0));
		carrinho.add(new Produto("G7-09", "ANEL CRISTAL", 99.59, 0));
		carrinho.add(new Produto("G7-10", "BRINCO ÁGATA", 59.79, 0));

		linha();
		System.out.print("\n\t\t    \n");
		nome();
		linha();
		System.out.print("\t        ✧ RELAÇÃO DE PRODUTOS ✧");
		linha();
		System.out.print("CÓDIGO\t        PRODUTO\t\t  PREÇO\t    ESTOQUE");

		for (Produto lista : itens) {
			System.out.print("\n " + lista.getCodigo() + "\t\t" + lista.getNome() + "\t  " + lista.getValor()
					+ "\t       " + lista.getEstoque());
		}

		linha();
		System.out.print("DESEJA FAZER COMPRAS? ");
		System.out.print("\n(DIGITE 'S' PARA SIM E 'N' PARA NÃO): ");
		op = leia.next().toUpperCase().charAt(0);
		linha();

		if (op == 'S') {
			// COMEÇO DA PRIMEIRA FUNÇÃO DE FAZER COMPRAS

//			System.out.println(itens.get(x).getCodigo() + "\t" + itens.get(x).getNome() + "\t"
//					+ itens.get(x).getValor() + "\t" + itens.get(x).getEstoque());
			
			do {
				leia.nextLine();
				System.out.print("\nDIGITE O CÓDIGO DO PRODUTO: ");
				auxCod = leia.nextLine().toUpperCase();
				for (x = 0; x < itens.size(); x++) {
					if (itens.get(x).getCodigo().equals(auxCod)) {
						pos = x;

						System.out.print("INFORME A QUANTIDADE QUE DESEJA: ");
						int auxQntd = leia.nextInt();

						if (itens.get(pos).getEstoque() < auxQntd) {
							linha();
							System.out.println("QUANTIDADE INVÁLIDA");
							System.out.println("\nO ESTOQUE É DE: " + itens.get(pos).getEstoque());
						} else {
							itens.get(pos).retirarEstoque(auxQntd);
							linha();
							System.out.println("\t         ✧ CARRINHO DE COMPRAS ✧");
							System.out.println("\n " + itens.get(x).getCodigo() + "\t\t"
									+ itens.get(x).getNome() + "\t  " + itens.get(x).getValor() + "\t       " + itens.get(x).getEstoque());
						}
					}
				}
			} while (op == 'S');
		}

		System.out.println("");

	}

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