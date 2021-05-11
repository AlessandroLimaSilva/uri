package desafio;
import java.util.Scanner;

public class URI1060 {
    private int positivo;
    public static void main(String[] args){
        URI1060 uri = new URI1060();
        uri.imprimir(uri.somar());
    }

    private int somar(){
        Scanner sc = new Scanner(System.in);
        for (int x = 0;x < 6;x++){
            double c = Double.parseDouble(sc.next());
            if (c > 0.0){positivo++;}
        }

        return positivo;
    }

    private void imprimir(int positivo){
        System.out.printf("%d valores positivos\n",positivo);
    }
}
