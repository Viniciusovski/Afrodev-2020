package personagemjogo;

public class Personagem {
    private String nome;
    private int velocidade;
    private int kmPercorrido;

    public Personagem() {
        kmPercorrido = 0;
        velocidade = 0;
    }

    public Personagem(String nome, int velocidade, int kmPercorrido) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.kmPercorrido = kmPercorrido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(int kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }
    
    public int correr(int valor){
        int corre = this.velocidade += valor;
        return corre;
    }
    
    public int percorrer(int valor){
        int km = this.kmPercorrido += valor;
        return km;
    }
    
    public int turbo(int valor){
        int corre = valor * 2;
        setVelocidade(corre);
        return corre;
    }
    
    public int puxarParaAtras(Personagem per){
        int rival = per.getKmPercorrido();
        int velocidadeRival = per.getVelocidade();
        int km = rival - 50;
        per.setKmPercorrido(km);
        per.setVelocidade(velocidadeRival - 10);
        return km;
    }
    
    public String chegar(int km){
        String resp = "";
        if(this.kmPercorrido >= km){
            resp = "Vencedor";
        } else {
            resp = "Perdedor";
        }
        return resp;
    }
}
