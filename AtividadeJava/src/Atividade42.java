import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números");

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe "+(i+1)+"° número");
            vetor[i] = leia.nextInt();
        }

        System.out.print("Números pares:");

        for(int i = 0; i < vetor.length; i++){
           if(vetor[i] % 2 == 0){
               System.out.println(vetor[i] + " ");
           }
        }
    }
}
