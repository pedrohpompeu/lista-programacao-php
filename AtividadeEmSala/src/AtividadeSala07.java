import java.util.Scanner;
public class AtividadeSala07 {
    public static void main(String[] args) {
        /*

        int a = 5, b = -5, x = 30, y = 9;
        if (a < 0 && b < 0 && x < 0 && y < 0){
            System.out.println("Toods os valores são Negativos.");
        } else if (a < 0 || b < 0 || x < 0 || y < 0) {
            System.out.println("Pelo um valor é negativo.");
        }else {
            System.out.println("Todos os valores são Positivos.");
        }
        char opcao = 'S';
        switch (opcao){
            case 'S':
                System.out.println("A opção 'S' foi escolhida");
                break;
            default:
                System.out.println("A opção escolida é invalida");
                break;
        }

         */
        Scanner leia = new Scanner(System.in);
        int idade = 0;
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        if(idade >= 18) System.out.println("Você é de maior");
        else System.out.println("Você é de menor");
        System.out.println("Digite o sexo:(M ou F)");
        char op = leia.next().toLowerCase().charAt(0);
        switch (op){
            case 'm':
                System.out.println("Masculino");
                break;
            case 'f':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
        }
    }
}
