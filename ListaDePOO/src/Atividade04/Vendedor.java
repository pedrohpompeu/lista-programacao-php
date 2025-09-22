package Atividade04;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double comissao) {
        super(nome, 1200.0);
        this.comissao = comissao;
    }

    public void setComissao(double valor){this.comissao = valor;}
        public double getComissao(){
            return this.comissao;
        }

    public double calcularPagamento() {
        return this.getSalarioBase() + this.comissao;
    }
}
