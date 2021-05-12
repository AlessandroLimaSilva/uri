package desafio;

import java.util.Scanner;

public class URI1002 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (Math.pow(raio,2));
        sc.close();
        System.out.printf("A=%.4f\n",area);
    }
}
