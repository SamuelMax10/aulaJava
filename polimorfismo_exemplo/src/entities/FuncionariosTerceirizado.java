package entities;

public class FuncionariosTerceirizado extends Funcionarios {
    private Double cobrancaAdicional;

    public FuncionariosTerceirizado(){
        super();
    }

    public FuncionariosTerceirizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public Double getCobrancaAdicional() {
        return cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento()+cobrancaAdicional*1.1;
    }
}
