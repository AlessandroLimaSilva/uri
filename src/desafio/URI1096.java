package desafio;

import java.io.IOException;

public class URI1096 {
	
	
	
	public static void main(String[] args) throws IOException{
		
		URI1096 uri = new URI1096();
		uri.loop();
	}
	
	public void loop() {
		
		for(int i = 1;i < 10;) {
			for(int y = 7;y > 4;y--) {
				System.out.printf("I=%d J=%d\n",i,y);
			}
			i += 2;
		}
	}

}
