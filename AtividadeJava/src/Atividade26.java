import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a nota final: (0 - 6)");
        double notaFinal = leia.nextDouble();
        if (notaFinal >= 6) {
            System.out.println("Aprovado");
        } else if (notaFinal >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}