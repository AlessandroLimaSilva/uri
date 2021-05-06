package desafio;
import java.util.Scanner;

public class URI1050 {

    private int entrada;
    private static final String nao = "DDD nao cadastrado";
    private static final int[] ddd = {61,71,11,21,32,19,27,31};
    private static final String[] destino ={"Brasilia","Salvador","Sao Paulo",
        "Rio de Janeiro","Juiz de Fora","Campinas","Vitoria","Belo Horizonte"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        URI1050 uri = new URI1050();
        uri.imprimir(entrada);
    }

    private String verificar(int entrada){

        String mensagem = "";
        for (int x = 0;x < ddd.length;x++){

            if (entrada == ddd[x]){
                mensagem = destino[x];
                x = ddd.length;
            }else{
                mensagem = nao;
            }
        }

        return mensagem;
    }

    private void imprimir(int entrada){
        System.out.printf("%s\n",verificar(entrada));
    }
}
