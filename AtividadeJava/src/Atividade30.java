import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char opcao;
        do {
            System.out.println("Escolha uma das Letras");
            System.out.println("A  B  C  D");
            opcao = leia.next().toLowerCase().charAt(0);

            switch (opcao) {
                case 'a':
                    System.out.println("Você PASSOU MUITO LONGE");
                    break;
                case 'b':
                    System.out.println("Você QUASE ACERTOU!!");
                    break;
                case 'c':
                    System.out.println("Você ACERTOU!!");
                    break;
                case 'd':
                    System.out.println("Você ERROU!!");
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!");
            }
        }while (opcao != 'z');
    }
}