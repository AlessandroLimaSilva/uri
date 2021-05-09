import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class URI1061 {

    private int novoDia,novoHora,novoMinuto,novoSegundo;
    private int[] dado= new int[4];

    public static void main(String[] args) throws ParseException, IOException {
        URI1061 uri = new URI1061();
        uri.imprimir(uri.entradaDados());
    }

    private int[] entradaDados() throws ParseException {
        Scanner sc = new Scanner(System.in);
        String[] entrada = new String[14];

        for (int z = 0;z < entrada.length;z++){
            entrada[z] = sc.next();
        }

        String n = entrada[1]+"/3/81 "+entrada[2]+":"+entrada[4]+":"+entrada[6];
        String s = entrada[8]+"/3/81 "+entrada[9]+":"+entrada[11]+":"+entrada[13];

        SimpleDateFormat sdf = new SimpleDateFormat("d/M/yy HH:mm:ss");
        Date in = sdf.parse(n);
        Date out = sdf.parse(s);

        long dif = out.getTime() - in.getTime();

        int segundoCalculo = (int) TimeUnit.MILLISECONDS.toSeconds(dif);

        while (segundoCalculo > 59){
            segundoCalculo -= 60;
            novoMinuto += 1;
        }

        while (novoMinuto > 59){
            novoMinuto -= 60;
            novoHora += 1;
        }

        while (novoHora > 23){
            novoHora -= 24;
            novoDia += 1;
        }
        novoSegundo = segundoCalculo;
        dado[0] = novoDia;
        dado[1] = novoHora;
        dado[2] = novoMinuto;
        dado[3] = novoSegundo;



        sc.close();

        return dado;
    }

    public void imprimir(int[] dado){
        System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n",dado[0],dado[1],dado[2],dado[3]);
    }

}
