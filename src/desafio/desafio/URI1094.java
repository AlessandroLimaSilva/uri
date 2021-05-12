import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;


public class URI1094 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        URI1094  uri = new URI1094();
        uri.imprimir();
    }

    public void imprimir() {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();

        int coelho = 0,rato = 0,sapo = 0;

        for(int i =0;i < loop;i++) {

            int in = sc.nextInt();

            char letra = sc.next().charAt(0);

            if(letra == 'C') {
                coelho += in;
            }

            if(letra == 'R') {
                rato += in;
            }

            if(letra == 'S') {
                sapo += in;
            }
        }

        int soma = coelho+rato+sapo;
        double a  = rato;
        double b = coelho;
        double c = sapo;
        double porRato = (a / soma) * 100;
        double porSapo = (c / soma) * 100;
        double porCoelho = (b / soma) * 100;

        sc.close();
        System.out.printf("Total: %d cobaias\n",soma);
        System.out.printf("Total de coelhos: %d\n",coelho);
        System.out.printf("Total de ratos: %d\n",rato);
        System.out.printf("Total de sapos: %d\n",sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n",porCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n",porRato);
        System.out.printf("Percentual de sapos: %.2f %%\n",porSapo);


    }



}
