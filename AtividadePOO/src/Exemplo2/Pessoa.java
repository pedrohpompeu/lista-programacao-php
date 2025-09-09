package Exemplo2;

public class Pessoa {
//Declaração de atributos (variaveis ou constantes)
    String nome;
    int idade;
// Ações (são os métodos)
    public void falar(){
        System.out.println("Oi eu sou " + this.nome + " Eu tenho " + this.idade + " anos de idade");
    }
}