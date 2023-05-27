import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float precoCompra, precoVenda, maiorLucro, valorTotalCompras=0, valorTotalVendas=0;
        float lucro, lucroemPorc, percTotal=0;
        long codigo = -1, codigoMaiorLucro, codigoMaisVendido;
        int numVendas, cont, maisVendida;
        int contLucroMenor10, contLUcroEntre10e20, contLucroMaior20;
        maisVendida=0; maiorLucro=0; codigoMaiorLucro=0; codigoMaisVendido=0; contLucroMenor10=0;
        contLUcroEntre10e20=0; contLucroMaior20=0;cont=0;


        while(codigo !=0){
            System.out.println("Codigo da marcadoria: ");
            codigo = leitor.nextLong();
            if (codigo == 0)
                break;
            System.out.println("Preco de compra: ");
            precoCompra = leitor.nextFloat();
            System.out.println("Preco de venda: ");
            precoVenda = leitor.nextFloat();
            System.out.println("Numero de venda: ");
            numVendas = leitor.nextInt();


            lucro = (precoVenda - precoCompra);
            lucroemPorc  = (lucro/precoCompra) * 100;
            if (lucroemPorc < 10) {
                contLucroMenor10++;
            }else if ( lucroemPorc < 20) {
                contLUcroEntre10e20++;
            }else {
                contLucroMaior20++;
            }
            if (lucro > maiorLucro || cont ==0) {
                maiorLucro = lucro;
                codigoMaiorLucro = codigo;
            }
            cont++;
            if(numVendas > maisVendida) {
                maisVendida = numVendas;
                codigoMaisVendido = codigo;
            }
            valorTotalCompras = precoCompra + valorTotalCompras;
            valorTotalVendas = precoVenda + valorTotalVendas;
            percTotal = (valorTotalVendas/valorTotalCompras) * 100;



        }


            System.out.println("Quantidade de mercadorias que geraram lucro menonr que 10% : " + contLucroMenor10);
            System.out.println("Quantidade de mercadorias que geraram lucro maior ou igual a 10%: " + contLUcroEntre10e20);
            System.out.println("Quantidade de mercadorias que geraram lucro maior que 20%: " + contLucroMaior20);
            System.out.println("Codigo da mercadoria que gerou o maior lucro: " + codigoMaiorLucro);
            System.out.println("Codigo da mercadoria mais vendida: " + codigoMaisVendido);
            System.out.println("O valor total de compras: " + valorTotalCompras + " valor total de vendas: " + valorTotalVendas + " e percentual de lucro total: " + percTotal);
            System.out.println("\n");
        }
    }



