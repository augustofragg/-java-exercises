package java_basic.estrutura_vetores;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");

        for(int num : numeros)
            if(num < 0)
                System.out.println(num);

        sc.close();
    }
}
