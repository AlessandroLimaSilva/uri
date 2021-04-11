package desafio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.util.Locale.US;

public class URI1010 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double valorTotal =0;
        sc.next();
        valorTotal += sc.nextInt() * sc.nextDouble();
        sc.hasNextLine();
        sc.next();
        valorTotal += sc.nextInt() * sc.nextDouble();


        System.out.printf(US,"VALOR A PAGAR: R$ %.2f%n",valorTotal);

    }
}
