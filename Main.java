import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] vetorA;
        double[] vetorB;
        int da, db;
        int flag;

        do{

            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual a dimensão do vetorA?");
            da = scanner.nextInt(); //tamanho do vetor tem que ser inteiro
            vetorA = new double[da];
            System.out.println("Qual a dimensão do vetorB?");
            db = scanner.nextInt(); //tamanho do vetor tem que ser inteiro
            vetorB = new double[db];


            //Preecher vetor A
            for(int i=0; i<vetorA.length; i++){
                System.out.println("Preencha o vetorA: ");
                double numerosA = scanner.nextDouble();
                vetorA[i] = numerosA;
            }

            //Preecher vetor B
            for(int i=0; i<vetorB.length; i++){
                System.out.println("Preencha o vetorB: ");
                double numerosB = scanner.nextDouble();
                vetorB[i] = numerosB;

            }

            //Percorrer vetor A
            for(int i=0; i<vetorA.length; i++){
                System.out.println("vetor A: " + vetorA[i]);
            }
            //Percorrer vetor B
            for(int i=0; i<vetorB.length; i++){
                System.out.println("vetor B: " + vetorB[i]);
            }

            System.out.println("Digite 0 para encerrar ou outro inteiro para continuar");
            flag = scanner.nextInt();

        } while (flag !=0);
    }
}
