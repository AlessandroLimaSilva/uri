package desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class URI1040 {

        public static void main(String []args){

            Scanner sc = new Scanner(System.in);
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            BigDecimal c = new BigDecimal(sc.next());
            BigDecimal d = new BigDecimal(sc.next());
            a = a.multiply(BigDecimal.valueOf(2));
            b = b.multiply(BigDecimal.valueOf(3));
            c = c.multiply(BigDecimal.valueOf(4));
            d = d.multiply(BigDecimal.valueOf(1));

            BigDecimal media = new BigDecimal(0f);

            media = media.add(a).add(b).add(c).add(d);

            media = media.divide(BigDecimal.valueOf(10f), RoundingMode.HALF_DOWN);

            BigDecimal exame = new BigDecimal(String.valueOf(BigDecimal.valueOf(0.0)));
            BigDecimal recupera = new BigDecimal(String.valueOf(BigDecimal.valueOf(0.0)));
            
            sc.close();

            if(media.doubleValue() >= 7.00){
                System.out.printf("Media: %.1f\n",media);
                System.out.printf("Aluno aprovado.\n",media);
            }

            if(media.doubleValue() < 5.00){
                System.out.printf("Media: %.1f\n",media);
                System.out.printf("Aluno reprovado.\n",media);
            }

            if(media.doubleValue() >= 5.0 && media.doubleValue() <= 6.9){

                exame = new BigDecimal(sc.next());
                System.out.printf("Media: %.1f\n",media);
                System.out.printf("Aluno em exame.\n",media);

                System.out.printf("Nota do exame: %.1f\n",exame);

                recupera = recupera.add(media).add(exame).divide(BigDecimal.valueOf(2.00), RoundingMode.HALF_DOWN);

                if (recupera.doubleValue() >= 5.0){
                    System.out.printf("Aluno aprovado.\n");
                    System.out.printf("Media final: %.1f\n",recupera);
                }else {
                    System.out.printf("Aluno reprovado.\n");
                    System.out.printf("Media final: %.1f\n", recupera);
                }
            }
    }

}
