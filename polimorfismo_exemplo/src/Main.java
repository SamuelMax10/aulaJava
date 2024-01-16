import entities.Funcionarios;
import entities.FuncionariosTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Insira o numero de funcionarios: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionario nº" + i + ": ");
            System.out.print("Terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Valor adicional: ");
                double adicional = sc.nextDouble();
                list.add(new FuncionariosTerceirizado(nome, horas, valorHora, adicional));
            } else {
                list.add(new Funcionarios(nome, horas, valorHora));
            }

            System.out.println();

        }

        System.out.println("PAGAMENTOS: ");
        for (Funcionarios fun : list) {  //Para cada funcionario na minha lista list.
            System.out.println(fun.getNome() + " - R$" + String.format("%.2f", fun.pagamento()));
        }

        sc.close();
    }
}