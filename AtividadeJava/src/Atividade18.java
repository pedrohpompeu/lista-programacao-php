import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número");
        double p = leia.nextDouble();
        System.out.println("informe outro número");
        double q = leia.nextDouble();
        if (p > q) {
            System.out.println(p + " Maior que " + q);
        } else if (p < q) {
            System.out.println(p + " Menor que " + q);
        } else System.out.println(p + " Igual que " + q);
    }
}