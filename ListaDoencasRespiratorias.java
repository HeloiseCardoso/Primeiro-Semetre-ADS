import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] sintomas = new String[14];
        sintomas[0] = "Dor de cabeça";
        sintomas[1] = "Dor no corpo";
        sintomas[2] = "Tosse";
        sintomas[3] = "Coriza";
        sintomas[4] = "Calafrio";
        sintomas[5] = "Mal estar";
        sintomas[6] = "Febre";
        sintomas[7] = "Dor no peito";
        sintomas[8] = "Perda subta do olfato";
        sintomas[9] = "Perda subta do paladra";
        sintomas[10] = "falta de ar";
        sintomas[11] = "coceira na garganta";
        sintomas[12] = "espirro";
        sintomas[13] = "coceira nos olhos";


        int[] sintomas_rinite = new int[4];
        sintomas_rinite[0] = 3;
        sintomas_rinite[1] = 12;
        sintomas_rinite[2] = 13;
        sintomas_rinite[3] = 11;


        int[] sintomas_covid = new int[8];
        sintomas_covid[0] = 2;
        sintomas_covid[1] = 5;
        sintomas_covid[2] = 6;
        sintomas_covid[3] = 7;
        sintomas_covid[4] = 8;
        sintomas_covid[5] = 9;
        sintomas_covid[6] = 10;
        sintomas_covid[7] = 11;

        int[] sintomas_resfriado = new int[5];
        sintomas_resfriado[0] = 1;
        sintomas_resfriado[1] = 2;
        sintomas_resfriado[2] = 4;
        sintomas_resfriado[3] = 7;
        sintomas_resfriado[4] = 0;

        System.out.println("*******************DOENÇAS RESPIRATÓRIAS*********************");
        System.out.println();
        System.out.println("CÓDIGO                       SINTOMA");


        for (int posicaoVetor = 0; posicaoVetor < 14; posicaoVetor++) {
            System.out.println(posicaoVetor + "             " + sintomas[posicaoVetor]);
        }

        int indice_sintomas_usuario = 0;
        int[] sintomas_usuario = new int[4];

        while (indice_sintomas_usuario <= 3) {
            System.out.println("Informe o código do seu sintoma");
            Scanner scan = new Scanner(System.in);
            int sintoma_digitado = scan.nextInt();

            if (sintoma_digitado < 0 || sintoma_digitado > 14) {
                System.out.println("Sintoma inválido");
            } else {
                sintomas_usuario[indice_sintomas_usuario] = sintoma_digitado;
                indice_sintomas_usuario++;
            }
        }
        indice_sintomas_usuario = 0;
        int contador_rinite = 0;
        int indice_sintomas_rinite = 0;

        while (indice_sintomas_usuario <= 3) {
            while (indice_sintomas_rinite <= 3) {
                if (sintomas_usuario[indice_sintomas_usuario] == sintomas_rinite[indice_sintomas_rinite]) {
                    contador_rinite++; //contador_rinite = contador_rinite + 1
                    indice_sintomas_rinite = 0;
                    break;
                } // fim if
                indice_sintomas_rinite++;
            } // fim while interno
            indice_sintomas_usuario = indice_sintomas_usuario+1;
        } //fim while externo

        if (contador_rinite >= 3) {
            System.out.println("usuário com supeita de rinite");
        }

        indice_sintomas_usuario = 0;
        int contador_covid = 0;
        int indice_sintomas_covid = 0;

        while (indice_sintomas_usuario <= 3) {
            while (indice_sintomas_covid <= 7) {
                if (sintomas_usuario[indice_sintomas_usuario] == sintomas_covid[indice_sintomas_covid]) {
                    contador_covid++; //contador_covid = contador_covid + 1
                    indice_sintomas_covid = 0;
                    break;
                } // fim if
                indice_sintomas_covid++;
            } // fim while interno
            indice_sintomas_usuario = indice_sintomas_usuario+1;
        } //fim while externo

        if (contador_covid >= 3) {
            System.out.println("usuário com supeita de covid");
        }

        indice_sintomas_usuario = 0;
        int contador_resfriado = 0;
        int indice_sintomas_resfriado = 0;

        while (indice_sintomas_usuario <= 3) {
            while (indice_sintomas_resfriado <= 4) {
                if (sintomas_usuario[indice_sintomas_usuario] == sintomas_resfriado[indice_sintomas_resfriado]) {
                    contador_resfriado++; //contador_resfriado = contador_resfriado + 1
                    indice_sintomas_resfriado = 0;
                    break;
                } // fim if
                indice_sintomas_resfriado++;
            } // fim while interno
            indice_sintomas_usuario = indice_sintomas_usuario+1;
        } //fim while externo

        if (contador_resfriado >= 3) {
            System.out.println("usuário com supeita de resfriado");
        }

    }

}