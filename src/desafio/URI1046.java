package desafio;

import java.util.Scanner;

public class URI1046 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int comeco = sc.nextInt();
        int fim = sc.nextInt();
        int count = 0;

        if(fim <= comeco){
            count = (fim + 24) - comeco;
        }else{
            count = comeco - fim;
            count = -count;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n",count);
    }
}
