import java.util.Scanner;
public class AtividadeSala16 {
    public static int fatorial(int valor){
        if(valor == 0)
            return 1;
        else
            return valor * fatorial(valor-1);}
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valor = 0;
        System.out.println("Fatoração");
        System.out.println("Iforme um número:");
        valor = leia.nextInt();
        System.out.println(fatorial(valor));
    }
}