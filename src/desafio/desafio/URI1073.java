package desafio;
import java.util.Scanner;
import java.io.IOException;


public class URI1073 {

    public static void main(String[] args) throws IOException{

        URI1073 uri = new URI1073();
        uri.imprimir();
    }

    public void imprimir(){
        Scanner sc = new Scanner(System.in);
        Integer in = sc.nextInt();

        if (in > 0){
            for (Integer i = 1;i <= in;i++){
                if (i % 2 == 0){
                    System.out.printf("%.0f\n",Math.pow(i,2));
                }
            }
        }else {
            for (Integer i = 0;i >= in;i--){
                if (i % 2 == 0){
                    System.out.printf("%.0f\n",Math.pow(i,2));
                }
            }
        }
    }
}
