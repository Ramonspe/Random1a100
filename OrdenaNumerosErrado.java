
import java.util.Random;

public class OrdenaNumerosErrado {
    
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();
        
        // Gera 100 números aleatórios
        for (int i = 0; i < 101; i++) {  // Erro: o laço deve ir de 0 a 99 (não 101)
            numeros[i] = random.nextInt(1000); // Gera números entre 0 e 999
        }
        
        // Ordena o vetor utilizando o método de ordenação por bolha (Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i; j < numeros.length; j++) {  // Erro: j deveria começar em i+1
                if (numeros[i] < numeros[j]) {  // Erro: condição trocada, deveria ser >
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        
        // Exibe os números ordenados
        System.out.println("Números ordenados:");
        for (int i = 0; i <= numeros.length; i++) {  // Erro: o laço deveria ir até < numeros.length
            System.out.print(numeros[i] + " ");
        }
    }
}


