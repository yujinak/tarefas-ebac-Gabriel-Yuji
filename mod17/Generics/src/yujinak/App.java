package yujinak;

import yujinak.marcas.Fiat;
import yujinak.marcas.Honda;
import yujinak.marcas.Kia;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("---------------Criando Carros---------------");

        Fiat uno = new Fiat("Uno");
        uno.ligar();

        Honda civic = new Honda("Civic");
        civic.ligar();

        Kia stonic = new Kia("Stonic");
        stonic.ligar();

        System.out.println("---------------Lista de Carros---------------");

        // Coleção de Carros
        ArrayList<Carros<?>> ListaDeCarros = new ArrayList<>();

        ListaDeCarros.add(uno);
        ListaDeCarros.add(civic);
        ListaDeCarros.add(stonic);

        // Imprime a coleção
        System.out.println(ListaDeCarros);

        //Imprime cada carro por linha
        printLista(ListaDeCarros);

    }

    private static void printLista() {
        printLista(null);
    }

    private static void printLista(List<? extends Carros> lista){
        for(Object i: lista) System.out.println(i);
    }
}
