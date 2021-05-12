package desafio;
import java.util.Scanner;
public class URI1006 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble() * 2;
        double b = sc.nextDouble() * 3;
        double c = sc.nextDouble() * 5;
        double x = (a+b+c) / 10.00;
        sc.close();
        System.out.printf("MEDIA = %.1f\n",x);
    }
}
