package desafio;

import java.util.Scanner;

public class URI1035 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean decisao = false;

        if (b > c && d > a && (c+d) > (a+b)){
            if (c >= 0 && d >= 0 && (a % 2) == 0){
                decisao = true;
            }
        }

        if (decisao == true){
            System.out.printf("Valores aceitos\n");
        }else
            System.out.printf("Valores nao aceitos\n");
    }
}
