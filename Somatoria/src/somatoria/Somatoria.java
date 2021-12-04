/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatoria;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Somatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Word");
        
        System.out.println("-------------");
        System.out.println("Iniciando Somador");
        System.out.println("-----------------");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int resultado = (num1 + num2) / 2;
        System.out.println("Resultadi da soma dos números dividido por 2 é: "+ resultado);
        
    }
    
}
