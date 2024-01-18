import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cores;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Forma> list = new ArrayList<>();

        System.out.print("Digite o número de formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da forma Nº" + i + ":");
            System.out.print("Retangulo ou Circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cores cor = Cores.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(cor,largura,altura));
            } else if (ch == 'c') {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(cor, raio));
            }
            System.out.println();
        }

        System.out.println("MOLDAR ÁREAS: ");
        for (Forma forma : list){
            System.out.println(String.format("%.2f",forma.area()));
        }


        sc.close();
    }

}
