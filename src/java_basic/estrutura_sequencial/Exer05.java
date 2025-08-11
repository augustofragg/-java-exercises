package java_basic.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codA= sc.nextInt();
        int numToolA = sc.nextInt();
        double unitValueToolA = sc.nextDouble();
        double totalValueToolA = numToolA * unitValueToolA;

        int codB = sc.nextInt();
        int numToolB = sc.nextInt();
        double unitValueToolB = sc.nextDouble();
        double totalValueToolB = numToolB * unitValueToolB;

        double totalValue = totalValueToolA + totalValueToolB;

        System.out.printf("VALOR A PAGAR: R$ %.2f",totalValue);



        sc.close();
    }
}
