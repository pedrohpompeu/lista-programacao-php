import java.util.Scanner;
public class Atividade09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a base:");
        double base = leia.nextDouble();
        System.out.println("Informe a altura:");
        double altura = leia.nextDouble();
        double perimetro = 2*(base+altura);
        System.out.println("Perimetro:"+perimetro);
    }
}
