package desafio;

import java.util.Scanner;

public class URI1038 {

    public static void main(String []args){
        double[] valor = {0.0,4.00,4.50,5.00,2.00,1.50};
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int quantidade = sc.nextInt();

        System.out.printf("Total: R$ %.2f\n",(valor[item]*quantidade));

    }
}
