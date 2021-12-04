package formasgeometricas;

import java.util.Scanner;

public class FormasGeometricas {

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        Scanner scan = new Scanner(System.in);        
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                {
                    System.out.println("Digite a base e altura do Retangulo:");
                    double b = scan.nextDouble();
                    double a = scan.nextDouble();
                    System.out.println("A area do Retangulo é " + areaRetangulo(b, a));
                    break;
                }
            case 2:
                {
                    System.out.println("Digite a base e altura do Triangulo:");
                    double b = scan.nextDouble();
                    double a = scan.nextDouble();
                    System.out.println("A area do Triangulo é " + areaTriangulo(b, a));
                    break;
                }
            case 3:
                {
                    System.out.println("Digite a base e altura do Quadrado:");
                    double b = scan.nextDouble();
                    double a = scan.nextDouble();
                    System.out.println("A area do Quadrado é " + areaQuadrado(b, a));
                    break;
                }
            case 4:
                System.out.println("Digite o raio do Circulo:");
                double r = scan.nextDouble();
                System.out.println("A area do Circulo é " + areaCirculo(r));
                break;
            case 9:
                System.out.println("Programa Encerrado");
                System.exit(0);
            default:
                break;
        }

    }

    public static void menu() {
        System.out.println("------------------");
        System.out.println("  Calcular Área   ");
        System.out.println("------------------");
        System.out.println("1- Retângulo");
        System.out.println("2- Triângulo");
        System.out.println("3- Quadrado");
        System.out.println("4- Círculo");
        System.out.println("9- SAIR");
        System.out.println("------------------");
        System.out.print("Selecione uma opção: ");
    }

    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double areaQuadrado(double base, double altura) {
        return base * altura;
    }

    public static double areaCirculo(double raio) {
        return (Math.pow(raio, 2)) * 3.14;
    }

}
