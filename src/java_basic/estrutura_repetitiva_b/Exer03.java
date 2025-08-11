package java_basic.estrutura_repetitiva_b;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while(n != 4) {

            switch(n) {
                case 1:
                    alcool++;
                break;
                case 2:
                    gasolina++;
                break;
                case 3:
                    diesel++;
                default:
                    System.out.println("Digite um novo código");
            }

            n = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
