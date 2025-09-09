package Exemplo4;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Usuario user = new Usuario("Pompeu", 21, "Bilbolseiro", "12345678910");
        user.falar();
    }
}
