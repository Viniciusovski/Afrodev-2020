package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        // TODO code application logic here
        Album alb1 = new Album("Lover", "Taylor Swift", 50);
        Album alb2 = new Album("Help", "The Beatles", 70);
        Album alb3 = new Album("Stoney", "Post Malone", 30);
        
        alb1.ouvir();
        alb2.ouvir();
        alb3.ouvir();
        
        alb1.verPreco();
        alb2.verPreco();
        alb3.verPreco();
    }
    
}
