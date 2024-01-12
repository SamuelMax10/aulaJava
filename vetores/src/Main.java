import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*EXEMPLO 01
        int n = sc.nextInt();
//        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
            for (int i = 0; i < n; i++){
                sum+=vect[i];
            }
        double avg = sum / n;

        System.out.printf("Altura média: %.2f%n", avg);*/

        /*EXEMPLO 02
        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0.0;
            for (int i=0; i< vect.length;i++){
            soma+= vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("A media de preço é: %.2f%n",media);*/

        sc.close();
    }

}