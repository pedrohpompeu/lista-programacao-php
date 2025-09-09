package Exemplo3;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa = new Pessoa(31, "Diego");
        pessoa.falar();
        //Alteração do atributo com metodo set
        pessoa.setIdade(16);
        //Chamada do atributo com metodo get
        System.out.println("Correção, minha idade é " + pessoa.getIdade());

        String nomeanterior = pessoa.getNome();
        pessoa.setNome("Pompeu");
        System.out.println("Nome anterior " + nomeanterior);
        System.out.println("Novo nome " + pessoa.getNome());
        pessoa.falar();
    }
}
