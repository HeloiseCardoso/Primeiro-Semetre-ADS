import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            int SIZEA = 10, SIZEB = 20;
            int A[], B[], C[];
            int i, j, qtde, achou, encontrou;
            qtde = 0;
            achou = 0;
            encontrou = 0;
            A = new int[SIZEA];
            B = new int[SIZEB];
            C = new int[SIZEA + SIZEB];
            System.out.println("Digite os valores de A: ");
            for (i = 0; i < SIZEA; i++) {
                A[i] = leitor.nextInt();
            }
            System.out.println("Digite os valores de B: ");
            for (j = 0; j < SIZEB; j++) {
                B[j] = leitor.nextInt();
            }


            //Encontrar elementos não comuns aos vetores A e B
            // A: 35 49 35 18
            // B: 7 36 18 30 18 7
            // C:
            for (i = 0; i < SIZEA; i++) {
                achou = 0;
                for (j = 0; j < SIZEB; j++) {
                    if (A[i] == B[j])
                        achou = 1;
                }
                if (achou == 0) {
                    encontrou = 0;
                    for (int cont = 0; cont < qtde; cont++) {
                        if (C[cont] == A[i])
                            encontrou = 1;
                    }
                    if (encontrou == 0) {
                        C[qtde] = A[i];
                        qtde++;
                    }
                }
            }


            for (j = 0; j < SIZEB; j++) {
                achou = 0;
                for (i = 0; i < SIZEA; i++) {
                    if (A[i] == B[j])
                        achou = 1;
                }
                if (achou == 0) {
                    encontrou = 0;
                    for (int cont = 0; cont < qtde; cont++) {
                        if (C[cont] == B[j])
                            encontrou = 1;
                    }
                    if (encontrou == 0) {
                        C[qtde] = B[j];
                        qtde++;
                    }
                }
            }

            //Escrever o resultados encontrados
            System.out.println("OS VALORES NÃO COMUNS SÃO");
            for (i = 0; i < qtde; i++) {
                System.out.println(C[i]);
            }
        }
    }
