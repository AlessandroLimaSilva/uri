package desafio;
import java.util.Scanner;
public class URI1008 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int numeroFuncionario = sc.nextInt();
        int quantidadeHora = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salarioTotal = valorHora * quantidadeHora;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numeroFuncionario,salarioTotal);

    }
}
