package java_basic.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double tax = 0.0;
        double renda = sc.nextDouble();

        if(renda <= 2000) {
            System.out.println("Isento");
        }
        else if(renda <= 3000) {
            tax = (renda - 2000) * 0.08;
        }
        else if(renda <= 4500) {
            tax = (renda - 3000) * 0.18 + 1000 * 0.08;
        }
        else if(renda > 4500) {
            tax = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        System.out.printf("R$ %.2f",tax);


        sc.close();
    }
}
