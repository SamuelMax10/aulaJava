package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime inicio;
    private LocalDateTime finish;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro(LocalDateTime inicio, LocalDateTime finish, Veiculo veiculo) {
        this.inicio = inicio;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
