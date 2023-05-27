import java.util.Scanner;

public class matriz1 {
    public static void main(String[] args) {

        //1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

        int mat[][];
        mat = new int[4][4];
        int qtd = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<4; i++){ // linha
            for (int j=0; j<4; j++){ //coluna
                System.out.println("preecha a matriz");
                mat[i][j]=scanner.nextInt();
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if( mat[i][j]>10){ //passei por cada elemento e verifiquei se ele é maior do que 10
                    qtd++;
                }
            }
        }
    }
}