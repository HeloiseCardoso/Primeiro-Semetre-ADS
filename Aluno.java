public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private String turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }


}



public class Principal {

   public static void main(String[] args) {

            System.out.println("Qual a quantidade de alunos: ");
            Scanner scanner = new Scanner(System.in);
            int quantidade = scanner.nextInt();

            Aluno[] vetorAluno = new Aluno[quantidade];
            for (int i = 0; i < quantidade; i++) {
                Alluno a = new Alluno();

                System.out.println("Digite a matricula: ");
                int matricula = scanner.nextInt();
                a.setMatricula(matricula);
                System.out.println("Digite a idade: ");
                int idade = scanner.nextInt();
                a.setIdade(idade);
                System.out.println("Digite o nome");
                String nome = scanner.next();
                a.setNome(nome);

                if (idade>=7 && idade <=12)
                    a.setTurma("Infancia");
                else
                if (idade>12 && idade<21)
                    a.setTurma("Adolescancia");
                else
                    a.setTurma("Adulto");

                vetorAluno[i] = a;
            }

            System.out.println("Seq        " + "Matr.      " + "            " + "Nome      " + "          " + "  Idade     " +"         "+ "     Turma");
            for(int h=0; h<quantidade;h++) {
                System.out.println("00" +h + "         " + vetorAluno[h].getMatricula()+"                       "+vetorAluno[h].getNome() + "                        " + vetorAluno[h].getIdade()+ "                " + vetorAluno[h].getTurma());
            }
        }
    }





