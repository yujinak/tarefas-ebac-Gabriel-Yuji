package switchcase;

import java.util.Scanner;

public class ExemploScanner2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println( "Digite seu nome: ");
        String nome = s.nextLine();

        System.out.println("\n Digite sua altura: ");
        double altura = s.nextDouble();

        System.out.println(nome + " tem " + altura + " de altura.");

    }
}
