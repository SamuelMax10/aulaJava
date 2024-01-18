package entities;

public class PessoaJuridica extends Contribuentes {
    private Integer numeroFuncionario;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
        super(nome, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    public Integer getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public Double imposto(double renda) {
        double sum = 0.0;
        if (numeroFuncionario > 10) {
            sum += renda * 0.14;
        } else {
            sum += renda * 0.16;
        }
        return sum;
    }
}
