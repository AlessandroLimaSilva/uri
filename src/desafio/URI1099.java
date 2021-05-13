package desafio;

import java.io.IOException;
import java.util.Scanner;

public class URI1099 {
	
	public static void main(String[] args) throws IOException{
		URI1099 uri = new URI1099();
		uri.imprimir();
	}
	
	public void imprimir() {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		String resultado = "";
		for(int x = 0;x < loop;x++) {
			
			int maior = sc.nextInt();
			int menor = sc.nextInt();
			int soma = 0;
			
			if(maior < menor) {
				int z = maior;
				maior = menor;
				menor = z;
			}
			
			for(int z = menor+1;z < maior;z++) {
				if(z % 2 != 0) {
					soma += z;
				}
			}
			resultado += soma+"\n";
		}
		sc.close();
		System.out.print(resultado);
	}

}
