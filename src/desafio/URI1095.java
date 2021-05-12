package desafio;

import java.io.IOException;

public class URI1095 {
	
	public static void main(String[] args) throws IOException{
		URI1095 uri = new URI1095();
		uri.loop();
	}
	
	private void loop() {
		int j = 60;
		int i = 1;
		
		while(j > -1) {
			System.out.printf("I=%d J=%d\n",i,j);
			j -= 5;
			i += 3;
		}
		
	}
}
