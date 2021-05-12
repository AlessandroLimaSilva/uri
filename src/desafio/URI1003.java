package desafio;
import java.util.Scanner;

public class URI1003 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a+b;
        sc.close();
        System.out.printf("SOMA = %d\n",x);
    }
}
