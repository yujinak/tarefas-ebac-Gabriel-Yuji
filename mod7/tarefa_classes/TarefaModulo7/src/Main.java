// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bom dia!");


        Pedido primeiroPedido = new Pedido();
     // Cardapio  casd = new Cardapio();

        //Pedir prato. Inserir "prato feito" ou "salada"
        primeiroPedido.registrarPedido("prato feito");
        // Retorna seu pedido
        System.out.println(primeiroPedido.getPedido());

        //Retorna o valor do prato
        primeiroPedido.retornaValor();
        }
    }
