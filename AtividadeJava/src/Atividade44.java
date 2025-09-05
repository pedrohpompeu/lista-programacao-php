import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0, media = 0;

        System.out.println("Notas");

        for(int i = 0; i < notas.length; i++){
            System.out.println("Informe "+(i+1)+"ª nota");
            notas[i] = leia.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;

        System.out.println("A média das notas é " + Math.round(media));

    }
}
