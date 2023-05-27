import java.util.Random;
import java.util.Scanner;

public class SegundoVetor {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(9);

        int vetorA[] = new int[numero];
        int vetorB[] = new int[numero];

        for(int i=0; i< numero-1; i++){
            vetorA[i] = random.nextInt(9);
        }

        //varrendo o vetorA[];
        for(int i=0; i<numero-1; i++){
            System.out.println("Valor do elemento: " + vetorA[i]);
            if(vetorA[i] % 2 == 0 ) {
                vetorB[i] = vetorA[i]/2;
                System.out.println("Elemento par divididos por dois: " + vetorB[i]);
            }else{
                vetorB[i] = vetorA[i]*3;
                System.out.println("Elemento impar multiplicados por tres: " + vetorB[i]);
            }

        }





    }
}
