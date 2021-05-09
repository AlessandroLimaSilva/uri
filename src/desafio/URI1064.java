import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class URI1064 {
    private ArrayList<Double> lista = new ArrayList<>();
    private double media;

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        URI1064 uri = new URI1064();
        uri.resposta(uri.leitura());

    }

    public ArrayList<Double> leitura(){
        Scanner sc = new Scanner(System.in);
        for (int x = 0;x < 6;x++){
            double z = Double.parseDouble(sc.next());
            if (z > 0){
                lista.add(z);
            }
        }
        return lista;
    }

    public void resposta(ArrayList<Double> lista){
        double total = 0;
        for (Double corre : lista){
            total += corre;
        }

        media = total / lista.size();


        System.out.printf("%d valores positivos\n%.1f",lista.size(),media);
    }
}
