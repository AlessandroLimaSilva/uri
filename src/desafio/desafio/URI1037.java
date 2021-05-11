package desafio;

import java.util.Scanner;

public class URI1037 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.next());
        double a = 25.00;
        double b = 50.00;
        double c = 75.00;
        double d = 100.00;

        //0 a 25
        if (x >= 0 && x <= a ){
            System.out.printf("Intervalo [0,25]\n");
        }
        //25 a 50
        if (x > a && x <= b ){
            System.out.printf("Intervalo (%.0f,%.0f]\n",a,b);
        }
        //50 a 75
        if (x > b && x <= c ){
            System.out.printf("Intervalo (%.0f,%.0f]\n",b,c);
        }
        //75 a 100
        if (x > c && x <= d ){
            System.out.printf("Intervalo (%.0f,%.0f]\n",c,d);
        }
        // < 0 && > 100
        if (x < 0 || x > d ){
            System.out.printf("Fora de intervalo\n");
        }

        sc.close();
    }
}
