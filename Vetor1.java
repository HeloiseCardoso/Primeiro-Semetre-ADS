import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {

        int n;
        int quantidade =0, achou = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero >= 1 e <=100000 para ser o tamanho do vetor");
        int tamanho = scanner.nextInt();
        int vetorV[] = new int[tamanho];


        for(int i=1; i<=tamanho; i++){
            System.out.println("Digite os valores do vetor");
            vetorV[i] = scanner.nextInt();
        }

        System.out.println("Digite um valor para buscar no vetor");
        n = scanner.nextInt();


        for(int i=1; i<tamanho; i++){
            if (vetorV[i] == n) {
              achou = 1;
            }
        }
        if(achou ==1 ) {
            System.out.println("ACHEI");
        }else{
            System.out.println("NAO ENCONTROU");
                }
            }
        }
