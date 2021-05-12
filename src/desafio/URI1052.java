package desafio;
import java.util.Scanner;

public class URI1052 {
    private static final String[] mes = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        URI1052 uri = new URI1052();
        uri.mensagem(uri.retorno(entrada));
        sc.close();
    }

    private String retorno(int entrada){
        String res = mes[entrada-1];
        return res;
    }

    private void mensagem(String res){
        System.out.printf("%s\n",res);
    }
}
