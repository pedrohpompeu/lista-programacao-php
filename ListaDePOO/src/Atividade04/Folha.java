package Atividade04;

public class Folha {
    public void pagar(Funcionario f) {
        System.out.println("Pagando com sucesso: " + f.getNome() +
                " Salario: " + f.calcularpagamento());
        System.out.println();
    }

}