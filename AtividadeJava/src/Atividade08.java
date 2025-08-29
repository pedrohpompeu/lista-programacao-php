import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe a primeira nota:");
        double n1 = leia.nextDouble();
        System.out.println("informe a segunda nota:");
        double n2 = leia.nextDouble();
        System.out.println("informe a terceira nota:");
        double n3 = leia.nextDouble();
        double media = (n1+n2+n3)/3;
        System.out.println("Média:"+media);
    }
}
