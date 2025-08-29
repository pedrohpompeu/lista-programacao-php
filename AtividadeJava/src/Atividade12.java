import java.util.Scanner;
public class Atividade12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o número a ser dividido:");
        double x = leia.nextDouble();
        System.out.println("informe o divisor:");
        double y = leia.nextDouble();
        double quociente = x/y;
        double resto = x%y;
        System.out.println("Quociente:"+Math.round(quociente)+"\n"+
                "Resto:"+Math.round(resto));
    }
}
