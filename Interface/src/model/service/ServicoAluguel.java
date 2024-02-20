package model.service;

import model.entities.AluguelCarro;
import model.entities.Fatura;

import java.time.Duration;
import java.util.PrimitiveIterator;

public class ServicoAluguel {
    private Double precoHora;
    private Double precoDia;

    private BrasilTaxServico taxServico;

    public ServicoAluguel() {

    }

    public ServicoAluguel(Double precoHora, Double precoDia, BrasilTaxServico taxServico) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxServico = taxServico;
    }

    public void processoFatura(AluguelCarro aluguelCarro) {

        double minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFinish()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;
        if (horas <= 12.0) {
            pagamentoBasico = precoHora * Math.ceil(horas);
        } else {
            pagamentoBasico = precoDia * Math.ceil(horas / 24.0);
        }

        double tax = taxServico.fatura(pagamentoBasico);

        aluguelCarro.setFatura(new Fatura(pagamentoBasico, tax));
    }
}
