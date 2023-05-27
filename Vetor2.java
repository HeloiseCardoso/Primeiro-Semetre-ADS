import java.util.Random;
import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {


            int quantidade = 0;
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int tamanho = 0;

            while (tamanho <1 || tamanho >= 100001  ) {
                System.out.println("Digite um numero >= 1 e <=100000 para ser o tamanho do vetor");
                tamanho = scanner.nextInt();

            }

            int vetorV[] = new int[tamanho];

            for(int i=0; i<=tamanho-1; i++){
                vetorV[i] = random.nextInt(100);
            }

            System.out.println("Digite um valor: ");
            int k = scanner.nextInt();

            for(int i=0; i<=tamanho-1;i++){
                if(vetorV[i]>= k){
                    quantidade++;
                }
            }
        System.out.println(quantidade);
    }
}
