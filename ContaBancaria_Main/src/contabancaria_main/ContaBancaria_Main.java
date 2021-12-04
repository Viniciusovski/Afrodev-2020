/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria_main;

/**
 *
 * @author Vinicius
 */
public class ContaBancaria_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Cofre cofre = new Cofre();
        
       cofre.mostrarSaldo(cofre.deposita(100));
       
       ContaBancaria conta = new ContaBancaria();
       /*
       conta.creditar(cofre);
       conta.debitar(cofre);
       conta.bloquear();
       conta.desbloquear();
       */
       
       conta.criar(cofre);
       conta.creditar(cofre);
       conta.debitar(cofre);
       
       String numeroConta = conta.getNumero();
     
       if(conta.bloquear().equals("CONTA BLOQUEADA")){
           System.out.println("Conta Bloqueada");
       } else {           
           conta.debitar(cofre);
           System.out.println(cofre.getSaldo());
       }
       
       conta.desbloquear();        
        System.out.println(conta.mostrarConta(cofre));
       //System.out.println(cofre.getSaldo());
        
    }
    
}
