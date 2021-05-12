package desafio;
import java.util.Scanner;
public class URI1012 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double area = (a * c) / 2;
        double circulo = 3.14159 * (Math.pow(c,2));
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;
        sc.close();

        System.out.printf("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n",area,circulo,trapezio,quadrado,retangulo);
    }
}
