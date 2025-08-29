import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a temperatura:");
        double celsius = leia.nextDouble();
        double fahrenheit = (9*celsius)/5+32;
        System.out.println("A temperatura em fahrenheit é:"+fahrenheit);
    }
}
