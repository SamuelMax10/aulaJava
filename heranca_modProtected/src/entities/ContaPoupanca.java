package entities;

public class ContaPoupanca extends Conta {

    private Double taxaJuros;

    public ContaPoupanca() {

    }

    public ContaPoupanca(Integer numero, String titula, Double saldo, Double taxaJuros) {
        super(numero, titula, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo * taxaJuros;
    }
}
