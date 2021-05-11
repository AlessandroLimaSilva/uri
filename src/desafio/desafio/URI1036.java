package desafio;

import java.util.Scanner;

public class URI1036 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        double xPos = 0;
        double xNeg = 0;

        //Primeiro passo raiz  = pow(b,2) - /4*a*c)
        double delta = Math.pow(b,2) - (4*a*c);
        //Segundo passo = x = -b +- raiz delta / 2*a
        xPos = (-b + Math.sqrt(delta)) / (2*a);
        xNeg = (-b - Math.sqrt(delta)) / (2*a);

        if(a == 0 || Math.sqrt(delta) < 0 || !(xPos == xPos) || !(xNeg == xNeg)){
            System.out.printf("Impossivel calcular\n");
        }else
            System.out.printf("R1 = %.5f\nR2 = %.5f\n",xPos,xNeg);
    }
}
