import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número INTEIRO");
        int k = leia.nextInt();
        if (k % 2 == 0) {
            System.out.println(k + "= Par");
        } else System.out.println(k + "= Ìmpar");
    }
}
