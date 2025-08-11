package java_basic.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangle = (a * c)/2.0;

        double areaCircle = 3.14159 * Math.pow(c,2);

        double areaTrapeze = (a + b) * c / 2.0;

        double areaSquare = Math.pow(b,2);

        double areaRetangle = a * b;

        System.out.printf("TRIANGULO: %.3f\n",areaTriangle);
        System.out.printf("CIRCULO: %.3f\n",areaCircle);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrapeze);
        System.out.printf("QUADRADO: %.3f\n",areaSquare);
        System.out.printf("RETANGULO: %.3f\n",areaRetangle);
        
        

        sc.close();
    }
}
