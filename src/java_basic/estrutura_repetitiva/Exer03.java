package java_basic.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        double[] average = new double[n];

        for (int i = 0; i < n; i++) {

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            average[i] = ((n1 * 2) + (n2 * 3) + (n3 * 5))/(10);
        }

        for (int i = 0; i < average.length; i++) {
            System.out.printf("%.2f\n",average[i]);
        }


        sc.close();
    }
}
