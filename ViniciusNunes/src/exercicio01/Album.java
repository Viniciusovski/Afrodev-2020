package exercicio01;

public class Album {
    private String nome;
    private String artista;
    private double preco;

    public Album() {
        nome = "";
        artista = "";
        preco = 0; 
    }

    public Album(String nome, String artista, double preco) {
        this.nome = nome;
        this.artista = artista;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void ouvir(){
        System.out.println("Você está ouvindo " + this.nome + " de " + this.artista);
    }
    
    public void verPreco(){
        System.out.println("O preco deste CD é: " + this.preco);
    }
    
}
