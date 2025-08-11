package java_basic.estrutura_repetitiva;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if(num >= 10 && num <= 20) {
                in++;
            }
            else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out",in,out);

        sc.close();
    }
}
