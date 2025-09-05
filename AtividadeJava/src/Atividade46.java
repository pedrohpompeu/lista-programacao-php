import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //46: Preencha uma matriz 2x2 com números inteiros e exiba a soma de todos os elementos.
        int[][] numero = new int[2][2];
        int soma = 0;

        System.out.println("Digite o numero abaixo.");

        for(int linha = 0; linha < numero.length;linha++){
            for (int coluna = 0; coluna < numero.length; coluna++){
                System.out.print("Insira o número da posição [" + linha + "][" + coluna + "]: ");
                numero[linha][coluna] = leia.nextInt();
                soma += numero[linha][coluna];
            }
        }

        System.out.println("Soma dos elementos: "+ soma);




    }
}