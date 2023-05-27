import java.util.Scanner;
    public class Ex2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {

                System.out.println("Digite um numero: ");
                int PrimeiroNumero = scanner.nextInt();

                if(PrimeiroNumero > 0) {
                    int auxiliar2 = PrimeiroNumero % 10;
                    int auxiliar3 = PrimeiroNumero / 10;
                    int numeroinvertido = auxiliar2 * 100 + auxiliar3;
                    System.out.println(numeroinvertido);

                    System.out.println("Digite um numero: ");
                    int SegundoNumero = scanner.nextInt();

                    if(SegundoNumero > 0 && SegundoNumero != PrimeiroNumero) {
                        int auxiliar4 = SegundoNumero % 10;
                        int auxiliar5 = SegundoNumero / 10;
                        int segundoNumeroInvertido = auxiliar4 * 100 + auxiliar5;
                        System.out.println(segundoNumeroInvertido);

                        if(numeroinvertido>segundoNumeroInvertido){
                            System.out.println("Maior: " + numeroinvertido);
                        }else{
                            System.out.println("Maior: " + segundoNumeroInvertido);
                        }

                    }
                }
            }
        }
    }




