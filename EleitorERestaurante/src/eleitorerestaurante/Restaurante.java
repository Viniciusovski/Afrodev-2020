package eleitorerestaurante;

public class Restaurante {
    String nome;
    String bairro;
    String tipo;
    private int numCliente;
    private int numComida;

    public Restaurante() {
    }

    public Restaurante(String nome, String bairro, String tipo, int numCliente, int numComida) {
        this.nome = nome;
        this.bairro = bairro;
        this.tipo = tipo;
        this.numCliente = numCliente;
        this.numComida = numComida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getNumComida() {
        return numComida;
    }

    public void setNumComida(int numComida) {
        this.numComida = numComida;
    }
    
    public int servirComida(int comida){        
        comida += 1;
        return comida;
    }
    
    public void verificarComidaServida(int comida, int numCliente, String nome){
        bemVindo(nome);
        if(comida == numCliente){
            System.out.println("Todos os Clientes foram servidos");
        } else {
            int sobra = numCliente - comida;
            System.out.println("Faltam " + sobra + " clientes para serem servidos");
        }
    }
    
    private void bemVindo(String nome){
        System.out.println("Bem vindo ao restaurante: " + nome);
    }
    
}
