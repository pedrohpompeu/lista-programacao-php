package Atividade04;

public class Atividade004 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fulano", 1200);
        Vendedor auxiliar = new Vendedor("Natan", 1200);
        Gerente gerente = new Gerente("Pompeu");
        Folha folha = new Folha();
        auxiliar.setComissao(1.2);
        gerente.setComissao(1200);
        folha.pagar(f1);
        folha.pagar(auxiliar);
        folha.pagar(gerente);
    }
}