package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        for (int i = 0; i < 3; i++) {
            valor = lerValores();
            if (i == 0) {
                num1 = valor;
            } else if (i == 1) {
                num2 = valor;
            } else {
                num3 = valor;
            }
        }

        verificarPositivoOuNegativo(num1, num2, num3);
        verificarTriangulo(num1, num2, num3);

        if (verificarTriangulo(num1, num2, num3).equals("É um triangulo")) {
            verificarTipoTriangulo(num1, num2, num3);
        } else {
            System.out.println("Não é um triangulo");
        }
    }

    public static int lerValores() {
        int valor = 0;
        System.out.println("Digite um valor: ");
        Scanner scan = new Scanner(System.in);

        return valor = scan.nextInt();
    }
    
    public static void verificarPositivoOuNegativo(int num1, int num2, int num3) {

        if (num1 < 0) {
            System.out.println("O primeiro valor é negativo");
        } else if (num2 < 0) {
            System.out.println("O segundo valor é negativo");
        } else if (num3 < 0) {
            System.out.println("O terceiro valor é negativo");
        } else {
            System.out.println("os três valores são positivos");
        }

    }

    public static String verificarTriangulo(int num1, int num2, int num3) {
        String verifica = "";
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;

        soma1 = num1 + num3;
        soma2 = num2 + num3;
        soma3 = num1 + num2;

        if ((num1 < soma2) && (num2 < soma1) && (num3 < soma3)) {
            return "É um triangulo";
        } else {
            return "Não é um triangulo";
        }
    }

    public static void verificarTipoTriangulo(int num1, int num2, int num3) {
        if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {
            System.out.println("O Triangulo é escaleno");
        } else if ((num1 == num2 && num1 == num3) && (num2 == num3)) {
            System.out.println("O triangulo é Equilatero");
        } else {
            System.out.println("O Triangulo é isósceles");
        }
    }
}

/*
    public static void lerValores() {
        int valor = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Digite um valor: ");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            valor = scan.nextInt();
            if (i == 0) {
                num1 = valor;
                System.out.println("Valor digitado: " + num1);
            } else if (i == 1) {
                num2 = valor;
                System.out.println("Valor digitado: " + num2);
            } else {
                num3 = valor;
                System.out.println("Valor digitado: " + num3);
            }
        }
    }
 */
