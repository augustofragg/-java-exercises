package java_basic.estrutura_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar: ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println();

        double sumArr = 0;
        System.out.print("VALORES = ");

        for(double num : numeros) {
            System.out.print(num + " ");
            sumArr += num;
        }

        System.out.println("\nSOMA = " + sumArr);

        double average = sumArr/numeros.length;
        String result = String.format("MEDIA = %.2f",average);

        System.out.printf(result);




        sc.close();
    }
}
