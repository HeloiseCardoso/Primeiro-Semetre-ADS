

//ELABORE UM PROGRAMA QUE:
//A) CRIE A CLASSE FUNCIONARIO( NOME: STRING, SALARIO:DOUBLE, E COM O ATRIBUTO LISTATEL: DO TIPO DE TELEFONE)
//B)CRIE A CLASSE TELEFONE(NUMERO: STRING);
//C)CRIA A CLASSE PRINCIPAL QUE PERMITA GERAR 30 OBJETOS EM UM LISTA DE FUNCIONARIOS E, EM SEGUIDA,
//ESCREVA AS INFORMACOES DE CADA FUNCIONARIO NO SEGUINTE FORMATO:
//OS NOMES DEVEM POSSUIR 20 CARACTERES, SALARIO DEVE POSSUIR 10 CARACTERES (7 INTEIROS E 2 DECIMAIS) E FONE
//DEVE POSSUIR 8 CARACTERES. PODENDO GERAR OS DADOS RANDOMICAMENTE OS DADOS, SENDO QUE DEVE-SE TER 0 A 5
///TELEFONES POR FUNCIONARIO.

import java.lang.reflect.Array;
import java.time.temporal.TemporalField;
import java.util.ArrayList; //arrayList é uma colecao com objetivo de armazenar objetos, sem quantidade limitada, a limitacao esta na memoria do computador. E o msmo que concatenar palavras
        import java.util.Random;

public class AgendaTelefonica {
    public static void main(String[] args) {

        //GERAR 30 OBJETOS EM UM LISTA DE FUNCIONARIOS

        ArrayList<Funcionario> listaDeFuncionario = new ArrayList<>();   //criei um arrei dentro dele esta a minhca classe que é o tipo/classe do meu objeto que dei o nme de listaDeFuncionario.

        for (int i = 0; i < 30; i++) {
            //criando objeto funcionario

            Funcionario funcionario1 = new Funcionario();
            funcionario1.setNome(funcionario1.gerarNome());
            funcionario1.setSalario(funcionario1.gerarSalario());

            Telefone telefone = new Telefone();
            telefone.setNumero(telefone.gerarTelefone());
            funcionario1.getListaTelefone().add(telefone);

            Telefone telefone2 = new Telefone();
            telefone2.setNumero(telefone2.gerarTelefone());
            funcionario1.getListaTelefone().add(telefone2);

            Telefone telefone3 = new Telefone();
            telefone3.setNumero(telefone3.gerarTelefone());
            funcionario1.getListaTelefone().add(telefone3);

            Telefone telefone4 = new Telefone();
            telefone4.setNumero(telefone4.gerarTelefone());
            funcionario1.getListaTelefone().add(telefone4);

            Telefone telefone5 = new Telefone();
            telefone5.setNumero(telefone5.gerarTelefone());
            funcionario1.getListaTelefone().add(telefone5);


            //adiciona uma objeto funcionario na lista
           listaDeFuncionario.add(funcionario1); //tenho que extender funcionario a agenda telefonica
        }
         //acessando o objeto na posicao i da lista
        for (int i = 0; i < listaDeFuncionario.size(); i++) {
            Funcionario funcionario1 = listaDeFuncionario.get(i);
            System.out.println("nome " + funcionario1.getNome());
            System.out.println("salario " + funcionario1.getSalario()); //????

            ArrayList<Telefone> listaTelefone = funcionario1.getListaTelefone();
            for( int j =0; j< listaTelefone.size();j++) {
                System.out.println("telefone " + listaTelefone.get(j).getNumero());

            }

        }

    }
}


import java.util.Random;

public class Telefone {
    private String numero;


    public String gerarTelefone() {
        String auxiliar = " " ;
        Random random = new Random();
        int telefone = 0;
        for (int i = 0; i < 8; i++) {
            telefone = random.nextInt(9);
            auxiliar = auxiliar + telefone;
        }
        return auxiliar;

    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}


public class Funcionario {

    private String nome;
    private double salario;
    private ArrayList<Telefone> listaTelefone = new ArrayList<>(); //criei a lista que esta vazia e tem tamanho zero
    // private  ArrayList<Telefone> listaTelefonelistaTelefone aqui eu so crio a espaco de memoria

    Random random = new Random();


    public String gerarNome() {

        String retorno = " ";
        for (int i = 0; i < 20; i++) {
            int letra = random.nextInt(26) + 65;
            char charLetra = (char) letra;
            String auxilixar = Character.toString(charLetra);
            retorno += auxilixar;
        }
        return retorno;
    }


        public double gerarSalario(){
        double salario = 0;
        double auxiliar = 0;
        for(int i=0; i< 10; i++){
            salario = random.nextInt();  //como faco para nao gerar numero negativo
            salario = auxiliar + salario;
        }
            return salario;
        } //SALARIO DEVE POSSUIR 10 CARACTERES (7 INTEIROS E 2 DECIMAIS)


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefonelistaTelefone(ArrayList<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }
