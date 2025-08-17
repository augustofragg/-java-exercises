package java_basic.estrutura_vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas ? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomeArr = new String[n];
        int[] idadeArr = new int[n];
        double[] alturaArr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            nomeArr[i] = nome;
            idadeArr[i] = idade;
            alturaArr[i] = altura;
        }

        double alturaSum = 0.0;
        for(double altura : alturaArr)
            alturaSum += altura;

        double averageHeight = alturaSum/alturaArr.length;
        System.out.printf("\nAltura média: %.2f\n",averageHeight);

        int idadeMenos = 0;
        for (int i = 0; i < n; i++) {
            if(idadeArr[i] < 16) {
                idadeMenos++;
            }
        }
        double agePercent = (double) idadeMenos * 100/idadeArr.length;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",agePercent);

        for (int i = 0; i < n; i++) {
            if(idadeArr[i] < 16) {
                System.out.println(nomeArr[i]);
            }
        }

        System.out.println("\n");


        sc.close();
    }
}
