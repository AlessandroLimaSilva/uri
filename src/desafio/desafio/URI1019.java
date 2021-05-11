package desafio;

import java.util.Scanner;

public class URI1019 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int hora =0,minuto = 0,segundo = 0;

        while (entrada >= 60){
            minuto += 1;
            entrada = entrada - 60;
        }

        while (minuto >= 60){
            hora += 1;
            minuto = minuto - 60;
        }

        segundo = entrada;

        sc.close();
        System.out.printf("%d:%d:%d\n",hora,minuto,segundo);
    }
}
