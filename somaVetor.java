package recursiva;

import java.util.*;

public class somaVetor {
    static Scanner leia = new Scanner(System.in);
    static int cont = 0;
    static int soma(int[] vetor, int indice){
      cont++;
        if(indice == 0){
          return vetor[0];
        }
        return vetor[indice] + soma(vetor, indice - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Tamanho do vetor: ");
        int tamanho = leia.nextInt();
        int[] vetor = new int[tamanho];
      for(int i = 0;i < tamanho;i++){
        System.out.println("Digite o valor para vetor[" + i + "]:");
        vetor[i] = leia.nextInt();
      }
        int respo = soma(vetor,tamanho - 1);
        System.out.println("Soma: "+respo);
        System.out.println("Vezes que a função foi chamada: " + cont);
    }
    
}
