package java_basic.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(b > a) {
            double axl = a;
            a = b;
            b = axl;
        }

        boolean isMultiple = a % b == 0;

        if(isMultiple) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }



        sc.close();
    }
}
