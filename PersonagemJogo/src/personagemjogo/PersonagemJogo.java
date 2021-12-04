package personagemjogo;

public class PersonagemJogo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Personagem lisa = new Personagem();
        Personagem homer = new Personagem();
        Personagem bart = new Personagem();
        
        int kmChegada = 100;
        
        lisa.percorrer(lisa.correr(10));
        
        bart.percorrer(bart.correr(10));
        
        homer.percorrer(homer.correr(10));
        
        lisa.percorrer(lisa.turbo(10));
        
        bart.percorrer(bart.correr(20));
        
        homer.percorrer(homer.correr(10));
        
        lisa.percorrer(lisa.correr(10));
        
        bart.puxarParaAtras(lisa);
        bart.percorrer(bart.turbo(20));
        
        homer.percorrer(homer.correr(10));
        
        lisa.percorrer(lisa.correr(10));
        bart.percorrer(bart.correr(10));
        
        
        if(lisa.chegar(kmChegada).equals("Vencedor")){
            System.out.println("Lisa é a vencedora");
            System.out.println("Velocidade: "+ lisa.getVelocidade());
        } else {
            System.out.println("Lisa perdeu com " + lisa.getKmPercorrido() + " km percorridos");
            System.out.println("Velocidade: "+ lisa.getVelocidade());
        } 
        
        if(bart.chegar(kmChegada).equals("Vencedor")){
            System.out.println("Bart é o vencedor");
            System.out.println("Velocidade: "+ bart.getVelocidade());
        } else {
            System.out.println("Bart perdeu com " + bart.getKmPercorrido() + " km percorridos");
            System.out.println("Velocidade: "+ bart.getVelocidade());
        }
        
        if(homer.chegar(kmChegada).equals("Vencedor")){
            System.out.println("Homer é o vencedor");
            System.out.println("Velocidade: "+ homer.getVelocidade());
        } else {
            System.out.println("Homer perdeu com " + homer.getKmPercorrido() + " km percorridos");
            System.out.println("Velocidade: "+ homer.getVelocidade());
        }
    }
    
}
