package desafio;

import java.util.Scanner;

public class URI1017 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double hora = sc.nextDouble();
        double vm = sc.nextDouble();
        double litro = (vm / 12) * hora;
        sc.close();
        System.out.printf("%.3f\n",litro);
    }
}
