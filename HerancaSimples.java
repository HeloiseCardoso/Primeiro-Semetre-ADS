public class Principal {
    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
        System.out.println(pessoa.primeiroLetraNomeMaiuscula());
        System.out.println(pessoa.ajustaNomes("heloise cardoso"));
    }
}

import java.util.Random;

public class Pessoa {

    private int dataNascimento;
    private String nome;
    private String sobrenome;


    public String nome(){
        Random random = new Random();
        String auxiliar = " ";
        for(int i = 0; i<= 10; i++) {
            int nome1 = random.nextInt(26) + 65;
            char nome2 = (char) nome1;
            auxiliar = auxiliar + nome2;
            nome = auxiliar;
        }
        return nome;
    }

    public String sobreNome() {
        Random random = new Random();
        String auxiliar = " ";
        for (int i = 0; i <= 15; i++) {
            int nome1 = random.nextInt(26) + 65;
            char nome2 = (char) nome1;
            auxiliar = auxiliar + nome2;
            sobrenome = auxiliar;
        }
        return sobrenome;
    }



    public String primeiroLetraNomeMaiuscula (){ //RETORNA APENAS O H
        String nomeS = "heloise";
        String nome = nomeS.substring(0,1).toUpperCase();
        return nome;
    }


    //O Split é usado para dividir uma string em pequenos pedaços. Para isso, seu método retorna um array de strings
    public String ajustaNomes(String nomeEsobrenome) {
        String vetor[] = nomeEsobrenome.split(" ");
        vetor[0]=vetor[0].substring(0,1).toUpperCase()+vetor[0].substring(1).toLowerCase();
        // Ex. heloise cardoso
        //vetor[0] = Heloise
        //vetor [0] = vetor[0].substring(0,1);  -> h
        //vetor [0] = vetor[0].sustring(0,1).toUpperCase; -> H
        //vetor [0] = vetor[0].substring(0,1).toUpperCase + vetor[0].subtring(1).toLowerCase() // do um em diante substring(1) letras minusculas toLowerCase

        vetor[1] = vetor[1].substring(0,1).toUpperCase()+vetor[0].substring(1).toLowerCase();
        //vetor[1] = Cardoso
        nomeEsobrenome = vetor[0] + " " + vetor[1];
        return nomeEsobrenome;
    }


    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
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
