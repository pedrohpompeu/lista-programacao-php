package Atividade04;

public class Atividade004 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fulano");
        Vendedor auxiliar = new Vendedor("Natan");
        Gerente gerente = new Gerente("Pompeu");
        Folha folha = new Folha();
        auxiliar.setComissao(1.2);
        gerente.setComissao(1200);
        folha.pagar(f1);
        folha.pagar(auxiliar);
        folha.pagar(gerente);
    }
}