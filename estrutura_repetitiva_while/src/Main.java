import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.println(soma);*/

        int x = 0;
        int y = 4;

        while (x < 3) {
            y += 2;
            x += 1;
        }
        System.out.println(x + "-" + y);
        sc.close();
    }
}