package desafio;
import java.util.Scanner;
public class URI1043 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        double maior = 0;
        boolean possivel = false;

        if (a == b && a == c){
            maior = a;
            if ((b+c) > a){
                possivel = true;
            }
        }

        if (a > b && a >= c){
            maior = a;
            if ((b+c) > a){
                possivel = true;
            }
        }

        if (b > a && b >= c){
            maior = b;
            if ((a+c) > b){
                possivel = true;
            }
        }

        if (c > a && c >= b){
            maior = c;
            if ((a+b) > c){
                possivel = true;
            }
        }

        if (possivel != false){
            double perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }else {
            double area = ((a+b) /2) * c;
            System.out.printf("Area = %.1f\n",area);
        }
        sc.close();
    }
}
