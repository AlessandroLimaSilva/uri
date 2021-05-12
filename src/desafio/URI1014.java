package desafio;

import java.util.Scanner;

public class URI1014 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double litro = sc.nextDouble();
        double kmLitro = km / litro;
        sc.close();
        System.out.printf("%.3f km/l\n",kmLitro);
    }
}
