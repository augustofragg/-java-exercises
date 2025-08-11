package java_basic.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double first = sc.nextDouble();
            double second = sc.nextDouble();

            if(second == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double average = first/second;
                System.out.printf("%.2f\n",average);
            }

        }


        sc.close();
    }
}
