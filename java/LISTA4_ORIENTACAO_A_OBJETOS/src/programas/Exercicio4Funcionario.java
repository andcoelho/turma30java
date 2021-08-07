package programas;

import java.util.Scanner;

import classes.Funcionario;

/*
 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente
 *   as informa��es deste objeto no console.
 */

public class Exercicio4Funcionario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.printf("Digite o nome do funcion�rio: "); // Lendo nome do funcion�rio
		funcionario1.nome = scan.nextLine().toUpperCase();
		System.out.printf("Digite o crach� do funcion�rio: "); // Lendo crach� do funcion�rio
		funcionario1.cracha = scan.nextInt();
		System.out.printf("Digite a idade do funcion�rio: "); // Lendo idade do funcion�rio
		funcionario1.idade = scan.nextInt();
		scan.nextLine(); // limpando buffer
		System.out.printf("Digite o periodo do funcion�rio: "); // Periodo - noturno/diurno
		funcionario1.periodo = scan.nextLine().toUpperCase();
		System.out.printf("Digite a cor do uniforme: "); // Cor - vermelho ou azul
		funcionario1.uniforme = scan.nextLine().toUpperCase();
		System.out.printf("Digite a folga da semana: "); 
		funcionario1.diaFolga = scan.nextLine().toUpperCase();
		System.out.printf("Digite o sal�rio do funcion�rio: "); // Salario em real
		funcionario1.salario = scan.nextDouble();
		
		funcionario1.perfilFuncionario();	// M�todo 	

	}

}
