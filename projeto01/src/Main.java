import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Insira o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Insira o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Existe um deposisto inicial (y/n)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else if (resposta == 'n') {
            conta = new Conta(numero, titular);
        } else {
            System.out.println("Opção incorreta!!!");
            return;
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor de deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println();
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println();
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        sc.close();
    }

}