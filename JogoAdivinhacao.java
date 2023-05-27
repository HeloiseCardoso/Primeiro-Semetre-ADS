
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