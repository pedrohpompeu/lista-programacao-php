package Atividade04;


public class Gerente extends Funcionario {
    double bonus;

    public Gerente() {
        super();
        this.bonus = 0;
    }

    public Gerente(String nome) {
        super();
    }


    public double getBonus() {
        return this.bonus;
    }

    public void setComissao(double bonus) {
        this.bonus = bonus;
    }

    public double getcalcularPagamento() {
        final double salarioBase = super.getSalarioBase();
        return salarioBase+this.bonus;
    }

}