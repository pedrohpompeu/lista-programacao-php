import java.util.Scanner;
public class Atividade13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Escreva o número A");
        double a = leia.nextDouble();
        System.out.println("Escreva o número B");
        double b = leia.nextDouble();
        System.out.println("Escreva o número C");
        double c = leia.nextDouble();
        System.out.println("Escreva o número D");
        double d = leia.nextDouble();
        double r = (a+b)*c-d;
        System.out.println("R="+Math.round(r));
    }
}
