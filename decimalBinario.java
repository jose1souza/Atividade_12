import java.util.*;

public class decimalBinario {
    static Scanner leia = new Scanner(System.in);
    static int cont = 0;
    static int binario(int num){
        cont++;
        if(num % 2 == 0){
            return 0;
        }
        if(num % 2 == 1){
            return 1;
        }
        return binario(num);
    }
    public static void main(String[] args) {
        System.out.println("Escreva um valor decimal: ");
        int primeiroNum = leia.nextInt();
        int respo = binario(primeiroNum);
        System.out.println("Resposta: "+respo);
        System.out.println("Vezes que a função foi chamada: " + cont);
    }
} 


