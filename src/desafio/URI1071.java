package desafio;
import java.util.Scanner;
import java.io.IOException;

public class URI1071 {
    private int maior,menor,soma;
    public static void main(String[] args) throws IOException{
        URI1071 uri = new URI1071();
        uri.entrada();
    }

    public void entrada(){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a < b){
            menor = a;
            maior = b;
        }else{
            maior = a;
            menor = b;
        }

        if (a > 0 && b > 0){
            for (;(menor+1) <= maior;menor++){
                if (menor % 2 != 0){
                    soma += menor;
                }
            }
        }

        if (maior < 0 || menor < 0){
            menor += 1;
            for (;menor <= maior;menor++){
                if (menor % 2 != 0){
                    soma += menor;
                }
            }
        }
        
        System.out.printf("%d\n",soma);
    }
}
