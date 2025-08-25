import java.util.Scanner;
public class AtividadeSala12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        //vetores e matrizes

        double[] notas = {0,0,0};

        for(int i = 0; i < 3; i++) {
            System.out.println("Digite a primeira nota");
            notas[i] = leia.nextDouble();
        }
        System.out.println("A media das notas digitadas é:" + (notas[0]) +  (notas[1]) + (notas[2])  /3);

    }
}
