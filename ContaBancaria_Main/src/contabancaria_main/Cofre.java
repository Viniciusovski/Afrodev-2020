package contabancaria_main;

public class Cofre {
    double saldo;

    public Cofre() {
    }

    public Cofre(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
    public double deposita(double valor){
        double soma = 0;
        if(valor > 0){
            soma = this.saldo + valor;
        } else {
            System.out.println("Não é possivel fazer o deposito");
        }
        this.saldo = this.saldo + valor;
        return soma;
    }
    
    public double retira(double valor){
        double sub = 0;
                if(this.saldo > 0){
                    sub = saldo - valor;
                } else {
                    System.out.println("Retirada recusada");
                }
        this.saldo = this.saldo - valor;
        return sub;
    }
    
    public void mostrarSaldo(double valor){
        System.out.println("O saldo atual é: "+ valor);
    }
}
