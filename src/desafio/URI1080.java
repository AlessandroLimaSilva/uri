package desafio;

import java.util.Scanner;
import java.io.IOException;

public class URI1080 {
	
	public static void main(String[] args) throws IOException{
		URI1080 uri = new URI1080();
		uri.imprimir();
	}
	
	public void imprimir() {
		
		Scanner sc = new Scanner(System.in);
		int[] guarda = new int[2];
		for(int x = 0;x < 100;x++) {
			int in = sc.nextInt();
			if(in > guarda[0]) {
				guarda[0] = in;
				guarda[1] = (x+1);
			}
		}
		sc.close();
		System.out.printf("%d\n%d\n", guarda[0],guarda[1]);
	}

}
