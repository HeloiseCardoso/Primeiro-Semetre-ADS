import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        String nome = pessoa.lerNome();
        System.out.println("NOME->"+nome);
        String nomeajustado = pessoa.ajustaNome(nome);

        String sobrenome = pessoa.lerSobrenome();
        System.out.println("SOBRENOME->"+sobrenome);
        String sobrenomejustado = pessoa.ajustaNome(sobrenome);
        System.out.println("NOME AJUSTADO->"+sobrenomejustado);

        String nomEsobrenome = nomeajustado + " " + sobrenomejustado;
        System.out.println("Nome e sobrenome: " + nomEsobrenome);



    }
}