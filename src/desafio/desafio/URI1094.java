package desafio;

import java.util.Scanner;
import java.io.IOException;

public class URI1094 {
	
	public static void main(String[] args) throws IOException {
		URI1094  uri = new URI1094();
		uri.imprimir();
	}
	
	public void imprimir() {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int coelho = 0,rato = 0,sapo = 0;
		for(int i =0;i < loop;i++) {
			int in = sc.nextInt();
			String letra = sc.next();
			if(letra.equalsIgnoreCase("C")) {
				coelho = in;
			}
			if(letra.equalsIgnoreCase("R")) {
				rato = in;
			}
			if(letra.equalsIgnoreCase("S")) {
				sapo = in;
			}
		}
		
		int soma = coelho+rato+sapo;
		double porRato = rato * soma / 100;
		double porSapo = sapo * soma / 100;
		double porCoelho = coelho * soma / 100;
		sc.close();
		System.out.printf("%d",soma);
		System.out.printf("%d",coelho);
		System.out.printf("%d",rato);
		System.out.printf("%d",sapo);
		System.out.printf("%.2f",porCoelho);
		System.out.printf("%.2f",porRato);
		System.out.printf("%.2f",porSapo);
		System.out.printf("Total: %d de cobaias\n"
				+ "Total de coelhos: %d\n"
				+ "Total de ratos: %d\n"
				+ "Total de sapos: %d\n"
				+ "Percentual de coelhos: %.2f\n"
				+ "Percentual de ratos: %.2f\n"
				+ "Percebtual de sapos: %2.f\n", soma,coelho,rato,sapo,porCoelho,porRato,porSapo);
	}

}
