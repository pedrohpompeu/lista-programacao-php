import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe um número:");
        int a = leia.nextInt();
        System.out.println("mais um número:");
        int b = leia.nextInt();
        int soma = a+b;
        System.out.println("Soma:"+ soma);
    }
}
