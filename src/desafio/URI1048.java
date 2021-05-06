package desafio;
import java.util.Scanner;
public class URI1048 {

    private static final int faixaUm = 15;
    private static final int faixaDois = 12;
    private static final int faixaTres = 10;
    private static final int faixaQuatro = 7;
    private static final int faixaCinco = 4;
    private static final double salarioUm = 400.00;
    private static final double salarioDois = 800.00;
    private static final double salarioTres = 1200.00;
    private static final double salarioQuatro = 2000.00;
    private double salario, novoSalario,valorAumento;
    private int faixa;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        URI1048 uri = new URI1048();
        uri.resultado(salario);

    }

    public Double calcularSalario(double salario){
        novoSalario = salario + valorAumento(salario);
        return novoSalario;
    }

    public Double valorAumento(double salario){
        valorAumento = salario * calcularFaixa(salario) / 100;
        return valorAumento;
    }

    public int calcularFaixa(double salario){

        if (salario <= salarioUm){
            faixa = faixaUm;
        }

        if (salario > salarioUm && salario <= salarioDois){
            faixa = faixaDois;
        }

        if (salario > salarioDois && salario <= salarioTres){
            faixa = faixaTres;
        }

        if (salario > salarioTres && salario <= salarioQuatro){
            faixa = faixaQuatro;
        }

        if (salario > salarioQuatro){
            faixa = faixaCinco;
        }


        return faixa;
    }

    public void resultado(double salario){
        System.out.printf("Novo salario: %.2f\n" +
                          "Reajuste ganho: %.2f\n" +
                          "Em percentual: %d %%\n"
                          ,calcularSalario(salario),valorAumento(salario),calcularFaixa(salario));
    }
}
