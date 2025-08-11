package java_basic.estrutura_repetitiva_b;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pwd = sc.nextInt();

        while(!(pwd == 2002)) {

            System.out.println("Senha Inválida");

            pwd = sc.nextInt();
        }

        System.out.println("Acesso Permitido");


        sc.close();
    }
}
