package desafio;
import java.util.Scanner;

public class URI1051 {

    private double entrada;
    private final double[] faixa = {1000.00,1500.00,4500.00};
    private final int[] faixaPer = {8,18,28};
    private final Double[] faixaValor = {0.00,2000.00,3000.00,4500.00};
    private double  valorImposto;
    private final static String isento = "Isento";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double entrada = Double.parseDouble(sc.next());
        URI1051 uri  = new URI1051();
        uri.calcularImposto(entrada);
        sc.close();
    }

    private void calcularImposto(double entrada){

        if (entrada <= faixaValor[1]){
            mensagemFaixaZero();
        }

        if (entrada > faixaValor[1] && entrada <= faixaValor[2]){
            mensagem(calculoFaixaUm(entrada));
        }

        if (entrada > faixaValor[2] && entrada <= faixaValor[3]){
            mensagem(calculofaixaDois(entrada));
        }

        if (entrada > faixaValor[3]){
            mensagem(calculofaixaTres(entrada));
        }
    }

    private double calculoFaixaUm(double entrada){

        if (entrada >= faixaValor[2]){
            valorImposto = faixa[0] * faixaPer[0] / 100;
        }else{
            valorImposto = (entrada - faixaValor[1]) * faixaPer[0] / 100;
        }

        return valorImposto;
    }

    private double calculofaixaDois(double entrada){

        if (entrada > faixaValor[3]){
            valorImposto = faixa[1] * faixaPer[1] / 100;
        }else{
            valorImposto = (entrada - faixaValor[2]) * faixaPer[1] / 100;
        }
        valorImposto += calculoFaixaUm(entrada);
        return valorImposto;
    }

    private double calculofaixaTres(double entrada){

        valorImposto = (entrada - faixaValor[3]) * faixaPer[2] / 100;
        valorImposto += calculofaixaDois(entrada);
        return valorImposto;
    }

    private void mensagemFaixaZero(){
        System.out.printf("%s\n",isento);
    }

    private void mensagem(double valorImposto){
        System.out.printf("R$ %.2f\n",valorImposto);
    }
}
