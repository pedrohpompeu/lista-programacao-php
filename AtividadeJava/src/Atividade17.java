import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número");
        double n = leia.nextDouble();
        System.out.println("O Quadrado de " + n + " é " + Math.round(n * n));

    }
}