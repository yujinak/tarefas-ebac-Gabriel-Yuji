package gabriel.yuji;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class ExercicioMod11 {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();

        Scanner reader = new Scanner(System.in);
        System.out.println("Olá! Insira o nome de uma pessoa:");
        String nome1 = reader.nextLine();
        listaNomes.add(nome1);

        for(int i=0;i<=10; i++){

            System.out.println("Quer inserir mais um nome? Digite o nome ou 'Não' se não quiser:");
            String nome2 = reader.nextLine();

            if(nome2.equalsIgnoreCase("Não") || nome2.equalsIgnoreCase("n") || nome2.isEmpty()){
                break;
            } else {
                listaNomes.add(nome2);
            }
        }

        Collections.sort(listaNomes); //ordena alfabeticamente
        System.out.println("Os nomes da lista são: " + listaNomes + ", contendo " + listaNomes.size() + " nomes.");
    }
}
