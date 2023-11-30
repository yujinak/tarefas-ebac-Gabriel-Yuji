package gabriel.yuji.array;


import java.util.Arrays;
import java.util.Scanner;

public class ExercicioMod12 {

    public static void main(String[] args) {
       String[] nomesDesordenados = cadastraNomes();

//      Ordenar alfabeticamente
        Arrays.sort(nomesDesordenados);
        System.out.println(Arrays.toString(nomesDesordenados));
    }

    public static String[] cadastraNomes(){

//      Ler os nomes das pessoas da lista, separado por vírgula
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos nomes quiser, separados por vírgula: ");
        String nomes = scanner.nextLine();

//      Guardar em alguma variável estudada no módulo
        return nomes.split(",");
    }


}
