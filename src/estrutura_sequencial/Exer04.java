package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hour = sc.nextInt();

        double salary = sc.nextDouble();

        double salaryPerHour = salary * hour;

        System.out.printf("NUMBER = " + number + "\n");
        System.out.printf("SALARY = U$ %.2f",salaryPerHour);




        sc.close();
    }
}
