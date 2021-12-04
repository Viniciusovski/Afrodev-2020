package eleitorerestaurante;

public class Eleitor {
    String nome;
    String titulo;
    String cidade;
    String estado;
    String cargo;
    
    public Eleitor(){
        
    }

    public Eleitor(String nome, String titulo, String cidade, String estado, String cargo) {
        this.nome = nome;
        this.titulo = titulo;
        this.cidade = cidade;
        this.estado = estado;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String votar(String nome, String titulo, String cargo){
        String resposta = "O "+ nome + " (Titulo: " + titulo +")" + " votou para " + cargo;
        System.out.println(resposta);
        return resposta;
    }
    
    public void confirmarVoto(String nome, String titulo, String cidade, String estado){
        if(("".equals(nome)) || (titulo == "") || (cidade == "") || (estado == "")){
            System.out.println("Não confirmado");
        }else{
            System.out.println("Voto confirmado");
        }
    }
    
}
