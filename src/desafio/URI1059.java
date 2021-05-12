package desafio;

public class URI1059 {

    public static void main(String[] args){
        URI1059 uri = new URI1059();
        uri.imprimir();
    }

    private void imprimir(){

        for(int x = 1;x < 101;x++){
            if (x % 2 == 0){
                System.out.printf("%d\n",x);
            }
        }

    }
}
