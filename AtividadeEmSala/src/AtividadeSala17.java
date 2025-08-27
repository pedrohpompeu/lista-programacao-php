import java.util.Scanner;
public class AtividadeSala17 {
    public static int potencia(int x, int y){
    if(x == 0)
        return 1;
    else
        return x * (y-1);
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int resultado = potencia(leia.nextInt());
    }
}
