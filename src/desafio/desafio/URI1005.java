package desafio;

import java.util.Scanner;

public interface URI1005 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble() * 3.5;
        double b = sc.nextDouble() * 7.5;
        double x = (a+b) / 11;
        System.out.printf("MEDIA = %.5f\n",x);
    }
}
