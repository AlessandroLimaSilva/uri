package desafio;
import java.util.Scanner;
public class URI1011 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double volume = (4.0/3.0) * (3.14159) * (Math.pow(raio,3));
        sc.close();
        System.out.printf("VOLUME = %.3f",volume);
    }
}
