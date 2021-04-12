import java.util.Scanner;

public class URI1018{
    public static void main(String []args){

        int cem = 0,cinquenta = 0,vinte = 0,dez = 0,cinco = 0,dois = 0,um = 0,original;

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        original = entrada;

        while(entrada >= 100){
            cem += 1;
            entrada = entrada - 100;
        }

        while (entrada >= 50 ){
            cinquenta += 1;
            entrada = entrada - 50;
        }

        while (entrada >= 20){
            vinte += 1;
            entrada = entrada - 20;
        }

        while (entrada >= 10){
            dez += 1;
            entrada = entrada - 10;
        }

        while (entrada >= 5){
            cinco += 1;
            entrada = entrada - 5;
        }

        while (entrada >= 2){
            dois += 1;
            entrada = entrada - 2;
        }

        while (entrada >= 1){
            um += 1;
            entrada = entrada - 1;
        }

        System.out.printf("%d\n" +
                "%d nota(s) de R$ 100,00\n" +
                "%d nota(s) de R$ 50,00\n" +
                "%d nota(s) de R$ 20,00\n" +
                "%d nota(s) de R$ 10,00\n" +
                "%d nota(s) de R$ 5,00\n" +
                "%d nota(s) de R$ 2,00\n" +
                "%d nota(s) de R$ 1,00\n",original,cem,cinquenta,vinte,dez,cinco,dois,um);
    }
}