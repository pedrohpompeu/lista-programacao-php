package Atividade01;

import java.util.Scanner;

public class Atividade001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada(true,100,"branca");
        lampada.falar();
        Lampada lampadaDois = new Lampada(false,0,"azul");
        lampadaDois.falar();

        lampadaDois.setaumentarBrilho(scanner.nextInt());
        lampadaDois.falar();
    }
}