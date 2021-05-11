package desafio;
import java.util.Scanner;
import java.io.IOException;

public class URI1067 {

    public static void main(String[] args) throws IOException{
        URI1067 uri = new URI1067();
        uri.leitura();
    }

    public void leitura(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0){
            for (int y = 0;y <= x;y++){
                if (y % 2 != 0){
                    System.out.printf("%d\n",y);
                }
            }
        }else{
            for (int y = 0;y > x;y--){
                if (y % 2 != 0){
                    System.out.printf("%d\n",y);
                }
            }
        }

        if (x == 1 || x == -1){
            System.out.printf("%d\n",x);
        }
    }
}
