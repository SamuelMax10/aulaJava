package entities;

public class ContaComercial extends Conta{
    private Double limiteEmprestimo;

    public ContaComercial(){
       super();
    }

    public ContaComercial(Integer numero, String titula, Double saldo, Double limiteEmprestimo) {
        super(numero, titula, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void emprestimo(Double quantia){
        if (quantia<=limiteEmprestimo){
           saldo += quantia - 10.0;
        }
    }
    @Override
    public void retirar(Double quantidade){
        super.retirar(quantidade);
        saldo-= 2.0;
    }
}
