package desafio;

import java.io.IOException;
import java.util.Scanner;

public class URI1101 {
	
	private boolean in;
	
	public static void main (String[] args) throws IOException{
		
		URI1101 uri = new URI1101();
		uri.imprimir();

	}
	
	public void imprimir() {
		Scanner sc = new Scanner(System.in);
		String resultado="";
		int n;
		int m;
		
		
		while(in != true){
			n = sc.nextInt();
			m = sc.nextInt();
			int soma = 0;
			int maior,menor;
			
			if(m < 1 || n < 1) {
				in = true;
			}
			
			if(m > n) {
				maior = m;
				menor = n;
			}else {
				maior = n;
				menor = m;
			}
			
			
			if(m > 0 && n > 0) {
				for(;menor < maior;n++) {
					resultado += n+" ";
					soma+=n;
				}
				resultado += "Sum="+soma+"\n";
			}
		
		}
		sc.close();
		System.out.printf("%s",resultado);
	}
	
	private int maior(int m,int n) {
		if(m > n) {
			return m;
		}
		
		if(n > m) {
			m = n;
			return m;
		}
		
		return m;
	}
	
	
}
