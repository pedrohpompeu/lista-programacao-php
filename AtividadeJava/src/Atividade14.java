import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número A");
        double a = leia.nextDouble();
        System.out.println("informe um número B");
        double b = leia.nextDouble();
        double soma = a+b;
        double sub = a-b;
        double produto = a*b;
        double quociente = a/b;
        double resto = a%b;
        System.out.println("Soma:"+soma+"\n" +
                "Subtração:"+sub+"\n" +
                "Produto:"+Math.round(produto)+"\n" +
                "Quociente:"+Math.round(quociente)+"\n" +
                "Resto:"+Math.round(resto));
    }
}
