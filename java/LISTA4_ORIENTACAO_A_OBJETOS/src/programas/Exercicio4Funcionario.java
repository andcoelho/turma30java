package programas;

import java.util.Scanner;

import classes.Funcionario;

/*
 * 4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente
 *   as informações deste objeto no console.
 */

public class Exercicio4Funcionario {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.printf("Digite o nome do funcionário: "); // Lendo nome do funcionário
		funcionario1.nome = scan.nextLine().toUpperCase();
		System.out.printf("Digite o crachá do funcionário: "); // Lendo crachá do funcionário
		funcionario1.cracha = scan.nextInt();
		System.out.printf("Digite a idade do funcionário: "); // Lendo idade do funcionário
		funcionario1.idade = scan.nextInt();
		scan.nextLine(); // limpando buffer
		System.out.printf("Digite o periodo do funcionário: "); // Periodo - noturno/diurno
		funcionario1.periodo = scan.nextLine().toUpperCase();
		System.out.printf("Digite a cor do uniforme: "); // Cor - vermelho ou azul
		funcionario1.uniforme = scan.nextLine().toUpperCase();
		System.out.printf("Digite a folga da semana: "); 
		funcionario1.diaFolga = scan.nextLine().toUpperCase();
		System.out.printf("Digite o salário do funcionário: "); // Salario em real
		funcionario1.salario = scan.nextDouble();
		
		funcionario1.perfilFuncionario();	// Método 	

	}

}
