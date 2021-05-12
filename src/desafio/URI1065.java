package desafio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class URI1065 {

    private ArrayList<Integer> entrada = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        URI1065 uri = new URI1065();
        uri.resposta();
    }

    public void resposta(){

        Scanner sc = new Scanner(System.in);
        for (int x = 0;x < 5;x++){
            int y = Integer.parseInt(sc.next());
            if (y % 2 == 0){
                entrada.add(y);
            }
        }
        sc.close();
        System.out.printf("%d valores pares\n",entrada.size());
    }

}
