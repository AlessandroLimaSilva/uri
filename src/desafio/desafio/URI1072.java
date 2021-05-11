package desafio;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class URI1072 {

    private int entrada,in,out;
    private ArrayList<Integer> lista = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        URI1072 uri = new URI1072();
        uri.imprimir();
    }

    public void imprimir(){
        Scanner sc = new Scanner(System.in);
        entrada = sc.nextInt();
        for (int x = 0; x < entrada;x++){
            lista.add(sc.nextInt());
        }

        for (int lis : lista){
            if (lis > 9 && lis < 21){
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.printf("%d in\n%d out\n",in,out);
    }
}
