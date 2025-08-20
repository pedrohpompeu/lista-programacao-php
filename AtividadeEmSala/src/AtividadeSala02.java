public class AtividadeSala02 {
    public static void main(String[] args) {
     String nome = "";
     nome = "Pedro";
     String sobrenome = "";
     sobrenome = "Pompeu";
     System.out.println("Nome:"+ nome +" "+ sobrenome);
     int idade = 16;
     double peso = 45.5;
     double altura = 1.66;
     int ano = 2025-idade;
     System.out.println("Ano de Nascimento:" +ano);
     System.out.println("Peso:" +peso +"  "+ "Altura:" +altura);
     double imc = peso/(altura*altura);
     System.out.println("IMC:" +imc);
    }
}