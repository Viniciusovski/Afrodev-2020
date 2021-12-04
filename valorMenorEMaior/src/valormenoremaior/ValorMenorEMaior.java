package valormenoremaior;

import java.util.Arrays;
import java.util.Scanner;

public class ValorMenorEMaior {

    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = new int[10];
        for(int i = 0; i < 10; i++){
            vet[i] = lerDados();
        }
        System.out.println(Arrays.toString(vet));
        verificarSeMenor(vet);
        verificarSeMaior(vet);
    }
    public static int lerDados(){
        
        System.out.println("Digite um valor: ");
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        return valor = scan.nextInt();
        
        
    }
    
    public static void verificarSeMenor(int vet[]){
        int numMenor = 999999999;
        for(int j = 0; j < vet.length; j++){
            if(vet[j] < numMenor){
                numMenor = vet[j];
            }
        }
        System.out.println("O menor numero é: " + numMenor);
        
        
    }
    
    public static void verificarSeMaior(int vet[]){
        int numMaior = 0;
        for(int j = 0; j < vet.length; j++){
            
            if(vet[j] > numMaior){
                numMaior = vet[j];
            }
        }
        System.out.println("O maior numero é: " + numMaior);
    }
}
//Obrigada, prefeitura!