package desafio;

import java.util.Scanner;

public class URI1045 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double [] lista = new double[3];
        lista[0] = Double.parseDouble(sc.next());
        lista[1] = Double.parseDouble(sc.next());
        lista[2] = Double.parseDouble(sc.next());
        String resultado ="";

        for(int x = 0;x < lista.length-1;x++){
            for (int y = 1;y < lista.length;y++){
                double aux = lista[x];
                if (lista[x] < lista[y]){

                    aux = lista[y];
                    lista[y] = lista[x];
                    lista[x] = aux;
                }
            }
        }

        if (lista[0] >= lista[1]+lista[2]){
            resultado += "NAO FORMA TRIANGULO\n";

        }else{

            if((lista[0] * lista[0]) ==  (lista[1]*lista[1]) + (lista[2]*lista[2])){
                resultado += "TRIANGULO RETANGULO\n";
            }

            if((lista[0] * lista[0]) >  (lista[1]*lista[1]) + (lista[2]*lista[2])){
                resultado += "TRIANGULO OBTUSANGULO\n";
            }

            if((lista[0] * lista[0]) <  (lista[1]*lista[1]) + (lista[2]*lista[2])){
                resultado += "TRIANGULO ACUTANGULO\n";
            }

            if(lista[0] == lista[1] && lista[0] == lista[2]){
                resultado +="TRIANGULO EQUILATERO\n";
            }

            if(lista[0] == lista[1] && lista[0] != lista[2] ||
                    lista[0] == lista[2] && lista[0] != lista[1] ||
                    lista[1] == lista[2] && lista[1] != lista[0]){
                resultado += "TRIANGULO ISOSCELES\n";
            }

        }

        sc.close();
        System.out.print(resultado);

    }
}
