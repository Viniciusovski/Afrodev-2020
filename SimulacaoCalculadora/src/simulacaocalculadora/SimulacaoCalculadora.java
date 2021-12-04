package simulacaocalculadora;

import java.util.Scanner;

public class SimulacaoCalculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------");
        System.out.println("  Calculadora   ");
        System.out.println("------------------");
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("9- SAIR");
        System.out.println("------------------");
        System.out.print("Selecione uma opção: ");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();

        System.out.println("Digite o 1° valor: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o 2° valor:");
        double num2 = scan.nextDouble();

        do {
            if (opcao == 1) {
                System.out.println("O resultado da soma é: " + adicao(num1, num2));
            } else if (opcao == 2) {
                System.out.println("O resultado da subtração é: " + subt(num1, num2));
            } else if (opcao == 3) {
                System.out.println("O resultado da multiplicão é: " + multi(num1, num2));
            } else if (opcao == 4) {
                System.out.println("O resultado da divisão é: " + divi(num1, num2));
            } else {
                System.out.println("Por favor, digite dados válidos");
            }
        } while (opcao == 9);

    }

    public static double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public static double subt(double n1, double n2) {
        return n1 - n2;
    }

    public static double multi(double n1, double n2) {
        return n1 * n2;
    }

    public static double divi(double n1, double n2) {
        return n1 / n2;
    }
}
