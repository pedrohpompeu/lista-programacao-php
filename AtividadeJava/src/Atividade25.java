import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu salário");
        double salario = leia.nextDouble();
        if (salario > 3000) {
            System.out.println("Você paga impostos");
        } else System.out.println("Você não paga impostos");
    }
}
