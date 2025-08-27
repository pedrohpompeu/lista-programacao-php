import java.util.Scanner;
public class AtividadeSala15 {
    public static double soma(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;}
    public static double mult(double x, double y){
        return x * y;}
    public static double div(double x, double y){
        if(y !=0);
            return x / y;}
    public static double poten(double x, int expoente){
        double resultado = x;
        for(int n = 0; n < expoente-1; n++){
            resultado = resultado * x;
        }
        return resultado;
    }
    public static String printResultado(char operador, double x, double y, double resultado){
        String texto = x + " " + operador + y + " = " + resultado +"\n";
        System.out.println(texto);
        return texto;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = -1;
        String historico = "Historico \n";
        historico = historico + "\n";
        do{
            System.out.println("Calculadora: \n Escolha uma das opções abaixo");
            System.out.println("1-Soma \n" +
                    "2-Subtração \n" +
                    "3-Multiplicação \n" +
                    "4-divisão \n" +
                    "5-Potencialização \n" +
                    "0-Sair \n");
            opcao = leia.nextInt();
            double x = 0;
            double y = 0;
            switch (opcao){
                case 1:
                    System.out.println("Soma: ");
                    System.out.println("Digite um valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite um valor para Y");
                    y = leia.nextDouble();
                    historico += printResultado('+',x,y,soma(x, y));
                    break;
                case 2:
                    System.out.println("Subtração: ");
                    System.out.println("Digite um valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite um valor para Y");
                    y = leia.nextDouble();
                    historico += printResultado('-',x,y,sub(x, y));
                    break;
                case 3:
                    System.out.println("Multplicação: ");
                    System.out.println("Digite um valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite um valor para Y");
                    y = leia.nextDouble();
                    historico += printResultado('x',x,y,mult(x, y));
                    break;
                case 4:
                    System.out.println("Divisão: ");
                    System.out.println("Digite um valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite um valor para Y");
                    y = leia.nextDouble();
                    historico += printResultado('/',x,y,div(x, y));
                    break;
                case 5:
                    System.out.println("Potência: ");
                    System.out.println("Digite um valor para X:");
                    x = leia.nextDouble();
                    System.out.println("Digite o expoente");
                    int e = leia.nextInt();
                    historico += printResultado('^',x,y,poten(x, e));
                    break;
                case 0:
                    System.out.println(historico);
                    break;
            }
        }while (opcao != 0);
    }
}