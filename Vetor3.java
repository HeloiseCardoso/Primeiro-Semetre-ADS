import java.util.Random;
import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {

        int quantidade = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int tamanho = 0;

        while (tamanho <1 || tamanho >5000 ) {
            System.out.println("Digite um numero menor que 5000 para ser o tamanho do vetor");
            tamanho = scanner.nextInt();

        }

        int vetorV[] = new int[tamanho];

        for(int i=0; i<=tamanho-1; i++){
            vetorV[i] = random.nextInt(100);
        }

        for(int i=0; i<=tamanho-1; i++){
            System.out.println(vetorV[i]);
        }
        System.out.println("Ordem inversa do vetor");

        for(int i=tamanho-1; i>=0; i--){
           System.out.println(vetorV[i]);
       }





    }
}
