/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

/**
 *
 * @author Vinicius
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "J.K Rowling", 300);
        Livro livro2 = new Livro("Harry Potter", "George", 100);
        Livro livro3 = new Livro("Harry Potter", "Carlos", 220);
        
        livro1.titulo ="Adeus";
        livro2.numPag = 200;
        livro3.autor = "Roberto Carlos";
    }
    
}
