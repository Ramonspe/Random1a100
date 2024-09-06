import java.util.Random;

public class OrdenaNumeros {
    
    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();
        
        // Gera 100 números aleatórios
        for (int i = 0; i < 100; i++) {  
            numeros[i] = random.nextInt(1000); 
        }
        
        // Ordena o vetor utilizando o método de ordenação por bolha (Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i+1; j < numeros.length; j++) {  
                if (numeros[i] > numeros[j]) {  
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
        
        // Exibe os números ordenados
        System.out.println("Números ordenados:");
        for (int i = 0; i < numeros.length; i++) {  
            System.out.print(numeros[i] + " ");
        }
    }
}
