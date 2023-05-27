import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        int anos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Populacao do pais A: ");
        float paisA = scanner.nextInt();
        System.out.println("Populacao do pais B: ");
        float paisB = scanner.nextInt();

        while (paisA < paisB) {
            paisA = paisA *  1.03f;
            paisB = paisB  *  1.015f;
            anos ++;
        }
        System.out.println("anos: " + anos);
    }
}
