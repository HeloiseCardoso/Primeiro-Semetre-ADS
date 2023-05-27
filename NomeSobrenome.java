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

import java.util.Random;

public class Pessoa {
    private String nome;
    private String sobrenome;




    public String lerNome(){
    Random random = new Random();
        String auxiliar = " ";
        for(int i = 0; i< 10; i++) {
            int nome1 = random.nextInt(26) + 65;
            char nomeChar = (char) nome1;
            auxiliar = auxiliar + nomeChar;
            nome = auxiliar;
        }
        return nome;
    }


    public String lerSobrenome(){
        Random random = new Random();
        String auxiliar = " ";
        for(int i = 0; i< 15; i++) {
            int nome = random.nextInt(26) + 65;
            char nomeChar = (char) nome;
            String aux = Character.toString(nomeChar);
            auxiliar = auxiliar + aux;
            sobrenome = auxiliar;
        }
        return sobrenome;
    }



    public String ajustaNome(String nome){
        String retorno = nome.substring(1,2).toUpperCase() + nome.substring(2).toLowerCase();
        return retorno;

    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;


    }
}
