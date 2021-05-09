import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class URI1047 {

    private int[] tempo = new int[4];
    private int hora,minuto,segundo;

    public static void main(String[] args) throws ParseException {
        URI1047 uri = new URI1047();
        uri.imprimir(uri.calculo(uri.leitura()));
    }

    public int[] leitura(){
        Scanner sc = new Scanner(System.in);
        for (int x = 0;x < tempo.length;x++){
            tempo[x] = Integer.parseInt(sc.next());
        }
        sc.close();
        return tempo;
    }

    public String calculo(int[] tempo) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("H:m");
        String i = tempo[0]+":"+tempo[1];
        String f = tempo[2]+":"+tempo[3];
        Date in = sdf.parse(i);
        Date out = sdf.parse(f);

        long dif = out.getTime() - in.getTime();

        int segundo = (int) TimeUnit.MILLISECONDS.toSeconds(dif);

        if (segundo > 86400){
            segundo = 86400;
        }

        while (segundo > 59){
            segundo -= 60;
            minuto += 1;
        }

        while (minuto > 59){
            minuto -= 60;
            hora += 1;
        }

        if (tempo[0] == tempo[2] && tempo[1] == tempo[3]){
            hora = 24;
            minuto = 0;
        }

        if (tempo[0] == tempo[2] && tempo[3] < tempo[1]){
            hora = 0;
            minuto = 1;
        }




        String re = "O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)\n";

        return re;
    }

    public void imprimir(String re){
        System.out.printf("%s",re);
    }
}
