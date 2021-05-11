package desafio;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class URI1079 {
	
	public static void main(String[] args) throws IOException{
		URI1079 uri = new URI1079();
		uri.imprimir();
	}
	
	public void imprimir() {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		double[] peso = {2,3,5};

		ArrayList<Double> list = new ArrayList<>();
		for(int x = 0;x < in;x++) {
			double soma = 0.0;
			soma += (Double.parseDouble(sc.next()) * peso[0]);
			soma += (Double.parseDouble(sc.next()) * peso[1]);
			soma += (Double.parseDouble(sc.next()) * peso[2]);
			soma = soma /10;
			list.add(soma);
		}
		
		sc.close();
		for(Double li : list) {
			System.out.printf("%.1f\n",li);
		}
		
		
		
		
	}

}
