//import util.Calculo;
import util.ConversorDeMoeda;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Entre com raio: ");
        double raio = sc.nextDouble();

        double c = Calculo.circunferencia(raio);
        double v = Calculo.volume(raio);

        System.out.printf("Circunferência: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("Valor de PI: %.2f", Calculo.PI);*/

        System.out.print("Qual é o preço do dólar: ");
        double preco = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados: ");
        double quant = sc.nextDouble();
        double resul = ConversorDeMoeda.calculos(quant, preco);
        System.out.printf("Valor a ser pago em reais: %.2f",resul);
        sc.close();
    }
}