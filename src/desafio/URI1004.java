package desafio;
import java.util.Scanner;
public class URI1004 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int PROUD = a*b;
        sc.close();
        System.out.printf("PROUD = %d\n",PROUD);
    }
}
