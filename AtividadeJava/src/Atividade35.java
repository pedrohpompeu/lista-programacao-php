import java.util.Scanner;
public class Atividade35 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n = 0, maior = 0;
        while (n!=-1){
            System.out.println("Digite um número");
            n = leia.nextInt();
            if(n > maior)maior = n;
            System.out.println(maior);
        }
    }
}
