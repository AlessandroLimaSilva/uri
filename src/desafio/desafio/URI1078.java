package desafio;

import java.util.Scanner;
import java.io.IOException;

public class URI1078 {

	public static void main(String[] args) throws IOException {
		URI1078 uri = new URI1078();
		uri.imprimir();
	}

//	
	private void imprimir() {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		for (int x = 1; x < 11; x++) {
			int z = x * in;
			System.out.printf("%d x %d = %d\n", x, in, z);
		}
	}

}
