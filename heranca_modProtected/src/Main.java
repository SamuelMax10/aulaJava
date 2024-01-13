import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1001, "Samuel", 0.0);
        ContaComercial comercial = new ContaComercial(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Conta conta1 = comercial;
        Conta conta2 = new ContaComercial(1003, "Rafaela", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004, "Sabrina", 0.0, 0.01);

        // DOWNCASTING

        ContaComercial conta4 = (ContaComercial) conta2;
        conta4.emprestimo(100.00);

        if (conta3 instanceof ContaComercial) {
            ContaComercial conta5 = (ContaComercial) conta3;
            conta5.emprestimo(200.00);
            System.out.println("Emprestimo!");
        }
        if (conta3 instanceof ContaPoupanca) {
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.atualizarSaldo();
            System.out.println("Update!");
        }

    }
}