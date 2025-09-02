import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número");
        double z = leia.nextDouble();
        if (z > 0) {
            System.out.println(z + "=Positivo");
        } else if (z < 0) {
            System.out.println(z + "= Negativo");
        } else System.out.println(z + "= Zero");
    }
}
