import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1001,"Leidynara",1000.00);
        conta1.retirar(200.00);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new ContaPoupanca(1002,"Samuel",1000.00,0.01);
        conta2.retirar(200.00);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaComercial(1003,"Paulo",1000.00,500.00);
        conta3.retirar(200.00);
        System.out.println(conta3.getSaldo());
    }
}