package desafio;
import java.math.BigDecimal;
import java.util.Scanner;

public class URI1021 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String entrada = sc.next();
        BigDecimal in = new BigDecimal(entrada);
        BigDecimal notaCem = new BigDecimal("100.00");
        BigDecimal notaCinquenta = new BigDecimal("50.00");
        BigDecimal notaVinte = new BigDecimal("20.00");
        BigDecimal notaDez = new BigDecimal("10.00");
        BigDecimal notaCinco = new BigDecimal("5.00");
        BigDecimal notaDois = new BigDecimal("2.00");
        BigDecimal moedaUm = new BigDecimal("1.00");
        BigDecimal moedaCinquenta = new BigDecimal("0.50");
        BigDecimal moedaVinteCinco = new BigDecimal("0.25");
        BigDecimal moedaDez = new BigDecimal("0.10");
        BigDecimal moedaCinco = new BigDecimal("0.05");
        BigDecimal moedaUmCentavo = new BigDecimal("0.01");
        int cemNota = 0,cinquentaNota = 0,vinteNota = 0,dezNota = 0,cincoNota = 0,doisNota = 0;
        int umMoeda = 0,cinquentaMoeda = 0,vinteCincoMoeda = 0,dezMoeda = 0,cincoMoeda = 0,umCenMoeda = 0;


        while(in.doubleValue() >= 100.00){
            in = in.subtract(notaCem);
            cemNota++;
        }

        while(in.doubleValue() >= 50.00){
            in = in.subtract(notaCinquenta);
            cinquentaNota++;
        }

        while(in.doubleValue() >= 20.00){
            in = in.subtract(notaVinte);
            vinteNota++;
        }

        while(in.doubleValue() >= 10.00){
            in = in.subtract(notaDez);
            dezNota++;
        }

        while(in.doubleValue() >= 5.00){
            in = in.subtract(notaCinco);
            cincoNota++;
        }

        while(in.doubleValue() >= 2.00){
            in = in.subtract(notaDois);
            doisNota++;
        }

        while(in.doubleValue() >= 1.00){
            in = in.subtract(moedaUm);
            umMoeda++;
        }

        while(in.doubleValue() >= 0.50){
            in = in.subtract(moedaCinquenta);
            cinquentaMoeda++;
        }

        while(in.doubleValue() >= 0.25){
            in = in.subtract(moedaVinteCinco);
            vinteCincoMoeda++;
        }

        while(in.doubleValue() >= 0.10){
            in = in.subtract(moedaDez);
            dezMoeda++;
        }

        while(in.doubleValue() >= 0.05){
            in = in.subtract(moedaCinco);
            cincoMoeda++;
        }

        while(in.doubleValue() >= 0.01){
            in = in.subtract(moedaUmCentavo);
            umCenMoeda++;
        }
        
        sc.close();
        
        System.out.printf("NOTAS:\n" +
                "%d nota(s) de R$ 100.00\n" +
                "%d nota(s) de R$ 50.00\n" +
                "%d nota(s) de R$ 20.00\n" +
                "%d nota(s) de R$ 10.00\n" +
                "%d nota(s) de R$ 5.00\n" +
                "%d nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                "%d moeda(s) de R$ 1.00\n" +
                "%d moeda(s) de R$ 0.50\n" +
                "%d moeda(s) de R$ 0.25\n" +
                "%d moeda(s) de R$ 0.10\n" +
                "%d moeda(s) de R$ 0.05\n" +
                "%d moeda(s) de R$ 0.01\n",
                cemNota,cinquentaNota,vinteNota,dezNota,cincoNota,doisNota,
                umMoeda,cinquentaMoeda,vinteCincoMoeda,dezMoeda,cincoMoeda,umCenMoeda);

    }
}
