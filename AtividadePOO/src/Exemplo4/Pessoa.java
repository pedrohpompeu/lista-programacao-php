package Exemplo4;

public class Pessoa {
    //Encapsulamento
    private String nome;
    private int idade;

    //Construtores
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos gets(ler) e sets(mudar) para ler ou Altetar um atributo
    //Get
    public int getIdade() {
        return this.idade;
    }

    //Set
    public void setIdade(int valor) {
        this.idade = valor;
    }

    public void falar() {
        System.out.println("Oi eu sou " + this.nome + " Eu tenho " + this.idade + " anos de idade");
    }

    //get
    public String getNome() {
        return this.nome;
    }

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
}
