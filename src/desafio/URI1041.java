package desafio;

import java.util.Scanner;

public class URI1041 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double x = Double.parseDouble(sc.next());
        double y = Double.parseDouble(sc.next());

        if (x == 0 && y == 0){
            System.out.print("Origem\n");
        }

        if (x > 0 && y > 0 ){
            System.out.print("Q1\n");
        }

        if (x < 0 && y > 0){
            System.out.print("Q2\n");
        }

        if (x > 0 && y < 0){
            System.out.print("Q4\n");
        }

        if (x < 0 && y < 0){
            System.out.print("Q3\n");
        }

        if (x == 0 && y != 0){
            System.out.print("Eixo y\n");
        }

        if (x != 0 && y == 0){
            System.out.print("Eixo x\n");
        }
    }
}
