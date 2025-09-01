import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número");
        double x = leia.nextDouble();
        System.out.println(x + "^2=" + Math.round(x *= x));
    }
}
