import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com três numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        resultadoTela(maior);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void resultadoTela(int valor) {
        System.out.println("Maior = " + valor);
    }
}