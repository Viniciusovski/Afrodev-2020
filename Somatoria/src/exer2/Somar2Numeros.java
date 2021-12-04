/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2;

import java.util.Scanner;

public class Somar2Numeros {

    public static void main(String[] args) {
        int resultado = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número");
        int num2 = scan.nextInt();
        System.out.println("Digite mais um número");
        int num3 = scan.nextInt();

        if (num3 == 0) {
            System.out.println("O terceiro valor deve ser diferente de 0");
        } else if (num1 < 10) {
            System.out.println("O primeiro número deve ser maior que 10");
        } else {
            resultado += (num1 + num2) / num3;
            if (resultado < 4) {
                System.out.println("O resultado é menor que 4");
            } else {
                System.out.println("O resultado é: " + resultado);
            }
        }
    }
}

