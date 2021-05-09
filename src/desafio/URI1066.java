import java.util.Scanner;
import java.io.IOException;

public class URI1066 {

    private int positivo,negativo,impar,par;

    public static void main(String[] args) throws IOException{
        URI1066 uri = new URI1066();
        uri.leitura();
        uri.imprimir(uri.positivo, uri.negativo, uri.par, uri.impar);
    }

    private void leitura(){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        for (int y = 0;y < 5;y++){
            x = sc.nextInt();
            if (x > 0){
                positivo += 1;
            }

            if (x < 0){
                negativo += 1;
            }

            if (x % 2 == 0 ){
                par += 1;
            }

            if (x % 2 != 0 ){
                impar += 1;
            }
        }
    }

    private void imprimir(int positivo, int negativo,int par, int impar){
        System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",par,impar,positivo,negativo);
    }
}
