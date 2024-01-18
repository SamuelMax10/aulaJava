import entities.Contribuentes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuentes> list = new ArrayList<>();

        System.out.print("Digite o numero de contribuentes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuente nº" + i + ":");
            System.out.print("Pessoa física ou pessoa Juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (ch == 'f') {
                System.out.print("Despesa de saúde: ");
                double saude = sc.nextDouble();
                list.add(new PessoaFisica(nome, renda, saude));

            } else if (ch == 'j') {
                System.out.println("Numero de funcionario: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, renda, funcionarios));
            }
        }
    }
}