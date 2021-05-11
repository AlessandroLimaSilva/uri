package desafio;
import java.util.Arrays;
import java.util.Scanner;

public class URI1013 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double entrada[] = new double[3];
        entrada[0] = sc.nextDouble();
        entrada[1] = sc.nextDouble();
        entrada[2] = sc.nextDouble();
        double maior = 0.0;

        for (int i = 0;i < entrada.length;i++){
            if (maior < entrada[i]){
                maior = entrada[i];
            }
        }

        System.out.printf("%.0f eh o maior\n",maior);
    }
}
