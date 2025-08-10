package estrutura_sequencial;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);
        System.out.printf("SOMA = %d\n",soma);

    }
}
