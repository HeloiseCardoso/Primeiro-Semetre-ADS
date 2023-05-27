import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas");
        int m = scanner.nextInt();
        System.out.println("Digite o numero de colunas");
        int n = scanner.nextInt();


        for(int i=2; i<=m; i++){
            for(int j=1; j<=n; j++)
                System.out.println(i+"-"+j);
                }
            }

        }


