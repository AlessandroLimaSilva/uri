package desafio;
import java.util.Scanner;

public class URI1049 {

    private String one,two,tree;
    private final static String[] verte = {"vertebrado",
            "ave","mamifero","carnivoro","onivoro","onivoro","herbivoro"};
    private final static String[] inver = {"invertebrado",
            "inseto","anelideo","hematofago","herbivoro","hematofago","onivoro"};

    private final static String[] especieOne = {"aguia","pomba","homem","vaca"};
    private final static String[] especieTwo = {"pulga","lagarta","sanguessuga","minhoca"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        String tree = sc.nextLine();
        URI1049 uri = new URI1049();
        uri.escolha(one,two,tree);
        sc.close();
    }


    public void escolha(String one,String two,String tree){
        if (one.equalsIgnoreCase(verte[0])){
            vertebrado(two,tree,verte,especieOne);
        }else{
            vertebrado(two,tree,inver,especieTwo);
        }
    }

    public void vertebrado(String two, String tree,String[] lista,String[] especie){
        String mensagem = "";
        if (two.equalsIgnoreCase(lista[1])){
            if (tree.equalsIgnoreCase(lista[3])){
                mensagem = especie[0];
            }
        }

        if (two.equalsIgnoreCase(lista[1])){
            if (tree.equalsIgnoreCase(lista[4])){
                mensagem = especie[1];
            }
        }

        if (two.equalsIgnoreCase(lista[2])){
            if (tree.equalsIgnoreCase(lista[5])){
                mensagem = especie[2];
            }
        }

        if (two.equalsIgnoreCase(lista[2])){
            if (tree.equalsIgnoreCase(lista[6])){
                mensagem = especie[3];
            }
        }

        System.out.printf("%s\n",mensagem);
    }

}
