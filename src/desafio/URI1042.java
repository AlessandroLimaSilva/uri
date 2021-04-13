package desafio;

import java.util.Scanner;

public class URI1042 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && b >= c){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",c,b,a,a,b,c);
        }

        if (a >= c && c >= b){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",b,c,a,a,b,c);
        }

        if (b >= a && a >= c){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",c,a,b,a,b,c);
        }

        if (b >= c && c >= a){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",a,c,b,a,b,c);
        }

        if (c >= a && a >= b){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",b,a,c,a,b,c);
        }

        if (c >= b && b >= a){
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n",a,b,c,a,b,c);
        }

        //abc : acb
        //bac : bca
        //cab : cba
    }
}
