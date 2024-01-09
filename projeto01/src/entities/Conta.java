package entities;

public class Conta {
    private final int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public int getconta() {
        return numero;
    }

    public String getNome() {
        return titular;
    }

    public void setNome(String nome) {
        this.titular = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double depositar) {
        saldo += depositar;
    }

    public void saque(double sacar) {
        saldo -= sacar + 5;
    }

    public String toString() {
        return "Conta: " + numero + ", Titular: " + titular + ", Saldo: " + String.format("%.2f", saldo);
    }
}

