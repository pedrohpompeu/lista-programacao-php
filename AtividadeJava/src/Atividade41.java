import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números");

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Informe " + (i + 1) + "° número");
            vetor[i] = leia.nextInt();
        }

        System.out.print("Números digitados:");

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

    }
}
