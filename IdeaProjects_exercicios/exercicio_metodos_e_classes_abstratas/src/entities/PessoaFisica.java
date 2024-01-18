package entities;

public class PessoaFisica extends Contribuentes {
    private Double despesaSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double despesaSaude) {
        super(nome, rendaAnual);
        this.despesaSaude = despesaSaude;
    }

    public Double getDespesaSaude() {
        return despesaSaude;
    }

    public void setDespesaSaude(Double despesaSaude) {
        this.despesaSaude = despesaSaude;
    }

    public Double imposto(double renda) {
        double sum = 0.0;
        if (renda < 20000) {
            sum += (renda * 0.15) - despesaSaude - 0.50;
        } else {
            sum += (renda * 0.25) - despesaSaude - 0.50;
        }
        return sum;
    }
}
