import java.util.Scanner;

public class Atividade43 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe 8 números");
        int[] vetor = new int[8];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° número");
            vetor[i] = leia.nextInt();
        }
        int maior = vetor[0], menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];

            } else if (vetor[i] < menor) {
                menor = vetor[i];

            }
        }
        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
    }
}
