

import Services.BrazilInterestService;
import Services.InterestService;
import Services.UsaIterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade: ");
        double amount = sc.nextDouble();
        System.out.print("Mesês: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);

        System.out.println("Pagamento após " + months + " mesês: ");
        System.out.println(String.format("%.2f",payment));

    }
}