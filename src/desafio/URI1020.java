package desafio;

import java.util.Scanner;

public class URI1020{
	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		int ano = 0,mes = 0,dia = 0;
		
		int entrada = sc.nextInt();
		
		while(entrada >= 30){
			mes += 1;
			entrada = entrada - 30;
		}

		while(mes >= 12){
			ano += 1;
			mes = mes - 12;
		}
		
		dia = entrada;
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n");
	
	}
}
