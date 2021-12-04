package exercicio02;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Triangulo tri01 = new Triangulo(50, 20);
        Triangulo tri02 = new Triangulo(100, 80);
        Triangulo tri03 = new Triangulo(100, 100);
        
        System.out.println("A area do Triangulo 1 é: " + tri01.calcularArea());
        System.out.println("A area do Triangulo 2 é: " + tri02.calcularArea());
        System.out.println("A area do Triangulo 3 é: " + tri03.calcularArea());
    }
}
