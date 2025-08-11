package java_basic.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int startHour = sc.nextInt();
        int endHour = sc.nextInt();

        if(startHour > endHour) {
            int totalHour = (24 + endHour) - startHour;
            System.out.println("O JOGO DUROU " + totalHour + " HORAS(S)");
        }
        else if(startHour < endHour) {
            int totalHour = endHour - startHour;
            System.out.println("O JOGO DUROU " + totalHour + " HORAS(S)");
        }
        else if(startHour == 0 && endHour == 0) {
            System.out.println("O JOGO DUROU 24 HORAS(S)");
        }

        sc.close();
    }
}
