import java.util.Scanner;
import java.io.IOException;

public class URI1070 {
    private int parada;
    public static void main(String[] args) throws IOException{
        URI1070  uri = new URI1070();
        uri.imprimir();
    }

    public void imprimir(){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (;parada != 6;x++){

            if(x % 2 != 0) {
                System.out.printf("%d\n", x);
                parada++;
            }

        }

    }
}
