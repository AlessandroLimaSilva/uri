package desafio;

import java.io.IOException;

public class URI1098 {
	
	public static void main(String[] args) throws IOException{
		URI1098 uri = new URI1098();
		uri.loop();
	}
	
	public void loop() {
		
		
		for(double i = 0.0;i < 2.1;) {
			
			double a = i + 4;
			double b = a - 3;
			for(;b < a;b++) {
				if(i == 0) {
					System.out.printf("I=%.0f J=%.0f\n", i,b);
				}
				
				if(i == 1) {
					System.out.printf("I=%.0f J=%.0f\n", i,b);
				}
				
				if(i > 1.99) {
					System.out.printf("I=%.0f J=%.0f\n", i,b);
				}
				
				if(i != 0 && i != 1 && i < 1.99){
					System.out.printf("I=%.1f J=%.1f\n", i,b);
				}
				
			}
			i += 0.2;
		}
	}

}
