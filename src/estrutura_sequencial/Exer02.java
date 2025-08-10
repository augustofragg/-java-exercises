package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double areaCircle = pi * (raio * raio);

        System.out.printf("A=%.4f",areaCircle);


        sc.close();
    }
}
