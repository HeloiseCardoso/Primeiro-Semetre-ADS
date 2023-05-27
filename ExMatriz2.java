import java.util.Scanner;

public class ExMatriz2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = 0;
        int matriz[][];

        while (n < 1 || n >= 1000) {
            System.out.println("Digite um numero >= 1 e <=1000 representando a ordem da matriz");
            n = scanner.nextInt();
        }

        matriz = new int[n][n];

        for(int i=0; i<n; i++) { // linha
            for (int j=0; j<n; j++) { //coluna
                System.out.println("preecha a matriz");
                matriz[i][j] = scanner.nextInt();
            }
        }


        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("Diagonal segundária: ");
        for(int i=0; i< n; i++){
            System.out.println(matriz[i][n-1-i]);
        }

    }
}
