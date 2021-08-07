package programas;

import java.util.Scanner;

import classes.Aviao;

public class Exercicio2Aviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		Scanner leia = new Scanner(System.in);
		
		aviao1.ativo = true;
		char auxAtivo;
		
		System.out.println("DIgite o nome do Avião: ");
		aviao1.nomeAviao = leia.next().toUpperCase();
		
		System.out.println("DIgite o nome do Piloto: ");
		aviao1.nomePiloto = leia.next().toUpperCase();
		
		System.out.println("DIgite o nome do Copiloto: ");
		aviao1.nomeCopiloto = leia.next().toUpperCase();
		
		System.out.println("Digite a quantidade de passageiros: ");
		aviao1.numeroPassageiros = leia.nextInt();
		
		System.out.println("O avião está voando? (S/N) ");
		auxAtivo = leia.next().toUpperCase().charAt(0);
		
		if(auxAtivo == 'N') {
			aviao1.ativo = false;
		}
		
		aviao1.pilotoNome();
		aviao1.copilotoNome();
		aviao1.aviaoNome();
		aviao1.passageirosNumero();
		aviao1.situacao();
		
		
		
		
		
		
		
		
		

	}

}
