import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.calculoarea();
        double areay = y.calculoarea();

        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areax > areay) {
            System.out.println("Larger area X");
        } else {
            System.out.println("Larger area Y");
        }

        sc.close();
    }
}