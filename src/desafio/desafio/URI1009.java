package desafio;
import java.util.Scanner;
public class URI1009 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendaEfetuada = sc.nextDouble();
        double porcentagemComissao = 15.00;
        double totalReceber = ((vendaEfetuada * porcentagemComissao) / 100)+salarioFixo;
        System.out.printf("TOTAL = R$ %.2f\n",totalReceber);

    }
}
