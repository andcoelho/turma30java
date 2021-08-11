package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		List<String> cadastro = new ArrayList<>();
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTUS");
		
		System.out.println("Tamanho da lista: " + cadastro.size());
		
		cadastro.add(1, "GUARANI");
		
		int x = 0;
		for(String time : cadastro) {
			System.out.println(x + " - " + time.toLowerCase());
			x++;
		}
		
		System.out.println(cadastro.get(4));
		
		System.out.println("Digite o código do time que deseja: ");
		x = leia.nextInt();
		
		System.out.println("Você escolheu o time " + cadastro.get(x));
		
		System.out.println("Digite o código do time que deseja retirar: ");
		x = leia.nextInt();
		
		System.out.println("Você escolheu o time: "+ cadastro.get(x) +" Esse time será retirado da lista");
		cadastro.remove(x);
		x = 0;
		for(String time : cadastro) {
			System.out.println(x + " - " + time.toLowerCase());
			x++;
		}
		
	}

}
