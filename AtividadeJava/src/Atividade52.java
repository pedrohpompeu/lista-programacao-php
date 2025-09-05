import java.util.Scanner;
public class Atividade52 {
    public static double temperatura(double c) {
        double  f = ((c*1.8)+32);
        return f ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atividade52 atv = new Atividade52();
        System.out.println("Digite um temperatura: ");
        System.out.println("A temperatura é "+atv.temperatura(scanner.nextDouble()));
    }
}
