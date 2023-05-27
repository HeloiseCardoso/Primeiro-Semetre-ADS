import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random random = new Random();

        int MAT[][] = new int[6][8];
        int somaLinhas[] = new int [6];


        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                MAT[linha][coluna] = random.nextInt(30);
            }
        }

        //varrer matriz
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                System.out.println("Valor para a linha " + linha  + " e coluna " + coluna + " : " + MAT[linha][coluna]);
            }
        }
        System.out.println("---------------------------------");

        //soma da linha
        for (int linha = 0; linha < 6; linha++) {
            int soma = 0;
            for (int coluna = 0; coluna < 8; coluna++) {
                soma = soma + MAT[linha][coluna];
                somaLinhas[linha] = soma;
            }
        }
        System.out.println("---------------------------------");

        //varrer soma
            for (int linha = 0; linha < 6; linha++) {
                    if(somaLinhas[linha] % 2 ==0){
                        System.out.println("A soma de numeros pares da linha " + linha + " é o valor : " + somaLinhas[linha]);
                    }else {
                        System.out.println("A soma de numeros impares da linha " + linha + " é o valor: " + somaLinhas[linha]);

                    }
            }
    }
}













