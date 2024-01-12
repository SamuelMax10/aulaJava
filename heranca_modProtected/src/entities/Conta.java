package entities;

public class Conta {
    private Integer numero;
    private String titula;
    protected Double saldo;

    public Conta() {

    }

    public Conta(Integer numero, String titula, Double saldo) {
        this.numero = numero;
        this.titula = titula;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void retirar(Double quantia) {
        saldo -= quantia;
    }

    public void deposito(Double quantia) {
        saldo += quantia;
    }


}
