package contabancaria_main;

import java.util.Scanner;

public class ContaBancaria {
    String numero;
    double saldo;
    String dataAbertura;

    public ContaBancaria() {
        String data = "00/00/0000";
    }

    public ContaBancaria(String numero, double saldo, String dataAbertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private double getSaldo() {        
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public void criar(Cofre cofre){
        /*
        Random gerador = new Random();

        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 10; i++) {
            System.out.println(gerador.nextInt());
        }

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        String conta = scan.nextLine();
        System.out.println("Digite a data de abertura: ");
        String data = scan.nextLine();
        System.out.println("Digite o saldo: ");
        double saldoDigitado = scan.nextDouble();
        
        System.out.println("Dados da conta criada: " + "\n"
                + "Conta: " + conta + "\n"
                + "Saldo: " + saldoDigitado + "\n"
                + "Data de Abertura: " + data);
        
        this.numero = conta;
        this.saldo = saldoDigitado;
        this.dataAbertura = data;
        
        cofre.setSaldo(this.saldo);
    }
    
    public void creditar(Cofre cofre){
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do crédito: ");
        double valor = scan.nextDouble();
        if(valor > 0){
            double credito = cofre.deposita(valor);
            System.out.println("Deposito efetuado, seu saldo é: "+ credito);
        } else {
            System.out.println("Não é possivel efetuar o crédito");
        }
        
    }
    
    public void debitar(Cofre cofre){
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do débito: ");
        double valor = scan.nextDouble();        
        
        if(cofre.getSaldo() > 0){
             double debito = cofre.retira(valor);
             System.out.println("Débito efetuado, seu saldo atual é: "+debito);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public String bloquear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero da conta para BLOQUEAR: ");
        String resp = "";
        String conta = scan.nextLine();
        
        if(conta.equals(this.numero)){
          System.out.println("A conta, " + conta + " foi bloqueada");
          resp = "CONTA BLOQUEADA";
          return resp;
        } else {
            resp = "Conta Liberada";
        }
        return resp;
    }
    
    public String desbloquear(){
        Scanner scan = new Scanner(System.in);  
        String resp = "";
        System.out.println("Digite o numero da conta para DESBLOQUEAR: ");
        String conta = scan.nextLine();
        
        if(conta.equals(this.numero)){
           resp = "A conta, " + conta + " foi desbloqueada";
        } else {
            resp = "Conta Inexistente";
        }
       return resp;        
    }
    
    public String mostrarConta(Cofre cofre){
        return "Número da conta: " + this.numero + "\n Data de Abertura: " + this.dataAbertura + "\n Saldo: " + cofre.getSaldo();
    }
    
}
