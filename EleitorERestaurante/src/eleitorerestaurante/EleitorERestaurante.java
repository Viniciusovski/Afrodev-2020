package eleitorerestaurante;

public class EleitorERestaurante {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Eleitor elei = new Eleitor();
        String nome, titulo, estado, cidade, cargo;
        elei.setTitulo("112-789");
        elei.setEstado("SP");
        elei.setCidade("Osasco");
        elei.setCargo("Vereador");
        
        nome = elei.getNome();
        titulo = elei.getTitulo();
        estado = elei.getEstado();
        elei.setNome("Ricardo");
        cidade = elei.getCidade();
        cargo = elei.getCargo();
        
        elei.votar(elei.getNome(), elei.getTitulo(), elei.getCargo());
        elei.confirmarVoto(nome, titulo, cidade, estado);
        
        
        Restaurante  res = new Restaurante();
        res.setNome("Mamamia");
        res.setTipo("Italiano");
        res.setBairro("Mooca");
        res.setNumCliente(50);
        
        String resNome = res.getNome();
        String resTipo = res.getTipo();
        String resBairro = res.getBairro();
        int numCliente = res.getNumCliente();
        
        System.out.println("Nome do Restaurante: " +resNome+ "\n" 
                + "Tipo: " + resTipo + "\n"
                + "Bairro: " +resBairro+ "\n" +
                "Numero de Cliente: " + numCliente);
        int comida = 0;        
        for(int i = 0; i < 10; i++){
            comida  += res.servirComida(2); //2 é a quantidade de comida servida de 5 em 5 minutos
        }
        
        res.verificarComidaServida(comida, numCliente, resNome);
    }
    
}
