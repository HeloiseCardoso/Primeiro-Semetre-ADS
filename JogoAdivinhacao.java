
import javax.swing.*;
import java.util.Scanner;

public class Jogo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valorMinimo = "A";
        String valorMaximo = "B";
        int quantidadeJogadores = 0;
        int quantidadePalpites = 0;

        Controle controle = new Controle();



        while(valorMinimo.matches("[A-Za-z]*")) { //valorMinimo comeca com A para entrar no while, [A-Z]

            valorMinimo = JOptionPane.showInputDialog("Digite um valor inicial inteiro");
            JOptionPane.showMessageDialog(null, "Valor inicial: " + valorMinimo);


            if (!valorMinimo.matches("[A-Za-z]*") && Integer.valueOf(valorMinimo) < 0) {
                //se nao for um numero entra no if, sai e volta para o while na condicao de letra
                // se for um numero mas menor que zero entra no if e para voltar por while precisa ser letra entao valor minimo começa com "A"
                valorMinimo = "A";
                valorMinimo = JOptionPane.showInputDialog("Voce nao digitou um valor inicial inteiro, digite novamente");
                JOptionPane.showMessageDialog(null, "Valor inicial: " + valorMinimo);
            }

            valorMaximo = JOptionPane.showInputDialog("Digite um valor final inteiro");
            JOptionPane.showMessageDialog(null, "Valor final : " + valorMaximo);

            if (!valorMinimo.matches("[A-Za-z]*") && Integer.valueOf(valorMinimo) < 0) {
                //se nao for um numero entra no if, sai e volta para o while na condicao de letra
                // se for um numero mas menor que zero entra no if e para voltar por while precisa ser letra entao valor minimo começa com "B"
                valorMaximo = "B";
                System.out.println("Digite um valor final inteiro");
            }
        }

        int valorMinimoInteiro = Integer.parseInt(valorMinimo); //converto String valorMinimo para inteiro para pode comparar o invervalo maior que 50
        int valorMaximoInteiro = Integer.parseInt(valorMaximo);

        if (valorMinimoInteiro + valorMaximoInteiro <= 50) {
            JOptionPane.showMessageDialog(null, "Intervalo menor que 50, digite um valor final maior");

            valorMaximo = JOptionPane.showInputDialog("Digite um valor final inteiro");
            JOptionPane.showMessageDialog(null, "Valor final : " + valorMaximo);

        }
        quantidadeJogadores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadores:"));
        JOptionPane.showMessageDialog(null, "Quantidade de jogadores : " + quantidadeJogadores);

        quantidadePalpites = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de palpites por jogador:"));
        JOptionPane.showMessageDialog(null, "Numeros de palpite : " + quantidadeJogadores);
        controle.iniciarJogo(valorMinimoInteiro, valorMaximoInteiro, quantidadeJogadores, quantidadePalpites);
        controle.imprimirVencedores();

    }
}


import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogador {
    private String nomeJogador;
    private int[] palpites;

    private boolean isVencedor = false;

    static Random random = new Random();
    //Um jogo deve possuir um ArrayList de jogadores, cujas informações serão armazenadas durante a execução do jogo.



    public void gerarPalpites(int quantidadePalpites, int valorMinimo, int valorMaximo) {
        this.palpites = new int[quantidadePalpites];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < quantidadePalpites; i++) {

            int palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite seu papite:"));
            JOptionPane.showMessageDialog(null, "Palpite: " + palpite);
            //System.out.println("digite seu palpite");
             //int palpite = scanner.nextInt();
             this.palpites[i] = palpite;
        }
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int[] getPalpites() {
        return palpites;
    }

    public boolean isVencedor() {
        return isVencedor;
    }

    public void setIsVencedor(boolean vencedor) {
        isVencedor = vencedor;
    }
}


import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controle extends Jogador {

        ArrayList<Jogador> jogadores;
        public void iniciarJogo(int valorMinimo, int valorMaximo, int quantidadeJogadores, int quantidadePalpite) {

            int numeroGerado = gerarNumero(valorMinimo, valorMaximo);
            this.jogadores = gerarJogadores(valorMinimo, valorMaximo, quantidadeJogadores, quantidadePalpite);

            for(int i = 0; i < this.jogadores.size(); i++) {
                Jogador jogador = this.jogadores.get(i);

                for(int j = 0 ; j < quantidadePalpite; j ++) {
                    if(jogador.getPalpites()[j] == numeroGerado) {
                        jogador.setIsVencedor(true);
                        break;
                    }
                }

            }

        }

        public void imprimirVencedores() {
            System.out.println("Jogadores Vencedores:");
            for(int i = 0; i < jogadores.size() ; i++) {
                Jogador jogador = jogadores.get(i);
                if(jogador.isVencedor()) {
                    System.out.println(jogador.getNomeJogador());
                }
            }
        }

        private int gerarNumero(int valorMinimo, int valorMaximo) { // o metodo vai sortear os numero e coloca-los em um vetor
            Random random = new Random();
            int numeroGerado = random.nextInt((valorMaximo - valorMinimo)+1) + valorMinimo; //formula: aleatorio.nextInt((max - min) + 1) + min;
            System.out.println("numeroGerado: " + numeroGerado);
            return numeroGerado;
        }

        private ArrayList gerarJogadores(int valorMinimo, int valorMaximo, int quantidadeJogadores, int quantidadePalpite) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Jogador> jogadores = new ArrayList<>();

            for (int i = 0; i < quantidadeJogadores; i++) {
                Jogador jogador = new Jogador();
                //System.out.println("Escreve o nome do jogador: ");
               // jogador.setNomeJogador(scanner.next());

                String NomeJogador = JOptionPane.showInputDialog("Nome do Jogador");
                JOptionPane.showMessageDialog(null, "Nome: " + NomeJogador);
                jogador.gerarPalpites(quantidadePalpite, valorMinimo, valorMaximo); //palpite e randomico
                imprimirPalpite(jogador.getPalpites());
                jogadores.add(jogador);
            }
            return jogadores;
        }

        private void imprimirPalpite(int[] palpites) {
            for (int i = 0; i < palpites.length; i++) {
                System.out.println(palpites[i]);
            }
        }

}



