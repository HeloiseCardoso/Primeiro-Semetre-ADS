import java.util.Random;
import java.util.Scanner;

public class MultiplosEfinal7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero;


        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        int vetorA[] = new int[numero]; //tamanho do vetor
        int vetorB[] = new int[numero];


        //preenchendo o vetor
        int x = 0;
        int cont = 0;
        int numeroNatural = 1;

        while (cont < numero) {

            if (numeroNatural % 7 == 0 || numeroNatural % 10 == 7) {
                vetorA[cont] = numeroNatural;
                cont ++;
            }
            numeroNatural++;
        }

            for (int i = 0; i < numero; i++) {
                System.out.println("vetor posicao " + i + " elemento " + vetorA[i]);

            }
        }
   }








