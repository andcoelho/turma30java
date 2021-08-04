import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        double ir = 0.0;
        double salario = 0.0;
        double imposto15 = 0.15;
        double imposto25 = 0.25;
        char opcao;

        System.out.print("Digite seu nome : ");
        nome = leia.nextLine().toUpperCase();
        System.out.println("Selecione M-ele, F-ela ou E-ellu :");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao == 'M') {
            System.out.println("Selecionado masculino");
        } else if (opcao == 'F') {
            System.out.println("Selecionado feminina");
        } else if (opcao == 'E') {
            System.out.println("Selecionado neutro - ellu");
        }
        System.out.println("Salario: ");
        salario = leia.nextDouble();
        if (salario <= 2000) {
            if (opcao == 'M') {
                System.out.println("Isento");
            } else if (opcao == 'F') {
                System.out.println("Isenta");
            } else if (opcao == 'E') {
                System.out.println("Isente");
            }
        } else if (salario > 2000 && salario <= 5000) {
            System.out.printf("Taxa: " + salario * imposto15);
            System.out.printf("\nSalarioBruto: " + ((salario * imposto15) + salario));
        } else if (salario > 5000) {
            System.out.printf("Taxa: " + salario * imposto25);
            System.out.printf("\nSalarioBruto: " + ((salario * imposto25) + salario));
        }
    }
}
