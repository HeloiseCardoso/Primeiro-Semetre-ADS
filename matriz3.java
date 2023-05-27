import java.util.Scanner;

public class matriz3 {
    //3. Leia duas matrizes 4 x 4
    // e escreva uma terceira com os maiores valores de cada posição das matrizes lidas
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1[][], m2[][], m3[][];
        m1 = new int[4][4];
        m2 = new int[4][4];
        m3 = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) { //pega maiores valores das respectivas posicoes
            for (int j = 0; j < 3; j++) {
                if (m1[i][j] > m2[i][j]) {
                    m3[i][j] = scanner.nextInt();
                } else {
                    m3[i][j] = m2[i][j];
                }
            }
        }
        //escreva matriz m3
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(m3[i][j]);
            }
        }
    }
}