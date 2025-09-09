package Exemplo4;

public class Usuario extends Pessoa {

    private String userName;
    private String passWord;

    //Construtos herdeiro
    public Usuario() {
        super();
    }

    public Usuario(String nome, int idade, String userName, String passWord) {
        super(idade, nome);
        this.userName = userName;
        this.passWord = passWord;
        //Sobrescrita de metodo
    }

    public void falar() {
        System.out.println("oi, eu sou " + this.getNome() + ". Eu tenho " + this.getIdade() + "anos de idade");
        System.out.println("Meu nome de usuário na Steam é:" + this.userName);
    }
}
