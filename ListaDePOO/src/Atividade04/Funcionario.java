package Atividade04;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(){
        this.nome = "";
        this.salarioBase = 1200.0;
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = 1200.0;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String valor){
        this.nome = valor;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }
    public void setSalarioBase(double valor){
        this.salarioBase = valor;
    }

    public double calcularpagamento(){
        return this.salarioBase;
    }
}
