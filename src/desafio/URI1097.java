package desafio;

import java.io.IOException;

public class URI1097 {
	
	
	public static void main(String[] args) throws IOException{
		
		URI1097 uri = new URI1097();
		uri.loop();
	}
	
	public void loop() {
		
		int i = 1;
		
		for(;i < 10;) {
			int f = i+6;
			int s = f -3;
			for(;f > s;f--) {
				
				System.out.printf("I=%d J=%d\n",i,f);
			
			}
			
			i += 2;
			
		}
		
	}

}
