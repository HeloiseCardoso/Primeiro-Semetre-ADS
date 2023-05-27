import java.util.Scanner;

public class ExMatriz1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int TAMANHO = 0;

        while (TAMANHO < 1 || TAMANHO >= 1000) {
            System.out.println("Digite um numero >= 1 e <=100000 para ser o tamanho da matriz");
            TAMANHO = scanner.nextInt();
        }

        int[][] A = new int[TAMANHO][TAMANHO];
        int[] diagonalPrincipal = new int[TAMANHO];

        //leitura
        for( int i=0; i < TAMANHO; i++){
            for( int j=0; j < TAMANHO; j++){
                System.out.println("Informe: " );
                A[i][j] = scanner.nextInt();
             }
        }


        // apresentação
        for(int i=0; i<TAMANHO; i++){
            for (int j=0; j<TAMANHO; j++){
                System.out.println(A[i][j]);
            }
        }
        System.out.println();
        System.out.println("Diagonal principal");
        //diagonal principal
        for(int i=0; i<TAMANHO; i++){
            for (int j=0; j<TAMANHO; j++){
               if(i==j){
                  diagonalPrincipal[i]= A[i][j];
               }
            }
        }
        for(int i=0; i<TAMANHO; i++){
            System.out.println(diagonalPrincipal[i]);
        }
    }
}
