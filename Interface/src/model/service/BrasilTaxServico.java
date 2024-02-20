package model.service;

public class BrasilTaxServico {

    public double fatura(double quantidade) {
        if (quantidade <= 100) {
            return quantidade * 0.2;
        } else {
            return quantidade * 0.15;
        }
    }
}
